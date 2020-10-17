package com.github.yrj_gdr.brick.item;

import com.github.yrj_gdr.brick.group.ModGroup;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.SwordItem;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class GoldBrick extends SwordItem {
    private static IItemTier iItemTier = new IItemTier() {
        //耐久
        @Override
        public int getMaxUses() {
            return 40;
        }

        //攻击速度
        @Override
        public float getEfficiency() {
            return 4.0F;
        }

        //攻击伤害
        @Override
        public float getAttackDamage() {
            return 35.0F;
        }

        //掉落等级
        @Override
        public int getHarvestLevel() {
            return 2;
        }

        //附魔等级
        @Override
        public int getEnchantability() {
            return 50;
        }

        //修补材料
        @Override
        public Ingredient getRepairMaterial() {
            return Ingredient.fromItems(Items.GOLD_INGOT);
        }
    };
    public GoldBrick(){
        super(iItemTier,0,-3.5F,new Properties().group(ModGroup.itemGroup));
    }

    @Override
    public void addInformation(ItemStack state, @Nullable World worldIn, List<ITextComponent> tips, ITooltipFlag flagIn){
        if(state.getItem() instanceof GoldBrick){
            ITextComponent tip = new TranslationTextComponent("item.brick.gold_brick.tip");
            tips.add(tip);
        }
        super.addInformation(state,worldIn,tips,flagIn);
    }
}
