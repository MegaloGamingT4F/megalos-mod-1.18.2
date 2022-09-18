package net.megalogaming.megalosmod.block.entity;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.megalogaming.megalosmod.item.ModItems;
import net.megalogaming.megalosmod.item.inventory.ImplementedInventory;
import net.megalogaming.megalosmod.recipe.MetallurgicFurnaceRecipe;
import net.megalogaming.megalosmod.screen.MetallurgicFurnaceScreenHandler;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class MetallurgicFurnaceBlockEntity extends BlockEntity implements NamedScreenHandlerFactory, ImplementedInventory {
    private final DefaultedList<ItemStack> inventory =
            DefaultedList.ofSize(11, ItemStack.EMPTY);

    protected final PropertyDelegate propertyDelegate;
    private int progress = 0;
    private int maxProgress = 72;
    private int fuelTime = 0;
    private int maxFuelTime = 0;
    public MetallurgicFurnaceBlockEntity(BlockPos pos, BlockState state){
        super(ModBlockEntities.METALLURGIC_FURNACE, pos, state);
        this.propertyDelegate = new PropertyDelegate() {
            @Override
            public int get(int index) {
                switch (index){
                    case 0: return MetallurgicFurnaceBlockEntity.this.progress;
                    case 1: return MetallurgicFurnaceBlockEntity.this.maxProgress;
                    case 2: return MetallurgicFurnaceBlockEntity.this.fuelTime;
                    case 3: return MetallurgicFurnaceBlockEntity.this.maxFuelTime;
                    default: return 0;
                }
            }

            @Override
            public void set(int index, int value) {
                switch (index){
                    case 0: MetallurgicFurnaceBlockEntity.this.progress = value; break;
                    case 1: MetallurgicFurnaceBlockEntity.this.maxProgress = value; break;
                    case 2: MetallurgicFurnaceBlockEntity.this.fuelTime = value; break;
                    case 3: MetallurgicFurnaceBlockEntity.this.maxFuelTime = value; break;
                }

            }

            @Override
            public int size() {
                return 4;
            }
        };
    }

    @Override
    public DefaultedList<ItemStack> getItems() {

        return inventory;
    }

    @Override
    public Text getDisplayName() {

        return new LiteralText("Metallurgic Furnace");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return new MetallurgicFurnaceScreenHandler(syncId, inv, this, this.propertyDelegate);
    }

    @Override
    protected void writeNbt(NbtCompound nbt){
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt,inventory);
        nbt.putInt("furnace.progress", progress);
        nbt.putInt("furnace.fuelTime", fuelTime);
        nbt.putInt("furnace.maxFuelTime", maxFuelTime);
    }
    @Override
    public void readNbt(NbtCompound nbt){
        Inventories.readNbt(nbt, inventory);
        super.readNbt(nbt);
        progress = nbt.getInt("furnace.progress");
        fuelTime = nbt.getInt("furnace.fuelTime");
        maxFuelTime = nbt.getInt("furnace.maxFuelTime");
    }

    private void consumeFuel() {
        if(!getStack(0).isEmpty()) {
            this.fuelTime = FuelRegistry.INSTANCE.get(this.removeStack(0, 1).getItem());
            this.maxFuelTime = this.fuelTime;
        }
    }
    public static void tick(World world, BlockPos pos, BlockState state, MetallurgicFurnaceBlockEntity entity) {
        if(isConsumingFuel(entity)) {
            entity.fuelTime--;
        }

        if(hasRecipe(entity)) {
            if(hasFuelInFuelSlot(entity) && !isConsumingFuel(entity)) {
                entity.consumeFuel();
            }
            if(isConsumingFuel(entity)) {
                entity.progress++;
                if(entity.progress > entity.maxProgress) {
                    craftItem(entity);
                }
            }
        } else {
            entity.resetProgress();
        }
        }
    private static boolean hasFuelInFuelSlot(MetallurgicFurnaceBlockEntity entity) {
        return !entity.getStack(0).isEmpty();
    }

    private static boolean isConsumingFuel(MetallurgicFurnaceBlockEntity entity) {
        return entity.fuelTime > 0;
    }

    private static boolean hasRecipe(MetallurgicFurnaceBlockEntity entity) {
        World world = entity.world;
        SimpleInventory inventory = new SimpleInventory(entity.inventory.size());
        for (int i = 0; i < entity.inventory.size(); i++) {
            inventory.setStack(i, entity.getStack(i));
        }

        Optional<MetallurgicFurnaceRecipe> match = world.getRecipeManager()
                .getFirstMatch(MetallurgicFurnaceRecipe.Type.INSTANCE, inventory, world);

        return match.isPresent() && canInsertAmountIntoOutputSlot(inventory)
                && canInsertItemIntoOutputSlot(inventory, match.get().getOutput());
    }
    private static void craftItem(MetallurgicFurnaceBlockEntity entity) {
        World world = entity.world;
        SimpleInventory inventory = new SimpleInventory(entity.inventory.size());
        for (int i = 0; i < entity.inventory.size(); i++) {
            inventory.setStack(i, entity.getStack(i));
        }

        Optional<MetallurgicFurnaceRecipe> match = world.getRecipeManager()
                .getFirstMatch(MetallurgicFurnaceRecipe.Type.INSTANCE, inventory, world);

        if (match.isPresent()) {
            entity.removeStack(1, 1);
            entity.removeStack(2, 1);

            entity.setStack(3, new ItemStack(match.get().getOutput().getItem(),
                    entity.getStack(3).getCount() + 1));

            entity.resetProgress();
        }
    }
        private void resetProgress() {
            this.progress = 0;
        }

        private static boolean canInsertItemIntoOutputSlot(SimpleInventory inventory, ItemStack output) {
            return inventory.getStack(3).getItem() == output.getItem() || inventory.getStack(3).isEmpty();
        }

        private static boolean canInsertAmountIntoOutputSlot(SimpleInventory inventory) {
            return inventory.getStack(3).getMaxCount() > inventory.getStack(3).getCount();
        }
}
