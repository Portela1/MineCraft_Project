package com.minecraft_megawallsrm.freeforall.world;

import java.util.Random;

import com.minecraft_megawallsrm.freeforall.init.ModBlocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModWorldGen implements IWorldGenerator {
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGeneratorm, IChunkProvider chunkProvider) {
		if(world.provider.getDimension() == 0) {
			generateOverworld(random, chunkX,  chunkZ, world, chunkGeneratorm,chunkProvider);
		}
	}
	private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGeneratorm, IChunkProvider chunkProvider) {
		generateOre(ModBlocks.PLUTONIUM_ORE.getDefaultState(),world,random,chunkX*16,chunkZ*16,16,64,random.nextInt(7)+4,50);
	}
	
	private void generateOre(IBlockState ore, World world, Random random, int x, int z,int miny,int maxy, int size, int chances) {
		int deltay = maxy - miny;
		for(int i = 0; i< chances; i++) {
			BlockPos pos = new BlockPos(x+random.nextInt(16),miny + random.nextInt(deltay), z+random.nextInt(20));
			WorldGenMinable generator = new WorldGenMinable(ore,size);
			generator.generate(world, random, pos);
		}
	}
	
	
}
