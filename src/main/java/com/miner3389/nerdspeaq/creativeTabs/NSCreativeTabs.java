package com.miner3389.nerdspeaq.creativeTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.miner3389.nerdspeaq.init.NSItems;
import com.miner3389.nerdspeaq.reference.NSModReference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class NSCreativeTabs {
	
	public static final CreativeTabs NSMAIN_TAB= new CreativeTabs(NSModReference.MOD_ID.toLowerCase() + ":maintab"){
		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem()
		{
			return NSItems.kleenex;
		}
	};	
}
