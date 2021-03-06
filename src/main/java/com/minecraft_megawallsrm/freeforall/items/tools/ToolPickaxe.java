package com.minecraft_megawallsrm.freeforall.items.tools;

import com.minecraft_megawallsrm.freeforall.Main;
import com.minecraft_megawallsrm.freeforall.init.ModItems;
import com.minecraft_megawallsrm.freeforall.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class ToolPickaxe extends ItemPickaxe implements IHasModel{
	
	
public ToolPickaxe(String name, ToolMaterial material){
		
		super(material);
		
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
