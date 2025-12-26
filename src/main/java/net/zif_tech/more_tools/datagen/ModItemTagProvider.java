package net.zif_tech.more_tools.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.zif_tech.more_tools.item.ModItems;
import net.zif_tech.more_tools.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Items.BIG_TOOLS)
                .forceAddTag(ModTags.Items.HAMMERS)
                .forceAddTag(ModTags.Items.CLEAVERS)
                .forceAddTag(ModTags.Items.BIG_SHOVELS)
                .forceAddTag(ModTags.Items.BIG_HOES)
                .forceAddTag(ModTags.Items.BROADSWORDS);

        getOrCreateTagBuilder(ModTags.Items.BROADSWORDS)
                .add(ModItems.STONE_BROADSWORD)
                .add(ModItems.IRON_BROADSWORD)
                .add(ModItems.GOLDEN_BROADSWORD)
                .add(ModItems.DIAMOND_BROADSWORD)
                .add(ModItems.NETHERITE_BROADSWORD);

        getOrCreateTagBuilder(ModTags.Items.DAGGERS)
                .add(ModItems.STONE_DAGGER)
                .add(ModItems.IRON_DAGGER)
                .add(ModItems.GOLDEN_DAGGER)
                .add(ModItems.DIAMOND_DAGGER)
                .add(ModItems.NETHERITE_DAGGER);

        getOrCreateTagBuilder(ModTags.Items.OMNI_TOOLS)
                .add(ModItems.STONE_OMNI_TOOL)
//                .add(ModItems.COPPER_OMNI_TOOL)
                .add(ModItems.IRON_OMNI_TOOL)
                .add(ModItems.IRON_BIG_OMNI_TOOL)
                .add(ModItems.GOLDEN_OMNI_TOOL)
                .add(ModItems.GOLDEN_BIG_OMNI_TOOL)
                .add(ModItems.DIAMOND_OMNI_TOOL)
                .add(ModItems.DIAMOND_BIG_OMNI_TOOL)
                .add(ModItems.NETHERITE_OMNI_TOOL)
                .add(ModItems.NETHERITE_BIG_OMNI_TOOL);

        getOrCreateTagBuilder(ModTags.Items.BIG_SHOVELS)
                .add(ModItems.STONE_BIG_SHOVEL)
//                .add(ModItems.COPPER_BIG_SHOVEL)
                .add(ModItems.IRON_BIG_SHOVEL)
                .add(ModItems.IRON_BIG_SHOVEL_LVL_2)
                .add(ModItems.GOLDEN_BIG_SHOVEL)
                .add(ModItems.DIAMOND_BIG_SHOVEL)
                .add(ModItems.DIAMOND_BIG_SHOVEL_LVL_2)
                .add(ModItems.DIAMOND_BIG_SHOVEL_LVL_3)
                .add(ModItems.NETHERITE_BIG_SHOVEL)
                .add(ModItems.NETHERITE_BIG_SHOVEL_LVL_2)
                .add(ModItems.NETHERITE_BIG_SHOVEL_LVL_3);

        getOrCreateTagBuilder(ModTags.Items.CLEAVERS)
                .add(ModItems.STONE_CLEAVER)
//                .add(ModItems.COPPER_CLEAVER)
                .add(ModItems.IRON_CLEAVER)
                .add(ModItems.IRON_CLEAVER_LVL_2)
                .add(ModItems.GOLDEN_CLEAVER)
                .add(ModItems.DIAMOND_CLEAVER)
                .add(ModItems.DIAMOND_CLEAVER_LVL_2)
                .add(ModItems.DIAMOND_CLEAVER_LVL_3)
                .add(ModItems.NETHERITE_CLEAVER)
                .add(ModItems.NETHERITE_CLEAVER_LVL_2)
                .add(ModItems.NETHERITE_CLEAVER_LVL_3);

        getOrCreateTagBuilder(ModTags.Items.HAMMERS)
                .add(ModItems.STONE_HAMMER)
//                .add(ModItems.COPPER_HAMMER)
                .add(ModItems.IRON_HAMMER)
                .add(ModItems.IRON_HAMMER_LVL_2)
                .add(ModItems.GOLDEN_HAMMER)
                .add(ModItems.DIAMOND_HAMMER)
                .add(ModItems.DIAMOND_HAMMER_LVL_2)
                .add(ModItems.DIAMOND_HAMMER_LVL_3)
                .add(ModItems.NETHERITE_HAMMER)
                .add(ModItems.NETHERITE_HAMMER_LVL_2)
                .add(ModItems.NETHERITE_HAMMER_LVL_3);

        getOrCreateTagBuilder(ModTags.Items.BIG_HOES)
                .add(ModItems.STONE_BIG_HOE)
//                .add(ModItems.COPPER_BIG_HOE)
                .add(ModItems.IRON_BIG_HOE)
                .add(ModItems.IRON_BIG_HOE_LVL_2)
                .add(ModItems.GOLDEN_BIG_HOE)
                .add(ModItems.DIAMOND_BIG_HOE)
                .add(ModItems.DIAMOND_BIG_HOE_LVL_2)
                .add(ModItems.DIAMOND_BIG_HOE_LVL_3)
                .add(ModItems.NETHERITE_BIG_HOE)
                .add(ModItems.NETHERITE_BIG_HOE_LVL_2)
                .add(ModItems.NETHERITE_BIG_HOE_LVL_3);

        getOrCreateTagBuilder(ItemTags.MINING_ENCHANTABLE)
                .forceAddTag(ModTags.Items.OMNI_TOOLS)
                .forceAddTag(ModTags.Items.BIG_TOOLS);

        getOrCreateTagBuilder(ItemTags.SHARP_WEAPON_ENCHANTABLE)
                .forceAddTag(ModTags.Items.OMNI_TOOLS);
        getOrCreateTagBuilder(ItemTags.DURABILITY_ENCHANTABLE)
                .forceAddTag(ModTags.Items.OMNI_TOOLS)
                .forceAddTag(ModTags.Items.BIG_TOOLS);

//        getOrCreateTagBuilder(ItemTags.SHOVELS)
//                .add(ModItems.COPPER_SHOVEL);
//        getOrCreateTagBuilder(ItemTags.AXES)
//                .add(ModItems.COPPER_AXE);
//        getOrCreateTagBuilder(ItemTags.PICKAXES)
//                .add(ModItems.COPPER_PICKAXE);
//        getOrCreateTagBuilder(ItemTags.HOES)
//                .add(ModItems.COPPER_HOE);
//        getOrCreateTagBuilder(ItemTags.SWORDS)
//                .add(ModItems.COPPER_SWORD);
    }
}
