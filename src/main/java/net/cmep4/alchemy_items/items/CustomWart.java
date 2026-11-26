package net.cmep4.alchemy_items.items;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;

import java.util.List;

public class CustomWart extends BlockItem {
    public static final String id = "custom_wart";
    public static final BlockBehaviour.Properties blockProperties = BlockBehaviour.Properties.of()
            .noCollission().randomTicks().instabreak().sound(SoundType.NETHER_WART).pushReaction(PushReaction.DESTROY);

    public CustomWart(Block block, Properties properties) {
        super(block, properties);
        properties.food(new FoodProperties.Builder()
                .nutrition(2)
                .effect(new MobEffectInstance(MobEffects.CONFUSION), 0.5f)
                .build()
        );
        properties.stacksTo(64);
    }

    @Override
    public void appendHoverText(ItemStack itemStack, TooltipContext tooltipContext, List<Component> list, TooltipFlag tooltipFlag) {
        super.appendHoverText(itemStack, tooltipContext, list, tooltipFlag);
        list.add(Component.translatable("itemTooltip.custom-alchemy.custom_wart").withStyle(ChatFormatting.GOLD));
    }
}
