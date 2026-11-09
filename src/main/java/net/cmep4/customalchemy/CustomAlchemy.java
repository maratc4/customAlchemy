package net.cmep4.customalchemy;

import net.cmep4.customalchemy.items.ItemRegistry;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomAlchemy implements ModInitializer {
	public static final String MOD_ID = "customalchemy";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("========== [Custom Alchemy] INIT MAIN CLASS ==========");
		ItemRegistry.initialize();
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}
