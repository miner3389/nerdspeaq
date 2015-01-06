package com.miner3389.nerdspeaq.init;

import com.miner3389.nerdspeaq.blocks.BlockFurnace;
import com.miner3389.nerdspeaq.blocks.BlockOreAluminum;
import com.miner3389.nerdspeaq.blocks.BlockOreBeryllium;
import com.miner3389.nerdspeaq.blocks.BlockOreBoron;
import com.miner3389.nerdspeaq.blocks.BlockOreLithium;
import com.miner3389.nerdspeaq.blocks.BlockOreMagnesium;
import com.miner3389.nerdspeaq.blocks.BlockOreSilicon;
import com.miner3389.nerdspeaq.blocks.NSBlock;
import com.miner3389.nerdspeaq.reference.NSModReference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(NSModReference.MOD_ID)
public class NSBlocks {
	public static final NSBlock furnace = new BlockFurnace();
	
	public static final NSBlock lithiumOre = new BlockOreLithium();
	public static final NSBlock berylliumOre = new BlockOreBeryllium();
	public static final NSBlock boronOre = new BlockOreBoron();
	public static final NSBlock sodiumOre = new BlockOreSilicon();
	public static final NSBlock magnesiumOre = new BlockOreMagnesium();
	public static final NSBlock aluminumOre = new BlockOreAluminum();
	public static final NSBlock siliconOre = new BlockOreSilicon();
	
	public static void init(){
		GameRegistry.registerBlock(furnace, "furnace");
		
		GameRegistry.registerBlock(lithiumOre, "lithiumOre");
		GameRegistry.registerBlock(berylliumOre, "berylliumOre");
		GameRegistry.registerBlock(boronOre, "boronOre");
		GameRegistry.registerBlock(sodiumOre, "sodiumOre");
		GameRegistry.registerBlock(magnesiumOre, "magnesiumOre");
		GameRegistry.registerBlock(aluminumOre, "aluminumOre");
		GameRegistry.registerBlock(siliconOre, "siliconOre");
	}
}
