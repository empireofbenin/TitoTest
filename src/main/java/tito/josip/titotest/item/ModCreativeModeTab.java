package tito.josip.titotest.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab tito_test_tab = new CreativeModeTab("tito_test_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.flint_hatchet.get());
        }
    };
}
