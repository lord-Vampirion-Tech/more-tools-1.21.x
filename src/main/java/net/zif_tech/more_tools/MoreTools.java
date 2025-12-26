package net.zif_tech.more_tools;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.zif_tech.more_tools.item.ModItemGroups;
import net.zif_tech.more_tools.item.ModItems;
import net.zif_tech.more_tools.util.ModComponents;
import net.zif_tech.more_tools.util.ModUsageEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreTools implements ModInitializer {
	public static final String MOD_ID = "more_tools";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.initialize();
		ModItems.initialize();
		ModComponents.initialize();

		PlayerBlockBreakEvents.BEFORE.register(new ModUsageEvent());

		ResourceManagerHelper.registerBuiltinResourcePack(
				Identifier.of(MOD_ID, "more_tools"),
				FabricLoader.getInstance().getModContainer(MOD_ID)
						.orElseThrow(() -> new RuntimeException("Mod container not found!")),
				Text.translatable("resourcepack.more_tools.name"),
				ResourcePackActivationType.NORMAL
		);
	}
}