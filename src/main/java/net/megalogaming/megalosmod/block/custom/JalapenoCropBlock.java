package net.megalogaming.megalosmod.block.custom;

import net.megalogaming.megalosmod.item.ModItems;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;

public class JalapenoCropBlock extends CropBlock {
    public JalapenoCropBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.JALAPENO_SEEDS;
    }
}
