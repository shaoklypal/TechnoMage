package shaoklypal.technomage;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import shaoklypal.technomage.block.TechMBlock;
import shaoklypal.technomage.item.TechMItem;
import shaoklypal.technomage.proxy.ServerProxy;
import shaoklypal.technomage.world.TechMOreGenerator;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "techm", name = "TechnoMage", version = "0.0.6.0")
public class TechnoMage {
	
	@SidedProxy(clientSide ="shaoklypal.technomage.proxy.ClientProxy",serverSide = "shaoklypal.technomage.proxy.ServerProxy")
	public static ServerProxy proxy;
	
	@Instance("techm")
	public static TechnoMage modInstance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		//Item/Block init and reg
		TechMBlock.init();
		TechMItem.init();
		
		proxy.registerRenderThings();
		
		GameRegistry.addSmelting(TechMBlock.blockTungsten, new ItemStack(TechMItem.itemTungsten), 1.0F);
		GameRegistry.registerWorldGenerator(new TechMOreGenerator(), 0);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		//Proxy, TileEntity, entity, GUI and Packet Reg
		proxy.registerNetworkStuff();
		
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
		GameRegistry.addRecipe(new ItemStack(TechMItem.itemArmorFrameSegment,2), new Object[]{"AMA","M M","AMA",'A',TechMItem.itemTungstenAlloy,'M',TechMItem.itemTristMesh});
		GameRegistry.addRecipe(new ItemStack(TechMItem.itemArmorFrameHelmet), new Object[]{"SSS","S S","   ",'S',TechMItem.itemArmorFrameSegment});
		GameRegistry.addRecipe(new ItemStack(TechMItem.itemArmorFrameChest), new Object[]{"S S","SSS","SSS",'S',TechMItem.itemArmorFrameSegment});
		GameRegistry.addRecipe(new ItemStack(TechMItem.itemArmorFrameLegs), new Object[]{"SSS","S S","S S",'S',TechMItem.itemArmorFrameSegment});
		GameRegistry.addRecipe(new ItemStack(TechMItem.itemArmorFrameBoots), new Object[]{"   ","S S","S S",'S',TechMItem.itemArmorFrameSegment});
		GameRegistry.addRecipe(new ItemStack(TechMItem.itemEnrichedTristMesh), new Object[]{"LRL","RMR","LRL",'L',new ItemStack(Items.dye,1,4),'R', Items.redstone, 'M', TechMItem.itemTristMesh});
		GameRegistry.addRecipe(new ItemStack(TechMItem.itemGoldenRope), new Object[]{"GTG","TST","GTG",'G',Items.gold_ingot, 'T', TechMItem.itemTrist, 'S', Items.string});
		GameRegistry.addRecipe(new ItemStack(TechMItem.itemHood), new Object[]{"EEE","EGE","   ",'E',TechMItem.itemEnrichedTristMesh,'G', TechMItem.itemGoldenRope});
		GameRegistry.addRecipe(new ItemStack(TechMItem.itemUpperRobe), new Object[]{"EGE","EEE","EEE",'E',TechMItem.itemEnrichedTristMesh,'G', TechMItem.itemGoldenRope});
		GameRegistry.addRecipe(new ItemStack(TechMItem.itemLowerRobe), new Object[]{"EEE","EGE","E E",'E',TechMItem.itemEnrichedTristMesh,'G', TechMItem.itemGoldenRope});
		GameRegistry.addRecipe(new ItemStack(TechMItem.itemSlippers), new Object[]{"   ","E E","EGE",'E',TechMItem.itemEnrichedTristMesh,'G', TechMItem.itemGoldenRope});
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
