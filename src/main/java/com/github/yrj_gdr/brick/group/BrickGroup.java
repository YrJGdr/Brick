package com.github.yrj_gdr.brick.group;

import com.github.yrj_gdr.brick.register.ItemRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class BrickGroup extends ItemGroup {
    public BrickGroup(){
        super("Brick");
    }

    @Override
    public ItemStack createIcon(){
        return new ItemStack(ItemRegistry.brick.get());
    }
}
