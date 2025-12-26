package net.zif_tech.more_tools.item.custom;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class ModSwordItem extends SwordItem {

    public ModSwordItem(ToolMaterial material, int damage, float attackSpeed, Settings settings) {
        super(material, settings.attributeModifiers(
                createAttributeModifiers(material, damage, attackSpeed)
        ));
    }
}
