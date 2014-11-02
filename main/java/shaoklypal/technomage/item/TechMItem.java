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
	public static Item itemTristMesh;
	public static Item itemEnrichedTristMesh;
	public static Item itemGoldenRope;

	public static Item itemCompendium;
	public static Item itemTungsten;
	public static Item itemTungstenAlloy;
	public static Item tungstenPickaxe;
	public static Item tungstenAxe;
	public static Item tungstenSpade;
	public static Item tungstenHoe;
	public static Item tungstenSword;

	public static Item tungstenHelmet;
	public static Item tungstenChestplate;
	public static Item tungstenLeggings;
	public static Item tungstenBoots;
	public static Item itemArmorFrameSegment;
	public static Item itemArmorFrameHelmet;
	public static Item itemArmorFrameChest;
	public static Item itemArmorFrameLegs;
	public static Item itemArmorFrameBoots;
	public static Item itemHood;
	public static Item itemUpperRobe;
	public static Item itemLowerRobe;
	public static Item itemSlippers;

	/**
	 * Init items
	 */
	public static void init(){
		//create item instance
		cropTristSeeds = new ItemSeeds(TechMBlock.blockTrist, Blocks.farmland).setUnlocalizedName("TristSeeds").setTextureName("techm:tristseeds").setCreativeTab(TechnoMage.tabTechnoMage);
		itemTrist = new ItemTrist().setUnlocalizedName("ItemTrist").setTextureName("techm:itemtrist").setCreativeTab(TechnoMage.tabTechnoMage);
		itemTristMesh = new ItemTristMesh().setUnlocalizedName("ItemTristMesh").setTextureName("techm:itemtristmesh").setCreativeTab(TechnoMage.tabTechnoMage);
		itemGoldenRope = new ItemGoldenRope().setUnlocalizedName("ItemGoldenRope").setTextureName("techm:itemgoldenrope").setCreativeTab(TechnoMage.tabTechnoMage);
		itemEnrichedTristMesh = new ItemEnrichedTristMesh().setUnlocalizedName("ItemEnrichedTristMesh").setTextureName("techm:itemenrichedtristmesh").setCreativeTab(TechnoMage.tabTechnoMage);

		//items
		itemCompendium = new ItemCompendium().setUnlocalizedName("ItemCompendium").setTextureName("techm:itemcompendium").setCreativeTab(TechnoMage.tabTechnoMage);
		itemTungsten = new ItemTungsten().setUnlocalizedName("ItemTungsten").setTextureName("techm:itemtungsteningot").setCreativeTab(TechnoMage.tabTechnoMage);
		itemTungstenAlloy = new ItemTungstenAlloy().setUnlocalizedName("ItemTungstenAlloy").setTextureName("techm:itemtungstenalloyingot").setCreativeTab(TechnoMage.tabTechnoMage);
		tungstenPickaxe = new ItemTungstenPickaxe(TechMMaterial.tungstenToolMaterial).setUnlocalizedName("ItemTungstenPickaxe").setTextureName("techm:itemtungstenpickaxe").setCreativeTab(TechnoMage.tabTechnoMage);
		tungstenAxe = new ItemTungstenAxe(TechMMaterial.tungstenToolMaterial).setUnlocalizedName("ItemTungstenAxe").setTextureName("techm:itemtungstenaxe").setCreativeTab(TechnoMage.tabTechnoMage);
		tungstenSpade = new ItemTungstenSpade(TechMMaterial.tungstenToolMaterial).setUnlocalizedName("ItemTungstenSpade").setTextureName("techm:itemtungstenspade").setCreativeTab(TechnoMage.tabTechnoMage);
		tungstenHoe = new ItemTungstenHoe(TechMMaterial.tungstenToolMaterial).setUnlocalizedName("ItemTungstenHoe").setTextureName("techm:itemtungstenhoe").setCreativeTab(TechnoMage.tabTechnoMage);
		tungstenSword = new ItemTungstenSword(TechMMaterial.tungstenToolMaterial).setUnlocalizedName("ItemTungstenSword").setTextureName("techm:itemtungstensword").setCreativeTab(TechnoMage.tabTechnoMage);


		tungstenHelmet = new ItemTungstenArmor(TechMMaterial.tungstenArmorMaterial, 0, 0).setUnlocalizedName("ItemTungstenHelmet").setTextureName("techm:itemtungstenhelm").setCreativeTab(TechnoMage.tabTechnoMage);
		tungstenChestplate = new ItemTungstenArmor(TechMMaterial.tungstenArmorMaterial, 0, 1).setUnlocalizedName("ItemTungstenChestplate").setTextureName("techm:itemtungstenchest").setCreativeTab(TechnoMage.tabTechnoMage);
		tungstenLeggings = new ItemTungstenArmor(TechMMaterial.tungstenArmorMaterial, 0, 2).setUnlocalizedName("ItemTungstenLeggings").setTextureName("techm:itemtungstenlegs").setCreativeTab(TechnoMage.tabTechnoMage);
		tungstenBoots = new ItemTungstenArmor(TechMMaterial.tungstenArmorMaterial, 0, 3).setUnlocalizedName("ItemTungstenBoots").setTextureName("techm:itemtungstenboots").setCreativeTab(TechnoMage.tabTechnoMage);
		
		itemArmorFrameSegment = new ItemArmorFrameSegment().setUnlocalizedName("ItemArmorFrameSegment").setTextureName("techm:itemarmorframesegment").setCreativeTab(TechnoMage.tabTechnoMage);
		itemArmorFrameHelmet = new ItemArmorFrameHelmet().setUnlocalizedName("ItemArmorFrameHelmet").setTextureName("techm:itemarmorframehelmet").setCreativeTab(TechnoMage.tabTechnoMage);
		itemArmorFrameChest = new ItemArmorFrameChest().setUnlocalizedName("ItemArmorFrameChest").setTextureName("techm:itemarmorframechest").setCreativeTab(TechnoMage.tabTechnoMage);
		itemArmorFrameLegs = new ItemArmorFrameLegs().setUnlocalizedName("ItemArmorFrameLegs").setTextureName("techm:itemarmorframelegs").setCreativeTab(TechnoMage.tabTechnoMage);
		itemArmorFrameBoots = new ItemArmorFrameBoots().setUnlocalizedName("ItemArmorFrameBoots").setTextureName("techm:itemarmorframeboots").setCreativeTab(TechnoMage.tabTechnoMage);

		itemHood = new ItemHood().setUnlocalizedName("ItemHood").setTextureName("techm:itemhood").setCreativeTab(TechnoMage.tabTechnoMage);
		itemUpperRobe = new ItemUpperRobe().setUnlocalizedName("ItemUpperRobe").setTextureName("techm:itemupperrobe").setCreativeTab(TechnoMage.tabTechnoMage);
		itemLowerRobe = new ItemLowerRobe().setUnlocalizedName("ItemLowerRobe").setTextureName("techm:itemlowerrobe").setCreativeTab(TechnoMage.tabTechnoMage);
		itemSlippers = new ItemSlippers().setUnlocalizedName("ItemSlippers").setTextureName("techm:itemslippers").setCreativeTab(TechnoMage.tabTechnoMage);

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
		GameRegistry.registerItem(itemTungstenAlloy, itemTungstenAlloy.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemArmorFrameSegment, itemArmorFrameSegment.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemEnrichedTristMesh, itemEnrichedTristMesh.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemGoldenRope, itemGoldenRope.getUnlocalizedName().substring(5));
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
		GameRegistry.registerItem(itemArmorFrameHelmet, itemArmorFrameHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemArmorFrameChest, itemArmorFrameChest.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemArmorFrameLegs, itemArmorFrameLegs.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemArmorFrameBoots, itemArmorFrameBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemHood, itemHood.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemUpperRobe, itemUpperRobe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemLowerRobe, itemLowerRobe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemSlippers, itemSlippers.getUnlocalizedName().substring(5));
		//crops
		GameRegistry.registerItem(cropTristSeeds, cropTristSeeds.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemTrist, itemTrist.getUnlocalizedName().substring(5));	
		GameRegistry.registerItem(itemTristMesh, itemTristMesh.getUnlocalizedName().substring(5));
		MinecraftForge.addGrassSeed(new ItemStack(cropTristSeeds), 3);
		
	}
}
