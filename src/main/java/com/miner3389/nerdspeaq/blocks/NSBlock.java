package com.miner3389.nerdspeaq.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import com.miner3389.nerdspeaq.creativeTabs.NSCreativeTabs;
import com.miner3389.nerdspeaq.reference.NSModReference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class NSBlock extends Block{

	public NSBlock(){
		this(Material.rock);
		this.setHardness(1F);
		this.setResistance(10.0F);
		this.setBlockTextureName(this.getUnlocalizedName());
		this.setCreativeTab(NSCreativeTabs.NSMAIN_TAB);
	}
	
	protected NSBlock(Material material) {
		super(material);
		this.setHardness(1F);
		this.setResistance(10.0F);
		this.setBlockTextureName(this.getUnlocalizedName());
		this.setCreativeTab(NSCreativeTabs.NSMAIN_TAB);
	}
	
	@Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", NSModReference.TEXTURE_PREFRIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
