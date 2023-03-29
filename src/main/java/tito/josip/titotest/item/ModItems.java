package tito.josip.titotest.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import tito.josip.titotest.titotest;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, titotest.MOD_ID);

    //Flint stuff
    public  static  final RegistryObject<Item> flint_hatchet = ITEMS.register("flint_hatchet",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.tito_test_tab)));
    public  static  final RegistryObject<Item> flint_mattock = ITEMS.register("flint_mattock",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.tito_test_tab)));

    //Tin stuff
    public  static  final RegistryObject<Item> tin_ingot = ITEMS.register("tin_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.tito_test_tab)));
    public  static  final RegistryObject<Item> raw_tin = ITEMS.register("raw_tin",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.tito_test_tab)));
    public static void register (IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
