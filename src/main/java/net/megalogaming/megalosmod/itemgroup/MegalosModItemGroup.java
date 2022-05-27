package net.megalogaming.megalosmod.itemgroup;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.megalogaming.megalosmod.MegalosMod;
import net.megalogaming.megalosmod.item.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class MegalosModItemGroup {
    public static final ItemGroup METALLURGY = FabricItemGroupBuilder.build(new Identifier(MegalosMod.MOD_ID, "metallurgy"),
            () -> new ItemStack(ModItems.ALUMINIUM_RAW));
    public static final ItemGroup ALLOY = FabricItemGroupBuilder.build(new Identifier(MegalosMod.MOD_ID, "alloy"),
            () -> new ItemStack(ModItems.STEEL_NUGGET));
    public static final ItemGroup HOPLOLOGY = FabricItemGroupBuilder.build(new Identifier(MegalosMod.MOD_ID, "hoplology"),
            () -> new ItemStack(ModItems.ALUMINIUM_AXE));
}
