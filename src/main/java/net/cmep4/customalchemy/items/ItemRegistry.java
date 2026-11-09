package net.cmep4.customalchemy.items;

import net.cmep4.customalchemy.CustomAlchemy;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ItemRegistry {
    public static final Item CUSTOM_WART = register(
            Items.NETHER_WART,
            "custom_wart"
    );

    public static void initialize() {
        CustomAlchemy.LOGGER.info("========== [Custom Alchemy] Init item registry ==========");
    }

    public static Item register(final Item item, final String id) {
        return Registry.register(
                Registries.ITEM,
                Identifier.of(CustomAlchemy.MOD_ID, id),
                item
        );
    }
}
