package com.tarantulagamingmods.tchem.core.item;

import com.tarantulagamingmods.tchem.core.init.ItemInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeTab {
    public static final CreativeModeTab TCHEM_TAB = new CreativeModeTab("tchemtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.HAMMER.get());
        }
    };
}
