package tito.josip.titotest.block;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import tito.josip.titotest.block.custom.uranium_block;
import tito.josip.titotest.block.custom.uranium_ore_block;
import tito.josip.titotest.item.ModCreativeModeTab;
import tito.josip.titotest.item.ModItems;
import tito.josip.titotest.item.custom.RadioactiveBlockItems;
import tito.josip.titotest.titotest;

import java.util.function.Supplier;

public class RadioactiveBlocks {
    public static final DeferredRegister<Block> RADIOACTIVEBLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, titotest.MOD_ID);

    public static final RegistryObject<Block> URANIUM_BLOCK = registerBlock("uranium_block",
            () -> new uranium_block(BlockBehaviour.Properties.of(Material.METAL).strength(6f).requiresCorrectToolForDrops().lightLevel(state -> state.getValue(uranium_block.LIT) ? 15 : 0)), ModCreativeModeTab.tito_test_tab);
    public static final RegistryObject<Block> deepslate_uranium_ore = registerBlock("deepslate_uranium_ore",
            () -> new uranium_ore_block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops().lightLevel(state -> state.getValue(uranium_ore_block.LIT) ? 7 : 0), UniformInt.of(3, 7)), ModCreativeModeTab.tito_test_tab);
    public static final RegistryObject<Block> uranium_ore = registerBlock("uranium_ore",
            () -> new uranium_ore_block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops().lightLevel(state -> state.getValue(uranium_ore_block.LIT) ? 7 : 0), UniformInt.of(3, 7)), ModCreativeModeTab.tito_test_tab);

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = RADIOACTIVEBLOCKS.register(name, block);
        registerRadioactiveBlockItems(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerRadioactiveBlockItems(String name, RegistryObject<T> block, CreativeModeTab tab) {

        return ModItems.ITEMS.register(name, () -> new RadioactiveBlockItems(block.get(), new Item.Properties().tab(tab)));
    }
    public static void register(IEventBus eventBus) {
        RADIOACTIVEBLOCKS.register(eventBus);
    }
}
