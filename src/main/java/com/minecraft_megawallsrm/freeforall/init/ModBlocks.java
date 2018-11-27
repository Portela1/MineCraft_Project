package com.minecraft_megawallsrm.freeforall.init;

import java.util.ArrayList;
import java.util.List;

import com.minecraft_megawallsrm.freeforall.blocks.BlockBase;
import com.minecraft_megawallsrm.freeforall.blocks.PlutoniumOre;
import com.minecraft_megawallsrm.freeforall.blocks.counter.BlockCounter;
import com.minecraft_megawallsrm.freeforall.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks implements IHasModel{
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block PLUTONIUM_BLOCK = new BlockBase("plutonium_block",Material.IRON);
	public static final Block PLUTONIUM_ORE = new PlutoniumOre("plutonium_ore",Material.ROCK);
	
	
	public static BlockCounter counter = new BlockCounter();
	
	public static void register(IForgeRegistry<Block> registry) {
		registry.registerAll(
				// ...
				counter
		);
	
		GameRegistry.registerTileEntity(counter.getTileEntityClass(), counter.getRegistryName().toString());
	}

	@Override
	public void registerModels() {
		// TODO Auto-generated method stub
		
		counter.registerModels();
	}
	

}
