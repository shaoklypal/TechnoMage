package shaoklypal.technomage;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockTungsten extends Block {

	public BlockTungsten(Material material) {
		super(material);
		this.setHardness(3.0F);
		this.setHarvestLevel("pickaxe", 2);
		this.setStepSound(soundTypeStone);
	}

}
