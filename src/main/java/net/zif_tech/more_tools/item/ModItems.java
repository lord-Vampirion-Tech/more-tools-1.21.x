package net.zif_tech.more_tools.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.Identifier;
import net.zif_tech.more_tools.MoreTools;
import net.zif_tech.more_tools.item.custom.*;
import net.zif_tech.more_tools.util.ModComponents;
import net.zif_tech.more_tools.util.ModTags;

import java.util.Map;

import static net.zif_tech.more_tools.util.ModToolMaterials.CUSTOM;

public class ModItems {

    private static Item.Settings toolSettings(int size, int deep) {
        return new Item.Settings()
                .component(ModComponents.SIZE, size)
                .component(ModComponents.DEEP, deep);
    }

    private static ToolMaterial materialTool(ToolMaterials materials, float durability, float miningSpeed) {
        return CUSTOM(materials, durability, miningSpeed);
    }

    //каменные инструменты
    public static final Item STONE_BIG_SHOVEL   = registerItem("stone_big_shovel",  new ModShovelItem   (materialTool(ToolMaterials.STONE,3.5f, 1.0f),2.0F,-2.8F, BlockTags.SHOVEL_MINEABLE, toolSettings(1, 0)));
    public static final Item STONE_CLEAVER      = registerItem("stone_cleaver",     new ModCleaverItem  (materialTool(ToolMaterials.STONE,3.5f, 1.0f),8.0F,-3.5F, BlockTags.AXE_MINEABLE, toolSettings(1, 0)));
    public static final Item STONE_HAMMER       = registerItem("stone_hammer",      new ModHammerItem   (materialTool(ToolMaterials.STONE,3.5f, 1.0f),2.0F,-2.8F, BlockTags.PICKAXE_MINEABLE, toolSettings(1, 0)));
    public static final Item STONE_BIG_HOE      = registerItem("stone_big_hoe",     new ModHoeItem      (materialTool(ToolMaterials.STONE,3.5f, 1.0f),-1.0F,-1.5F,BlockTags.HOE_MINEABLE, toolSettings(1, 0)));

    public static final Item STONE_OMNI_TOOL    = registerItem("stone_omni_tool",   new ModOmniToolItem (materialTool(ToolMaterials.STONE,3.5f, 1.0f),5.0F,-2.8F, ModTags.Blocks.MULTI_TOOL_MINEABLE,
            new Item.Settings()), Map.of(ItemGroups.TOOLS, Items.STONE_HOE));

    public static final Item STONE_BROADSWORD   = registerItem("stone_broadsword",  new ModSwordItem    (materialTool(ToolMaterials.STONE, 2.0f,0.0f),8,-3.5f, new Item.Settings()));
    public static final Item STONE_DAGGER       = registerItem("stone_dagger",      new ModSwordItem    (materialTool(ToolMaterials.STONE, 0.5f,0.0f),0,-1.5f, new Item.Settings()));

    //железные инструменты
    public static final Item IRON_BIG_SHOVEL        = registerItem("iron_big_shovel",       new ModShovelItem      (materialTool(ToolMaterials.IRON,3.5f, 1.0f),2.0F,-2.8F, BlockTags.SHOVEL_MINEABLE, toolSettings(1, 0)));
    public static final Item IRON_CLEAVER           = registerItem("iron_cleaver",          new ModCleaverItem     (materialTool(ToolMaterials.IRON,3.5f, 1.0f),8.0F,-3.5F, BlockTags.AXE_MINEABLE, toolSettings(1, 0)));
    public static final Item IRON_HAMMER            = registerItem("iron_hammer",           new ModHammerItem      (materialTool(ToolMaterials.IRON,3.5f, 1.0f),2.0F,-2.8F, BlockTags.PICKAXE_MINEABLE, toolSettings(1, 0)));
    public static final Item IRON_BIG_HOE           = registerItem("iron_big_hoe",          new ModHoeItem         (materialTool(ToolMaterials.IRON,3.5f, 1.0f),-1.0F,-1.5F,BlockTags.HOE_MINEABLE, toolSettings(1, 0)));
    public static final Item IRON_BIG_SHOVEL_LVL_2  = registerItem("iron_big_shovel_lvl_2", new ModShovelItem      (materialTool(ToolMaterials.IRON,4.5f, 1.5f),2.0F,-2.8F, BlockTags.SHOVEL_MINEABLE, toolSettings(2, 0)));
    public static final Item IRON_CLEAVER_LVL_2     = registerItem("iron_cleaver_lvl_2",    new ModCleaverItem     (materialTool(ToolMaterials.IRON,4.5f, 1.5f),9.0F,-3.7F, BlockTags.AXE_MINEABLE, toolSettings(2, 0)));
    public static final Item IRON_HAMMER_LVL_2      = registerItem("iron_hammer_lvl_2",     new ModHammerItem      (materialTool(ToolMaterials.IRON,4.5f, 1.5f),2.0F,-2.8F, BlockTags.PICKAXE_MINEABLE, toolSettings(2, 0)));
    public static final Item IRON_BIG_HOE_LVL_2     = registerItem("iron_big_hoe_lvl_2",    new ModHoeItem         (materialTool(ToolMaterials.IRON,4.5f, 1.5f),0.0F,-1.8F, BlockTags.HOE_MINEABLE, toolSettings(2, 0)));

