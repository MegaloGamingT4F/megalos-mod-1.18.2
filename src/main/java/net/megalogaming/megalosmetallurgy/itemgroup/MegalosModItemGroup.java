package net.megalogaming.megalosmetallurgy.itemgroup;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.megalogaming.megalosmetallurgy.MegalosMetallurgy;
import net.megalogaming.megalosmetallurgy.block.ModBlocks;
import net.megalogaming.megalosmetallurgy.item.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class MegalosModItemGroup {
    public static final ItemGroup METALLURGY = FabricItemGroupBuilder.build(new Identifier(MegalosMetallurgy.MOD_ID, "metallurgy"),
            () -> new ItemStack(ModItems.ALUMINIUM_RAW));
    public static final ItemGroup ALLOY = FabricItemGroupBuilder.build(new Identifier(MegalosMetallurgy.MOD_ID, "alloy"),
            () -> new ItemStack(ModBlocks.ALUBRO_BLOCK));
    public static final ItemGroup HOPLOLOGY = FabricItemGroupBuilder.build(new Identifier(MegalosMetallurgy.MOD_ID, "hoplology"),
            () -> new ItemStack(ModItems.ALUMINIUM_AXE));
}
