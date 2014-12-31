package com.miner3389.nerdspeaq.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

import com.miner3389.nerdspeaq.reference.NSModReference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class NSBlock extends Block{

	public NSBlock(){
		this(Material.rock);
	}
	
	protected NSBlock(Material material) {
		super(material);
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