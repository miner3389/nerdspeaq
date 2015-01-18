package com.miner3389.nerdspeaq.world.gen;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import com.miner3389.nerdspeaq.init.NSBlocks;

import cpw.mods.fml.common.IWorldGenerator;

public class NSWorldGeneratorOre implements IWorldGenerator{
	
	private WorldGenMinable bauxiteOre = new WorldGenMinable(NSBlocks.bauxiteOre, 8);
	private WorldGenMinable cassiteriteOre = new WorldGenMinable(NSBlocks.cassiteriteOre, 8);
	private WorldGenMinable cobaliteOre = new WorldGenMinable(NSBlocks.cobaliteOre, 2);
	private WorldGenMinable galenaOre = new WorldGenMinable(NSBlocks.galenaOre, 8);
	private WorldGenMinable malachiteOre = new WorldGenMinable(NSBlocks.malachiteOre, 8);
	private WorldGenMinable monaziteOre = new WorldGenMinable(NSBlocks.monaziteOre, 16);
	private WorldGenMinable nativePlatinumOre = new WorldGenMinable(NSBlocks.nativePlatinumOre, 1);
	private WorldGenMinable nativeSilverOre = new WorldGenMinable(NSBlocks.nativeSilverOre, 6);
	private WorldGenMinable pentanditeOre = new WorldGenMinable(NSBlocks.pentanditeOre, 8);
	private WorldGenMinable sphaleriteOre = new WorldGenMinable(NSBlocks.sphaleriteOre, 8);
	private WorldGenMinable uraniumOre = new WorldGenMinable(NSBlocks.uraniumOre, 6);
	private WorldGenMinable wolframiteOre = new WorldGenMinable(NSBlocks.wolframiteOre, 1);
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		if(world.provider.dimensionId != 1 && world.provider.dimensionId != -1){
			generateOre(bauxiteOre, random, chunkX, 80, chunkZ, world, 70);
			generateOre(cassiteriteOre, random, chunkX, 80, chunkZ, world, 70);
			generateOre(cobaliteOre, random, chunkX, 30, chunkZ, world, 20);
			generateOre(galenaOre, random, chunkX, 70, chunkZ, world, 45);
			generateOre(malachiteOre, random, chunkX, 80, chunkZ, world, 70);
			generateOre(monaziteOre, random, chunkX, 40, chunkZ, world, 40);
			generateOre(nativePlatinumOre, random, chunkX, 20, chunkZ, world, 10);
			generateOre(nativeSilverOre, random, chunkX, 30, chunkZ, world, 20);
			generateOre(pentanditeOre, random, chunkX, 80, chunkZ, world, 70);
			generateOre(sphaleriteOre, random, chunkX, 80, chunkZ, world, 70);
			generateOre(uraniumOre, random, chunkX, 30, chunkZ, world, 20);
			generateOre(wolframiteOre, random, chunkX, 20, chunkZ, world, 10);
		}
	}
	
	public void generateOre(WorldGenMinable ore, Random rand, int chunkX, int topY, int chunkZ, World world, int probability){
		for(int i = 0; i < probability; i++){
			int x = chunkX * 16 + rand.nextInt(16);
			int y = rand.nextInt(topY);
			int z = chunkZ * 16 + rand.nextInt(16);
			ore.generate(world, rand, x, y, z);
		}
	}

}
