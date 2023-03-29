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

    //creates test item
    public  static  final RegistryObject<Item> flint_hatchet = ITEMS.register("flint_hatchet",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.tito_test_tab)));

   //creates test item2
    public  static  final RegistryObject<Item> flint_mattock = ITEMS.register("flint_mattock",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.tito_test_tab)));

    public static void register (IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
