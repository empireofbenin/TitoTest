package tito.josip.titotest.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class uranium_block extends Block {
    public uranium_block(Properties p_49795_) {super(p_49795_);}
    @Override
    public void stepOn(Level level, BlockPos blockPos, BlockState blockState, Entity entity) {
        if (entity instanceof LivingEntity livingEntity) {
            livingEntity.addEffect(new MobEffectInstance(MobEffects.WITHER, 200));
            livingEntity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 200));
        }
        super.stepOn(level, blockPos, blockState, entity);
    }
}

