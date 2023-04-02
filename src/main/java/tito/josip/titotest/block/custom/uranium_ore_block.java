package tito.josip.titotest.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import tito.josip.titotest.item.custom.RadioactiveItem;

public class uranium_ore_block extends DropExperienceBlock {

    public uranium_ore_block(BlockBehaviour.Properties properties, UniformInt of) {super(properties);}

    @Override
    public void stepOn(Level level, BlockPos blockPos, BlockState blockState, Entity entity) {
        if (entity instanceof LivingEntity livingEntity) {
            livingEntity.addEffect(new MobEffectInstance(MobEffects.WITHER, 200));
        }
        super.stepOn(level, blockPos, blockState, entity);
    }
}
