package com.miner3389.nerdspeaq;

import com.miner3389.nerdspeaq.handler.ConfigurationHandler;
import com.miner3389.nerdspeaq.init.NSItems;
import com.miner3389.nerdspeaq.proxies.IProxy;
import com.miner3389.nerdspeaq.reference.NSModReference;
import com.miner3389.nerdspeaq.utility.LoggingHelper;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=NSModReference.MOD_ID, name=NSModReference.MOD_NAME, version=NSModReference.VERSION, guiFactory=NSModReference.GUI_FACTORY_CLASS)
 public class NerdSpeaq {
	
	@Mod.Instance(NSModReference.MOD_ID)
	public static NerdSpeaq instance;
	
	@SidedProxy(clientSide = NSModReference.CLIENT_PROXY_CLASS, 
			serverSide = NSModReference.SERVER_PROXY_CLASS, 
			modId = NSModReference.MOD_ID)
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		LoggingHelper.info("Pre Initialization Complete");
		
		NSItems.init();
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event){
		LoggingHelper.info("Initialization Complete");
	}
	
	//Interact w/ other mods
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){
		LoggingHelper.info("Post Initialization Complete");
	}
	
}