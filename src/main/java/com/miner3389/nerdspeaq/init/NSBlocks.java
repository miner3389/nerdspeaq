package com.miner3389.nerdspeaq.init;

import com.miner3389.nerdspeaq.blocks.BlockOreBauxite;
import com.miner3389.nerdspeaq.blocks.BlockOreCassiterite;
import com.miner3389.nerdspeaq.blocks.BlockOreCobalite;
import com.miner3389.nerdspeaq.blocks.BlockOreGalena;
import com.miner3389.nerdspeaq.blocks.BlockOreMalachite;
import com.miner3389.nerdspeaq.blocks.BlockOreMonazite;
import com.miner3389.nerdspeaq.blocks.BlockOreNativePlatinum;
import com.miner3389.nerdspeaq.blocks.BlockOreNativeSilver;
import com.miner3389.nerdspeaq.blocks.BlockOrePentandite;
import com.miner3389.nerdspeaq.blocks.BlockOreSphalerite;
import com.miner3389.nerdspeaq.blocks.BlockOreUranium;
import com.miner3389.nerdspeaq.blocks.BlockOreWolframite;
import com.miner3389.nerdspeaq.blocks.BlockTest;
import com.miner3389.nerdspeaq.blocks.NSBlock;
import com.miner3389.nerdspeaq.reference.NSModReference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(NSModReference.MOD_ID)
public class NSBlocks {
	public static final NSBlock bauxiteOre = new BlockOreBauxite();
	public static final NSBlock cassiteriteOre = new BlockOreCassiterite();
	public static final NSBlock cobaliteOre = new BlockOreCobalite();
	public static final NSBlock galenaOre = new BlockOreGalena();
	public static final NSBlock malachiteOre = new BlockOreMalachite();
	public static final NSBlock monaziteOre = new BlockOreMonazite();
	public static final NSBlock nativePlatinumOre = new BlockOreNativePlatinum();
	public static final NSBlock nativeSilverOre = new BlockOreNativeSilver();
	public static final NSBlock pentanditeOre = new BlockOrePentandite();
	public static final NSBlock sphaleriteOre = new BlockOreSphalerite();
	public static final NSBlock uraniumOre = new BlockOreUranium();
	public static final NSBlock wolframiteOre = new BlockOreWolframite();
	public static final NSBlock testBlock = new BlockTest();
	
	public static void init(){
		GameRegistry.registerBlock(bauxiteOre, "bauxiteOre");
		GameRegistry.registerBlock(cassiteriteOre, "cassiteriteOre");
		GameRegistry.registerBlock(cobaliteOre, "cobaliteOre");
		GameRegistry.registerBlock(galenaOre, "glenaOre");
		GameRegistry.registerBlock(malachiteOre, "malachiteOre");
		GameRegistry.registerBlock(monaziteOre, "monaziteOre");
		GameRegistry.registerBlock(nativePlatinumOre, "nativePlatinumOre");
		GameRegistry.registerBlock(nativeSilverOre, "nativeSilverOre");
		GameRegistry.registerBlock(pentanditeOre, "pentanditeOre");
		GameRegistry.registerBlock(sphaleriteOre, "sphaleriteOre");
		GameRegistry.registerBlock(uraniumOre, "uraniumOre");
		GameRegistry.registerBlock(wolframiteOre, "wolframiteOre");
		GameRegistry.registerBlock(testBlock, "testBlock");
	}
}
