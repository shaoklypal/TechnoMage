package shaoklypal.technomage;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import shaoklypal.technomage.block.TechMBlock;
import shaoklypal.technomage.item.TechMItem;
import shaoklypal.technomage.world.TechMOreGenerator;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "techm", name = "TechnoMage", version = "0.0.4.1")
public class TechnoMage {
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		//Item/Block init and reg
		TechMBlock.init();
		TechMItem.init();
		
		GameRegistry.addSmelting(TechMBlock.blockTungsten, new ItemStack(TechMItem.itemTungsten), 1.0F);
		GameRegistry.registerWorldGenerator(new TechMOreGenerator(), 0);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		//Proxy, TileEntity, entity, GUI and Packet Reg
		
		//--------------------should prolly put this in its own class file as well-----------------------------------------------------
		GameRegistry.addRecipe(new ItemStack(TechMItem.tungstenPickaxe), new Object[]{"TTT"," S "," S ",'T', TechMItem.itemTungsten, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(TechMItem.tungstenAxe), new Object[]{"TT ","TS "," S ",'T', TechMItem.itemTungsten, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(TechMItem.tungstenAxe), new Object[]{" TT"," ST"," S ",'T', TechMItem.itemTungsten, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(TechMItem.tungstenSpade), new Object[]{"T  ","S  ","S  ",'T', TechMItem.itemTungsten, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(TechMItem.tungstenSpade), new Object[]{" T "," S "," S ",'T', TechMItem.itemTungsten, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(TechMItem.tungstenSpade), new Object[]{"  T","  S","  S",'T', TechMItem.itemTungsten, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(TechMItem.tungstenHoe), new Object[]{"TT "," S "," S ",'T', TechMItem.itemTungsten, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(TechMItem.tungstenHoe), new Object[]{" TT"," S "," S ",'T', TechMItem.itemTungsten, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(TechMItem.tungstenSword), new Object[]{"T  ","T  ","S  ",'T', TechMItem.itemTungsten, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(TechMItem.tungstenSword), new Object[]{" T "," T "," S ",'T', TechMItem.itemTungsten, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(TechMItem.tungstenSword), new Object[]{"  T","  T","  S",'T', TechMItem.itemTungsten, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(TechMItem.itemCompendium), new Object[]{"TBT", "   ", "   ", 'T', TechMItem.itemTungsten, 'B', Items.book});
		GameRegistry.addRecipe(new ItemStack(TechMItem.itemCompendium), new Object[]{"   ", "TBT", "   ", 'T', TechMItem.itemTungsten, 'B', Items.book});
		GameRegistry.addRecipe(new ItemStack(TechMItem.itemCompendium), new Object[]{"   ", "   ", "TBT", 'T', TechMItem.itemTungsten, 'B', Items.book});
		GameRegistry.addRecipe(new ItemStack(TechMItem.itemCompendium), new Object[]{"TBT", "   ", "   ", 'T', TechMItem.itemTrist, 'B', Items.book});
		GameRegistry.addRecipe(new ItemStack(TechMItem.itemCompendium), new Object[]{"   ", "TBT", "   ", 'T', TechMItem.itemTrist, 'B', Items.book});
		GameRegistry.addRecipe(new ItemStack(TechMItem.itemCompendium), new Object[]{"   ", "   ", "TBT", 'T', TechMItem.itemTrist, 'B', Items.book});
		GameRegistry.addRecipe(new ItemStack(TechMItem.tungstenHelmet), new Object[]{"TTT","T T", "   ", 'T', TechMItem.itemTungsten});
		GameRegistry.addRecipe(new ItemStack(TechMItem.tungstenChestplate), new Object[]{"T T","TTT", "TTT", 'T', TechMItem.itemTungsten});
		GameRegistry.addRecipe(new ItemStack(TechMItem.tungstenLeggings), new Object[]{"TTT","T T", "T T", 'T', TechMItem.itemTungsten});
		GameRegistry.addRecipe(new ItemStack(TechMItem.tungstenBoots), new Object[]{"   ","T T", "T T", 'T', TechMItem.itemTungsten});
		GameRegistry.addRecipe(new ItemStack(TechMItem.itemTungstenAlloy,6), new Object[]{"TTT","RRR","TTT",'T', TechMItem.itemTungsten, 'R', Items.redstone});
		GameRegistry.addRecipe(new ItemStack(TechMItem.itemTristMesh), new Object[]{"TTT","T T", "TTT",'T',TechMItem.itemTrist});
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
	
	public static CreativeTabs tabTechnoMage = new CreativeTabs("tabTechnoMage"){
		@Override
		public Item getTabIconItem(){
			return new ItemStack(TechMItem.itemCompendium).getItem();
		}
	};
}
