package shaoklypal.technomage.item;


import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import shaoklypal.technomage.TechnoMage;
import shaoklypal.technomage.gui.TechMGuiHandler;
import shaoklypal.technomage.proxy.ServerProxy;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class ItemCompendium extends Item {
	
	public boolean onItemActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ){
		
		if(!world.isRemote){
			FMLNetworkHandler.openGui(player, TechnoMage.modInstance, TechnoMage.guiIDCompendium, world, x, y, z);
			
		}
		return true;
	}

}
