package net.megalogaming.megalosmetallurgy;

import net.fabricmc.api.ModInitializer;
import net.megalogaming.megalosmetallurgy.block.ModBlocks;
import net.megalogaming.megalosmetallurgy.block.entity.ModBlockEntities;
import net.megalogaming.megalosmetallurgy.item.ModItems;
import net.megalogaming.megalosmetallurgy.recipe.ModRecipes;
import net.megalogaming.megalosmetallurgy.screen.ModScreenHandlers;
import net.megalogaming.megalosmetallurgy.world.feature.ModConfiguredFeatures;
import net.megalogaming.megalosmetallurgy.world.gen.ModWorldGen;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MegalosMetallurgy implements ModInitializer {
    public static final String MOD_ID = "megalosmetallurgy";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModConfiguredFeatures.registerConfiguredFeatures();

        ModBlocks.registerModBlocks();
        ModItems.registerModItems();

        ModWorldGen.generateModWorldGen();

        ModBlockEntities.registerAllBlockEntities();
        ModRecipes.registerRecipes();

        ModScreenHandlers.registerAllScreenHandlers();
    }
}