    public static final Item IRON_BIG_OMNI_TOOL     = registerItem("iron_big_omni_tool",    new ModBigOmniToolItem (materialTool(ToolMaterials.IRON,4.0f, 2.0f),6.0F,-3.0F, ModTags.Blocks.MULTI_TOOL_MINEABLE,
            toolSettings(1,0)), Map.of(ItemGroups.TOOLS, Items.IRON_HOE));
    public static final Item IRON_OMNI_TOOL         = registerItem("iron_omni_tool",        new ModOmniToolItem    (materialTool(ToolMaterials.IRON,3.5f, 1.0f),5.0F,-2.0F, ModTags.Blocks.MULTI_TOOL_MINEABLE,
            new Item.Settings()),  Map.of(ItemGroups.TOOLS, Items.IRON_HOE));

    public static final Item IRON_BROADSWORD   = registerItem("iron_broadsword",  new ModSwordItem    (materialTool(ToolMaterials.IRON, 2.0f,0.0f),8,-3.5f, new Item.Settings()));
    public static final Item IRON_DAGGER       = registerItem("iron_dagger",      new ModSwordItem    (materialTool(ToolMaterials.IRON, 0.5f,0.0f),0,-1.5f, new Item.Settings()));

    //золотые инструменты
    public static final Item GOLDEN_BIG_SHOVEL        = registerItem("golden_big_shovel",       new ModShovelItem      (materialTool(ToolMaterials.GOLD,2.0f, 2.0f),2.0F,-2.8F,  BlockTags.SHOVEL_MINEABLE, toolSettings(1, 0)));
    public static final Item GOLDEN_CLEAVER           = registerItem("golden_cleaver",          new ModCleaverItem     (materialTool(ToolMaterials.GOLD,2.0f, 2.0f),8.0F,-3.5F,  BlockTags.AXE_MINEABLE, toolSettings(1, 0)));
    public static final Item GOLDEN_HAMMER            = registerItem("golden_hammer",           new ModHammerItem      (materialTool(ToolMaterials.GOLD,2.0f, 2.0f),2.0F,-2.8F,  BlockTags.PICKAXE_MINEABLE, toolSettings(1, 0)));
    public static final Item GOLDEN_BIG_HOE           = registerItem("golden_big_hoe",          new ModHoeItem         (materialTool(ToolMaterials.GOLD,2.0f, 2.0f),0.0F,-1.5F,  BlockTags.HOE_MINEABLE, toolSettings(1, 0)));
    public static final Item GOLDEN_BIG_SHOVEL_LVL_2  = registerItem("golden_big_shovel_lvl_2", new ModShovelItem      (materialTool(ToolMaterials.GOLD,3.0f, 3.0f),1.0F,-1.8F,  BlockTags.SHOVEL_MINEABLE, toolSettings(2, 0)));
    public static final Item GOLDEN_CLEAVER_LVL_2     = registerItem("golden_cleaver_lvl_2",    new ModCleaverItem     (materialTool(ToolMaterials.GOLD,3.0f, 3.0f),9.0F,-2.5F,  BlockTags.AXE_MINEABLE, toolSettings(2, 0)));
    public static final Item GOLDEN_HAMMER_LVL_2      = registerItem("golden_hammer_lvl_2",     new ModHammerItem      (materialTool(ToolMaterials.GOLD,3.0f, 3.0f),3.0F,-1.8F,  BlockTags.PICKAXE_MINEABLE, toolSettings(2, 0)));
    public static final Item GOLDEN_BIG_HOE_LVL_2     = registerItem("golden_big_hoe_lvl_2",    new ModHoeItem         (materialTool(ToolMaterials.GOLD,3.0f, 3.0f),1.0F,-0.5F,  BlockTags.HOE_MINEABLE, toolSettings(2, 0)));

