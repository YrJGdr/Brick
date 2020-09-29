package com.github.yrj_gdr.brick.item;

import com.github.yrj_gdr.brick.group.ModGroup;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class Brick extends SwordItem {
    private static IItemTier iItemTier = new IItemTier() {
        //耐久
        @Override
        public int getMaxUses() {
            return 10;
        }

        //攻击速度
        @Override
        public float getEfficiency() {
            return 4.0F;
        }

        //攻击伤害
        @Override
        public float getAttackDamage() {
            return 1.0F;
        }

        //掉落等级
        @Override
        public int getHarvestLevel() {
            return 1;
        }

        //附魔等级
        @Override
        public int getEnchantability() {
            return 30;
        }

        //修补材料
        @Override
        public Ingredient getRepairMaterial() {
            return null;
        }
    };

    public Brick(){
        super(iItemTier,14,-3.8F,new Properties().group(ModGroup.itemGroup));
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tips, ITooltipFlag flagIn){
        if(stack.getItem() instanceof Brick){
            TextComponent tip = new TranslationTextComponent("item.brick.brick.tip");
            tips.add(tip);
        }
        super.addInformation(stack,worldIn,tips,flagIn);
    }
}
