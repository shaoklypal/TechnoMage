package shaoklypal.technomage.item;


import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import shaoklypal.technomage.TechnoMage;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemCompendium extends Item {
	
	/*public boolean onItemActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ){
		
		if(!world.isRemote){
			FMLNetworkHandler.openGui(player, TechnoMage.modInstance, TechnoMage.guiIDCompendium, world, x, y, z);
		
		}
		
		return true;
	}*/
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World world, EntityPlayer player){
		if(!world.isRemote){
			FMLNetworkHandler.openGui(player, TechnoMage.modInstance, TechnoMage.guiIDCompendium, world,player.chunkCoordX,player.chunkCoordY,player.chunkCoordZ);
			
		}
		return par1ItemStack;
	  }

}
