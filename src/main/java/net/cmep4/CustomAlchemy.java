package net.cmep4;

import net.cmep4.blocks.BlockRegistry;
import net.cmep4.items.CustomAlchemyGroup;
import net.cmep4.items.ItemRegistry;
import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.ResourceLocation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomAlchemy implements ModInitializer {
	public static final String MOD_ID = "custom-alchemy";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("========== [Custom Alchemy] INIT MAIN CLASS ==========");
		CustomAlchemyGroup.initialize();
		ItemRegistry.initialize();
		BlockRegistry.initialize();
	}

	public static ResourceLocation id(String path) {
		return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
	}
}
