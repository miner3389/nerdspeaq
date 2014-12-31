package com.miner3389.nerdspeaq.init;

import com.miner3389.nerdspeaq.items.ItemKleenex;
import com.miner3389.nerdspeaq.items.NSItem;

import cpw.mods.fml.common.registry.GameRegistry;

public class NSItems {
	public static final NSItem kleenex = new ItemKleenex();
	
	public static void init(){
		GameRegistry.registerItem(kleenex, "kleenex");
	}
	
}