    public static final Item GOLDEN_BIG_OMNI_TOOL     = registerItem("golden_big_omni_tool",    new ModBigOmniToolItem (materialTool(ToolMaterials.GOLD,4.0f, 2.0f),6.0F,-3.0F,  ModTags.Blocks.MULTI_TOOL_MINEABLE,
            toolSettings(1,0)), Map.of(ItemGroups.TOOLS, Items.GOLDEN_HOE));
    public static final Item GOLDEN_OMNI_TOOL         = registerItem("golden_omni_tool",        new ModOmniToolItem (materialTool(ToolMaterials.GOLD,2.0f, 2.0f),5.0F,-2.0F,     ModTags.Blocks.MULTI_TOOL_MINEABLE,
            new Item.Settings()), Map.of(ItemGroups.TOOLS, Items.GOLDEN_HOE));

    public static final Item GOLDEN_BROADSWORD   = registerItem("golden_broadsword",  new ModSwordItem    (materialTool(ToolMaterials.GOLD, 2.0f,0.0f),8,-3.5f, new Item.Settings()));
    public static final Item GOLDEN_DAGGER       = registerItem("golden_dagger",      new ModSwordItem    (materialTool(ToolMaterials.GOLD, 0.5f,0.0f),0,-1.5f, new Item.Settings()));

    //алмазные инструменты
    public static final Item DIAMOND_BIG_SHOVEL        = registerItem("diamond_big_shovel",       new ModShovelItem      (materialTool(ToolMaterials.DIAMOND,3.5f, 1.0f),2.0F,-2.8F, BlockTags.SHOVEL_MINEABLE, toolSettings(1, 0)));
    public static final Item DIAMOND_CLEAVER           = registerItem("diamond_cleaver",          new ModCleaverItem     (materialTool(ToolMaterials.DIAMOND,3.5f, 1.0f),7.0F,-3.5F, BlockTags.AXE_MINEABLE, toolSettings(1, 0)));
    public static final Item DIAMOND_HAMMER            = registerItem("diamond_hammer",           new ModHammerItem      (materialTool(ToolMaterials.DIAMOND,3.5f, 1.0f),2.0F,-2.8F, BlockTags.PICKAXE_MINEABLE, toolSettings(1, 0)));
    public static final Item DIAMOND_BIG_HOE           = registerItem("diamond_big_hoe",          new ModHoeItem         (materialTool(ToolMaterials.DIAMOND,3.5f, 1.0f),-2.0F,0.0F, BlockTags.HOE_MINEABLE, toolSettings(1, 0)));
    public static final Item DIAMOND_BIG_SHOVEL_LVL_2  = registerItem("diamond_big_shovel_lvl_2", new ModShovelItem      (materialTool(ToolMaterials.DIAMOND,4.5f, 1.5f),2.0F,-2.8F, BlockTags.SHOVEL_MINEABLE, toolSettings(2, 0)));
    public static final Item DIAMOND_CLEAVER_LVL_2     = registerItem("diamond_cleaver_lvl_2",    new ModCleaverItem     (materialTool(ToolMaterials.DIAMOND,4.5f, 1.5f),8.0F,-3.7F, BlockTags.AXE_MINEABLE, toolSettings(2, 0)));
    public static final Item DIAMOND_HAMMER_LVL_2      = registerItem("diamond_hammer_lvl_2",     new ModHammerItem      (materialTool(ToolMaterials.DIAMOND,4.5f, 1.5f),2.0F,-2.8F, BlockTags.PICKAXE_MINEABLE, toolSettings(2, 0)));
    public static final Item DIAMOND_BIG_HOE_LVL_2     = registerItem("diamond_big_hoe_lvl_2",    new ModHoeItem         (materialTool(ToolMaterials.DIAMOND,4.5f, 1.5f),-1.0F,0.0F, BlockTags.HOE_MINEABLE, toolSettings(2, 0)));
    public static final Item DIAMOND_BIG_SHOVEL_LVL_3  = registerItem("diamond_big_shovel_lvl_3", new ModShovelItem      (materialTool(ToolMaterials.DIAMOND,5.5f, 2.0f),2.0F,-2.8F, BlockTags.SHOVEL_MINEABLE, toolSettings(2, 2)));
    public static final Item DIAMOND_CLEAVER_LVL_3     = registerItem("diamond_cleaver_lvl_3",    new ModCleaverItem     (materialTool(ToolMaterials.DIAMOND,5.5f, 2.0f),10.0F,-3.8F,BlockTags.AXE_MINEABLE, toolSettings(2, 2)));
    public static final Item DIAMOND_HAMMER_LVL_3      = registerItem("diamond_hammer_lvl_3",     new ModHammerItem      (materialTool(ToolMaterials.DIAMOND,5.5f, 2.0f),2.0F,-2.6F, BlockTags.PICKAXE_MINEABLE, toolSettings(2, 2)));
    public static final Item DIAMOND_BIG_HOE_LVL_3     = registerItem("diamond_big_hoe_lvl_3",    new ModHoeItem         (materialTool(ToolMaterials.DIAMOND,5.5f, 2.0f),-1.0F,0.0F, BlockTags.HOE_MINEABLE, toolSettings(2, 2)));

