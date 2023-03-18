package net.megalogaming.megalosmetallurgy.recipe;


import net.megalogaming.megalosmetallurgy.MegalosMetallurgy;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModRecipes {
    public static void registerRecipes(){
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(MegalosMetallurgy.MOD_ID, MetallurgicFurnaceRecipe.Serializer.ID),
                MetallurgicFurnaceRecipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(MegalosMetallurgy.MOD_ID, MetallurgicFurnaceRecipe.Type.ID),
                MetallurgicFurnaceRecipe.Type.INSTANCE);
    }
}
