package com.miner3389.nerdspeaq.init;

import net.minecraftforge.oredict.OreDictionary;

public class NSOreDictionary {
	public static void init(){
		OreDictionary.registerOre(NSItems.ingotLithium.getUnlocalizedName(), NSItems.ingotLithium);
		OreDictionary.registerOre(NSItems.ingotBeryllium.getUnlocalizedName(), NSItems.ingotBeryllium);
		OreDictionary.registerOre(NSItems.ingotBoron.getUnlocalizedName(), NSItems.ingotBoron);
		OreDictionary.registerOre(NSItems.powderCarbon.getUnlocalizedName(), NSItems.powderCarbon);
		OreDictionary.registerOre(NSItems.ingotSodium.getUnlocalizedName(), NSItems.ingotSodium);
		OreDictionary.registerOre(NSItems.ingotMagnesium.getUnlocalizedName(), NSItems.ingotMagnesium);
		OreDictionary.registerOre(NSItems.ingotAluminum.getUnlocalizedName(), NSItems.ingotAluminum);
		OreDictionary.registerOre(NSItems.bouleSilicon.getUnlocalizedName(), NSItems.bouleSilicon);
		
		OreDictionary.registerOre(NSBlocks.lithiumOre.getUnlocalizedName(), NSBlocks.lithiumOre);
		OreDictionary.registerOre(NSBlocks.berylliumOre.getUnlocalizedName(), NSBlocks.berylliumOre);
		OreDictionary.registerOre(NSBlocks.boronOre.getUnlocalizedName(), NSBlocks.boronOre);
		OreDictionary.registerOre(NSBlocks.sodiumOre.getUnlocalizedName(), NSBlocks.sodiumOre);
		OreDictionary.registerOre(NSBlocks.magnesiumOre.getUnlocalizedName(), NSBlocks.magnesiumOre);
		OreDictionary.registerOre(NSBlocks.aluminumOre.getUnlocalizedName(), NSBlocks.aluminumOre);
		OreDictionary.registerOre(NSBlocks.siliconOre.getUnlocalizedName(), NSBlocks.siliconOre);
	}
}