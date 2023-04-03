package tito.josip.titotest.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.BlockHitResult;

public class uranium_ore_block extends DropExperienceBlock {
    public static final BooleanProperty LIT = BooleanProperty.create("lit");
    public uranium_ore_block(Properties properties, UniformInt of) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(LIT, Boolean.valueOf(false)));
    }
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(LIT);
    }

    @Override
    public boolean isRandomlyTicking(BlockState state) {
        return state.getValue(LIT); //randomly checks the blockstate
    }
    @Override
    public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource randomSource) {
        if (state.getValue(LIT)) {
            level.setBlock(pos, state.setValue(LIT, Boolean.valueOf(false)), 3); //If the block is on when randomly checked, turn it off
        }
    }
    private static void radiationPoisoningPlayer (Player player) {
        player.addEffect(new MobEffectInstance(MobEffects.WITHER, 200, 1));
        player.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 200));
    }
    private static void radiationPoisoningEntity (Entity entity) {
        if (entity instanceof LivingEntity livingEntity) {
            livingEntity.addEffect(new MobEffectInstance(MobEffects.WITHER, 200, 1));
            livingEntity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 200));
        }
    }
    private static void interact(BlockState state, Level level, BlockPos pos) {
            level.setBlock(pos, state.setValue(LIT, Boolean.valueOf(true)), 3);
    }
    @Override
    public void attack(BlockState state, Level level, BlockPos pos, Player player) {
        interact(state, level, pos);
        radiationPoisoningPlayer(player);
        super.attack(state, level, pos, player);
    }
    @Override
    public void stepOn(Level level, BlockPos pos, BlockState state, Entity entity) {
        if(!entity.isSteppingCarefully()) {
            interact(state, level, pos);
            radiationPoisoningEntity(entity);
            }
        super.stepOn(level, pos, state, entity);
    }
    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult result) {
        interact(state, level, pos);
        radiationPoisoningPlayer(player);
        ItemStack itemStack = player.getItemInHand(hand);
        return itemStack.getItem() instanceof BlockItem && (new BlockPlaceContext(player, hand, itemStack, result)).canPlace() ? InteractionResult.PASS : InteractionResult.SUCCESS;
    }
}
