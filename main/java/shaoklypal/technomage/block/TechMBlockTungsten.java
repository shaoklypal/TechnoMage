package shaoklypal.technomage.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class TechMBlockTungsten extends Block {

	public TechMBlockTungsten(Material material) {
		super(material);
		this.setHardness(3.0F);
		this.setHarvestLevel("pickaxe", 2);
		this.setStepSound(soundTypeStone);
	}

}
