package net.cmep4.alchemy_blocks;

import net.cmep4.CustomAlchemy;
import net.cmep4.alchemy_items.items.CustomWart;
import net.cmep4.alchemy_items.items.Molasses;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class BlockRegistry {
    //BlockItems
    public static Block CUSTOM_WART = register(new Block(CustomWart.blockProperties), CustomWart.id, true);
    public static Block MOLASSES = register(new Block(Molasses.blockProperties), Molasses.id, true);

    //Blocks
    public static Block CUSTOM_CAULDRON = register(
            new Block(BlockBehaviour.Properties.of().sound(SoundType.CALCITE).strength(4f).requiresCorrectToolForDrops()),
            "custom_cauldron",
            true
    );

    public static void initialize() {
        CustomAlchemy.LOGGER.info("========== [Custom Alchemy] Init block registry ==========");
    }

    public static Block register(final Block block, final String id, final boolean registerItem) {
        final var blockId = ResourceLocation.fromNamespaceAndPath(CustomAlchemy.MOD_ID, id);
        if (registerItem) {
            final var blockItem = new BlockItem(block, new Item.Properties());
            Registry.register(BuiltInRegistries.ITEM, blockId, blockItem);
        }

        return Registry.register(BuiltInRegistries.BLOCK, blockId, block);
    }
}
