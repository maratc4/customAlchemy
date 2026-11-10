package net.cmep4.items;

import net.cmep4.CustomAlchemy;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

public class ItemRegistry {
    public static Item CUSTOM_WART = register(new Item(new Item.Properties()), CustomWart.id);
    public static Item MOLASSES = register(new Item(new Item.Properties()), Molasses.id);

    public static void initialize() {
        CustomAlchemy.LOGGER.info("========== [Custom Alchemy] Init item registry ==========");

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS)
                .register(itemGroup -> {
                    itemGroup.accept(ItemRegistry.CUSTOM_WART);
                    itemGroup.accept(ItemRegistry.MOLASSES);
                });

        setCustomWart();
        setMolasses();
    }

    public static Item register(final Item item, final String id) {
        return Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(CustomAlchemy.MOD_ID, id), item);
    }

    private static void setCustomWart() {
        
    }

    private static void setMolasses() {
        CompostingChanceRegistry.INSTANCE.add(ItemRegistry.MOLASSES, 0.5f);
    }
}
