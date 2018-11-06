package com.minecraft_megawallsrm.freeforall.items;

import com.minecraft_megawallsrm.freeforall.Main;
import com.minecraft_megawallsrm.freeforall.init.ModItems;
import com.minecraft_megawallsrm.freeforall.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name){
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
	
	}
	
	@Override
	public void registerModels() {
		
		Main.proxy.registerItemRenderer(this,0, "inventory");
		
	}

}
