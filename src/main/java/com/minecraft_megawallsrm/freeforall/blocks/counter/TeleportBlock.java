package com.minecraft_megawallsrm.freeforall.blocks.counter;

import java.util.ArrayList;

import javax.annotation.Nullable;

import com.minecraft_megawallsrm.freeforall.blocks.BlockTileEntity;
import com.minecraft_megawallsrm.freeforall.comands.util.Teleport;
import com.minecraft_megawallsrm.freeforall.util.IHasModel;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityCommandBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;



public class TeleportBlock extends BlockTileEntity<TileEntityTeleporter> implements IHasModel{

	public TeleportBlock(String name) {
		super("teleport_block", Material.DRAGON_EGG); 
	}
	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ) {
		if (!world.isRemote) {
			TileEntityTeleporter tile = getTileEntity(world, pos);
			if (side == EnumFacing.DOWN) {
				tile.decrementCount();}
			else if (side == EnumFacing.NORTH || side == EnumFacing.SOUTH || side == EnumFacing.EAST|| side == EnumFacing.WEST) {
				BlockPos closest = closestblock(world,pos,32);
				Teleport.teleportToDemension(player, closest.getX(), closest.getY(),closest.getZ());
			
			} else if (side == EnumFacing.UP) {
				tile.incrementCount();
			}
			player.sendMessage(new TextComponentString("ID: " + tile.getCount()));
		}
		return true;
	}
	
	
	static BlockPos closestblock(World world, BlockPos start, int rad){
		int counter = 1;
		ArrayList<BlockPos> InRadiusAndSameId = new ArrayList<BlockPos>();
		BlockPos result = new BlockPos(start.getX(),start.getY(),start.getZ());
	while(counter != rad) {
		for(int x = start.getX() - counter; x <= start.getX() + counter; x++)
			for(int y = start.getY() - counter; y <= start.getY() + counter; y++)
				for(int z = start.getZ() - counter; z <= start.getZ() + counter;z++) {
					BlockPos position = new BlockPos(x,y,z);
					if((position.getX() - start.getX() < 1 && position.getY() - start.getY() < 1 && position.getZ() - start.getZ()<1)) { 
						continue;
					}
					if (world.getTileEntity(position) instanceof TileEntityTeleporter){
						TileEntityTeleporter otro = (TileEntityTeleporter) world.getTileEntity(position);
						TileEntityTeleporter mio = (TileEntityTeleporter) world.getTileEntity(start);
						if( mio.getCount() == otro.getCount()) {
							InRadiusAndSameId.add(position);
						}
						
					}	
				}
		counter++;
	}
	
	int xds = (InRadiusAndSameId.get(0).getX() - start.getX()) * (InRadiusAndSameId.get(0).getX() - start.getX());
	int yds = (InRadiusAndSameId.get(0).getY() - start.getY()) * (InRadiusAndSameId.get(0).getY() - start.getY());
	int zds = (InRadiusAndSameId.get(0).getZ() - start.getZ()) * (InRadiusAndSameId.get(0).getZ() - start.getZ());
	int min = (int) Math.sqrt(xds+yds+zds);
	int vec;
	for(BlockPos i : InRadiusAndSameId) {
		xds = (i.getX() - start.getX()) * (i.getX() - start.getX());
		yds = (i.getY() - start.getY()) * (i.getY() - start.getY());
		zds = (i.getZ() - start.getZ()) * (i.getZ() - start.getZ());
		vec = (int) Math.sqrt(xds+yds+zds);
		if(vec<=min) {
			min = vec;
			result = new BlockPos(i.getX(),i.getY(),i.getZ());
		}
	}
	
	return result;
		
	}
	
	@Override
	public Class<TileEntityTeleporter> getTileEntityClass() {
		return TileEntityTeleporter.class;
	}
	
	@Nullable
	@Override
	public TileEntityTeleporter createTileEntity(World world, IBlockState state) {
		return new TileEntityTeleporter();
	}

}