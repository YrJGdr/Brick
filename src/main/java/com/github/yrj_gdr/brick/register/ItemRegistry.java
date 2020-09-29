package com.github.yrj_gdr.brick.register;

import com.github.yrj_gdr.brick.item.Brick;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

//注册物品
public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS,"brick");

    //注册板砖
    public static RegistryObject<Item> brick = ITEMS.register("brick",() ->{
        return new Brick();
    });
}
