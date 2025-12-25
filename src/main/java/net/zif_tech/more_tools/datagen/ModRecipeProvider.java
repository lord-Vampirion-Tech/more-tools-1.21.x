package net.zif_tech.more_tools.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.SmithingTransformRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.zif_tech.more_tools.MoreTools;
import net.zif_tech.more_tools.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    public static void generateBigToolRecipe(RecipeExporter exporter, Item resultItem, Item tool, TagKey<Item> tagItem) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, resultItem)
                .pattern("#x#")
                .pattern(" / ")
                .pattern(" / ")
                .input('#', tagItem)
                .input('x', tool)
                .input('/', Items.STICK)
                .criterion("", RecipeProvider.conditionsFromItem(resultItem))
                .criterion("", RecipeProvider.conditionsFromTag(tagItem))
                .criterion("", RecipeProvider.conditionsFromItem(tool))
                .criterion("", RecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter);
    }
    public static void generateBigToolRecipe(RecipeExporter exporter, Item resultItem, Item tool, Item resource) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, resultItem)
                .pattern("#x#")
                .pattern(" / ")
                .pattern(" / ")
                .input('#', resource)
                .input('x', tool)
                .input('/', Items.STICK)
                .criterion("", RecipeProvider.conditionsFromItem(resultItem))
                .criterion("", RecipeProvider.conditionsFromItem(resource))
                .criterion("", RecipeProvider.conditionsFromItem(tool))
                .criterion("", RecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter);
    }
    public static void generateOmniToolRecipe(RecipeExporter exporter, Item resultItem, Item tool1, Item tool2, Item tool3) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, resultItem)
                .pattern("123")
                .pattern(" / ")
                .pattern(" / ")
                .input('1', tool1)
                .input('2', tool2)
                .input('3', tool3)
                .input('/', Items.STICK)
                .criterion("", RecipeProvider.conditionsFromItem(resultItem))
                .criterion("", RecipeProvider.conditionsFromItem(tool1))
                .criterion("", RecipeProvider.conditionsFromItem(tool2))
                .criterion("", RecipeProvider.conditionsFromItem(tool3))
                .criterion("", RecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter);
    }
    public static void generateToolRecipes(RecipeExporter exporter, Item material, Item shovel, Item axe, Item pickaxe, Item hoe, Item sword) {
        createToolRecipe(exporter, shovel, material, "#", "/", "/");
        createToolRecipe(exporter, axe, material, "##", "#/", " /");
        createToolRecipe(exporter, pickaxe, material, "###", " / ", " / ");
        createToolRecipe(exporter, hoe, material, "##", " /", " /");
        createToolRecipe(exporter, sword, material, "#", "#", "/");
    }
    private static void createToolRecipe(RecipeExporter exporter, Item result, Item material, String row1, String row2, String row3) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, result)
                .pattern(row1)
                .pattern(row2)
                .pattern(row3)
                .input('#', material)
                .input('/', Items.STICK)
                .criterion("has_material", RecipeProvider.conditionsFromItem(material))
                .criterion("has_stick", RecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter);
    }

    public static void generateSmithingTransformToolRecipe(RecipeExporter exporter, Item template, Item base_tool, Item materials, Item result_item, RecipeCategory recipeCategory) {
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(template),
                        Ingredient.ofItems(base_tool),
                        Ingredient.ofItems(materials),
                        recipeCategory,
                        result_item)
                .criterion(hasItem(base_tool), conditionsFromItem(base_tool))
                .criterion(hasItem(materials), conditionsFromItem(materials))
                .criterion(hasItem(result_item), conditionsFromItem(result_item))
                .offerTo(exporter, result_item.getName().getString().replace("item."+ MoreTools.MOD_ID +".", "") + "_smithing");
    }

    @Override
    public void generate(RecipeExporter exporter) {
        generateSmithingTransformToolRecipe(exporter, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ModItems.DIAMOND_BIG_SHOVEL, Items.NETHERITE_BLOCK, ModItems.NETHERITE_BIG_SHOVEL, RecipeCategory.TOOLS);
        generateSmithingTransformToolRecipe(exporter, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ModItems.DIAMOND_BIG_SHOVEL_LVL_2, Items.NETHERITE_BLOCK, ModItems.NETHERITE_BIG_SHOVEL_LVL_2, RecipeCategory.TOOLS);
        generateSmithingTransformToolRecipe(exporter, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ModItems.NETHERITE_BIG_SHOVEL_LVL_2, Items.NETHERITE_BLOCK, ModItems.NETHERITE_BIG_SHOVEL_LVL_3, RecipeCategory.TOOLS);

        generateSmithingTransformToolRecipe(exporter, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ModItems.DIAMOND_CLEAVER, Items.NETHERITE_BLOCK, ModItems.NETHERITE_CLEAVER, RecipeCategory.TOOLS);
        generateSmithingTransformToolRecipe(exporter, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ModItems.DIAMOND_CLEAVER_LVL_2, Items.NETHERITE_BLOCK, ModItems.NETHERITE_CLEAVER_LVL_2, RecipeCategory.TOOLS);
        generateSmithingTransformToolRecipe(exporter, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ModItems.NETHERITE_CLEAVER_LVL_2, Items.NETHERITE_BLOCK, ModItems.NETHERITE_CLEAVER_LVL_3, RecipeCategory.TOOLS);

        generateSmithingTransformToolRecipe(exporter, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ModItems.DIAMOND_HAMMER, Items.NETHERITE_BLOCK, ModItems.NETHERITE_HAMMER, RecipeCategory.TOOLS);
        generateSmithingTransformToolRecipe(exporter, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ModItems.DIAMOND_HAMMER_LVL_2, Items.NETHERITE_BLOCK, ModItems.NETHERITE_HAMMER_LVL_2, RecipeCategory.TOOLS);
        generateSmithingTransformToolRecipe(exporter, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ModItems.NETHERITE_HAMMER_LVL_2, Items.NETHERITE_BLOCK, ModItems.NETHERITE_HAMMER_LVL_3, RecipeCategory.TOOLS);

        generateSmithingTransformToolRecipe(exporter, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ModItems.DIAMOND_BIG_HOE, Items.NETHERITE_BLOCK, ModItems.NETHERITE_BIG_HOE, RecipeCategory.TOOLS);
        generateSmithingTransformToolRecipe(exporter, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ModItems.DIAMOND_BIG_HOE_LVL_2, Items.NETHERITE_BLOCK, ModItems.NETHERITE_BIG_HOE_LVL_2, RecipeCategory.TOOLS);
        generateSmithingTransformToolRecipe(exporter, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ModItems.NETHERITE_BIG_HOE_LVL_2, Items.NETHERITE_BLOCK, ModItems.NETHERITE_BIG_HOE_LVL_3, RecipeCategory.TOOLS);

        generateSmithingTransformToolRecipe(exporter, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ModItems.DIAMOND_OMNI_TOOL, Items.NETHERITE_INGOT, ModItems.NETHERITE_OMNI_TOOL, RecipeCategory.TOOLS);

        generateOmniToolRecipe(exporter, ModItems.STONE_OMNI_TOOL, Items.STONE_SHOVEL, Items.STONE_PICKAXE, Items.STONE_AXE);
//        generateOmniToolRecipe(exporter, ModItems.COPPER_OMNI_TOOL, ModItems.COPPER_SHOVEL, ModItems.COPPER_PICKAXE, ModItems.COPPER_AXE);
        generateOmniToolRecipe(exporter, ModItems.IRON_OMNI_TOOL, Items.IRON_SHOVEL, Items.IRON_PICKAXE, Items.IRON_AXE);
        generateOmniToolRecipe(exporter, ModItems.GOLDEN_OMNI_TOOL, Items.GOLDEN_SHOVEL, Items.GOLDEN_PICKAXE, Items.GOLDEN_AXE);
        generateOmniToolRecipe(exporter, ModItems.DIAMOND_OMNI_TOOL, Items.DIAMOND_SHOVEL, Items.DIAMOND_PICKAXE, Items.DIAMOND_AXE);

        generateBigToolRecipe(exporter, ModItems.STONE_BIG_SHOVEL, Items.STONE_SHOVEL, ItemTags.STONE_CRAFTING_MATERIALS);
//        generateBigToolRecipe(exporter, ModItems.COPPER_BIG_SHOVEL, ModItems.COPPER_SHOVEL, Items.COPPER_BLOCK);
        generateBigToolRecipe(exporter, ModItems.IRON_BIG_SHOVEL, Items.IRON_SHOVEL, Items.IRON_BLOCK);
        generateBigToolRecipe(exporter, ModItems.IRON_BIG_SHOVEL_LVL_2, ModItems.IRON_BIG_SHOVEL, Items.IRON_BLOCK);
        generateBigToolRecipe(exporter, ModItems.GOLDEN_BIG_SHOVEL, Items.GOLDEN_SHOVEL, Items.GOLD_BLOCK);
        generateBigToolRecipe(exporter, ModItems.DIAMOND_BIG_SHOVEL, Items.DIAMOND_SHOVEL, Items.DIAMOND_BLOCK);
        generateBigToolRecipe(exporter, ModItems.DIAMOND_BIG_SHOVEL_LVL_2, ModItems.DIAMOND_BIG_SHOVEL, Items.DIAMOND_BLOCK);

        generateBigToolRecipe(exporter, ModItems.STONE_CLEAVER, Items.STONE_AXE, ItemTags.STONE_CRAFTING_MATERIALS);
//        generateBigToolRecipe(exporter, ModItems.COPPER_CLEAVER, ModItems.COPPER_AXE, Items.COPPER_BLOCK);
        generateBigToolRecipe(exporter, ModItems.IRON_CLEAVER, Items.IRON_AXE, Items.IRON_BLOCK);
        generateBigToolRecipe(exporter, ModItems.IRON_CLEAVER_LVL_2, ModItems.IRON_CLEAVER, Items.IRON_BLOCK);
        generateBigToolRecipe(exporter, ModItems.GOLDEN_CLEAVER, Items.GOLDEN_AXE,Items.GOLD_BLOCK);
        generateBigToolRecipe(exporter, ModItems.DIAMOND_CLEAVER, Items.DIAMOND_AXE,Items.DIAMOND_BLOCK);
        generateBigToolRecipe(exporter, ModItems.DIAMOND_CLEAVER_LVL_2, ModItems.DIAMOND_CLEAVER,Items.DIAMOND_BLOCK);

        generateBigToolRecipe(exporter, ModItems.STONE_HAMMER, Items.STONE_PICKAXE, ItemTags.STONE_CRAFTING_MATERIALS);
//        generateBigToolRecipe(exporter, ModItems.COPPER_HAMMER, ModItems.COPPER_PICKAXE, Items.COPPER_BLOCK);
        generateBigToolRecipe(exporter, ModItems.IRON_HAMMER, Items.IRON_PICKAXE, Items.IRON_BLOCK);
        generateBigToolRecipe(exporter, ModItems.IRON_HAMMER_LVL_2, ModItems.IRON_HAMMER, Items.IRON_BLOCK);
        generateBigToolRecipe(exporter, ModItems.GOLDEN_HAMMER, Items.GOLDEN_PICKAXE, Items.GOLD_BLOCK);
        generateBigToolRecipe(exporter, ModItems.DIAMOND_HAMMER, Items.DIAMOND_PICKAXE, Items.DIAMOND_BLOCK);
        generateBigToolRecipe(exporter, ModItems.DIAMOND_HAMMER_LVL_2, ModItems.DIAMOND_HAMMER, Items.DIAMOND_BLOCK);

        generateBigToolRecipe(exporter, ModItems.STONE_BIG_HOE, Items.STONE_HOE, ItemTags.STONE_CRAFTING_MATERIALS);
//        generateBigToolRecipe(exporter, ModItems.COPPER_BIG_HOE, ModItems.COPPER_HOE, Items.COPPER_BLOCK);
        generateBigToolRecipe(exporter, ModItems.IRON_BIG_HOE, Items.IRON_HOE, Items.IRON_BLOCK);
        generateBigToolRecipe(exporter, ModItems.IRON_BIG_HOE_LVL_2, ModItems.IRON_BIG_HOE, Items.IRON_BLOCK);
        generateBigToolRecipe(exporter, ModItems.GOLDEN_BIG_HOE, Items.GOLDEN_HOE, Items.GOLD_BLOCK);
        generateBigToolRecipe(exporter, ModItems.DIAMOND_BIG_HOE, Items.DIAMOND_HOE, Items.DIAMOND_BLOCK);
        generateBigToolRecipe(exporter, ModItems.DIAMOND_BIG_HOE_LVL_2, ModItems.DIAMOND_BIG_HOE, Items.DIAMOND_BLOCK);
//
//        generateToolRecipes(exporter,
//                Items.COPPER_INGOT,
//                ModItems.COPPER_SHOVEL,
//                ModItems.COPPER_AXE,
//                ModItems.COPPER_PICKAXE,
//                ModItems.COPPER_HOE,
//                ModItems.COPPER_SWORD);
    }
}
