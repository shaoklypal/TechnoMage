package shaoklypal.technomage.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import shaoklypal.technomage.TechnoMage;

public class TechMBlock {

	public static Block blockTungsten;
	public static Block blockTrist;

	/**
	 * Init blocks
	 */
	public static void init(){
		//create block instance
		blockTungsten = new TechMBlockTungsten(Material.rock).setBlockName("BlockTungsten").setBlockTextureName("techm:blocktungsten").setCreativeTab(TechnoMage.tabTechnoMage);
		blockTrist = new TechMBlockCrops().setBlockName("blockTrist").setBlockTextureName("techm:trist");
		
		
		//register blocks
		registerBlock();
	}

	/**
	 * register blocks
	 */
	public static void registerBlock(){
		GameRegistry.registerBlock(blockTungsten, blockTungsten.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockTrist, "Trist");
	}
}
