package com.minecraft_megawallsrm.freeforall.init;

import java.util.ArrayList;
import java.util.List;

import com.minecraft_megawallsrm.freeforall.blocks.BlockBase;
import com.minecraft_megawallsrm.freeforall.blocks.PlutoniumOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block PLUTONIUM_BLOCK = new BlockBase("plutonium_block",Material.IRON);
	public static final Block PLUTONIUM_ORE = new PlutoniumOre("plutonium_ore",Material.ROCK);
}
