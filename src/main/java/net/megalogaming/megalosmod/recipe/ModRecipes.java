package net.megalogaming.megalosmod.recipe;


import net.megalogaming.megalosmod.MegalosMod;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModRecipes {
    public static void registerRecipes(){
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(MegalosMod.MOD_ID, MetallurgicFurnaceRecipe.Serializer.ID),
                MetallurgicFurnaceRecipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(MegalosMod.MOD_ID, MetallurgicFurnaceRecipe.Type.ID),
                MetallurgicFurnaceRecipe.Type.INSTANCE);
    }
}
