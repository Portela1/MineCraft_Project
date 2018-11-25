package com.minecraft_megawallsrm.freeforall.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipies 
{

	public static void init() {
		GameRegistry.addSmelting(ModBlocks.PLUTONIUM_ORE,new ItemStack(ModItems.PLUTONIUM,1),2.0f);
	}
	
	
}
