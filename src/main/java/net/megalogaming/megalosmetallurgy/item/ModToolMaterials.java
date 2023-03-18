package net.megalogaming.megalosmetallurgy.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    ALUMINIUM(MiningLevels.WOOD, 159, 2.0f, 0.0f, 15, () -> Ingredient.ofItems(ModItems.ALUMINIUM_INGOT)),
    SILVER(MiningLevels.STONE, 229, 2.0f, 0.0f, 15, () -> Ingredient.ofItems(ModItems.SILVER_INGOT)),
    STEEL(MiningLevels.IRON, 350, 6.0f, 2.0f, 14, () -> Ingredient.ofItems(ModItems.STEEL_INGOT)),
    DAMASCUS(MiningLevels.DIAMOND, 631, 4.0f, 1.0f, 5, () -> Ingredient.ofItems(ModItems.DAMASCUS_INGOT)),
    TITANIUM(MiningLevels.DIAMOND, 836, 8.0f, 3.0f, 10, () -> Ingredient.ofItems(ModItems.TITANIUM_INGOT));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    private ModToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy<Ingredient>(repairIngredient);
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
