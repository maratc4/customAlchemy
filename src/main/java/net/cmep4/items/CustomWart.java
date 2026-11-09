package net.cmep4.items;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;

import java.util.List;

public class CustomWart extends Item {
    public static final String id = "custom_wart";

    public CustomWart(Properties properties) {
        super(properties);
        properties.food(new FoodProperties.Builder()
                .nutrition(2)
                .effect(new MobEffectInstance(MobEffects.CONFUSION), 0.5f)
                .fast()
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
