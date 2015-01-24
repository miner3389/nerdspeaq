package com.miner3389.nerdspeaq.blocks;

import java.util.Random;

import net.minecraft.world.World;

public class BlockTest extends NSBlock{
	public BlockTest(){
		super();
		setBlockName("testBlock");
		setTickRandomly(true);
	}
	
	 public void updateTick(World world, int x, int y, int z, Random rand) {
		 world.playSoundEffect(x, y, z, "tile.piston.in", rand.nextFloat(), 1.0F);//x,y,z,soundname,volume,pitch
	 }
}
