package com.miner3389.nerdspeaq.init;

import com.miner3389.nerdspeaq.items.ItemIngotAluminium;
import com.miner3389.nerdspeaq.items.ItemKleenex;
import com.miner3389.nerdspeaq.items.NSItem;
import com.miner3389.nerdspeaq.reference.NSModReference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(NSModReference.MOD_ID)
public class NSItems {
	public static final NSItem kleenex = new ItemKleenex();
	
	public static void init(){
		GameRegistry.registerItem(kleenex, "kleenex");
	}
	 
}
