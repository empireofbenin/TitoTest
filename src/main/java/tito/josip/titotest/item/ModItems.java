package tito.josip.titotest.item;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import tito.josip.titotest.block.ModBlocks;
import tito.josip.titotest.item.custom.EightballItem;
import tito.josip.titotest.item.custom.RadioactiveBlockItems;
import tito.josip.titotest.item.custom.RadioactiveItem;
import tito.josip.titotest.titotest;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, titotest.MOD_ID);

    //Flint stuff
    public  static  final RegistryObject<Item> flint_hatchet = ITEMS.register("flint_hatchet",
            () -> new Item(new Properties().tab(ModCreativeModeTab.tito_test_tab)));
    public  static  final RegistryObject<Item> flint_chisel = ITEMS.register("flint_chisel",
            () -> new Item(new Properties().tab(ModCreativeModeTab.tito_test_tab)));
    public  static  final RegistryObject<Item> flint_spade = ITEMS.register("flint_hand_hoe",
            () -> new Item(new Properties().tab(ModCreativeModeTab.tito_test_tab)));
    public  static  final RegistryObject<Item> flint_knife = ITEMS.register("flint_knife",
            () -> new Item(new Properties().tab(ModCreativeModeTab.tito_test_tab)));
    public  static  final RegistryObject<Item> flint_sword = ITEMS.register("flint_sword",
            () -> new Item(new Properties().tab(ModCreativeModeTab.tito_test_tab)));
    public  static  final RegistryObject<Item> flint_hand_hoe= ITEMS.register("flint_spade",
            () -> new Item(new Properties().tab(ModCreativeModeTab.tito_test_tab)));

    //Tin stuff
    public  static  final RegistryObject<Item> tin_ingot = ITEMS.register("tin_ingot",
            () -> new Item(new Properties().tab(ModCreativeModeTab.tito_test_tab)));
    public  static  final RegistryObject<Item> raw_tin = ITEMS.register("raw_tin",
            () -> new Item(new Properties().tab(ModCreativeModeTab.tito_test_tab)));

    //uranium stuff
    public  static  final RegistryObject<Item> uranium_ingot = ITEMS.register("uranium_ingot",
            () -> new RadioactiveItem(new Properties().tab(ModCreativeModeTab.tito_test_tab)));
    public  static  final RegistryObject<Item> raw_uranium = ITEMS.register("raw_uranium",
            () -> new RadioactiveItem(new Properties().tab(ModCreativeModeTab.tito_test_tab)));
    public static final RegistryObject<Item> uranium_block_item = ITEMS.register("uranium_block_item",
            () -> new RadioactiveBlockItems(ModBlocks.uranium_block.get(), new Properties()));
    public static final RegistryObject<Item> uranium_ore_item = ITEMS.register("uranium_ore_item",
            () -> new RadioactiveBlockItems(ModBlocks.uranium_ore.get(), new Properties()));
    public static final RegistryObject<Item> deepslate_uranium_ore_item = ITEMS.register("deepslate_uranium_ore_item",
            () -> new RadioactiveBlockItems(ModBlocks.deepslate_uranium_ore.get(), new Properties()));


    //Tutorial Items
    public  static  final RegistryObject<Item> eight_ball = ITEMS.register("eight_ball",
            () -> new EightballItem(new Properties().tab(ModCreativeModeTab.tito_test_tab).stacksTo(1)));

    public static void register (IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
