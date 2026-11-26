package net.cmep4.alchemy_items.items;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;

import java.util.List;

public class Molasses extends BlockItem {
    public static final String id = "molasses";
    public static final BlockBehaviour.Properties blockProperties = BlockBehaviour.Properties.of()
            .noCollission().randomTicks().instabreak().sound(SoundType.ROOTS).pushReaction(PushReaction.DESTROY);

    public Molasses(final Block block, final Properties properties) {
        super(block, properties);
        properties.stacksTo(64);
    }

    @Override
    public void appendHoverText(ItemStack itemStack, TooltipContext tooltipContext, List<Component> list, TooltipFlag tooltipFlag) {
        super.appendHoverText(itemStack, tooltipContext, list, tooltipFlag);
        list.add(Component.translatable("itemTooltip.custom-alchemy.molasses").withStyle(ChatFormatting.GOLD));
    }
}
