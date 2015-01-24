package com.miner3389.nerdspeaq.proxies;

import com.miner3389.nerdspeaq.client.settings.NSKeyBindings;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.FMLCommonHandler;

public class ClientProxy extends CommonProxy{

	@Override
	public void preInit(){
		registerKeyBindings();
	}
	
	public void registerKeyBindings() {
		for(NSKeyBindings key : NSKeyBindings.values()){
			ClientRegistry.registerKeyBinding(key.getKeybind());
		}
	}
	
	@Override
	public void init(){
		
	}
	
	public void postInit(){
		
	}
}
