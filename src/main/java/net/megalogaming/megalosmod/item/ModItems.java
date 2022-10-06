package net.megalogaming.megalosmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.megalogaming.megalosmod.MegalosMod;
import net.megalogaming.megalosmod.block.ModBlocks;
import net.megalogaming.megalosmod.item.tools.ModAxeItem;
import net.megalogaming.megalosmod.item.tools.ModHoeItem;
import net.megalogaming.megalosmod.item.tools.ModPickaxeItem;
import net.megalogaming.megalosmod.item.tools.ModShovelItem;
import net.megalogaming.megalosmod.itemgroup.MegalosModItemGroup;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;

import net.minecraft.util.registry.Registry;

public class ModItems {
    //Metallurgy
    //Raw
    public static final Item ALUMINIUM_RAW = registerItem("raw_aluminium", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item ANTIMONY_RAW = registerItem("raw_antimony", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item ARSENIC_RAW = registerItem("raw_arsenic", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item BARIUM_RAW = registerItem("raw_barium", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item BERYLLIUM_RAW = registerItem("raw_beryllium", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item BISMUTH_RAW = registerItem("raw_bismuth", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item CADMIUM_RAW = registerItem("raw_cadmium", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item CALCIUM_RAW = registerItem("raw_calcium", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item CAESIUM_RAW = registerItem("raw_caesium", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item CHROMIUM_RAW = registerItem("raw_chromium", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item CINNABAR_RAW = registerItem("raw_cinnabar", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item COBALT_RAW = registerItem("raw_cobalt", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item GERMANIUM_RAW = registerItem("raw_germanium", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item GALLIUM_RAW = registerItem("raw_gallium", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item HAFNIUM_RAW = registerItem("raw_hafnium", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item INDIUM_RAW = registerItem("raw_indium", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item IRIDIUM_RAW = registerItem("raw_iridium", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item LEAD_RAW = registerItem("raw_lead", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item LITHIUM_RAW = registerItem("raw_lithium", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item MAGNESIUM_RAW = registerItem("raw_magnesium", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item MANGANESE_RAW = registerItem("raw_manganese", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item MOLYBDENUM_RAW = registerItem("raw_molybdenum", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item NICKEL_RAW = registerItem("raw_nickel", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item NIOBIUM_RAW = registerItem("raw_niobium", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item OSMIUM_RAW = registerItem("raw_osmium", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item PALLADIUM_RAW = registerItem("raw_palladium", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item PHOSPHORUS_RAW = registerItem("raw_phosphorus", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item PLATINUM_RAW = registerItem("raw_platinum", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item POTASSIUM_RAW = registerItem("raw_potassium", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item RHENIUM_RAW = registerItem("raw_rhenium", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item RHODIUM_RAW = registerItem("raw_rhodium", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item RUBIDIUM_RAW = registerItem("raw_rubidium", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item RUTHENIUM_RAW = registerItem("raw_ruthenium", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item SCANDIUM_RAW = registerItem("raw_scandium", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item SELENIUM_RAW = registerItem("raw_selenium", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item SILICON_RAW = registerItem("raw_silicon", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item SILVER_RAW = registerItem("raw_silver", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item SODIUM_RAW = registerItem("raw_sodium", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item STRONTIUM_RAW = registerItem("raw_strontium", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item TANTALUM_RAW = registerItem("raw_tantalum", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item TECHNETIUM_RAW = registerItem("raw_technetium", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item TELLURIUM_RAW = registerItem("raw_tellurium", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item THALLIUM_RAW = registerItem("raw_thallium", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item TIN_RAW = registerItem("raw_tin", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item TITANIUM_RAW = registerItem("raw_titanium", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item TUNGSTEN_RAW = registerItem("raw_tungsten", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item VANADIUM_RAW = registerItem("raw_vanadium", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item YTTRIUM_RAW = registerItem("raw_yttrium", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item ZINC_RAW = registerItem("raw_zinc", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item ZIRCONIUM_RAW = registerItem("raw_zirconium", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));

    //Ingot
    public static final Item ALUMINIUM_INGOT = registerItem("aluminium_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item ANTIMONY_INGOT = registerItem("antimony_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item ARSENIC_INGOT = registerItem("arsenic_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item BARIUM_INGOT = registerItem("barium_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item BERYLLIUM_INGOT = registerItem("beryllium_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item BISMUTH_INGOT = registerItem("bismuth_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item CADMIUM_INGOT = registerItem("cadmium_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item CALCIUM_INGOT = registerItem("calcium_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item CAESIUM_INGOT = registerItem("caesium_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item CHROMIUM_INGOT = registerItem("chromium_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item CINNABAR_INGOT = registerItem("cinnabar_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item COBALT_INGOT = registerItem("cobalt_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item GERMANIUM_INGOT = registerItem("germanium_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item GALLIUM_INGOT = registerItem("gallium_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item HAFNIUM_INGOT = registerItem("hafnium_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item INDIUM_INGOT = registerItem("indium_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item IRIDIUM_INGOT = registerItem("iridium_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item LEAD_INGOT = registerItem("lead_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item LITHIUM_INGOT = registerItem("lithium_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item MAGNESIUM_INGOT = registerItem("magnesium_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item MANGANESE_INGOT = registerItem("manganese_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item MOLYBDENUM_INGOT = registerItem("molybdenum_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item NICKEL_INGOT = registerItem("nickel_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item NIOBIUM_INGOT = registerItem("niobium_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item OSMIUM_INGOT = registerItem("osmium_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item PALLADIUM_INGOT = registerItem("palladium_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item PHOSPHORUS_INGOT = registerItem("phosphorus_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item PLATINUM_INGOT = registerItem("platinum_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item POTASSIUM_INGOT = registerItem("potassium_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item RHENIUM_INGOT = registerItem("rhenium_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item RHODIUM_INGOT = registerItem("rhodium_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item RUBIDIUM_INGOT = registerItem("rubidium_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item RUTHENIUM_INGOT = registerItem("ruthenium_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item SCANDIUM_INGOT = registerItem("scandium_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item SELENIUM_INGOT = registerItem("selenium_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item SILICON_INGOT = registerItem("silicon_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item SILVER_INGOT = registerItem("silver_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item SODIUM_INGOT = registerItem("sodium_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item STRONTIUM_INGOT = registerItem("strontium_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item TANTALUM_INGOT = registerItem("tantalum_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item TECHNETIUM_INGOT = registerItem("technetium_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item TELLURIUM_INGOT = registerItem("tellurium_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item THALLIUM_INGOT = registerItem("thallium_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item TIN_INGOT = registerItem("tin_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item TITANIUM_INGOT = registerItem("titanium_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item TUNGSTEN_INGOT = registerItem("tungsten_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item VANADIUM_INGOT = registerItem("vanadium_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item YTTRIUM_INGOT = registerItem("yttrium_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item ZINC_INGOT = registerItem("zinc_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item ZIRCONIUM_INGOT = registerItem("zirconium_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));

    //Nugget
    public static final Item ALUMINIUM_NUGGET = registerItem("aluminium_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item ANTIMONY_NUGGET = registerItem("antimony_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item ARSENIC_NUGGET = registerItem("arsenic_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item BARIUM_NUGGET = registerItem("barium_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item BERYLLIUM_NUGGET = registerItem("beryllium_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item BISMUTH_NUGGET = registerItem("bismuth_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item CADMIUM_NUGGET = registerItem("cadmium_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item CALCIUM_NUGGET = registerItem("calcium_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item CAESIUM_NUGGET = registerItem("caesium_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item CHROMIUM_NUGGET = registerItem("chromium_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item CINNABAR_NUGGET = registerItem("cinnabar_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item COBALT_NUGGET = registerItem("cobalt_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item GERMANIUM_NUGGET = registerItem("germanium_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item GALLIUM_NUGGET = registerItem("gallium_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item HAFNIUM_NUGGET = registerItem("hafnium_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item INDIUM_NUGGET = registerItem("indium_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item IRIDIUM_NUGGET = registerItem("iridium_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item LEAD_NUGGET = registerItem("lead_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item LITHIUM_NUGGET = registerItem("lithium_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item MAGNESIUM_NUGGET = registerItem("magnesium_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item MANGANESE_NUGGET = registerItem("manganese_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item MOLYBDENUM_NUGGET = registerItem("molybdenum_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item NICKEL_NUGGET = registerItem("nickel_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item NIOBIUM_NUGGET = registerItem("niobium_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item OSMIUM_NUGGET = registerItem("osmium_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item PALLADIUM_NUGGET = registerItem("palladium_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item PHOSPHORUS_NUGGET = registerItem("phosphorus_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item PLATINUM_NUGGET = registerItem("platinum_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item POTASSIUM_NUGGET = registerItem("potassium_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item RHENIUM_NUGGET = registerItem("rhenium_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item RHODIUM_NUGGET = registerItem("rhodium_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item RUBIDIUM_NUGGET = registerItem("rubidium_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item RUTHENIUM_NUGGET = registerItem("ruthenium_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item SCANDIUM_NUGGET = registerItem("scandium_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item SELENIUM_NUGGET = registerItem("selenium_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item SILICON_NUGGET = registerItem("silicon_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item SILVER_NUGGET = registerItem("silver_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item SODIUM_NUGGET = registerItem("sodium_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item STRONTIUM_NUGGET = registerItem("strontium_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item TANTALUM_NUGGET = registerItem("tantalum_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item TECHNETIUM_NUGGET = registerItem("technetium_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item TELLURIUM_NUGGET = registerItem("tellurium_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item THALLIUM_NUGGET = registerItem("thallium_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item THALLIUM_DUST = registerItem("thallium_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item TIN_NUGGET = registerItem("tin_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item TITANIUM_NUGGET = registerItem("titanium_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item TUNGSTEN_NUGGET = registerItem("tungsten_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item VANADIUM_NUGGET = registerItem("vanadium_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item YTTRIUM_NUGGET = registerItem("yttrium_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item ZINC_NUGGET = registerItem("zinc_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item ZIRCONIUM_NUGGET = registerItem("zirconium_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));

    //Dust
    public static final Item ALUMINIUM_DUST = registerItem("aluminium_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item ANTIMONY_DUST = registerItem("antimony_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item ARSENIC_DUST = registerItem("arsenic_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item BARIUM_DUST = registerItem("barium_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item BERYLLIUM_DUST = registerItem("beryllium_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item BISMUTH_DUST = registerItem("bismuth_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item CADMIUM_DUST = registerItem("cadmium_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item CAESIUM_DUST = registerItem("caesium_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item CALCIUM_DUST = registerItem("calcium_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item CHROMIUM_DUST = registerItem("chromium_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item CINNABAR_DUST = registerItem("cinnabar_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item COBALT_DUST = registerItem("cobalt_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item GALLIUM_DUST = registerItem("gallium_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item GERMANIUM_DUST = registerItem("germanium_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item HAFNIUM_DUST = registerItem("hafnium_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item INDIUM_DUST = registerItem("indium_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item IRIDIUM_DUST = registerItem("iridium_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item LEAD_DUST = registerItem("lead_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item LITHIUM_DUST = registerItem("lithium_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item MAGNESIUM_DUST = registerItem("magnesium_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item MANGANESE_DUST = registerItem("manganese_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item MOLYBDENUM_DUST = registerItem("molybdenum_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item NICKEL_DUST = registerItem("nickel_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item NIOBIUM_DUST = registerItem("niobium_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item OSMIUM_DUST = registerItem("osmium_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item PALLADIUM_DUST = registerItem("palladium_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item PHOSPHORUS_DUST = registerItem("phosphorus_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item PLATINUM_DUST = registerItem("platinum_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item POTASSIUM_DUST = registerItem("potassium_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item RHENIUM_DUST = registerItem("rhenium_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item RHODIUM_DUST = registerItem("rhodium_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item RUBIDIUM_DUST = registerItem("rubidium_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item RUTHENIUM_DUST = registerItem("ruthenium_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item SCANDIUM_DUST = registerItem("scandium_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item SELENIUM_DUST = registerItem("selenium_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item SILICON_DUST = registerItem("silicon_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item SILVER_DUST = registerItem("silver_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item SODIUM_DUST = registerItem("sodium_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item STRONTIUM_DUST = registerItem("strontium_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item TANTALUM_DUST = registerItem("tantalum_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item TECHNETIUM_DUST = registerItem("technetium_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item TELLURIUM_DUST = registerItem("tellurium_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item TIN_DUST = registerItem("tin_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item TITANIUM_DUST = registerItem("titanium_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item TUNGSTEN_DUST = registerItem("tungsten_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item VANADIUM_DUST = registerItem("vanadium_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item YTTRIUM_DUST = registerItem("yttrium_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item ZINC_DUST = registerItem("zinc_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));
    public static final Item ZIRCONIUM_DUST = registerItem("zirconium_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.METALLURGY)));

    //Alloy Ingots
    //Aluminium Alloy Ingot
    public static final Item AA_INGOT = registerItem("aa_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item AILI_INGOT = registerItem("aili_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item ALNICO_INGOT = registerItem("alnico_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item ALUSCA_INGOT = registerItem("alusca_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item BIRMA_INGOT = registerItem("birma_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item DURALUMIN_INGOT = registerItem("duralumin_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item HIDUMINIUM_INGOT = registerItem("hiduminium_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item HINDALIUM_INGOT = registerItem("hindalium_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item HYDRONALIUM_INGOT = registerItem("hydronalium_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item ITALMA_INGOT = registerItem("italma_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item MAGNALIUM_INGOT = registerItem("magnalium_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item NAMBE_INGOT = registerItem("nambe_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item NITIAL_INGOT = registerItem("nitial_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item SILUMIN_INGOT = registerItem("silumin_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item YALLOY_INGOT = registerItem("yalloy_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Beryllium Alloy Ingot
    public static final Item LOCKALLOY_INGOT = registerItem("lockalloy_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Bismuth Alloy Ingot
    public static final Item BISMANOL_INGOT = registerItem("bismanol_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item CERROSAFE_INGOT = registerItem("cerrosafe_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item ROSEMETAL_INGOT = registerItem("rosemetal_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item WOODSMETAL_INGOT = registerItem("woodsmetal_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item FIELDSMETAL_INGOT = registerItem("fieldsmetal_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Chromium Alloy Ingot
    public static final Item CHROMHYD_INGOT = registerItem("chromhyd_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item CRNIWTI_INGOT = registerItem("crniwti_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item FERROCHROME_INGOT = registerItem("ferrochrome_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item NICHROME_INGOT = registerItem("nichrome_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Cobalt Alloy Ingot
    public static final Item ELGILOY_INGOT = registerItem("elgiloy_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item MEGALLIUM_INGOT = registerItem("megallium_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item STELLITE_INGOT = registerItem("stellite_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item TALONITE_INGOT = registerItem("talonite_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item ULTIMET_INGOT = registerItem("ultimet_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item VITALLIUM_INGOT = registerItem("vitallium_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Copper Alloy Ingot
    public static final Item ALUBRO_INGOT = registerItem("alubro_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item ARSBRO_INGOT = registerItem("arsbro_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item ARSCOP_INGOT = registerItem("arscop_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item BELLMETAL_INGOT = registerItem("bellmetal_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item BERYLCOPPER_INGOT = registerItem("berylcopper_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item BRASS_INGOT = registerItem("brass_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item BILLON_INGOT = registerItem("billon_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item BRONZE_INGOT = registerItem("bronze_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item CALAMINE_INGOT = registerItem("calamine_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item CHISIL_INGOT = registerItem("chisil_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item CONIFE_INGOT = registerItem("conife_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item CONSTANTAN_INGOT = registerItem("constantan_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item COPHYD_INGOT = registerItem("cophyd_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item COPTUNG_INGOT = registerItem("coptung_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item CORINTHIAN_INGOT = registerItem("corinthian_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item CUPRONICKEL_INGOT = registerItem("cupronickel_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item CUSIL_INGOT = registerItem("cusil_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item CYMBAL_INGOT = registerItem("cymbal_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item DEVARDA_INGOT = registerItem("devarda_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item DUTCHMETAL_INGOT = registerItem("dutchmetal_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item FLORENTINE_INGOT = registerItem("florentine_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item GILDMETAL_INGOT = registerItem("gildmetal_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item GLUCYDUR_INGOT = registerItem("glucydur_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item GUANIN_INGOT = registerItem("guanin_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item GUNMETAL_INGOT = registerItem("gunmetal_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item HAUSLER_INGOT = registerItem("hausler_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item HEPATIZON_INGOT = registerItem("hepatizon_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item MANGANIN_INGOT = registerItem("manganin_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item MELCHIOR_INGOT = registerItem("melchior_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item MUNTZMETAL_INGOT = registerItem("muntzmetal_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item NICKSILVER_INGOT = registerItem("nicksilver_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item NORDIC_INGOT = registerItem("nordic_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item ORMOLU_INGOT = registerItem("ormolu_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item PHOSPHOR_INGOT = registerItem("phosphor_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item PINCHBECK_INGOT = registerItem("pinchbeck_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item PRINCEMETAL_INGOT = registerItem("princemetal_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item SHAKUDO_INGOT = registerItem("shakudo_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item SILBRO_INGOT = registerItem("silbro_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item SPECULUM_INGOT = registerItem("speculum_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item TOMBAC_INGOT = registerItem("tombac_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item TUMBAGA_INGOT = registerItem("tumbaga_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item WHIBRO_INGOT = registerItem("whibro_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Gallium Ingot
    public static final Item ALGA_INGOT = registerItem("alga_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item GALFENOL_INGOT = registerItem("galfenol_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item GALINSTAN_INGOT = registerItem("galinstan_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Gold Ingot
    public static final Item ANTANIUM_INGOT = registerItem("antanium_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item COLORGOLD_INGOT = registerItem("colorgold_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item CROWNGOLD_INGOT = registerItem("crowngold_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item ELECTRUM_INGOT = registerItem("electrum_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item RHODITE_INGOT = registerItem("rhodite_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item ROSEGOLD_INGOT = registerItem("rosegold_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item WHITEGOLD_INGOT = registerItem("whitegold_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Iron Ingot
    public static final Item ANTHRACITE_INGOT = registerItem("anthracite_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item BULAT_INGOT = registerItem("bulat_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item CASTIRON_INGOT = registerItem("castiron_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item CHROMOLY_INGOT = registerItem("chromoly_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item CRUCIBLE_INGOT = registerItem("crucible_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item DAMASCUS_INGOT = registerItem("damascus_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item ELINVAR_INGOT = registerItem("elinvar_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item FERNICO_INGOT = registerItem("fernico_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item HIGHSPEED_INGOT = registerItem("highspeed_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item HSLA_INGOT = registerItem("hsla_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item INVAR_INGOT = registerItem("invar_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item KOVAR_INGOT = registerItem("kovar_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item MARAGING_INGOT = registerItem("maraging_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item PIGIRON_INGOT = registerItem("pigiron_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item REYNOLDS_INGOT = registerItem("reynolds_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item SILISTEEL_INGOT = registerItem("silisteel_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item SPIEGEL_INGOT = registerItem("spiegel_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item SPRINGSTEEL_INGOT = registerItem("springsteel_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item STAINLESS_INGOT = registerItem("stainless_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item TOOLSTEEL_INGOT = registerItem("toolsteel_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item WEATHERING_INGOT = registerItem("weathering_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item WOOTZ_INGOT = registerItem("wootz_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item WROUGHT_INGOT = registerItem("wrought_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Lead Ingot
    public static final Item MOLYBDOCHALKOS_INGOT = registerItem("molybdochalkos_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item SOLDER_INGOT = registerItem("solder_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item TERNE_INGOT = registerItem("terne_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item TYPEMETAL_INGOT = registerItem("typemetal_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Magnesium Ingot
    public static final Item ELEKTRON_INGOT = registerItem("elektron_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item FERROMAGNES_INGOT = registerItem("ferromagnes_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item MAGNOX_INGOT = registerItem("magnox_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item TMGALZN_INGOT = registerItem("tmgalzn_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Manganese Nugget
    public static final Item FERROMANGA_INGOT = registerItem("ferromanga_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item MNFZ_INGOT = registerItem("mnfz_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item MNSZ_INGOT = registerItem("mnsz_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Mercury Ingot
    public static final Item AMALGAM_INGOT = registerItem("amalgam_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item ASHTADHATU_INGOT = registerItem("ashtadhatu_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Molybdenum Ingot
    public static final Item FERROMOLBD_INGOT = registerItem("ferromolybd_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Nickel Ingot
    public static final Item ALUMEL_INGOT = registerItem("alumel_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item BRIGHTRAY_INGOT = registerItem("brightray_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item CHROMEL_INGOT = registerItem("chromel_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item COINSILVER_INGOT = registerItem("coinsilver_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item FERRONICKEL_INGOT = registerItem("ferronickel_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item GERSIL_INGOT = registerItem("gersil_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item HASTELLOY_INGOT = registerItem("hastelloy_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item INCONEL_INGOT = registerItem("inconel_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item INCONELSES_INGOT = registerItem("inconelses_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item MONEL_INGOT = registerItem("monel_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item MUMETAL_INGOT = registerItem("mumetal_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item NICKCARB_INGOT = registerItem("nickcarb_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item NICROSIL_INGOT = registerItem("nicrosil_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item NIMONIC_INGOT = registerItem("nimonic_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item NISIL_INGOT = registerItem("nisil_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item NITINOL_INGOT = registerItem("nitinol_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item PERMALLOY_INGOT = registerItem("permalloy_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item SUPERMALLOY_INGOT = registerItem("supermalloy_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Phosphorus Ingot
    public static final Item FERROPHOSPHORUS_INGOT = registerItem("ferrophosphorus_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Potassium Ingot
    public static final Item NAK_INGOT = registerItem("nak_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item KLI_INGOT = registerItem("kli_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Rhodium
    public static final Item PSEUDO_INGOT = registerItem("pseudo_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Scandium Ingot
    public static final Item SCANHYD_INGOT = registerItem("scanhyd_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Silicon Ingot
    public static final Item FERROSILICON_INGOT = registerItem("ferrosilicon_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Silver Ingot
    public static final Item ARGSTERSIL_INGOT = registerItem("argstersil_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item BRITSIL_INGOT = registerItem("britsil_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item DORE_INGOT = registerItem("dore_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item DYMALLOY_INGOT = registerItem("dymalloy_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item GOLOID_INGOT = registerItem("goloid_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item PLATSTER_INGOT = registerItem("platster_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item SHIBUICHI_INGOT = registerItem("shibuichi_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item STERLING_INGOT = registerItem("sterling_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item TIBETSIL_INGOT = registerItem("tibetsil_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Tin Ingot
    public static final Item BABBITT_INGOT = registerItem("babbitt_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item BRITANNIUM_INGOT = registerItem("britannium_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item PEWTER_INGOT = registerItem("pewter_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item QUEENS_INGOT = registerItem("queens_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item WHIMETAL_INGOT = registerItem("whimetal_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Titanium Ingot
    public static final Item BETAC_INGOT = registerItem("betac_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item FERROTITANIUM_INGOT = registerItem("ferrotitanium_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item GUMMETAL_INGOT = registerItem("gummetal_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item SALFV_INGOT = registerItem("salfv_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item TITANGOLD_INGOT = registerItem("titangold_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item TITANHYD_INGOT = registerItem("titanhyd_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item TITANNIT_INGOT = registerItem("titannit_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Vanadium Ingot
    public static final Item FERROVANADIUM_INGOT = registerItem("ferrovanadium_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Zinc
    public static final Item ZAMAK_INGOT = registerItem("zamak_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Zirconium Ingot
    public static final Item ZIRCALOY_INGOT = registerItem("zircaloy_ingot", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Nuggets
    //Aluminium Alloy Nugget
    public static final Item AA_NUGGET = registerItem("aa_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item AILI_NUGGET = registerItem("aili_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item ALNICO_NUGGET = registerItem("alnico_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item ALUSCA_NUGGET = registerItem("alusca_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item BIRMA_NUGGET = registerItem("birma_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item DURALUMIN_NUGGET = registerItem("duralumin_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item HIDUMINIUM_NUGGET = registerItem("hiduminium_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item HINDALIUM_NUGGET = registerItem("hindalium_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item HYDRONALIUM_NUGGET = registerItem("hydronalium_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item ITALMA_NUGGET = registerItem("italma_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item MAGNALIUM_NUGGET = registerItem("magnalium_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item NAMBE_NUGGET = registerItem("nambe_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item NITIAL_NUGGET = registerItem("nitial_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item SILUMIN_NUGGET = registerItem("silumin_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item YALLOY_NUGGET = registerItem("yalloy_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Beryllium Alloy Nugget
    public static final Item LOCKALLOY_NUGGET = registerItem("lockalloy_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Bismuth Alloy Nugget
    public static final Item BISMANOL_NUGGET = registerItem("bismanol_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item CERROSAFE_NUGGET = registerItem("cerrosafe_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item ROSEMETAL_NUGGET = registerItem("rosemetal_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item WOODSMETAL_NUGGET = registerItem("woodsmetal_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item FIELDSMETAL_NUGGET = registerItem("fieldsmetal_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Chromium Alloy Nugget
    public static final Item CHROMHYD_NUGGET = registerItem("chromhyd_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item CRNIWTI_NUGGET = registerItem("crniwti_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item FERROCHROME_NUGGET = registerItem("ferrochrome_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item NICHROME_NUGGET = registerItem("nichrome_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Cobalt Alloy Nugget
    public static final Item ELGILOY_NUGGET = registerItem("elgiloy_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item MEGALLIUM_NUGGET = registerItem("megallium_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item STELLITE_NUGGET = registerItem("stellite_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item TALONITE_NUGGET = registerItem("talonite_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item ULTIMET_NUGGET = registerItem("ultimet_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item VITALLIUM_NUGGET = registerItem("vitallium_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Copper Alloy Nugget
    public static final Item ALUBRO_NUGGET = registerItem("alubro_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item ARSBRO_NUGGET = registerItem("arsbro_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item ARSCOP_NUGGET = registerItem("arscop_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item BELLMETAL_NUGGET = registerItem("bellmetal_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item BERYLCOPPER_NUGGET = registerItem("berylcopper_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item BILLON_NUGGET = registerItem("billon_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item BRASS_NUGGET = registerItem("brass_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item BRONZE_NUGGET = registerItem("bronze_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item CALAMINE_NUGGET = registerItem("calamine_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item CHISIL_NUGGET = registerItem("chisil_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item CONIFE_NUGGET = registerItem("conife_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item CONSTANTAN_NUGGET = registerItem("constantan_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item COPHYD_NUGGET = registerItem("cophyd_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item COPTUNG_NUGGET = registerItem("coptung_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item CORINTHIAN_NUGGET = registerItem("corinthian_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item CUPRONICKEL_NUGGET = registerItem("cupronickel_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item CUSIL_NUGGET = registerItem("cusil_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item CYMBAL_NUGGET = registerItem("cymbal_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item DEVARDA_NUGGET = registerItem("devarda_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item DUTCHMETAL_NUGGET = registerItem("dutchmetal_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item FLORENTINE_NUGGET = registerItem("florentine_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item GILDMETAL_NUGGET = registerItem("gildmetal_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item GLUCYDUR_NUGGET = registerItem("glucydur_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item GUANIN_NUGGET = registerItem("guanin_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item GUNMETAL_NUGGET = registerItem("gunmetal_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item HEPATIZON_NUGGET = registerItem("hepatizon_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item HAUSLER_NUGGET = registerItem("hausler_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item MANGANIN_NUGGET = registerItem("manganin_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item MELCHIOR_NUGGET = registerItem("melchior_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item MUNTZMETAL_NUGGET = registerItem("muntzmetal_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item NICKSILVER_NUGGET = registerItem("nicksilver_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item NORDIC_NUGGET = registerItem("nordic_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item ORMOLU_NUGGET = registerItem("ormolu_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item PHOSPHOR_NUGGET = registerItem("phosphor_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item PINCHBECK_NUGGET = registerItem("pinchbeck_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item PRINCEMETAL_NUGGET = registerItem("princemetal_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item SHAKUDO_NUGGET = registerItem("shakudo_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item SILBRO_NUGGET = registerItem("silbro_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item SPECULUM_NUGGET = registerItem("speculum_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item TOMBAC_NUGGET = registerItem("tombac_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item TUMBAGA_NUGGET = registerItem("tumbaga_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item WHIBRO_NUGGET = registerItem("whibro_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Gallium Nugget
    public static final Item ALGA_NUGGET = registerItem("alga_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item GALFENOL_NUGGET = registerItem("galfenol_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item GALINSTAN_NUGGET = registerItem("galinstan_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Gold Nugget
    public static final Item ANTANIUM_NUGGET = registerItem("antanium_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item COLORGOLD_NUGGET = registerItem("colorgold_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item CROWNGOLD_NUGGET = registerItem("crowngold_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item ELECTRUM_NUGGET = registerItem("electrum_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item RHODITE_NUGGET = registerItem("rhodite_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item ROSEGOLD_NUGGET = registerItem("rosegold_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item WHITEGOLD_NUGGET = registerItem("whitegold_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Iron Nugget
    public static final Item ANTHRACITE_NUGGET = registerItem("anthracite_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item BULAT_NUGGET = registerItem("bulat_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item CASTIRON_NUGGET = registerItem("castiron_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item CHROMOLY_NUGGET = registerItem("chromoly_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item CRUCIBLE_NUGGET = registerItem("crucible_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item DAMASCUS_NUGGET = registerItem("damascus_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item ELINVAR_NUGGET = registerItem("elinvar_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item FERNICO_NUGGET = registerItem("fernico_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item HIGHSPEED_NUGGET = registerItem("highspeed_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item HSLA_NUGGET = registerItem("hsla_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item INVAR_NUGGET = registerItem("invar_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item KOVAR_NUGGET = registerItem("kovar_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item MARAGING_NUGGET = registerItem("maraging_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item PIGIRON_NUGGET = registerItem("pigiron_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item REYNOLDS_NUGGET = registerItem("reynolds_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item SILISTEEL_NUGGET = registerItem("silisteel_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item SPIEGEL_NUGGET = registerItem("spiegel_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item SPRINGSTEEL_NUGGET = registerItem("springsteel_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item STAINLESS_NUGGET = registerItem("stainless_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item STEEL_NUGGET = registerItem("steel_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item TOOLSTEEL_NUGGET = registerItem("toolsteel_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item WEATHERING_NUGGET = registerItem("weathering_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item WOOTZ_NUGGET = registerItem("wootz_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item WROUGHT_NUGGET = registerItem("wrought_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Lead Nugget
    public static final Item MOLYBDOCHALKOS_NUGGET = registerItem("molybdochalkos_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item SOLDER_NUGGET = registerItem("solder_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item TERNE_NUGGET = registerItem("terne_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item TYPEMETAL_NUGGET = registerItem("typemetal_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Magnesium Nugget
    public static final Item ELEKTRON_NUGGET = registerItem("elektron_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item FERROMAGNES_NUGGET = registerItem("ferromagnes_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item MAGNOX_NUGGET = registerItem("magnox_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item TMGALZN_NUGGET = registerItem("tmgalzn_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Manganese Nugget
    public static final Item FERROMANGA_NUGGET = registerItem("ferromanga_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item MNFZ_NUGGET = registerItem("mnfz_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item MNSZ_NUGGET = registerItem("mnsz_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Mercury Nugget
    public static final Item AMALGAM_NUGGET = registerItem("amalgam_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item ASHTADHATU_NUGGET = registerItem("ashtadhatu_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Molybdenum Nugget
    public static final Item FERROMOLYBD_NUGGET = registerItem("ferromolybd_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Nickel Nugget
    public static final Item ALUMEL_NUGGET = registerItem("alumel_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item BRIGHTRAY_NUGGET = registerItem("brightray_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item CHROMEL_NUGGET = registerItem("chromel_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item COINSILVER_NUGGET = registerItem("coinsilver_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item FERRONICKEL_NUGGET = registerItem("ferronickel_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item GERSIL_NUGGET = registerItem("gersil_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item HASTELLOY_NUGGET = registerItem("hastelloy_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item INCONEL_NUGGET = registerItem("inconel_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item INCONELSES_NUGGET = registerItem("inconelses_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item MONEL_NUGGET = registerItem("monel_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item MUMETAL_NUGGET = registerItem("mumetal_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item NICKCARB_NUGGET = registerItem("nickcarb_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item NICROSIL_NUGGET = registerItem("nicrosil_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item NIMONIC_NUGGET = registerItem("nimonic_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item NISIL_NUGGET = registerItem("nisil_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item NITINOL_NUGGET = registerItem("nitinol_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item PERMALLOY_NUGGET = registerItem("permalloy_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item SUPERMALLOY_NUGGET = registerItem("supermalloy_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Phosphorus Nugget
    public static final Item FERROPHOSPHORUS_NUGGET = registerItem("ferrophosphorus_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Potassium Nugget
    public static final Item NAK_NUGGET = registerItem("nak_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item KLI_NUGGET = registerItem("kli_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Rhodium Nugget
    public static final Item PSEUDO_NUGGET = registerItem("pseudo_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Scandium Nugget
    public static final Item SCANHYD_NUGGET = registerItem("scanhyd_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Silicon Nugget
    public static final Item FERROSILICON_NUGGET = registerItem("ferrosilicon_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Silver Nugget
    public static final Item ARGSTERSIL_NUGGET = registerItem("argstersil_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item BRITSIL_NUGGET = registerItem("britsil_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item DORE_NUGGET = registerItem("dore_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item DYMALLOY_NUGGET = registerItem("dymalloy_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item GOLOID_NUGGET = registerItem("goloid_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item PLATSTER_NUGGET = registerItem("platster_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item SHIBUICHI_NUGGET = registerItem("shibuichi_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item STERLING_NUGGET = registerItem("sterling_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item TIBETSIL_NUGGET = registerItem("tibetsil_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Tin Nugget
    public static final Item BABBITT_NUGGET = registerItem("babbitt_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item BRITANNIUM_NUGGET = registerItem("britannium_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item PEWTER_NUGGET = registerItem("pewter_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item QUEENS_NUGGET = registerItem("queens_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item WHIMETAL_NUGGET = registerItem("whimetal_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Titanium Nugget
    public static final Item BETAC_NUGGET = registerItem("betac_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item FERROTITANIUM_NUGGET = registerItem("ferrotitanium_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item GUMMETAL_NUGGET = registerItem("gummetal_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item SALFV_NUGGET = registerItem("salfv_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item TITANGOLD_NUGGET = registerItem("titangold_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item TITANHYD_NUGGET = registerItem("titanhyd_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item TITANNIT_NUGGET = registerItem("titannit_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Vanadium Nugget
    public static final Item FERROVANADIUM_NUGGET = registerItem("ferrovanadium_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Zinc Nugget
    public static final Item ZAMAK_NUGGET = registerItem("zamak_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Zirconium Nugget
    public static final Item ZIRCALOY_NUGGET = registerItem("zircaloy_nugget", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Alloy Dust
    //Aluminium Alloy Dust
    public static final Item AA_DUST = registerItem("aa_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item AILI_DUST = registerItem("aili_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item ALNICO_DUST = registerItem("alnico_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item ALUSCA_DUST = registerItem("alusca_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item BIRMA_DUST = registerItem("birma_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item DURALUMIN_DUST = registerItem("duralumin_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item HIDUMINIUM_DUST = registerItem("hiduminium_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item HINDALIUM_DUST = registerItem("hindalium_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item HYDRONALIUM_DUST = registerItem("hydronalium_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item ITALMA_DUST = registerItem("italma_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item MAGNALIUM_DUST = registerItem("magnalium_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item NAMBE_DUST = registerItem("nambe_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item NITIAL_DUST = registerItem("nitial_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item SILUMIN_DUST = registerItem("silumin_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item YALLOY_DUST = registerItem("yalloy_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Beryllium Alloy Dust
    public static final Item LOCKALLOY_DUST = registerItem("lockalloy_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Bismuth Alloy Dust
    public static final Item BISMANOL_DUST = registerItem("bismanol_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item CERROSAFE_DUST = registerItem("cerrosafe_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item ROSEMETAL_DUST = registerItem("rosemetal_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item WOODSMETAL_DUST = registerItem("woodsmetal_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item FIELDSMETAL_DUST = registerItem("fieldsmetal_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Chromium Alloy Dust
    public static final Item CHROMHYD_DUST = registerItem("chromhyd_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item CRNIWTI_DUST = registerItem("crniwti_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item FERROCHROME_DUST = registerItem("ferrochrome_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item NICHROME_DUST = registerItem("nichrome_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Cobalt Alloy Dust
    public static final Item ELGILOY_DUST = registerItem("elgiloy_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item MEGALLIUM_DUST = registerItem("megallium_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item STELLITE_DUST = registerItem("stellite_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item TALONITE_DUST = registerItem("talonite_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item ULTIMET_DUST = registerItem("ultimet_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item VITALLIUM_DUST = registerItem("vitallium_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Copper Alloy Dust
    public static final Item ALUBRO_DUST = registerItem("alubro_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item ARSBRO_DUST = registerItem("arsbro_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item ARSCOP_DUST = registerItem("arscop_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item BELLMETAL_DUST = registerItem("bellmetal_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item BERYLCOPPER_DUST = registerItem("berylcopper_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item BILLON_DUST = registerItem("billon_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item BRASS_DUST = registerItem("brass_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item BRONZE_DUST = registerItem("bronze_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item CALAMINE_DUST = registerItem("calamine_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item CHISIL_DUST = registerItem("chisil_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item CONIFE_DUST = registerItem("conife_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item CONSTANTAN_DUST = registerItem("constantan_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item COPHYD_DUST = registerItem("cophyd_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item COPTUNG_DUST = registerItem("coptung_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item CORINTHIAN_DUST = registerItem("corinthian_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item CUPRONICKEL_DUST = registerItem("cupronickel_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item CUSIL_DUST = registerItem("cusil_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item CYMBAL_DUST = registerItem("cymbal_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item DEVARDA_DUST = registerItem("devarda_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item DUTCHMETAL_DUST = registerItem("dutchmetal_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item FLORENTINE_DUST = registerItem("florentine_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item GILDMETAL_DUST = registerItem("gildmetal_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item GLUCYDUR_DUST = registerItem("glucydur_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item GUANIN_DUST = registerItem("guanin_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item HAUSLER_DUST = registerItem("hausler_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item GUNMETAL_DUST = registerItem("gunmetal_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item HEPATIZON_DUST = registerItem("hepatizon_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item MANGANIN_DUST = registerItem("manganin_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item MELCHIOR_DUST = registerItem("melchior_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item MUNTZMETAL_DUST = registerItem("muntzmetal_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item NICKSILVER_DUST = registerItem("nicksilver_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item NORDIC_DUST = registerItem("nordic_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item ORMOLU_DUST = registerItem("ormolu_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item PHOSPHOR_DUST = registerItem("phosphor_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item PINCHBECK_DUST = registerItem("pinchbeck_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item PRINCEMETAL_DUST = registerItem("princemetal_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item SHAKUDO_DUST = registerItem("shakudo_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item SILBRO_DUST = registerItem("silbro_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item SPECULUM_DUST = registerItem("speculum_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item TOMBAC_DUST = registerItem("tombac_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item TUMBAGA_DUST = registerItem("tumbaga_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item WHIBRO_DUST = registerItem("whibro_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Gallium Dust
    public static final Item ALGA_DUST = registerItem("alga_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item GALFENOL_DUST = registerItem("galfenol_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item GALINSTAN_DUST = registerItem("galinstan_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Gold Dust
    public static final Item ANTANIUM_DUST = registerItem("antantium_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item COLORGOLD_DUST = registerItem("colorgold_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item CROWNGOLD_DUST = registerItem("crowngold_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item ELECTRUM_DUST = registerItem("electrum_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item RHODITE_DUST = registerItem("rhodite_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item ROSEGOLD_DUST = registerItem("rosegold_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item WHITEGOLD_DUST = registerItem("whitegold_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Iron Dust
    public static final Item ANTHRACITE_DUST = registerItem("anthracite_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item BULAT_DUST = registerItem("bulat_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item CASTIRON_DUST = registerItem("castiron_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item CHROMOLY_DUST = registerItem("chromoly_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item CRUCIBLE_DUST = registerItem("crucible_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item DAMASCUS_DUST = registerItem("damascus_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item ELINVAR_DUST = registerItem("elinvar_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item FERNICO_DUST = registerItem("fernico_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item HIGHSPEED_DUST = registerItem("highspeed_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item HSLA_DUST = registerItem("hsla_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item INVAR_DUST = registerItem("invar_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item KOVAR_DUST = registerItem("kovar_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item MARAGING_DUST = registerItem("maraging_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item PIGIRON_DUST = registerItem("pigiron_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item REYNOLDS_DUST = registerItem("reynolds_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item SILISTEEL_DUST = registerItem("silisteel_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item SPIEGEL_DUST = registerItem("spiegel_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item SPRINGSTEEL_DUST = registerItem("springsteel_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item STAINLESS_DUST = registerItem("stainless_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item STEEL_DUST = registerItem("steel_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item TOOLSTEEL_DUST = registerItem("toolsteel_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item WEATHERING_DUST = registerItem("weathering_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item WROUGHT_DUST = registerItem("wrought_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item WOOTZ_DUST = registerItem("wootz_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Magnesium Dust
    public static final Item ELEKTRON_DUST = registerItem("elektron_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item FERROMAGNES_DUST = registerItem("ferromagnes_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item MAGNOX_DUST = registerItem("magnox_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item TMGALZN_DUST = registerItem("tmgalzn_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Manganese Dust
    public static final Item FERROMANGA_DUST = registerItem("ferromanga_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item MNFZ_DUST = registerItem("mnfz_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item MNSZ_DUST = registerItem("mnsz_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Mercury Dust
    public static final Item AMALGAM_DUST = registerItem("amalgam_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item ASHTADHATU_DUST = registerItem("ashtadhatu_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Molybdenum
    public static final Item FERROMOLYBD_DUST = registerItem("ferromolybd_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Nickel Dust
    public static final Item ALUMEL_DUST = registerItem("alumel_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item BRIGHTRAY_DUST = registerItem("brightray_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item CHROMEL_DUST = registerItem("chromel_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item COINSILVER_DUST = registerItem("coinsilver_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item FERRONICKEL_DUST = registerItem("ferronickel_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item GERSIL_DUST = registerItem("gersil_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item HASTELLOY_DUST = registerItem("hastelloy_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item INCONEL_DUST = registerItem("inconel_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item INCONELSES_DUST = registerItem("inconelses_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item MONEL_DUST = registerItem("monel_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item MUMETAL_DUST = registerItem("mumetal_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item NICKCARB_DUST = registerItem("nickcarb_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item NICROSIL_DUST = registerItem("nicrosil_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item NIMONIC_DUST = registerItem("nimonic_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item NISIL_DUST = registerItem("nisil_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item NITINOL_DUST = registerItem("nitinol_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item PERMALLOY_DUST = registerItem("permalloy_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item SUPERMALLOY_DUST = registerItem("supermalloy_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Phosphorus Dust
    public static final Item FERROPHOSPHORUS_DUST = registerItem("ferrophosphorus_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Potassium Dust
    public static final Item NAK_DUST = registerItem("nak_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item KLI_DUST = registerItem("kli_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Lead Dust
    public static final Item MOLYBDOCHALKOS_DUST = registerItem("molybdochalkos_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item SOLDER_DUST = registerItem("solder_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item TERNE_DUST = registerItem("terne_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item TYPEMETAL_DUST = registerItem("typemetal_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));


    //Rhodium Dust
    public static final Item PSEUDO_DUST = registerItem("pseudo_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Scandium Dust
    public static final Item SCANHYD_DUST = registerItem("scanhyd_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Silicon Dust
    public static final Item FERROSILICON_DUST = registerItem("ferrosilicon_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Silver Dust
    public static final Item ARGSTERSIL_DUST = registerItem("argstersil_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item BRITSIL_DUST = registerItem("britsil_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item DORE_DUST = registerItem("dore_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item DYMALLOY_DUST = registerItem("dymalloy_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item GOLOID_DUST = registerItem("goloid_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item PLATSTER_DUST = registerItem("platster_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item SHIBUICHI_DUST = registerItem("shibuichi_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item STERLING_DUST = registerItem("sterling_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item TIBETSIL_DUST = registerItem("tibetsil_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Tin Dust
    public static final Item BABBITT_DUST = registerItem("babbitt_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item BRITANNIUM_DUST = registerItem("britannium_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item PEWTER_DUST = registerItem("pewter_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item QUEENS_DUST = registerItem("queens_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item WHIMETAL_DUST = registerItem("whimetal_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Titanium Dust
    public static final Item BETAC_DUST = registerItem("betac_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item FERROTITANIUM_DUST = registerItem("ferrotitanium_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item GUMMETAL_DUST = registerItem("gummetal_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item SALFV_DUST = registerItem("salfv_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item TITANGOLD_DUST = registerItem("titangold_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item TITANHYD_DUST = registerItem("titanhyd_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item TITANNIT_DUST = registerItem("titannit_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Vanadium Dust
    public static final Item FERROVANADIUM_DUST = registerItem("ferrovanadium_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Zinc Dust
    public static final Item ZAMAK_DUST = registerItem("zamak_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Zirconium Dust
    public static final Item ZIRCALOY_DUST = registerItem("zircaloy_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Extras
    public static final Item COPPER_DUST = registerItem("copper_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item IRON_DUST = registerItem("iron_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item GOLD_DUST = registerItem("gold_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item COAL_DUST = registerItem("coal_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));
    public static final Item CHARCOAL_DUST = registerItem("charcoal_dust", new Item(new FabricItemSettings().group(MegalosModItemGroup.ALLOY)));

    //Hoplology
    //Axe
    public static final Item ALUMINIUM_AXE = registerItem("aluminium_axe", new ModAxeItem(ModToolMaterials.ALUMINIUM,1,2f,new FabricItemSettings().group(MegalosModItemGroup.HOPLOLOGY)));
    public static final Item SILVER_AXE = registerItem("silver_axe", new ModAxeItem(ModToolMaterials.SILVER,1,2f,new FabricItemSettings().group(MegalosModItemGroup.HOPLOLOGY)));
    public static final Item STEEL_AXE = registerItem("steel_axe", new ModAxeItem(ModToolMaterials.STEEL,1,2f,new FabricItemSettings().group(MegalosModItemGroup.HOPLOLOGY)));
    public static final Item DAMASCUS_AXE = registerItem("damascus_axe", new ModAxeItem(ModToolMaterials.DAMASCUS,1,2f,new FabricItemSettings().group(MegalosModItemGroup.HOPLOLOGY)));
    public static final Item TITANIUM_AXE = registerItem("titanium_axe", new ModAxeItem(ModToolMaterials.TITANIUM,1,2f,new FabricItemSettings().group(MegalosModItemGroup.HOPLOLOGY)));

    //Hoe
    public static final Item ALUMINIUM_HOE = registerItem("aluminium_hoe", new ModHoeItem(ModToolMaterials.ALUMINIUM,1,2f,new FabricItemSettings().group(MegalosModItemGroup.HOPLOLOGY)));
    public static final Item SILVER_HOE = registerItem("silver_hoe", new ModHoeItem(ModToolMaterials.SILVER,1,2f,new FabricItemSettings().group(MegalosModItemGroup.HOPLOLOGY)));
    public static final Item STEEL_HOE = registerItem("steel_hoe", new ModHoeItem(ModToolMaterials.STEEL,1,2f,new FabricItemSettings().group(MegalosModItemGroup.HOPLOLOGY)));
    public static final Item DAMASCUS_HOE = registerItem("damascus_hoe", new ModHoeItem(ModToolMaterials.DAMASCUS,1,2f,new FabricItemSettings().group(MegalosModItemGroup.HOPLOLOGY)));
    public static final Item TITANIUM_HOE = registerItem("titanium_hoe", new ModHoeItem(ModToolMaterials.TITANIUM,1,2f,new FabricItemSettings().group(MegalosModItemGroup.HOPLOLOGY)));

    //Pickaxe
    public static final Item ALUMINIUM_PICKAXE = registerItem("aluminium_pickaxe", new ModPickaxeItem(ModToolMaterials.ALUMINIUM,1,2f,new FabricItemSettings().group(MegalosModItemGroup.HOPLOLOGY)));
    public static final Item SILVER_PICKAXE = registerItem("solver_pickaxe", new ModPickaxeItem(ModToolMaterials.SILVER,1,2f,new FabricItemSettings().group(MegalosModItemGroup.HOPLOLOGY)));
    public static final Item STEEL_PICKAXE = registerItem("steel_pickaxe", new ModPickaxeItem(ModToolMaterials.STEEL,1,2f,new FabricItemSettings().group(MegalosModItemGroup.HOPLOLOGY)));
    public static final Item DAMASCUS_PICKAXE = registerItem("damascus_pickaxe", new ModPickaxeItem(ModToolMaterials.DAMASCUS,1,2f,new FabricItemSettings().group(MegalosModItemGroup.HOPLOLOGY)));
    public static final Item TITANIUM_PICKAXE = registerItem("titanium_pickaxe", new ModPickaxeItem(ModToolMaterials.TITANIUM,1,2f,new FabricItemSettings().group(MegalosModItemGroup.HOPLOLOGY)));

    //Shovel
    public static final Item ALUMINIUM_SHOVEL = registerItem("aluminium_shovel", new ModShovelItem(ModToolMaterials.ALUMINIUM,1,2f,new FabricItemSettings().group(MegalosModItemGroup.HOPLOLOGY)));
    public static final Item SILVER_SHOVEL = registerItem("silver_shovel", new ModShovelItem(ModToolMaterials.SILVER,1,2f,new FabricItemSettings().group(MegalosModItemGroup.HOPLOLOGY)));
    public static final Item STEEL_SHOVEL = registerItem("steel_shovel", new ModShovelItem(ModToolMaterials.STEEL,1,2f,new FabricItemSettings().group(MegalosModItemGroup.HOPLOLOGY)));
    public static final Item DAMASCUS_SHOVEL = registerItem("damascus_shovel", new ModShovelItem(ModToolMaterials.DAMASCUS,1,2f,new FabricItemSettings().group(MegalosModItemGroup.HOPLOLOGY)));
    public static final Item TITANIUM_SHOVEL = registerItem("titanium_shovel", new ModShovelItem(ModToolMaterials.TITANIUM,1,2f,new FabricItemSettings().group(MegalosModItemGroup.HOPLOLOGY)));

    //Sword
    public static final Item ALUMINIUM_SWORD = registerItem("aluminium_sword", new SwordItem(ModToolMaterials.ALUMINIUM,1,2f,new FabricItemSettings().group(MegalosModItemGroup.HOPLOLOGY)));
    public static final Item SILVER_SWORD = registerItem("silver_sword", new SwordItem(ModToolMaterials.SILVER,1,2f,new FabricItemSettings().group(MegalosModItemGroup.HOPLOLOGY)));
    public static final Item STEEL_SWORD = registerItem("steel_sword", new SwordItem(ModToolMaterials.STEEL,1,2f,new FabricItemSettings().group(MegalosModItemGroup.HOPLOLOGY)));
    public static final Item DAMASCUS_SWORD = registerItem("damascus_sword", new SwordItem(ModToolMaterials.DAMASCUS,1,2f,new FabricItemSettings().group(MegalosModItemGroup.HOPLOLOGY)));
    public static final Item TITANIUM_SWORD = registerItem("titanium_sword", new SwordItem(ModToolMaterials.TITANIUM,1,2f,new FabricItemSettings().group(MegalosModItemGroup.HOPLOLOGY)));

    //Armour
    public static final Item ALUMINIUM_HELMET = registerItem("aluminium_helmet", new ArmorItem(ModArmorMaterials.ALUMINIUM, EquipmentSlot.HEAD, new FabricItemSettings().group(MegalosModItemGroup.HOPLOLOGY)));
    public static final Item ALUMINIUM_CHESTPLATE = registerItem("aluminium_chestplate", new ArmorItem(ModArmorMaterials.ALUMINIUM, EquipmentSlot.CHEST, new FabricItemSettings().group(MegalosModItemGroup.HOPLOLOGY)));
    public static final Item ALUMINIUM_LEGGINGS = registerItem("aluminium_leggings", new ArmorItem(ModArmorMaterials.ALUMINIUM, EquipmentSlot.LEGS, new FabricItemSettings().group(MegalosModItemGroup.HOPLOLOGY)));
    public static final Item ALUMINIUM_BOOTS = registerItem("aluminium_boots", new ArmorItem(ModArmorMaterials.ALUMINIUM, EquipmentSlot.FEET, new FabricItemSettings().group(MegalosModItemGroup.HOPLOLOGY)));

    public static final Item SILVER_HELMET = registerItem("silver_helmet", new ArmorItem(ModArmorMaterials.SILVER, EquipmentSlot.HEAD, new FabricItemSettings().group(MegalosModItemGroup.HOPLOLOGY)));
    public static final Item SILVER_CHESTPLATE = registerItem("silver_chestplate", new ArmorItem(ModArmorMaterials.SILVER, EquipmentSlot.CHEST, new FabricItemSettings().group(MegalosModItemGroup.HOPLOLOGY)));
    public static final Item SILVER_LEGGINGS = registerItem("silver_leggings", new ArmorItem(ModArmorMaterials.SILVER, EquipmentSlot.LEGS, new FabricItemSettings().group(MegalosModItemGroup.HOPLOLOGY)));
    public static final Item SILVER_BOOTS = registerItem("silver_boots", new ArmorItem(ModArmorMaterials.SILVER, EquipmentSlot.FEET, new FabricItemSettings().group(MegalosModItemGroup.HOPLOLOGY)));

    public static final Item STEEL_HELMET = registerItem("steel_helmet", new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.HEAD, new FabricItemSettings().group(MegalosModItemGroup.HOPLOLOGY)));
    public static final Item STEEL_CHESTPLATE = registerItem("steel_chestplate", new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.CHEST, new FabricItemSettings().group(MegalosModItemGroup.HOPLOLOGY)));
    public static final Item STEEL_LEGGINGS = registerItem("steel_leggings", new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.LEGS, new FabricItemSettings().group(MegalosModItemGroup.HOPLOLOGY)));
    public static final Item STEEL_BOOTS = registerItem("steel_boots", new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.FEET, new FabricItemSettings().group(MegalosModItemGroup.HOPLOLOGY)));

    public static final Item DAMASCUS_HELMET = registerItem("damascus_helmet", new ArmorItem(ModArmorMaterials.DAMASCUS, EquipmentSlot.HEAD, new FabricItemSettings().group(MegalosModItemGroup.HOPLOLOGY)));
    public static final Item DAMASCUS_CHESTPLATE = registerItem("damascus_chestplate", new ArmorItem(ModArmorMaterials.DAMASCUS, EquipmentSlot.CHEST, new FabricItemSettings().group(MegalosModItemGroup.HOPLOLOGY)));
    public static final Item DAMASCUS_LEGGINGS = registerItem("damascus_leggings", new ArmorItem(ModArmorMaterials.DAMASCUS, EquipmentSlot.LEGS, new FabricItemSettings().group(MegalosModItemGroup.HOPLOLOGY)));
    public static final Item DAMASCUS_BOOTS = registerItem("damascus_boots", new ArmorItem(ModArmorMaterials.DAMASCUS, EquipmentSlot.FEET, new FabricItemSettings().group(MegalosModItemGroup.HOPLOLOGY)));

    public static final Item TITANIUM_HELMET = registerItem("titanium_helmet", new ArmorItem(ModArmorMaterials.TITANIUM, EquipmentSlot.HEAD, new FabricItemSettings().group(MegalosModItemGroup.HOPLOLOGY)));
    public static final Item TITANIUM_CHESTPLATE = registerItem("titanium_chestplate", new ArmorItem(ModArmorMaterials.TITANIUM, EquipmentSlot.CHEST, new FabricItemSettings().group(MegalosModItemGroup.HOPLOLOGY)));
    public static final Item TITANIUM_LEGGINGS = registerItem("titanium_leggings", new ArmorItem(ModArmorMaterials.TITANIUM, EquipmentSlot.LEGS, new FabricItemSettings().group(MegalosModItemGroup.HOPLOLOGY)));
    public static final Item TITANIUM_BOOTS = registerItem("titanium_boots", new ArmorItem(ModArmorMaterials.TITANIUM, EquipmentSlot.FEET, new FabricItemSettings().group(MegalosModItemGroup.HOPLOLOGY)));

    public static final Item JALAPENO_SEEDS = registerItem("",
            new AliasedBlockItem(ModBlocks.JALAPENO_PLANT,
                    new FabricItemSettings().group(MegalosModItemGroup.GASTRONOMY).maxCount(1)));

private static Item registerItem(String name, Item item){
    return Registry.register(Registry.ITEM, new Identifier(MegalosMod.MOD_ID, name), item);
}

    public static void registerModItems(){
        MegalosMod.LOGGER.info("Registering Mod Items for " + MegalosMod.MOD_ID);
    }
}
