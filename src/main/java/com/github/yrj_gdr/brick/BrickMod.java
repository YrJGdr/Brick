package com.github.yrj_gdr.brick;

import com.github.yrj_gdr.brick.register.ItemRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("brick")
public class BrickMod {
    public BrickMod(){
        ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
