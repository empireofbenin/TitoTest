package tito.josip.titotest.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class RadioactiveBlockItems extends BlockItem {

    public RadioactiveBlockItems(Block block, Properties properties) {super(block, properties);}

    @Override
    public void inventoryTick(ItemStack itemStack, Level level, Entity entity, int i, boolean b) {
        if (entity instanceof LivingEntity livingEntity) {
            livingEntity.addEffect(new MobEffectInstance(MobEffects.WITHER, 200, 1));
            livingEntity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 200));
        }
        super.inventoryTick(itemStack, level, entity, i, b);
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> components, TooltipFlag tooltipFlag) {
        components.add(Component.literal("Radioactive").withStyle(ChatFormatting.GREEN));

        super.appendHoverText(itemStack, level, components, tooltipFlag);
    }
}

