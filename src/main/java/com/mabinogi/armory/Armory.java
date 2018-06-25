package com.mabinogi.armory;

import com.mabinogi.armory.plugins.ArmoryPlugins;
import com.mabinogi.armory.plugins.combat.CombatPlugin;
import com.mabinogi.lib.logging.LogHandler;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLLoadCompleteEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ArmorySettings.MODID, name = ArmorySettings.NAME, version = ArmorySettings.VERSION, dependencies = ArmorySettings.DEPENDENCIES)
public class Armory
{
	@Instance
    public static Armory instance;

    public static LogHandler LOG;
    
    public Armory()
	{
    	//register plugins
    	ArmoryPlugins.instance.registerPlugin(new CombatPlugin());
    	
		//start plugins
    	ArmoryPlugins.instance.start();
	}

    @EventHandler
    public void pre(FMLPreInitializationEvent event)
    {
    	//initialise logging
        LOG = new LogHandler(event.getModLog(), LogHandler.LEVEL_WARN);
        
        //initialise configuration
    	
    	//pre plugins
        ArmoryPlugins.instance.pre(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	//init plugins
    	ArmoryPlugins.instance.init(event);
    }
    
    @EventHandler
    public void post(FMLPostInitializationEvent event)
    {
    	//post plugins
    	ArmoryPlugins.instance.post(event);
    }
    
    @EventHandler
    public void complete(FMLLoadCompleteEvent event)
    {
    	//complete plugins
    	ArmoryPlugins.instance.complete(event);
    }
}
