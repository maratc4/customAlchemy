package net.cmep4.customalchemy.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.List;

public class Molasses extends Item {
    public static final String id = "molasses";

    public Molasses(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        super.appendTooltip(stack, context, tooltip, type);
        tooltip.add(Text.translatable("itemTooltop.customalchemy.molasses").setStyle(Style.EMPTY.withColor(Formatting.GOLD)));
    }
}
