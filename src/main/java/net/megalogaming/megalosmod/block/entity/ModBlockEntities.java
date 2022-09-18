package net.megalogaming.megalosmod.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.megalogaming.megalosmod.MegalosMod;
import net.megalogaming.megalosmod.block.ModBlocks;
import net.minecraft.block.entity.BlockEntityType;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlockEntities {
    public static BlockEntityType<MetallurgicFurnaceBlockEntity> METALLURGIC_FURNACE;

    public static void registerAllBlockEntities(){
        METALLURGIC_FURNACE = Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(MegalosMod.MOD_ID, "metallurgic_furnace"),
                FabricBlockEntityTypeBuilder.create(MetallurgicFurnaceBlockEntity::new,
                        ModBlocks.METALLURGIC_FURNACE).build(null));
    }
}
