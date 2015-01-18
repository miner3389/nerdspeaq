package com.miner3389.nerdspeaq.init;

import com.miner3389.nerdspeaq.items.ItemIngotAluminum;
import com.miner3389.nerdspeaq.items.ItemIngotBrass;
import com.miner3389.nerdspeaq.items.ItemIngotBronze;
import com.miner3389.nerdspeaq.items.ItemIngotCobalt;
import com.miner3389.nerdspeaq.items.ItemIngotCopper;
import com.miner3389.nerdspeaq.items.ItemIngotLead;
import com.miner3389.nerdspeaq.items.ItemIngotNickel;
import com.miner3389.nerdspeaq.items.ItemIngotPlatinum;
import com.miner3389.nerdspeaq.items.ItemIngotSilver;
import com.miner3389.nerdspeaq.items.ItemIngotTin;
import com.miner3389.nerdspeaq.items.ItemIngotTungsten;
import com.miner3389.nerdspeaq.items.ItemIngotZinc;
import com.miner3389.nerdspeaq.items.ItemThorium;
import com.miner3389.nerdspeaq.items.ItemUranium;
import com.miner3389.nerdspeaq.items.NSItem;
import com.miner3389.nerdspeaq.reference.NSModReference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(NSModReference.MOD_ID)
public class NSItems {
	
	public static final NSItem ingotAluminum = new ItemIngotAluminum();
	public static final NSItem ingotBrass = new ItemIngotBrass();
	public static final NSItem ingotBronze = new ItemIngotBronze();
	public static final NSItem ingotCobalt = new ItemIngotCobalt();
	public static final NSItem ingotCopper = new ItemIngotCopper();
	public static final NSItem ingotLead = new ItemIngotLead();
	public static final NSItem ingotNickel = new ItemIngotNickel();
	public static final NSItem ingotPlatinum = new ItemIngotPlatinum();
	public static final NSItem ingotSilver = new ItemIngotSilver();
	public static final NSItem ingotTin = new ItemIngotTin();
	public static final NSItem ingotTungsten = new ItemIngotTungsten();
	public static final NSItem ingotZinc = new ItemIngotZinc();
	public static final NSItem thorium = new ItemThorium();
	public static final NSItem uranium = new ItemUranium();

	public static void init(){
		
		GameRegistry.registerItem(ingotAluminum, "ingotAluminum");
		GameRegistry.registerItem(ingotBrass, "ingotBrass");
		GameRegistry.registerItem(ingotBronze, "ingotBronze");
		GameRegistry.registerItem(ingotCobalt, "ingotCobalt");
		GameRegistry.registerItem(ingotCopper, "ingotCopper");
		GameRegistry.registerItem(ingotLead, "ingotLead");
		GameRegistry.registerItem(ingotNickel, "ingotNickel");
		GameRegistry.registerItem(ingotPlatinum, "ingotPlatinum");
		GameRegistry.registerItem(ingotSilver, "ingotSilver");
		GameRegistry.registerItem(ingotTin, "ingotTin");
		GameRegistry.registerItem(ingotTungsten, "ingotTungsten");
		GameRegistry.registerItem(ingotZinc, "ingotZinc");
		GameRegistry.registerItem(thorium, "thorium");
		GameRegistry.registerItem(uranium, "uranium");
		
	}
	 
}
