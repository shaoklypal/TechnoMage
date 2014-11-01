package shaoklypal.technomage.item;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import shaoklypal.technomage.TechnoMage;
import shaoklypal.technomage.block.TechMBlock;
import shaoklypal.technomage.material.TechMMaterial;
import cpw.mods.fml.common.registry.GameRegistry;

public class TechMItem {
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

	/**
	 * Init items
	 */
	public static void init(){
		//create item instance
		cropTristSeeds = new ItemSeeds(TechMBlock.blockTrist, Blocks.farmland).setUnlocalizedName("TristSeeds").setTextureName("techm:tristseeds").setCreativeTab(TechnoMage.tabTechnoMage);
		itemTrist = new ItemTrist().setUnlocalizedName("ItemTrist").setTextureName("techm:itemtrist").setCreativeTab(TechnoMage.tabTechnoMage);

		//items
		itemCompendium = new ItemCompendium().setUnlocalizedName("ItemCompendium").setTextureName("techm:itemcompendium").setCreativeTab(TechnoMage.tabTechnoMage);
		itemTungsten = new ItemTungsten().setUnlocalizedName("ItemTungsten").setTextureName("techm:itemtungsteningot").setCreativeTab(TechnoMage.tabTechnoMage);
		tungstenPickaxe = new ItemTungstenPickaxe(TechMMaterial.tungstenToolMaterial).setUnlocalizedName("ItemTungstenPickaxe").setTextureName("techm:itemtungstenpickaxe").setCreativeTab(TechnoMage.tabTechnoMage);
		tungstenAxe = new ItemTungstenAxe(TechMMaterial.tungstenToolMaterial).setUnlocalizedName("ItemTungstenAxe").setTextureName("techm:itemtungstenaxe").setCreativeTab(TechnoMage.tabTechnoMage);
		tungstenSpade = new ItemTungstenSpade(TechMMaterial.tungstenToolMaterial).setUnlocalizedName("ItemTungstenSpade").setTextureName("techm:itemtungstenspade").setCreativeTab(TechnoMage.tabTechnoMage);
		tungstenHoe = new ItemTungstenHoe(TechMMaterial.tungstenToolMaterial).setUnlocalizedName("ItemTungstenHoe").setTextureName("techm:itemtungstenhoe").setCreativeTab(TechnoMage.tabTechnoMage);
		tungstenSword = new ItemTungstenSword(TechMMaterial.tungstenToolMaterial).setUnlocalizedName("ItemTungstenSword").setTextureName("techm:itemtungstensword").setCreativeTab(TechnoMage.tabTechnoMage);


		tungstenHelmet = new ItemTungstenArmor(TechMMaterial.tungstenArmorMaterial, 0, 0).setUnlocalizedName("ItemTungstenHelmet").setTextureName("techm:itemtungstenhelm").setCreativeTab(TechnoMage.tabTechnoMage);;
		tungstenChestplate = new ItemTungstenArmor(TechMMaterial.tungstenArmorMaterial, 0, 1).setUnlocalizedName("ItemTungstenChestplate").setTextureName("techm:itemtungstenchest").setCreativeTab(TechnoMage.tabTechnoMage);;
		tungstenLeggings = new ItemTungstenArmor(TechMMaterial.tungstenArmorMaterial, 0, 2).setUnlocalizedName("ItemTungstenLeggings").setTextureName("techm:itemtungstenlegs").setCreativeTab(TechnoMage.tabTechnoMage);;
		tungstenBoots = new ItemTungstenArmor(TechMMaterial.tungstenArmorMaterial, 0, 3).setUnlocalizedName("ItemTungstenBoots").setTextureName("techm:itemtungstenboots").setCreativeTab(TechnoMage.tabTechnoMage);;


		//register blocks
		registerItem();
	}

	/**
	 * Register items
	 */
	public static void registerItem(){
		
		//items
		GameRegistry.registerItem(itemCompendium, itemCompendium.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemTungsten, itemTungsten.getUnlocalizedName().substring(5));
		//tools
		GameRegistry.registerItem(tungstenPickaxe, tungstenPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(tungstenAxe, tungstenAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(tungstenSpade, tungstenSpade.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(tungstenHoe, tungstenHoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(tungstenSword, tungstenSword.getUnlocalizedName().substring(5));
		//armour
		GameRegistry.registerItem(tungstenHelmet, tungstenHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(tungstenChestplate, tungstenChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(tungstenLeggings, tungstenLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(tungstenBoots, tungstenBoots.getUnlocalizedName().substring(5));
		//crops
		GameRegistry.registerItem(cropTristSeeds, cropTristSeeds.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemTrist, itemTrist.getUnlocalizedName().substring(5));		
		MinecraftForge.addGrassSeed(new ItemStack(cropTristSeeds), 3);
	}
}
