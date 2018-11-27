package com.minecraft_megawallsrm.freeforall.blocks.counter;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntityCounter extends TileEntity {

	private int count;

	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound) {
		compound.setInteger("ID", count);
		return super.writeToNBT(compound);
	}
	
	@Override
	public void readFromNBT(NBTTagCompound compound) {
		count = compound.getInteger("ID");
		super.readFromNBT(compound);
	}
	
	public int getCount() {
		return count;
	}
	
	public void incrementCount() {
		count++;
		markDirty();
	}
	
	public void decrementCount() {
		count--;
		markDirty();
	}

}