package com.blakebr0.mysticalagriculture.handler;

import com.blakebr0.mysticalagriculture.gui.ContainerSeedReprocessor;
import com.blakebr0.mysticalagriculture.gui.GuiSeedReprocessor;
import com.blakebr0.mysticalagriculture.tileentity.TileEntitySeedReprocessor;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

    @Override
    public Object getClientGuiElement (int ID, EntityPlayer player, World world, int x, int y, int z){
        if(ID == 0){
            return new GuiSeedReprocessor(player.inventory, (TileEntitySeedReprocessor)world.getTileEntity(new BlockPos(x, y, z)));
        }
        return null;
    }

    @Override
    public Object getServerGuiElement (int ID, EntityPlayer player, World world, int x, int y, int z){
        if(ID == 0){
            return new ContainerSeedReprocessor(player.inventory, (TileEntitySeedReprocessor)world.getTileEntity(new BlockPos(x, y, z)));
        }
        return null;
    }
}
