package com.miner3389.nerdspeaq.client.gui;

import java.util.List;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

import com.miner3389.nerdspeaq.handler.ConfigurationHandler;
import com.miner3389.nerdspeaq.reference.NSModReference;

import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.IConfigElement;

public class NSGuiConfig extends GuiConfig{
	
	public NSGuiConfig(GuiScreen guiScreen){
		super(guiScreen, 
				(List<IConfigElement>) new ConfigElement(ConfigurationHandler.config.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
				NSModReference.MOD_ID, 
				false, 
				false, 
				GuiConfig.getAbridgedConfigPath(ConfigurationHandler.config.toString()));
	}
	
}
 