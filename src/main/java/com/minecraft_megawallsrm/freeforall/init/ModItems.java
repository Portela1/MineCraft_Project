package com.minecraft_megawallsrm.freeforall.init;


import java.util.ArrayList;
import java.util.List;

import com.minecraft_megawallsrm.freeforall.items.ItemBase;
import com.minecraft_megawallsrm.freeforall.items.armor.ArmorBase;
import com.minecraft_megawallsrm.freeforall.items.tools.ToolAxe;
import com.minecraft_megawallsrm.freeforall.items.tools.ToolHoe;
import com.minecraft_megawallsrm.freeforall.items.tools.ToolPickaxe;
import com.minecraft_megawallsrm.freeforall.items.tools.ToolSpade;
import com.minecraft_megawallsrm.freeforall.items.tools.ToolSword;
import com.minecraft_megawallsrm.freeforall.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//material 
	
	public static final ToolMaterial MATERIAL_PLUTONIUM = EnumHelper.addToolMaterial("material_plutonium", 3, 250, 8.0F, 3.0F, 10);
	public static final ArmorMaterial ARMOR_MATERIAL_PLUTONIUM = EnumHelper.addArmorMaterial("armor_material_plutonium", Reference.MOD_ID + ":plutonium", 15, 
			new int[] {2, 7, 6, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F);
	
	// items
	public static final Item PLUTONIUM = new ItemBase("plutonium");
	public static final Item PLUTONIUM_LOLIPOP = new ItemBase("plutonium_lolipop");
	
	//Tools
	public static final ItemSword PLUTONIUM_SWORD = new ToolSword("plutonium_sword", MATERIAL_PLUTONIUM );
	public static final ItemSpade PLUTONIUM_SPADE = new ToolSpade("plutonium_spade", MATERIAL_PLUTONIUM );
	public static final ItemPickaxe PLUTONIUM_PICKAXE = new ToolPickaxe("plutonium_pickaxe", MATERIAL_PLUTONIUM );
	public static final ItemAxe PLUTONIUM_AXE = new ToolAxe("plutonium_axe", MATERIAL_PLUTONIUM );
	public static final ItemHoe PLUTONIUM_HOE = new ToolHoe("plutonium_hoe", MATERIAL_PLUTONIUM );
	
	
	//Amor
	public static final Item PLUTONIUM_HELMET = new ArmorBase("plutonium_helmet", ARMOR_MATERIAL_PLUTONIUM, 1, EntityEquipmentSlot.HEAD );
	public static final Item PLUTONIUM_CHESTPLATE = new ArmorBase("plutonium_chestplate", ARMOR_MATERIAL_PLUTONIUM, 1, EntityEquipmentSlot.CHEST );
	public static final Item PLUTONIUM_LEGGINGS = new ArmorBase("plutonium_leggings", ARMOR_MATERIAL_PLUTONIUM, 2, EntityEquipmentSlot.LEGS );
	public static final Item PLUTONIUM_BOOTS = new ArmorBase("plutonium_boots", ARMOR_MATERIAL_PLUTONIUM, 1, EntityEquipmentSlot.FEET );



}
