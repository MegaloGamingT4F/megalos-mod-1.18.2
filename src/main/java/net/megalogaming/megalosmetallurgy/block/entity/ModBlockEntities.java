package net.megalogaming.megalosmetallurgy.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.megalogaming.megalosmetallurgy.MegalosMetallurgy;
import net.megalogaming.megalosmetallurgy.block.ModBlocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlockEntities {
    public static BlockEntityType<MetallurgicFurnaceBlockEntity> METALLURGIC_FURNACE;

    public static void registerAllBlockEntities(){
        METALLURGIC_FURNACE = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier(MegalosMetallurgy.MOD_ID, "metallurgic_furnace"),
                FabricBlockEntityTypeBuilder.create(MetallurgicFurnaceBlockEntity::new,
                        ModBlocks.METALLURGIC_FURNACE).build(null));
    }
}