    public static final Item DIAMOND_BIG_OMNI_TOOL     = registerItem("diamond_big_omni_tool",    new ModBigOmniToolItem (materialTool(ToolMaterials.DIAMOND,4.0f, 2.0f),6.0F,-3.0F,    ModTags.Blocks.MULTI_TOOL_MINEABLE,
            toolSettings(1,0)), Map.of(ItemGroups.TOOLS, Items.DIAMOND_HOE));
    public static final Item DIAMOND_OMNI_TOOL         = registerItem("diamond_omni_tool",        new ModOmniToolItem    (materialTool(ToolMaterials.DIAMOND,3.5f, 1.0f),5.0F,-2.0F, ModTags.Blocks.MULTI_TOOL_MINEABLE,
            new Item.Settings()), Map.of(ItemGroups.TOOLS, Items.DIAMOND_HOE));

    public static final Item DIAMOND_BROADSWORD   = registerItem("diamond_broadsword",  new ModSwordItem    (materialTool(ToolMaterials.DIAMOND, 2.0f,0.0f),8,-3.5f, new Item.Settings()));
    public static final Item DIAMOND_DAGGER       = registerItem("diamond_dagger",      new ModSwordItem    (materialTool(ToolMaterials.DIAMOND, 0.5f,0.0f),0,-1.5f, new Item.Settings()));

