package shaoklypal.technomage.gui;

import shaoklypal.technomage.TechnoMage;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class TechMGuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity tileentity = world.getTileEntity(x, y, z);
		Item item = player.inventory.getCurrentItem().getItem();
		switch(ID){
		case TechnoMage.guiIDCompendium:
			return new ContainerCompendium(player.inventory, item);
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity tileentity = world.getTileEntity(x, y, z);
		Item item = player.inventory.getCurrentItem().getItem();
		switch(ID){
		case TechnoMage.guiIDCompendium:
			return new GuiCompendiumHome(player.inventory, item);
		}
		return null;
	}



}
