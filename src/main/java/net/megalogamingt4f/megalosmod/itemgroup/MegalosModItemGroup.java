package net.megalogamingt4f.megalosmod.itemgroup;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.megalogamingt4f.megalosmod.MegalosMod;
import net.megalogamingt4f.megalosmod.item.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class MegalosModItemGroup {
    public static final ItemGroup METALLURGY = FabricItemGroupBuilder.build(new Identifier(MegalosMod.MOD_ID, "metallurgy"),
            () -> new ItemStack(ModItems.ALUMINIUM_RAW));
    public static final ItemGroup ALLOY = FabricItemGroupBuilder.build(new Identifier(MegalosMod.MOD_ID, "metallurgy"),
            () -> new ItemStack(ModItems.STEEL_NUGGET));
}
