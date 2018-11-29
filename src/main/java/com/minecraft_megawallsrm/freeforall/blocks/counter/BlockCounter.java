package com.minecraft_megawallsrm.freeforall.blocks.counter;

import javax.annotation.Nullable;

import com.minecraft_megawallsrm.freeforall.blocks.BlockTileEntity;
import com.minecraft_megawallsrm.freeforall.comands.util.Teleport;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;



public class BlockCounter extends BlockTileEntity<TileEntityCounter> {

	public BlockCounter() {
		super(Material.DRAGON_EGG, "counter"); 
	}
	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ) {
		if (!world.isRemote) {
			TileEntityCounter tile = getTileEntity(world, pos);
			if (side == EnumFacing.DOWN) {
				tile.decrementCount();}
			else if (side == EnumFacing.NORTH || side == EnumFacing.SOUTH || side == EnumFacing.EAST|| side == EnumFacing.WEST) {
				Teleport.teleportToDemension(player, player.getPosition().getX()+20, player.getPosition().getY()+20, player.getPosition().getZ()+20);
			
			} else if (side == EnumFacing.UP) {
				tile.incrementCount();
			}
			player.sendMessage(new TextComponentString("ID: " + tile.getCount()));
		}
		return true;
	}
	
	@Override
	public Class<TileEntityCounter> getTileEntityClass() {
		return TileEntityCounter.class;
	}
	
	@Nullable
	@Override
	public TileEntityCounter createTileEntity(World world, IBlockState state) {
		return new TileEntityCounter();
	}

}