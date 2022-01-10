package com.tarantulagamingmods.tchem;

import com.tarantulagamingmods.tchem.core.init.ItemInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(TChem.MOD_ID)
public class TChem {
    public static final String MOD_ID = "tchem";

    public TChem() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(bus);
    }
}