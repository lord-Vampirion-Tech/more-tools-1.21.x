package net.zif_tech.more_tools.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.zif_tech.more_tools.MoreTools;

import java.util.Map;


public class ModItemGroups {

    public static final ItemGroup MORE_TOOLS_GROUP =  Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MoreTools.MOD_ID, "more_tools_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.DIAMOND_HAMMER))
                    .displayName(Text.translatable("more_tools.more_tools_group"))
                    .entries(((displayContext, entries) -> {

                        entries.add(ModItems.STONE_DAGGER);
                        entries.add(ModItems.STONE_BROADSWORD);
                        entries.add(ModItems.IRON_DAGGER);
                        entries.add(ModItems.IRON_BROADSWORD);
                        entries.add(ModItems.GOLDEN_DAGGER);
                        entries.add(ModItems.GOLDEN_BROADSWORD);
                        entries.add(ModItems.DIAMOND_DAGGER);
                        entries.add(ModItems.DIAMOND_BROADSWORD);
                        entries.add(ModItems.NETHERITE_DAGGER);
                        entries.add(ModItems.NETHERITE_BROADSWORD);

                        entries.add(ModItems.STONE_BIG_SHOVEL);
//                        entries.add(ModItems.COPPER_BIG_SHOVEL);
                        entries.add(ModItems.IRON_BIG_SHOVEL);
                        entries.add(ModItems.IRON_BIG_SHOVEL_LVL_2);
                        entries.add(ModItems.GOLDEN_BIG_SHOVEL);
                        entries.add(ModItems.GOLDEN_BIG_SHOVEL_LVL_2);
                        entries.add(ModItems.DIAMOND_BIG_SHOVEL);
                        entries.add(ModItems.DIAMOND_BIG_SHOVEL_LVL_2);
                        entries.add(ModItems.DIAMOND_BIG_SHOVEL_LVL_3);
                        entries.add(ModItems.NETHERITE_BIG_SHOVEL);
                        entries.add(ModItems.NETHERITE_BIG_SHOVEL_LVL_2);
                        entries.add(ModItems.NETHERITE_BIG_SHOVEL_LVL_3);

                        entries.add(ModItems.STONE_CLEAVER);
//                        entries.add(ModItems.COPPER_CLEAVER);
                        entries.add(ModItems.IRON_CLEAVER);
                        entries.add(ModItems.IRON_CLEAVER_LVL_2);
                        entries.add(ModItems.GOLDEN_CLEAVER);
                        entries.add(ModItems.GOLDEN_CLEAVER_LVL_2);
                        entries.add(ModItems.DIAMOND_CLEAVER);
                        entries.add(ModItems.DIAMOND_CLEAVER_LVL_2);
                        entries.add(ModItems.DIAMOND_CLEAVER_LVL_3);
                        entries.add(ModItems.NETHERITE_CLEAVER);
                        entries.add(ModItems.NETHERITE_CLEAVER_LVL_2);
                        entries.add(ModItems.NETHERITE_CLEAVER_LVL_3);

                        entries.add(ModItems.STONE_HAMMER);
//                        entries.add(ModItems.COPPER_HAMMER);
                        entries.add(ModItems.IRON_HAMMER);
                        entries.add(ModItems.IRON_HAMMER_LVL_2);
                        entries.add(ModItems.GOLDEN_HAMMER);
                        entries.add(ModItems.GOLDEN_HAMMER_LVL_2);
                        entries.add(ModItems.DIAMOND_HAMMER);
                        entries.add(ModItems.DIAMOND_HAMMER_LVL_2);
                        entries.add(ModItems.DIAMOND_HAMMER_LVL_3);
                        entries.add(ModItems.NETHERITE_HAMMER);
                        entries.add(ModItems.NETHERITE_HAMMER_LVL_2);
                        entries.add(ModItems.NETHERITE_HAMMER_LVL_3);

                        entries.add(ModItems.STONE_BIG_HOE);
//                        entries.add(ModItems.COPPER_BIG_HOE);
                        entries.add(ModItems.IRON_BIG_HOE);
                        entries.add(ModItems.IRON_BIG_HOE_LVL_2);
                        entries.add(ModItems.GOLDEN_BIG_HOE);
                        entries.add(ModItems.GOLDEN_BIG_HOE_LVL_2);
                        entries.add(ModItems.DIAMOND_BIG_HOE);
                        entries.add(ModItems.DIAMOND_BIG_HOE_LVL_2);
                        entries.add(ModItems.DIAMOND_BIG_HOE_LVL_3);
                        entries.add(ModItems.NETHERITE_BIG_HOE);
                        entries.add(ModItems.NETHERITE_BIG_HOE_LVL_2);
                        entries.add(ModItems.NETHERITE_BIG_HOE_LVL_3);

                        entries.add(ModItems.STONE_OMNI_TOOL);
//                        entries.add(ModItems.COPPER_BIG_HOE);
                        entries.add(ModItems.IRON_OMNI_TOOL);
                        entries.add(ModItems.IRON_BIG_OMNI_TOOL);
                        entries.add(ModItems.GOLDEN_OMNI_TOOL);
                        entries.add(ModItems.GOLDEN_BIG_OMNI_TOOL);
                        entries.add(ModItems.DIAMOND_OMNI_TOOL);
                        entries.add(ModItems.DIAMOND_BIG_OMNI_TOOL);
                        entries.add(ModItems.NETHERITE_OMNI_TOOL);
                        entries.add(ModItems.NETHERITE_BIG_OMNI_TOOL);

                    })).build()
            );

    public static void initialize() {
        MoreTools.LOGGER.info("Registering {} item groups", MoreTools.MOD_ID);
    }
}
