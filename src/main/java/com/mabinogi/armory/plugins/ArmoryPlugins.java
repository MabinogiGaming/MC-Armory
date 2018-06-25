package com.mabinogi.armory.plugins;

import com.mabinogi.lib.plugin.IPlugin;
import com.mabinogi.lib.plugin.PluginManager;

public class ArmoryPlugins extends PluginManager {
	
	public static ArmoryPlugins instance = new ArmoryPlugins();
	
	@Override
	public void registerPlugin(IPlugin plugin) 
	{
		plugins.add(plugin);
	}

}