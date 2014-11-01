package shaoklypal.technomage.item;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemTungstenArmor extends ItemArmor {

		public ItemTungstenArmor(ArmorMaterial armorMaterial, int renderIndex,
				int armorType) {
			super(armorMaterial, renderIndex, armorType);
		}
		
		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
		if(this.armorType == 2){
			return "techm:textures/models/armor/tungsten_layer_2.png";
			}
			return "techm:textures/models/armor/tungsten_layer_1.png";
		}
}
