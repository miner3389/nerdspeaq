package com.miner3389.nerdspeaq.handler;

import java.io.File;

import com.miner3389.nerdspeaq.reference.NSModReference;
import com.miner3389.nerdspeaq.utility.LoggingHelper;

import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class ConfigurationHandler {
	
	public static Configuration config;
	
	public static boolean configValue = false;
	
	public static void init(File configFile){
		//create config object from file
		//use m inalean's tutorial to make a gui!!
		if(config == null){
			config = new Configuration(configFile);
		} 
		loadConfig();
	}
	
	@SubscribeEvent
	public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event){
		LoggingHelper.error("Config Detected");
		if (event.modID.equalsIgnoreCase(NSModReference.MOD_ID)){
			loadConfig();
			LoggingHelper.error("Config Loaded");
		}
	}
	
	private static void loadConfig(){
		
		configValue = config.getBoolean("config value", Configuration.CATEGORY_GENERAL, true, "This is simply a test");
		
		LoggingHelper.error("loaded config values");
		
		if(config.hasChanged()){
			config.save();
			LoggingHelper.error("Config Saved");
		}
		
	}
	
	
}
