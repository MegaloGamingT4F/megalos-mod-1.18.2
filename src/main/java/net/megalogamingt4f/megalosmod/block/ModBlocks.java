package net.megalogamingt4f.megalosmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.megalogamingt4f.megalosmod.MegalosMod;
import net.megalogamingt4f.megalosmod.tab.MegalosModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    //Metallurgy
    public static final Block ALUMINIUM_ORE = registerblock("aluminium_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), MegalosModItemGroup.METALLURGY);
    public static final Block DEEPSLATE_ALUMINIUM_ORE = registerblock("deepslate_aluminium_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), MegalosModItemGroup.METALLURGY);
    public static final Block NETHERRACK_ALUMINIUM_ORE = registerblock("netherrack_aluminium_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), MegalosModItemGroup.METALLURGY);
    public static final Block ALUMINIUM_BLOCK = registerblock("aluminium_block", new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), MegalosModItemGroup.METALLURGY);
    public static final Block RAW_ALUMINIUM_BLOCK = registerblock("raw_aluminium_block", new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), MegalosModItemGroup.METALLURGY);

    public static final Block ANTIMONY_ORE = registerblock("antimony_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), MegalosModItemGroup.METALLURGY);
    public static final Block DEEPSLATE_ANTIMONY_ORE = registerblock("deepslate_antimony_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), MegalosModItemGroup.METALLURGY);
    public static final Block NETHERRACK_ANTIMONY_ORE = registerblock("netherrack_antimony_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), MegalosModItemGroup.METALLURGY);
    public static final Block ANTIMONY_BLOCK = registerblock("antimony_block", new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), MegalosModItemGroup.METALLURGY);
    public static final Block RAW_ANTIMONY_BLOCK = registerblock("raw_antimony_block", new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), MegalosModItemGroup.METALLURGY);

    public static final Block ARSENIC_ORE = registerblock("arsenic_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), MegalosModItemGroup.METALLURGY);
    public static final Block DEEPSLATE_ARSENIC_ORE = registerblock("deepslate_arsenic_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), MegalosModItemGroup.METALLURGY);
    public static final Block NETHERRACK_ARSENIC_ORE = registerblock("netherrack_arsenic_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), MegalosModItemGroup.METALLURGY);
    public static final Block ARSENIC_BLOCK = registerblock("arsenic_block", new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), MegalosModItemGroup.METALLURGY);
    public static final Block RAW_ARSENIC_BLOCK = registerblock("raw_arsenic_block", new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), MegalosModItemGroup.METALLURGY);

    public static final Block BARIUM_ORE = registerblock("barium_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), MegalosModItemGroup.METALLURGY);
    public static final Block DEEPSLATE_BARIUM_ORE = registerblock("deepslate_barium_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), MegalosModItemGroup.METALLURGY);
    public static final Block NETHERRACK_BARIUM_ORE = registerblock("netherrack_barium_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), MegalosModItemGroup.METALLURGY);
    public static final Block BARIUM_BLOCK = registerblock("barium_block", new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), MegalosModItemGroup.METALLURGY);
    public static final Block RAW_BARIUM_BLOCK = registerblock("raw_barium_block", new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), MegalosModItemGroup.METALLURGY);

    public static final Block BERYLLIUM_ORE = registerblock("beryllium_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), MegalosModItemGroup.METALLURGY);
    public static final Block DEEPSLATE_BERYLLIUM_ORE = registerblock("deepslate_beryllium_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), MegalosModItemGroup.METALLURGY);
    public static final Block NETHERRACK_BERYLLIUM_ORE = registerblock("netherrack_beryllium_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), MegalosModItemGroup.METALLURGY);
    public static final Block BERYLLIUM_BLOCK = registerblock("beryllium_block", new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), MegalosModItemGroup.METALLURGY);
    public static final Block RAW_BERYLLIUM_BLOCK = registerblock("raw_beryllium_block", new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), MegalosModItemGroup.METALLURGY);

    public static final Block BISMUTH_ORE = registerblock("bismuth_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), MegalosModItemGroup.METALLURGY);
    public static final Block DEEPSLATE_BISMUTH_ORE = registerblock("deepslate_bismuth_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), MegalosModItemGroup.METALLURGY);
    public static final Block NETHERRACK_BISMUTH_ORE = registerblock("netherrack_bismuth_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), MegalosModItemGroup.METALLURGY);
    public static final Block BISMUTH_BLOCK = registerblock("bismuth_block", new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), MegalosModItemGroup.METALLURGY);
    public static final Block RAW_BISMUTH_BLOCK = registerblock("raw_bismuth_block", new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), MegalosModItemGroup.METALLURGY);

    //Alloy
    public static final Block STEEL_BLOCK = registerblock("steel_block", new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), MegalosModItemGroup.ALLOY);

    //Dendrology
    public static final Block ASH_LOG = registerblock("ash_log", new Block(FabricBlockSettings.of(Material.WOOD).strength(6f).requiresTool()), MegalosModItemGroup.DENDROLOGY);
    public static final Block ASH_PLANKS = registerblock("ash_planks", new Block(FabricBlockSettings.of(Material.WOOD).strength(6f).requiresTool()), MegalosModItemGroup.DENDROLOGY);

    private static Block registerblock(String name, Block block, ItemGroup group){
        registerBlockItem(name,block,group);
        return Registry.register(Registry.BLOCK, new Identifier(MegalosMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        return Registry.register(Registry.ITEM, new Identifier(MegalosMod.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(group)));
    }
    public static void registerModBlocks(){
        MegalosMod.LOGGER.info("Registering ModBlocks for" + MegalosMod.MOD_ID);
    }
}
