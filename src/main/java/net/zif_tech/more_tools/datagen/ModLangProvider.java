package net.zif_tech.more_tools.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLangProvider extends FabricLanguageProvider {
    private final String language;

    public ModLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup, String language) {
        super(dataOutput, language, registryLookup);
        this.language = language;
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        String[] materials = {"stone", "iron", "golden", "diamond", "netherite"};
        String[] tools = {"big_shovel", "cleaver", "hammer", "big_hoe", "big_omni_tool", "omni_tool", "broadsword", "dagger"};

        String[] toolNamesEN = {"Big Shovel", "Cleaver", "Hammer", "Big Hoe", "Big Omni Tool", "Omni Tool", "Broadsword", "Dagger"};
        String[] toolNamesRU = {"Большая лопата", "Тесак", "Молот", "Большая мотыга", "Большой универсальный инструмент", "Универсальный инструмент", "Палаш", "Кинжал"};

        for (String material : materials) {
            for (int i = 0; i < tools.length; i++) {
                String baseTool = tools[i];
                String nameEN = toolNamesEN[i];
                String nameRU = toolNamesRU[i];

                int maxLevel;
                if (material.equals("stone")) maxLevel = 1;
                else if (material.equals("golden")) maxLevel = 2;
                else maxLevel = 3; // iron, diamond, netherite

                // Только для инструментов с уровнями
                if (baseTool.equals("big_shovel") || baseTool.equals("cleaver") || baseTool.equals("hammer") || baseTool.equals("big_hoe")) {
                    for (int lvl = 1; lvl <= maxLevel; lvl++) {
                        String levelSuffix = (lvl == 1) ? "" : "_lvl_" + lvl;
                        String key = "item.more_tools." + material + "_" + baseTool + levelSuffix;
                        String value = capitalize(material) + " " + (language.equals("ru_ru") ? nameRU : nameEN) + (lvl > 1 ? " " + roman(lvl) : "");
                        translationBuilder.add(key, value);
                    }
                } else {
                    String key = "item.more_tools." + material + "_" + baseTool;
                    String value = capitalize(material) + " " + (language.equals("ru_ru") ? nameRU : nameEN);
                    translationBuilder.add(key, value);
                }
            }
        }

        // Общие переводы
        translationBuilder.add("more_tools.more_tools_group", language.equals("ru_ru") ? "Группа More tools" : "More tools group");
        translationBuilder.add("item.more_tools.size", language.equals("ru_ru") ? "Базовый размер: [%1$sx%1$sx%2$s]" : "Base size: [%1$sx%1$sx%2$s]");
    }

    private static String capitalize(String s) {
        return s.substring(0, 1).toUpperCase() + s.substring(1);
    }

    private static String roman(int num) {
        return switch (num) {
            case 2 -> "II";
            case 3 -> "III";
            default -> "";
        };
    }
}
