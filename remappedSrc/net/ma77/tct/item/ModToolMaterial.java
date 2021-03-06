package net.ma77.tct.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.tag.ItemTags;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {

    STONE(MiningLevels.STONE, 150, 4.0f, 1.0f, 5, () -> Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS)),
    COPPER(MiningLevels.IRON, 400, 5.0f, 1.5f, 7, () -> Ingredient.ofItems(Items.COPPER_INGOT)),
    IRON(MiningLevels.IRON, 800, 6.0f, 2.0f, 8, () -> Ingredient.ofItems(Items.IRON_INGOT)),
    DIAMOND(MiningLevels.DIAMOND, 1500, 8.0f, 3.0f, 10, () -> Ingredient.ofItems(Items.DIAMOND)),
    NETHERITE(MiningLevels.NETHERITE, 2000, 10.0f, 4.0f, 15, () -> Ingredient.ofItems(Items.NETHERITE_INGOT));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    private ModToolMaterial(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
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