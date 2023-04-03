package tito.josip.titotest.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import tito.josip.titotest.block.ModBlocks;
import tito.josip.titotest.item.custom.EightballItem;
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

    //Tutorial Items
    public  static  final RegistryObject<Item> eight_ball = ITEMS.register("eight_ball",
            () -> new EightballItem(new Properties().tab(ModCreativeModeTab.tito_test_tab).stacksTo(1)));
    public  static  final RegistryObject<Item> BLUEBERRY_SEEDS = ITEMS.register("blueberry_seeds",
            () -> new ItemNameBlockItem(ModBlocks.BLUEBERRY_CROP.get(),
                    new Properties().tab(ModCreativeModeTab.tito_test_tab)));
    public  static  final RegistryObject<Item> BLUEBERRY = ITEMS.register("blueberry",
            () -> new Item(new Properties().tab(ModCreativeModeTab.tito_test_tab).food(new FoodProperties.Builder().nutrition(2).saturationMod(2).build())));



    public static void register (IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