    //незеритовые инструменты
    public static final Item NETHERITE_BIG_SHOVEL        = registerItem("netherite_big_shovel",       new ModShovelItem      (materialTool(ToolMaterials.NETHERITE,3.5f, 1.0f),2.0F,-2.8F, BlockTags.SHOVEL_MINEABLE, toolSettings(1, 0)));
    public static final Item NETHERITE_CLEAVER           = registerItem("netherite_cleaver",          new ModCleaverItem     (materialTool(ToolMaterials.NETHERITE,3.5f, 1.0f),8.0F,-3.5F, BlockTags.AXE_MINEABLE, toolSettings(1, 0)));
    public static final Item NETHERITE_HAMMER            = registerItem("netherite_hammer",           new ModHammerItem      (materialTool(ToolMaterials.NETHERITE,3.5f, 1.0f),2.0F,-2.8F, BlockTags.PICKAXE_MINEABLE, toolSettings(1, 0)));
    public static final Item NETHERITE_BIG_HOE           = registerItem("netherite_big_hoe",          new ModHoeItem         (materialTool(ToolMaterials.NETHERITE,3.5f, 1.0f),-3.0F,0.0F, BlockTags.HOE_MINEABLE, toolSettings(1, 0)));
    public static final Item NETHERITE_BIG_SHOVEL_LVL_2  = registerItem("netherite_big_shovel_lvl_2", new ModShovelItem      (materialTool(ToolMaterials.NETHERITE,4.5f, 1.5f),2.0F,-2.8F, BlockTags.SHOVEL_MINEABLE, toolSettings(2, 2)));
    public static final Item NETHERITE_CLEAVER_LVL_2     = registerItem("netherite_cleaver_lvl_2",    new ModCleaverItem     (materialTool(ToolMaterials.NETHERITE,4.5f, 1.5f),9.0F,-3.7F, BlockTags.AXE_MINEABLE, toolSettings(2, 2)));
    public static final Item NETHERITE_HAMMER_LVL_2      = registerItem("netherite_hammer_lvl_2",     new ModHammerItem      (materialTool(ToolMaterials.NETHERITE,4.5f, 1.5f),2.0F,-2.8F, BlockTags.PICKAXE_MINEABLE, toolSettings(2, 2)));
    public static final Item NETHERITE_BIG_HOE_LVL_2     = registerItem("netherite_big_hoe_lvl_2",    new ModHoeItem         (materialTool(ToolMaterials.NETHERITE,4.5f, 1.5f),-2.0F,0.0F, BlockTags.HOE_MINEABLE, toolSettings(2, 2)));
    public static final Item NETHERITE_BIG_SHOVEL_LVL_3  = registerItem("netherite_big_shovel_lvl_3", new ModShovelItem      (materialTool(ToolMaterials.NETHERITE,5.5f, 2.0f),2.0F,-2.8F, BlockTags.SHOVEL_MINEABLE, toolSettings(3, 2)));
    public static final Item NETHERITE_CLEAVER_LVL_3     = registerItem("netherite_cleaver_lvl_3",    new ModCleaverItem     (materialTool(ToolMaterials.NETHERITE,5.5f, 2.0f),10.0F,-3.8F,BlockTags.AXE_MINEABLE, toolSettings(3, 2)));
    public static final Item NETHERITE_HAMMER_LVL_3      = registerItem("netherite_hammer_lvl_3",     new ModHammerItem      (materialTool(ToolMaterials.NETHERITE,5.5f, 2.0f),2.0F,-2.6F, BlockTags.PICKAXE_MINEABLE, toolSettings(3, 2)));
    public static final Item NETHERITE_BIG_HOE_LVL_3     = registerItem("netherite_big_hoe_lvl_3",    new ModHoeItem         (materialTool(ToolMaterials.NETHERITE,5.5f, 2.0f),-1.0F,0.0F, BlockTags.HOE_MINEABLE, toolSettings(3, 2)));

    public static final Item NETHERITE_BIG_OMNI_TOOL     = registerItem("netherite_big_omni_tool",    new ModBigOmniToolItem (materialTool(ToolMaterials.NETHERITE,4.0f, 2.0f),6.0F,-3.0F,      ModTags.Blocks.MULTI_TOOL_MINEABLE,
            toolSettings(1,0)), Map.of(ItemGroups.TOOLS, Items.NETHERITE_HOE));
    public static final Item NETHERITE_OMNI_TOOL         = registerItem("netherite_omni_tool",        new ModOmniToolItem    (materialTool(ToolMaterials.NETHERITE,3.5f, 1.0f),5.0F,-2.0F, ModTags.Blocks.MULTI_TOOL_MINEABLE,
            new Item.Settings()), Map.of(ItemGroups.TOOLS, Items.NETHERITE_HOE));

    public static final Item NETHERITE_BROADSWORD   = registerItem("netherite_broadsword",  new ModSwordItem    (materialTool(ToolMaterials.NETHERITE, 2.0f,0.0f),8,-3.5f, new Item.Settings()));
    public static final Item NETHERITE_DAGGER       = registerItem("netherite_dagger",      new ModSwordItem    (materialTool(ToolMaterials.NETHERITE, 0.5f,0.0f),0,-1.5f, new Item.Settings()));

    static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MoreTools.MOD_ID, name), item);
    }

    static Item registerItem(String name, Item item, Map<RegistryKey<ItemGroup>, Item> groupAfterMap) {
        Item registeredItem = registerItem(name, item);

        if (groupAfterMap == null || groupAfterMap.isEmpty()) return registeredItem;

        groupAfterMap.forEach((group, afterItem) ->
                ItemGroupEvents.modifyEntriesEvent(group).register(entries -> {
                    if (afterItem != null) {
                        entries.addBefore(afterItem, registeredItem);
                    } else {
                        entries.add(registeredItem);
                    }
                })
        );

        return registeredItem;
    }

    public static void initialize() {
        MoreTools.LOGGER.info("Registering {} items", MoreTools.MOD_ID);
    }
}
