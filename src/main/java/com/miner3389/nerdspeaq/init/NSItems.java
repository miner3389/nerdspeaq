package com.miner3389.nerdspeaq.init;

import com.miner3389.nerdspeaq.items.ItemBouleSilicon;
import com.miner3389.nerdspeaq.items.ItemIngotAluminum;
import com.miner3389.nerdspeaq.items.ItemIngotBeryllium;
import com.miner3389.nerdspeaq.items.ItemIngotBoron;
import com.miner3389.nerdspeaq.items.ItemIngotLithium;
import com.miner3389.nerdspeaq.items.ItemIngotMagnesium;
import com.miner3389.nerdspeaq.items.ItemIngotSodium;
import com.miner3389.nerdspeaq.items.ItemKleenex;
import com.miner3389.nerdspeaq.items.ItemPowderCarbon;
import com.miner3389.nerdspeaq.items.NSItem;
import com.miner3389.nerdspeaq.reference.NSModReference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(NSModReference.MOD_ID)
public class NSItems {
	public static final NSItem kleenex = new ItemKleenex();
	
	public static final NSItem ingotLithium = new ItemIngotLithium();
	public static final NSItem ingotBeryllium = new ItemIngotBeryllium();
	public static final NSItem ingotBoron = new ItemIngotBoron();
	public static final NSItem powderCarbon = new ItemPowderCarbon();
	public static final NSItem ingotSodium = new ItemIngotSodium();
	public static final NSItem ingotMagnesium = new ItemIngotMagnesium();
	public static final NSItem ingotAluminum = new ItemIngotAluminum();
	public static final NSItem bouleSilicon = new ItemBouleSilicon();
	
	public static void init(){
		GameRegistry.registerItem(kleenex, "kleenex");
		
		GameRegistry.registerItem(ingotLithium, "ingotLithium");
		GameRegistry.registerItem(ingotBeryllium, "ingotBeryllium");
		GameRegistry.registerItem(ingotBoron, "ingotBoron");
		GameRegistry.registerItem(powderCarbon, "powderCarbon");
		GameRegistry.registerItem(ingotSodium, "ingotSodium");
		GameRegistry.registerItem(ingotMagnesium, "ingotMagnesium");
		GameRegistry.registerItem(ingotAluminum, "ingotAluminum");
		GameRegistry.registerItem(bouleSilicon, "bouldeSilicon");
	}
	 
}
