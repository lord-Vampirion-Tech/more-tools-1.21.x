package net.zif_tech.more_tools;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.zif_tech.more_tools.datagen.ModBlockTagProvider;
import net.zif_tech.more_tools.datagen.ModItemTagProvider;
import net.zif_tech.more_tools.datagen.ModModelProvider;
import net.zif_tech.more_tools.datagen.ModRecipeProvider;
import net.zif_tech.more_tools.datagen.ModRegistryDataGenerator;

public class MoreToolsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModItemTagProvider::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModRecipeProvider::new);
		pack.addProvider(ModRegistryDataGenerator::new);
	}
}
