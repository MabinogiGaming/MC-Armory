package com.mabinogi.armory;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ArmorySettings {
	
	public static final String MODID = "armory";
    public static final String NAME = "Armory";
    public static final String VERSION = "0.0.1";
    public static final String DEPENDENCIES = "required-after:mabinogi";
	
	public static CreativeTabs armoryTab = new CreativeTabs("armoryTab")
	{
		@Override
		public ItemStack getTabIconItem()
		{
			return new ItemStack(Items.IRON_SWORD);
		}
	};

}
