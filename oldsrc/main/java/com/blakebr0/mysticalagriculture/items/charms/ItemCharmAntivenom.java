package com.blakebr0.mysticalagriculture.items.charms;

import java.util.List;

import com.blakebr0.mysticalagriculture.items.BaseItem;
import com.blakebr0.mysticalagriculture.util.ShiftChecker;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemCharmAntivenom extends BaseItem {

	public ItemCharmAntivenom(String name) {
		super(name);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer player, List tooltip, boolean advanced){
		if(ShiftChecker.isShiftKeyDown()){
			tooltip.add("\u00A7eDescription:");
			tooltip.add("Prevents you from getting the Poison effect.");
			tooltip.add("");
			tooltip.add("\u00A7eApplicable To:");
			tooltip.add("- \u00A7cHelmet");
			tooltip.add("- \u00A7cChestplate");
			tooltip.add("- \u00A7cLeggings");
			tooltip.add("- \u00A7cBoots");
		} else {
			tooltip.add("Hold \u00A7e\u00A7oSHIFT \u00A7r\u00A77for info.");
		}
		super.addInformation(stack, player, tooltip, advanced);
	}
}
