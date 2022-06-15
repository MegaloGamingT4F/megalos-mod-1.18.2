package net.megalogaming.megalosmod.world.feature;

import net.megalogaming.megalosmod.MegalosMod;
import net.megalogaming.megalosmod.block.ModBlocks;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {
    //Stone
    public static final List<OreFeatureConfig.Target> OVERWORLD_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.ALUMINIUM_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.ANTIMONY_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.ARSENIC_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.BARIUM_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.BERYLLIUM_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.BISMUTH_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.CADMIUM_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.CAESIUM_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.CALCIUM_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.CHROMIUM_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.CINNABAR_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.COBALT_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.GERMANIUM_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.HAFNIUM_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.INDIUM_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.IRIDIUM_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.LEAD_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.LITHIUM_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.MAGNESIUM_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.MANGANESE_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.MOLYBDENUM_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.NICKEL_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.NIOBIUM_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.OSMIUM_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.PALLADIUM_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.PHOSPHORUS_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.PLATINUM_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.POTASSIUM_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.RHENIUM_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.RHODIUM_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.RUBIDIUM_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.RUTHENIUM_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SCANDIUM_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SELENIUM_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SILICON_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SILVER_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SODIUM_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.STRONTIUM_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.TANTALUM_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.TECHNETIUM_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.TELLURIUM_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.THALLIUM_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.TIN_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.TITANIUM_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.TUNGSTEN_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.VANADIUM_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.YTTRIUM_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.ZINC_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.ZIRCONIUM_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_ALUMINIUM_ORE.getDefaultState()));

    //Stone
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ALUMINIUM_ORE = ConfiguredFeatures.register("aluminium_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ORES,9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ANTIMONY_ORE = ConfiguredFeatures.register("antimony_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ORES,9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ARSENIC_ORE = ConfiguredFeatures.register("arsenic_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ORES,9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> BARIUM_ORE = ConfiguredFeatures.register("barium_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ORES,9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> BERYLLIUM_ORE = ConfiguredFeatures.register("beryllium_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ORES,9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> BISMUTH_ORE = ConfiguredFeatures.register("bismuth_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ORES,9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> CADMIUM_ORE = ConfiguredFeatures.register("cadmium_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ORES,9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> CAESIUM_ORE = ConfiguredFeatures.register("caesium_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ORES,9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> CALCIUM_ORE = ConfiguredFeatures.register("calcium_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ORES,9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> CHROMIUM_ORE = ConfiguredFeatures.register("chromium_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ORES,9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> CINNABAR_ORE = ConfiguredFeatures.register("cinnabar_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ORES,9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> COBALT_ORE = ConfiguredFeatures.register("cobalt_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ORES,9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> GERMANIUM_ORE = ConfiguredFeatures.register("germanium_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ORES,9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> HAFNIUM_ORE = ConfiguredFeatures.register("hafnium_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ORES,9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> INDIUM_ORE = ConfiguredFeatures.register("indium_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ORES,9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> IRIDIUM_ORE = ConfiguredFeatures.register("iridium_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ORES,9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> LEAD_ORE = ConfiguredFeatures.register("lead_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ORES,9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> LITHIUM_ORE = ConfiguredFeatures.register("lithium_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ORES,9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> MAGNESIUM_ORE = ConfiguredFeatures.register("magnesium_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ORES,9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> MANGANESE_ORE = ConfiguredFeatures.register("manganese_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ORES,9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> MOLYBDENUM_ORE = ConfiguredFeatures.register("molybdenum_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ORES,9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> NICKEL_ORE = ConfiguredFeatures.register("nickel_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ORES,9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> NIOBIUM_ORE = ConfiguredFeatures.register("niobium_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ORES,9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> OSMIUM_ORE = ConfiguredFeatures.register("osmium_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ORES,9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> PALLADIUM_ORE = ConfiguredFeatures.register("palladium_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ORES,9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> PHOSPHORUS_ORE = ConfiguredFeatures.register("phosphorus_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ORES,9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> PLATINUM_ORE = ConfiguredFeatures.register("platinum_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ORES,9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> POTASSIUM_ORE = ConfiguredFeatures.register("potassium_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ORES,9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> RHENIUM_ORE = ConfiguredFeatures.register("rhenium_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ORES,9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> RHODIUM_ORE = ConfiguredFeatures.register("rhodium_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ORES,9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> RUBIDIUM_ORE = ConfiguredFeatures.register("rubidium_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ORES,9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> RUTHENIUM_ORE = ConfiguredFeatures.register("ruthenium_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ORES,9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> SCANDIUM_ORE = ConfiguredFeatures.register("scandium_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ORES,9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> SELENIUM_ORE = ConfiguredFeatures.register("selenium_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ORES,9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> SILICON_ORE = ConfiguredFeatures.register("silicon_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ORES,9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> SILVER_ORE = ConfiguredFeatures.register("silver_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ORES,9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> SODIUM_ORE = ConfiguredFeatures.register("sodium_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ORES,9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> STRONTIUM_ORE = ConfiguredFeatures.register("strontium_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ORES,9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> TANTALUM_ORE = ConfiguredFeatures.register("tantalum_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ORES,9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> TECHNETIUM_ORE = ConfiguredFeatures.register("technetium_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ORES,9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> TELLURIUM_ORE = ConfiguredFeatures.register("tellurium_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ORES,9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> THALLIUM_ORE = ConfiguredFeatures.register("thallium_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ORES,9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> TIN_ORE = ConfiguredFeatures.register("tin_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ORES,9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> TITANIUM_ORE = ConfiguredFeatures.register("titanium_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ORES,9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> TUNGSTEN_ORE = ConfiguredFeatures.register("tungsten_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ORES,9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> VANADIUM_ORE = ConfiguredFeatures.register("vanadium_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ORES,9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> YTTRIUM_ORE = ConfiguredFeatures.register("yttrium_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ORES,9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ZINC_ORE = ConfiguredFeatures.register("zinc_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ORES,9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ZIRCONIUM_ORE = ConfiguredFeatures.register("zirconium_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ORES,9));

    //Deepslate

    public static void registerConfiguredFeatures(){
        System.out.println("Registering ModConfiguredFeatures for" + MegalosMod.MOD_ID);
    }
}
