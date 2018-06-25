package com.mabinogi.armory.plugins.combat;

import com.mabinogi.armory.plugins.ArmoryPlugins;
import com.mabinogi.armory.plugins.combat.items.ItemSword;
import com.mabinogi.lib.item.ItemBase;
import com.mabinogi.lib.model.item.LayeredItemModel;
import com.mabinogi.lib.plugin.IPlugin;
import com.mabinogi.lib.registry.RegistryManager;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLLoadCompleteEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CombatPlugin implements IPlugin {

	public static void register()
	{
		ArmoryPlugins.instance.registerPlugin(new CombatPlugin());
	}

	@Override
	public void configPlugin(Configuration cfg)
	{
		//do nothing
	}

	@Override
	public void pre(FMLPreInitializationEvent event)
	{
		//register item models
		RegistryManager.instance.registerItemModel(new ModelResourceLocation("armory:sword", "inventory"), new LayeredItemModel());
		
		//register items
		ItemBase.register(new ItemSword());
	}

	@Override
	public void init(FMLInitializationEvent event)
	{
		//do nothing
	}

	@Override
	public void post(FMLPostInitializationEvent event)
	{
		//do nothing
	}

	@Override
	public void complete(FMLLoadCompleteEvent event)
	{
		//do nothing
	}

}
