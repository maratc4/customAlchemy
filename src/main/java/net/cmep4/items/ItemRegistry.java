package net.cmep4.items;

import net.cmep4.CustomAlchemy;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

public class ItemRegistry {
    public static Item CUSTOM_WART = register(Items.NETHER_WART, CustomWart.id);
    public static Item MOLASSES = register(Items.WHEAT_SEEDS, Molasses.id);

    public static void initialize() {
        CustomAlchemy.LOGGER.info("========== [Custom Alchemy] Init item registry ==========");

        setCustomWart();
        setMolasses();
    }

    public static Item register(final Item item, final String id) {
        return Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(CustomAlchemy.MOD_ID, id), item);
    }

    private static void setCustomWart() {
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS)
                .register(itemGroup -> itemGroup.accept(ItemRegistry.CUSTOM_WART));
    }

    private static void setMolasses() {
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS)
                .register(itemGroup -> itemGroup.accept(ItemRegistry.MOLASSES));
        CompostingChanceRegistry.INSTANCE.add(ItemRegistry.MOLASSES, 0.5f);
    }
}
