package tito.josip.titotest.block;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import tito.josip.titotest.block.custom.jumpy_block;
import tito.josip.titotest.block.custom.uranium_block;
import tito.josip.titotest.block.custom.uranium_ore_block;
import tito.josip.titotest.item.ModCreativeModeTab;
import tito.josip.titotest.item.ModItems;
import tito.josip.titotest.titotest;

import java.util.function.Supplier;

public class RadioactiveBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, titotest.MOD_ID);

    public static final RegistryObject<Block> uranium_block = registerBlock("uranium_block",
            () -> new uranium_block(BlockBehaviour.Properties.of(Material.METAL).strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.tito_test_tab);
    public static final RegistryObject<Block> deepslate_uranium_ore = registerBlock("deepslate_uranium_ore",
            () -> new uranium_ore_block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTab.tito_test_tab);
    public static final RegistryObject<Block> uranium_ore = registerBlock("uranium_ore",
            () -> new uranium_ore_block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTab.tito_test_tab);
    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        return toReturn;
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
