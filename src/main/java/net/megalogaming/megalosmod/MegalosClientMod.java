package net.megalogaming.megalosmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.megalogaming.megalosmod.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;

public class MegalosClientMod implements ClientModInitializer {
    @Override
    public void onInitializeClient(){
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.METALLURGIC_FURNACE, RenderLayer.getCutout());
    }
}
