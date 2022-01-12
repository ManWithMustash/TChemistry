package com.tarantulagamingmods.tchem.core.init;

import com.tarantulagamingmods.tchem.TChem;
import com.tarantulagamingmods.tchem.core.item.ModCreativeTab;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class ItemInit {
    private ItemInit() {}

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TChem.MOD_ID);

    public static final RegistryObject<Item> FERRITE_DUST = ITEMS.register("ferrite_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.TCHEM_TAB)));

    public static final RegistryObject<Item> GOLD_DUST = ITEMS.register("gold_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.TCHEM_TAB)));

    public static final RegistryObject<Item> FG_BLEND = ITEMS.register("fg_blend",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.TCHEM_TAB)));

    public static final RegistryObject<Item> FG_INGOT = ITEMS.register("fg_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.TCHEM_TAB)));
    public static final RegistryObject<Item> HAMMER = ITEMS.register("hammer",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.TCHEM_TAB).durability(50).stacksTo(1)));
}