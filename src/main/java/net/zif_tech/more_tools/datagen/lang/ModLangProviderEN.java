package net.zif_tech.more_tools.datagen.lang;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLangProviderEN extends FabricLanguageProvider {

    public ModLangProviderEN(
            FabricDataOutput dataOutput,
            CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup
    ) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder t) {

        // ===== STONE =====
        t.add("item.more_tools.stone_big_shovel", "Stone Big Shovel");
        t.add("item.more_tools.stone_big_shovel_lvl_2", "Stone Big Shovel II");
        t.add("item.more_tools.stone_cleaver", "Stone Cleaver");
        t.add("item.more_tools.stone_cleaver_lvl_2", "Stone Cleaver II");
        t.add("item.more_tools.stone_hammer", "Stone Hammer");
        t.add("item.more_tools.stone_hammer_lvl_2", "Stone Hammer II");
        t.add("item.more_tools.stone_big_hoe", "Stone Big Hoe");
        t.add("item.more_tools.stone_big_hoe_lvl_2", "Stone Big Hoe II");

        t.add("item.more_tools.stone_big_omni_tool", "Stone Big Omni Tool");
        t.add("item.more_tools.stone_omni_tool", "Stone Omni Tool");
        t.add("item.more_tools.stone_broadsword", "Stone Broadsword");
        t.add("item.more_tools.stone_dagger", "Stone Dagger");

        // ===== IRON =====
        t.add("item.more_tools.iron_big_shovel", "Iron Big Shovel");
        t.add("item.more_tools.iron_big_shovel_lvl_2", "Iron Big Shovel II");
        t.add("item.more_tools.iron_big_shovel_lvl_3", "Iron Big Shovel III");

        t.add("item.more_tools.iron_cleaver", "Iron Cleaver");
        t.add("item.more_tools.iron_cleaver_lvl_2", "Iron Cleaver II");
        t.add("item.more_tools.iron_cleaver_lvl_3", "Iron Cleaver III");

        t.add("item.more_tools.iron_hammer", "Iron Hammer");
        t.add("item.more_tools.iron_hammer_lvl_2", "Iron Hammer II");
        t.add("item.more_tools.iron_hammer_lvl_3", "Iron Hammer III");

        t.add("item.more_tools.iron_big_hoe", "Iron Big Hoe");
        t.add("item.more_tools.iron_big_hoe_lvl_2", "Iron Big Hoe II");
        t.add("item.more_tools.iron_big_hoe_lvl_3", "Iron Big Hoe III");

        t.add("item.more_tools.iron_big_omni_tool", "Iron Big Omni Tool");
        t.add("item.more_tools.iron_omni_tool", "Iron Omni Tool");
        t.add("item.more_tools.iron_broadsword", "Iron Broadsword");
        t.add("item.more_tools.iron_dagger", "Iron Dagger");

        // ===== GOLDEN =====
        t.add("item.more_tools.golden_big_shovel", "Golden Big Shovel");
        t.add("item.more_tools.golden_big_shovel_lvl_2", "Golden Big Shovel II");

        t.add("item.more_tools.golden_cleaver", "Golden Cleaver");
        t.add("item.more_tools.golden_cleaver_lvl_2", "Golden Cleaver II");

        t.add("item.more_tools.golden_hammer", "Golden Hammer");
        t.add("item.more_tools.golden_hammer_lvl_2", "Golden Hammer II");

        t.add("item.more_tools.golden_big_hoe", "Golden Big Hoe");
        t.add("item.more_tools.golden_big_hoe_lvl_2", "Golden Big Hoe II");

        t.add("item.more_tools.golden_big_omni_tool", "Golden Big Omni Tool");
        t.add("item.more_tools.golden_omni_tool", "Golden Omni Tool");
        t.add("item.more_tools.golden_broadsword", "Golden Broadsword");
        t.add("item.more_tools.golden_dagger", "Golden Dagger");

        // ===== DIAMOND =====
        t.add("item.more_tools.diamond_big_shovel", "Diamond Big Shovel");
        t.add("item.more_tools.diamond_big_shovel_lvl_2", "Diamond Big Shovel II");
        t.add("item.more_tools.diamond_big_shovel_lvl_3", "Diamond Big Shovel III");

        t.add("item.more_tools.diamond_cleaver", "Diamond Cleaver");
        t.add("item.more_tools.diamond_cleaver_lvl_2", "Diamond Cleaver II");
        t.add("item.more_tools.diamond_cleaver_lvl_3", "Diamond Cleaver III");

        t.add("item.more_tools.diamond_hammer", "Diamond Hammer");
        t.add("item.more_tools.diamond_hammer_lvl_2", "Diamond Hammer II");
        t.add("item.more_tools.diamond_hammer_lvl_3", "Diamond Hammer III");

        t.add("item.more_tools.diamond_big_hoe", "Diamond Big Hoe");
        t.add("item.more_tools.diamond_big_hoe_lvl_2", "Diamond Big Hoe II");
        t.add("item.more_tools.diamond_big_hoe_lvl_3", "Diamond Big Hoe III");

        t.add("item.more_tools.diamond_big_omni_tool", "Diamond Big Omni Tool");
        t.add("item.more_tools.diamond_omni_tool", "Diamond Omni Tool");
        t.add("item.more_tools.diamond_broadsword", "Diamond Broadsword");
        t.add("item.more_tools.diamond_dagger", "Diamond Dagger");

        // ===== NETHERITE =====
        t.add("item.more_tools.netherite_big_shovel", "Netherite Big Shovel");
        t.add("item.more_tools.netherite_big_shovel_lvl_2", "Netherite Big Shovel II");
        t.add("item.more_tools.netherite_big_shovel_lvl_3", "Netherite Big Shovel III");

        t.add("item.more_tools.netherite_cleaver", "Netherite Cleaver");
        t.add("item.more_tools.netherite_cleaver_lvl_2", "Netherite Cleaver II");
        t.add("item.more_tools.netherite_cleaver_lvl_3", "Netherite Cleaver III");

        t.add("item.more_tools.netherite_hammer", "Netherite Hammer");
        t.add("item.more_tools.netherite_hammer_lvl_2", "Netherite Hammer II");
        t.add("item.more_tools.netherite_hammer_lvl_3", "Netherite Hammer III");

        t.add("item.more_tools.netherite_big_hoe", "Netherite Big Hoe");
        t.add("item.more_tools.netherite_big_hoe_lvl_2", "Netherite Big Hoe II");
        t.add("item.more_tools.netherite_big_hoe_lvl_3", "Netherite Big Hoe III");

        t.add("item.more_tools.netherite_big_omni_tool", "Netherite Big Omni Tool");
        t.add("item.more_tools.netherite_omni_tool", "Netherite Omni Tool");
        t.add("item.more_tools.netherite_broadsword", "Netherite Broadsword");
        t.add("item.more_tools.netherite_dagger", "Netherite Dagger");

        // ===== MISC =====
        t.add("more_tools.more_tools_group", "More Tools Group");
        t.add("item.more_tools.size", "Base size: [%1$sx%1$sx%2$s]");
    }

}
