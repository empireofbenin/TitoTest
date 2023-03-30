package tito.josip.titotest.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import tito.josip.titotest.item.custom.EightballItem;
import tito.josip.titotest.titotest;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, titotest.MOD_ID);

    //Flint stuff
    public  static  final RegistryObject<Item> flint_hatchet = ITEMS.register("flint_hatchet",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.tito_test_tab)));
    public  static  final RegistryObject<Item> flint_chisel = ITEMS.register("flint_chisel",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.tito_test_tab)));
    public  static  final RegistryObject<Item> flint_spade = ITEMS.register("flint_spade",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.tito_test_tab)));
    public  static  final RegistryObject<Item> flint_knife = ITEMS.register("flint_knife",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.tito_test_tab)));
    public  static  final RegistryObject<Item> flint_sword = ITEMS.register("flint_sword",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.tito_test_tab)));
    public  static  final RegistryObject<Item> flint_hand_hoe= ITEMS.register("flint_hand_hoe",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.tito_test_tab)));



    //Tin stuff
    public  static  final RegistryObject<Item> tin_ingot = ITEMS.register("tin_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.tito_test_tab)));
    public  static  final RegistryObject<Item> raw_tin = ITEMS.register("raw_tin",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.tito_test_tab)));

    //Tutorial Items
    public  static  final RegistryObject<Item> eight_ball = ITEMS.register("eight_ball",
            () -> new EightballItem(new Item.Properties().tab(ModCreativeModeTab.tito_test_tab).stacksTo(1)));

    public static void register (IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
