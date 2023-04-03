package tito.josip.titotest.block.custom;

import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import tito.josip.titotest.item.ModItems;

public class blueberry_crop_block extends CropBlock {
    public static final IntegerProperty AGE =IntegerProperty.create("age", 0, 6);
    public blueberry_crop_block(Properties properties) {
        super(properties);
    }
    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.BLUEBERRY_SEEDS.get();
    }
    @Override
    public IntegerProperty getAgeProperty() {
        return AGE;
    }

    @Override
    public int getMaxAge() {
        return 6;
    }
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }
}

