package net.zif_tech.more_tools.util;

import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.TagKey;


public class ModToolMaterials implements ToolMaterial {
    private final ToolMaterial baseMaterial;
    private final float customDurability;
    private final float customMiningSpeed;

    public ModToolMaterials(ToolMaterial baseMaterial, float customDurability, float customMiningSpeed) {
        this.baseMaterial = baseMaterial;
        this.customDurability = customDurability;
        this.customMiningSpeed = customMiningSpeed;
    }

    public static ToolMaterial CUSTOM(ToolMaterial toolMaterials, float durability, float miningSpeed) {
        return new ModToolMaterials(toolMaterials, toolMaterials.getDurability() * durability, toolMaterials.getMiningSpeedMultiplier() + miningSpeed);
    }

    public static ToolMaterial CUSTOM(ToolMaterial toolMaterials, float durability) {
        return CUSTOM(toolMaterials, durability, 0);
    }


    @Override
    public int getDurability() {return (int) this.customDurability;}

    @Override
    public float getMiningSpeedMultiplier() {return customMiningSpeed;}

    @Override
    public float getAttackDamage() {return this.baseMaterial.getAttackDamage();}

    @Override
    public TagKey<Block> getInverseTag() {return this.baseMaterial.getInverseTag();}

    @Override
    public int getEnchantability() {return this.baseMaterial.getEnchantability();}

    @Override
    public Ingredient getRepairIngredient() {return this.baseMaterial.getRepairIngredient();}

}
