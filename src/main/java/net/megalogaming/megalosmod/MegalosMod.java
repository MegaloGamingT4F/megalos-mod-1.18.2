package net.megalogaming.megalosmod;

import net.fabricmc.api.ModInitializer;
import net.megalogaming.megalosmod.block.ModBlocks;
import net.megalogaming.megalosmod.item.ModItems;
import net.megalogaming.megalosmod.world.feature.ModConfiguredFeatures;
import net.megalogaming.megalosmod.world.gen.ModWorldGen;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MegalosMod implements ModInitializer {
    public static final String MOD_ID = "megalosmod";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModConfiguredFeatures.registerConfiguredFeatures();

        ModBlocks.registerModBlocks();
        ModItems.registerModItems();

        ModWorldGen.generateModWorldGen();
    }
}
