package com.miner3389.nerdspeaq.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class NSRecipies {
	
	//never use a non OreDict Shapeless Recipe
	
	public static void init(){
		//GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NSItems.kleenex), "ccc", "ppp", 'p', new ItemStack(Items.paper), 'c', new ItemStack(Blocks.wool)));
		//GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(NSBlocks.furnace), new ItemStack(NSItems.kleenex), new ItemStack(NSItems.kleenex)));
		GameRegistry.addSmelting(NSBlocks.bauxiteOre, new ItemStack(NSItems.ingotAluminum), .5F);
		GameRegistry.addSmelting(NSBlocks.cassiteriteOre, new ItemStack(NSItems.ingotTin), .5F);
		GameRegistry.addSmelting(NSBlocks.cobaliteOre, new ItemStack(NSItems.ingotCobalt), .5F);
		GameRegistry.addSmelting(NSBlocks.galenaOre, new ItemStack(NSItems.ingotLead), .5F);
		GameRegistry.addSmelting(NSBlocks.malachiteOre, new ItemStack(NSItems.ingotCopper), .5F);
		GameRegistry.addSmelting(NSBlocks.monaziteOre, new ItemStack(NSItems.thorium), .5F);
		GameRegistry.addSmelting(NSBlocks.nativePlatinumOre, new ItemStack(NSItems.ingotPlatinum), .5F);
		GameRegistry.addSmelting(NSBlocks.nativeSilverOre, new ItemStack(NSItems.ingotSilver), .5F);
		GameRegistry.addSmelting(NSBlocks.pentanditeOre, new ItemStack(NSItems.ingotNickel), .5F);
		GameRegistry.addSmelting(NSBlocks.sphaleriteOre, new ItemStack(NSItems.ingotZinc), .5F);
		GameRegistry.addSmelting(NSBlocks.uraniumOre, new ItemStack(NSItems.uranium), .5F);
		GameRegistry.addSmelting(NSBlocks.wolframiteOre, new ItemStack(NSItems.ingotTungsten), .5F);
	}
	
}
