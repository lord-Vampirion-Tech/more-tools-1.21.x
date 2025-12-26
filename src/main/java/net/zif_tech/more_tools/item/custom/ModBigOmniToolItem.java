package net.zif_tech.more_tools.item.custom;

import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.registry.tag.TagKey;


public class ModBigOmniToolItem extends ModHammerItem {
    public ModBigOmniToolItem(ToolMaterial material, float damage, float attackSpeed, TagKey<Block> blocksTag, Settings settings) {
        super(material, damage, attackSpeed, blocksTag, settings);
    }
}
