package com.minecraft_megawallsrm.freeforall.items.tools;

import com.minecraft_megawallsrm.freeforall.Main;
import com.minecraft_megawallsrm.freeforall.init.ModItems;
import com.minecraft_megawallsrm.freeforall.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class ToolAxe extends ItemAxe implements IHasModel {
	
	
public ToolAxe(String name, ToolMaterial material){
		
		super(material, 6.0F, -3.2F);
		
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
