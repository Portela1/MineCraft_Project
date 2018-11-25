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
	public int quantityDropped(Random rand) {
		int max = 4;
		int min = 1;
		return rand.nextInt(max)+ min;
	}
	
}
