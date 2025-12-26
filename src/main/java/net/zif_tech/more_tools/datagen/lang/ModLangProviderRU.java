package net.zif_tech.more_tools.datagen.lang;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLangProviderRU extends FabricLanguageProvider {

    public ModLangProviderRU(
            FabricDataOutput dataOutput,
            CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup
    ) {
        super(dataOutput, "ru_ru", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder t) {

        // ===== STONE =====
        t.add("item.more_tools.stone_big_shovel", "Каменная большая лопата");
        t.add("item.more_tools.stone_big_shovel_lvl_2", "Каменная большая лопата II");
        t.add("item.more_tools.stone_cleaver", "Каменный тесак");
        t.add("item.more_tools.stone_cleaver_lvl_2", "Каменный тесак II");
        t.add("item.more_tools.stone_hammer", "Каменный молот");
        t.add("item.more_tools.stone_hammer_lvl_2", "Каменный молот II");
        t.add("item.more_tools.stone_big_hoe", "Каменная большая мотыга");
        t.add("item.more_tools.stone_big_hoe_lvl_2", "Каменная большая мотыга II");

        t.add("item.more_tools.stone_big_omni_tool", "Каменный большой универсальный инструмент");
        t.add("item.more_tools.stone_omni_tool", "Каменный универсальный инструмент");
        t.add("item.more_tools.stone_broadsword", "Каменный палаш");
        t.add("item.more_tools.stone_dagger", "Каменный кинжал");

        // ===== IRON =====
        t.add("item.more_tools.iron_big_shovel", "Железная большая лопата");
        t.add("item.more_tools.iron_big_shovel_lvl_2", "Железная большая лопата II");
        t.add("item.more_tools.iron_big_shovel_lvl_3", "Железная большая лопата III");

        t.add("item.more_tools.iron_cleaver", "Железный тесак");
        t.add("item.more_tools.iron_cleaver_lvl_2", "Железный тесак II");
        t.add("item.more_tools.iron_cleaver_lvl_3", "Железный тесак III");

        t.add("item.more_tools.iron_hammer", "Железный молот");
        t.add("item.more_tools.iron_hammer_lvl_2", "Железный молот II");
        t.add("item.more_tools.iron_hammer_lvl_3", "Железный молот III");

        t.add("item.more_tools.iron_big_hoe", "Железная большая мотыга");
        t.add("item.more_tools.iron_big_hoe_lvl_2", "Железная большая мотыга II");
        t.add("item.more_tools.iron_big_hoe_lvl_3", "Железная большая мотыга III");

        t.add("item.more_tools.iron_big_omni_tool", "Железный большой универсальный инструмент");
        t.add("item.more_tools.iron_omni_tool", "Железный универсальный инструмент");
        t.add("item.more_tools.iron_broadsword", "Железный палаш");
        t.add("item.more_tools.iron_dagger", "Железный кинжал");

        // ===== GOLDEN =====
        t.add("item.more_tools.golden_big_shovel", "Золотая большая лопата");
        t.add("item.more_tools.golden_big_shovel_lvl_2", "Золотая большая лопата II");

        t.add("item.more_tools.golden_cleaver", "Золотой тесак");
        t.add("item.more_tools.golden_cleaver_lvl_2", "Золотой тесак II");

        t.add("item.more_tools.golden_hammer", "Золотой молот");
        t.add("item.more_tools.golden_hammer_lvl_2", "Золотой молот II");

        t.add("item.more_tools.golden_big_hoe", "Золотая большая мотыга");
        t.add("item.more_tools.golden_big_hoe_lvl_2", "Золотая большая мотыга II");

        t.add("item.more_tools.golden_big_omni_tool", "Золотой большой универсальный инструмент");
        t.add("item.more_tools.golden_omni_tool", "Золотой универсальный инструмент");
        t.add("item.more_tools.golden_broadsword", "Золотой палаш");
        t.add("item.more_tools.golden_dagger", "Золотой кинжал");

        // ===== DIAMOND =====
        t.add("item.more_tools.diamond_big_shovel", "Алмазная большая лопата");
        t.add("item.more_tools.diamond_big_shovel_lvl_2", "Алмазная большая лопата II");
        t.add("item.more_tools.diamond_big_shovel_lvl_3", "Алмазная большая лопата III");

        t.add("item.more_tools.diamond_cleaver", "Алмазный тесак");
        t.add("item.more_tools.diamond_cleaver_lvl_2", "Алмазный тесак II");
        t.add("item.more_tools.diamond_cleaver_lvl_3", "Алмазный тесак III");

        t.add("item.more_tools.diamond_hammer", "Алмазный молот");
        t.add("item.more_tools.diamond_hammer_lvl_2", "Алмазный молот II");
        t.add("item.more_tools.diamond_hammer_lvl_3", "Алмазный молот III");

        t.add("item.more_tools.diamond_big_hoe", "Алмазная большая мотыга");
        t.add("item.more_tools.diamond_big_hoe_lvl_2", "Алмазная большая мотыга II");
        t.add("item.more_tools.diamond_big_hoe_lvl_3", "Алмазная большая мотыга III");

        t.add("item.more_tools.diamond_big_omni_tool", "Алмазный большой универсальный инструмент");
        t.add("item.more_tools.diamond_omni_tool", "Алмазный универсальный инструмент");
        t.add("item.more_tools.diamond_broadsword", "Алмазный палаш");
        t.add("item.more_tools.diamond_dagger", "Алмазный кинжал");

        // ===== NETHERITE =====
        t.add("item.more_tools.netherite_big_shovel", "Незеритовая большая лопата");
        t.add("item.more_tools.netherite_big_shovel_lvl_2", "Незеритовая большая лопата II");
        t.add("item.more_tools.netherite_big_shovel_lvl_3", "Незеритовая большая лопата III");

        t.add("item.more_tools.netherite_cleaver", "Незеритовый тесак");
        t.add("item.more_tools.netherite_cleaver_lvl_2", "Незеритовый тесак II");
        t.add("item.more_tools.netherite_cleaver_lvl_3", "Незеритовый тесак III");

        t.add("item.more_tools.netherite_hammer", "Незеритовый молот");
        t.add("item.more_tools.netherite_hammer_lvl_2", "Незеритовый молот II");
        t.add("item.more_tools.netherite_hammer_lvl_3", "Незеритовый молот III");

        t.add("item.more_tools.netherite_big_hoe", "Незеритовая большая мотыга");
        t.add("item.more_tools.netherite_big_hoe_lvl_2", "Незеритовая большая мотыга II");
        t.add("item.more_tools.netherite_big_hoe_lvl_3", "Незеритовая большая мотыга III");

        t.add("item.more_tools.netherite_big_omni_tool", "Незеритовый большой универсальный инструмент");
        t.add("item.more_tools.netherite_omni_tool", "Незеритовый универсальный инструмент");
        t.add("item.more_tools.netherite_broadsword", "Незеритовый палаш");
        t.add("item.more_tools.netherite_dagger", "Незеритовый кинжал");

        // ===== MISC =====
        t.add("more_tools.more_tools_group", "Группа More Tools");
        t.add("item.more_tools.size", "Базовый размер: [%1$sx%1$sx%2$s]");
    }


}
