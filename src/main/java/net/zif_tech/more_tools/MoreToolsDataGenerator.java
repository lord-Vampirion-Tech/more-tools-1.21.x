package net.zif_tech.more_tools;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.zif_tech.more_tools.datagen.*;
import net.zif_tech.more_tools.datagen.lang.ModLangProviderEN;
import net.zif_tech.more_tools.datagen.lang.ModLangProviderRU;

public class MoreToolsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModItemTagProvider::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModRecipeProvider::new);
		pack.addProvider(ModRegistryDataGenerator::new);

		pack.addProvider(ModLangProviderEN::new);
		pack.addProvider(ModLangProviderRU::new);
	}
}
