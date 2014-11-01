package shaoklypal.technomage;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import shaoklypal.technomage.item.ItemTrist;
import shaoklypal.technomage.item.ItemTungstenArmor;
import shaoklypal.technomage.item.ItemTungstenAxe;
import shaoklypal.technomage.item.ItemTungstenHoe;
import shaoklypal.technomage.item.ItemTungstenPickaxe;
import shaoklypal.technomage.item.ItemTungstenSpade;
import shaoklypal.technomage.item.ItemTungstenSword;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "techm", name = "TechnoMage", version = "0.0.4.1")
public class TechnoMage {
	
	
	//Blocks
	public static Block blockTungsten;
	public static Block blockTrist;
	
	
	//Items
	
	public static Item cropTristSeeds;
	public static Item itemTrist;
	
	public static Item itemCompendium;
	public static Item itemTungsten;
	public static Item tungstenPickaxe;
	public static Item tungstenAxe;
	public static Item tungstenSpade;
	public static Item tungstenHoe;
	public static Item tungstenSword;
	
	
	public static Item tungstenHelmet;
	public static Item tungstenChestplate;
	public static Item tungstenLeggings;
	public static Item tungstenBoots;
	
	public static final Item.ToolMaterial tungstenToolMaterial = EnumHelper.addToolMaterial("tungstenToolMaterial", 4, 800, 6.0F, 4.0F, 5);
	public static final ItemArmor.ArmorMaterial tungstenArmorMaterial = EnumHelper.addArmorMaterial("tungstenArmorMaterial", (480 / 16), new int[]{3,10,8,5}, 5);
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		//Item/Block init and reg
		//Config handling
		
		//blocks
		blockTungsten = new BlockTungsten(Material.rock).setBlockName("BlockTungsten").setBlockTextureName("techm:blocktungsten").setCreativeTab(tabTechnoMage);
		blockTrist = new TechMCrop().setBlockName("blockTrist").setBlockTextureName("techm:trist");
		
		//crops
		cropTristSeeds = new ItemSeeds(blockTrist, Blocks.farmland).setUnlocalizedName("TristSeeds").setTextureName("techm:tristseeds").setCreativeTab(tabTechnoMage);
		itemTrist = new ItemTrist().setUnlocalizedName("ItemTrist").setTextureName("techm:itemtrist").setCreativeTab(tabTechnoMage);
		
		//items
		itemCompendium = new ItemCompendium().setUnlocalizedName("ItemCompendium").setTextureName("techm:itemcompendium").setCreativeTab(tabTechnoMage);
		itemTungsten = new ItemTungsten().setUnlocalizedName("ItemTungsten").setTextureName("techm:itemtungsteningot").setCreativeTab(tabTechnoMage);
		tungstenPickaxe = new ItemTungstenPickaxe(tungstenToolMaterial).setUnlocalizedName("ItemTungstenPickaxe").setTextureName("techm:itemtungstenpickaxe").setCreativeTab(tabTechnoMage);
		tungstenAxe = new ItemTungstenAxe(tungstenToolMaterial).setUnlocalizedName("ItemTungstenAxe").setTextureName("techm:itemtungstenaxe").setCreativeTab(tabTechnoMage);
		tungstenSpade = new ItemTungstenSpade(tungstenToolMaterial).setUnlocalizedName("ItemTungstenSpade").setTextureName("techm:itemtungstenspade").setCreativeTab(tabTechnoMage);
		tungstenHoe = new ItemTungstenHoe(tungstenToolMaterial).setUnlocalizedName("ItemTungstenHoe").setTextureName("techm:itemtungstenhoe").setCreativeTab(tabTechnoMage);
		tungstenSword = new ItemTungstenSword(tungstenToolMaterial).setUnlocalizedName("ItemTungstenSword").setTextureName("techm:itemtungstensword").setCreativeTab(tabTechnoMage);

		
		tungstenHelmet = new ItemTungstenArmor(tungstenArmorMaterial, 0, 0).setUnlocalizedName("ItemTungstenHelmet").setTextureName("techm:itemtungstenhelm").setCreativeTab(tabTechnoMage);;
		tungstenChestplate = new ItemTungstenArmor(tungstenArmorMaterial, 0, 1).setUnlocalizedName("ItemTungstenChestplate").setTextureName("techm:itemtungstenchest").setCreativeTab(tabTechnoMage);;
		tungstenLeggings = new ItemTungstenArmor(tungstenArmorMaterial, 0, 2).setUnlocalizedName("ItemTungstenLeggings").setTextureName("techm:itemtungstenlegs").setCreativeTab(tabTechnoMage);;
		tungstenBoots = new ItemTungstenArmor(tungstenArmorMaterial, 0, 3).setUnlocalizedName("ItemTungstenBoots").setTextureName("techm:itemtungstenboots").setCreativeTab(tabTechnoMage);;
		
		
		//blocks
		GameRegistry.registerBlock(blockTungsten, blockTungsten.getUnlocalizedName().substring(5));
		
