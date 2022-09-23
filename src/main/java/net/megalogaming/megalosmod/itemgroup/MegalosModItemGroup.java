package net.megalogaming.megalosmod.itemgroup;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.megalogaming.megalosmod.MegalosMod;
import net.megalogaming.megalosmod.block.ModBlocks;
import net.megalogaming.megalosmod.item.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class MegalosModItemGroup {
    public static final ItemGroup METALLURGY = FabricItemGroupBuilder.build(new Identifier(MegalosMod.MOD_ID, "metallurgy"),
            () -> new ItemStack(ModItems.ALUMINIUM_RAW));
    public static final ItemGroup ALLOY = FabricItemGroupBuilder.build(new Identifier(MegalosMod.MOD_ID, "alloy"),
            () -> new ItemStack(ModBlocks.ALUBRO_BLOCK));
    public static final ItemGroup HOPLOLOGY = FabricItemGroupBuilder.build(new Identifier(MegalosMod.MOD_ID, "hoplology"),
            () -> new ItemStack(ModItems.ALUMINIUM_AXE));
    public static final ItemGroup TECHHNOLOGY = FabricItemGroupBuilder.build(new Identifier(MegalosMod.MOD_ID, "technology"),
            () -> new ItemStack(ModItems.COAL_DUST));

    public static final ItemGroup GASTRONOMY = FabricItemGroupBuilder.build(new Identifier(MegalosMod.MOD_ID, "gastronomy"),
            () -> new ItemStack(ModItems.COAL_DUST));

    public static final ItemGroup GEOLOGY = FabricItemGroupBuilder.build(new Identifier(MegalosMod.MOD_ID, "geology"),
            () -> new ItemStack(ModItems.COAL_DUST));

    public static final ItemGroup DENDROLOGY = FabricItemGroupBuilder.build(new Identifier(MegalosMod.MOD_ID, "dendrology"),
            () -> new ItemStack(ModItems.COAL_DUST));
}
