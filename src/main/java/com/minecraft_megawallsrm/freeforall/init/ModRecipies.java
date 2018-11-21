package com.minecraft_megawallsrm.freeforall.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipies 
{

	public static void init() {
		GameRegistry.addSmelting(ModItems.PLUTONIUM, new ItemStack(ModBlocks.PLUTONIUM_BLOCK,1), 2.0f);
		GameRegistry.addSmelting(ModBlocks.PLUTONIUM_BLOCK,new ItemStack(ModItems.PLUTONIUM,9),2.0f);
	}
	
	
}
