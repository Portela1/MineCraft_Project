package com.minecraft_megawallsrm.freeforall.blocks;

import java.util.Random;

import com.minecraft_megawallsrm.freeforall.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class PlutoniumOre extends BlockBase {

	public PlutoniumOre(String name,Material material) {
		super(name,material);
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe",2);
	}
	
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.PLUTONIUM;
	}
	
	@Override
	public int quantityDropped(Random rand) {
		int max = 10;
		int min = 2;
		return rand.nextInt(max)+min;
	}
	
}
