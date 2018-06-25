package com.mabinogi.armory.plugins.combat.items;

import java.util.Map;

import com.google.common.collect.Maps;
import com.mabinogi.armory.ArmorySettings;
import com.mabinogi.lib.item.ItemBase;
import com.mabinogi.lib.item.iface.ILayeredModelItem;

import net.minecraft.creativetab.CreativeTabs;

public class ItemSword extends ItemBase implements ILayeredModelItem {

	@Override
	public String getName()
	{
		return "sword";
	}

	@Override
	public String getModId()
	{
		return ArmorySettings.MODID;
	}

	@Override
	public CreativeTabs getTab()
	{
		return CreativeTabs.MISC;
	}

	@Override
	public Map<String, Integer> getLayerMap()
	{
		Map<String, Integer> iconMap = Maps.newLinkedHashMap();
		
		//generate icons here
		iconMap.put(ArmorySettings.MODID + ":items/sword_blade", 0xffff00ff);
		iconMap.put(ArmorySettings.MODID + ":items/sword_handle", 0xffaa4444);
		iconMap.put(ArmorySettings.MODID + ":items/sword_binding", 0xff777777);
		iconMap.put(ArmorySettings.MODID + ":items/sword_sharpness", 0x88ffff00);
		
		return iconMap;
	}

}
