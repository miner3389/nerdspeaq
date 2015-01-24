package com.miner3389.nerdspeaq.world.gen;

import java.util.Random;

import com.miner3389.nerdspeaq.init.NSBlocks;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;

public class NSWorldGeneratorStructures implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		if(world.provider.dimensionId != 1 && world.provider.dimensionId != -1){
			generateHouse(random, world, chunkX, chunkZ);
		}
			
	}
	
	private void generateHouse(Random rand, World world, int chunkX, int chunkZ){
		if(rand.nextInt(10) == 0){
			int x = chunkX * 16 + rand.nextInt(16);
			int z = chunkZ * 16 + rand.nextInt(16);
			int y = world.getHeightValue(x, z);
			if(world.getBlock(x, y-1, z) != Blocks.water && world.getBlock(x, y-1, z) != Blocks.leaves && world.getBlock(x, y-1, z) != Blocks.leaves2 && world.getBlock(x, y-1, z) != Blocks.vine && world.getBlock(x, y-1, z) != Blocks.cactus && world.getBlock(x, y-1, z) != Blocks.flowing_lava && world.getBlock(x, y-1, z) != Blocks.flowing_water && world.getBlock(x, y-1, z) != Blocks.lava && world.getBlock(x, y-1, z) != Blocks.ice && world.getBlock(x, y-1, z) != Blocks.stone_slab && world.getBlock(x, y-1, z) != Blocks.pumpkin){
				for(int i = 0; i < 8; i++){
					for(int j = 0; j <5; j++){
						world.setBlock(x + i, y, z + j, Blocks.planks);
					}
				}
				world.setBlock(x, y + 1, z, NSBlocks.testBlock);
			}
		}
	}
}
