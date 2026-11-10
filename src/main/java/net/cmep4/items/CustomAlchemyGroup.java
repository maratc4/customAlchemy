package net.cmep4.items;

import net.cmep4.CustomAlchemy;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CustomAlchemyGroup {
    public static final ResourceKey<CreativeModeTab> CUSTOM_AlCHEMY_GROUP_KEY = ResourceKey.create(
            BuiltInRegistries.CREATIVE_MODE_TAB.key(),
            ResourceLocation.fromNamespaceAndPath(CustomAlchemy.MOD_ID, "custom_alchemy_group")
    );

    public static final CreativeModeTab CUSTOM_ALCHEMY_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ItemRegistry.CUSTOM_WART))
            .title(Component.translatable("itemGroup.custom-alchemy"))
            .build();

    public static void initialize() {
        CustomAlchemy.LOGGER.info("========== [Custom Alchemy] Init custom alchemy group registry ==========");
    }
}