		//crops
		GameRegistry.registerItem(cropTristSeeds, cropTristSeeds.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemTrist, itemTrist.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockTrist, "Trist");
		
		MinecraftForge.addGrassSeed(new ItemStack(cropTristSeeds), 3);
		
		//items
		GameRegistry.registerItem(itemCompendium, itemCompendium.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemTungsten, itemTungsten.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(tungstenPickaxe, tungstenPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(tungstenAxe, tungstenAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(tungstenSpade, tungstenSpade.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(tungstenHoe, tungstenHoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(tungstenSword, tungstenSword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(tungstenHelmet, tungstenHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(tungstenChestplate, tungstenChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(tungstenLeggings, tungstenLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(tungstenBoots, tungstenBoots.getUnlocalizedName().substring(5));
		
		GameRegistry.addSmelting(blockTungsten, new ItemStack(itemTungsten), 1.0F);
		
		GameRegistry.registerWorldGenerator(new TungstenGeneration(), 0);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		//Proxy, TileEntity, entity, GUI and Packet Reg
		GameRegistry.addRecipe(new ItemStack(tungstenPickaxe), new Object[]{"TTT"," S "," S ",'T', itemTungsten, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(tungstenAxe), new Object[]{"TT ","TS "," S ",'T', itemTungsten, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(tungstenAxe), new Object[]{" TT"," ST"," S ",'T', itemTungsten, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(tungstenSpade), new Object[]{"T  ","S  ","S  ",'T', itemTungsten, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(tungstenSpade), new Object[]{" T "," S "," S ",'T', itemTungsten, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(tungstenSpade), new Object[]{"  T","  S","  S",'T', itemTungsten, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(tungstenHoe), new Object[]{"TT "," S "," S ",'T', itemTungsten, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(tungstenHoe), new Object[]{" TT"," S "," S ",'T', itemTungsten, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(tungstenSword), new Object[]{"T  ","T  ","S  ",'T', itemTungsten, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(tungstenSword), new Object[]{" T "," T "," S ",'T', itemTungsten, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(tungstenSword), new Object[]{"  T","  T","  S",'T', itemTungsten, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(itemCompendium), new Object[]{"TBT", "   ", "   ", 'T', itemTungsten, 'B', Items.book});
		GameRegistry.addRecipe(new ItemStack(itemCompendium), new Object[]{"   ", "TBT", "   ", 'T', itemTungsten, 'B', Items.book});
		GameRegistry.addRecipe(new ItemStack(itemCompendium), new Object[]{"   ", "   ", "TBT", 'T', itemTungsten, 'B', Items.book});
		GameRegistry.addRecipe(new ItemStack(itemCompendium), new Object[]{"TBT", "   ", "   ", 'T', itemTrist, 'B', Items.book});
		GameRegistry.addRecipe(new ItemStack(itemCompendium), new Object[]{"   ", "TBT", "   ", 'T', itemTrist, 'B', Items.book});
		GameRegistry.addRecipe(new ItemStack(itemCompendium), new Object[]{"   ", "   ", "TBT", 'T', itemTrist, 'B', Items.book});
		GameRegistry.addRecipe(new ItemStack(tungstenHelmet), new Object[]{"TTT","T T", "   ", 'T', itemTungsten});
		GameRegistry.addRecipe(new ItemStack(tungstenChestplate), new Object[]{"T T","TTT", "TTT", 'T', itemTungsten});
		GameRegistry.addRecipe(new ItemStack(tungstenLeggings), new Object[]{"TTT","T T", "T T", 'T', itemTungsten});
		GameRegistry.addRecipe(new ItemStack(tungstenBoots), new Object[]{"   ","T T", "T T", 'T', itemTungsten});
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
	
	public static CreativeTabs tabTechnoMage = new CreativeTabs("tabTechnoMage"){
		@Override
		public Item getTabIconItem(){
			return new ItemStack(itemCompendium).getItem();
		}
	};
}
