package shaoklypal.technomage.material;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class TechMMaterial {
	public static final Item.ToolMaterial tungstenToolMaterial = EnumHelper.addToolMaterial("tungstenToolMaterial", 4, 800, 6.0F, 4.0F, 5);
	public static final ItemArmor.ArmorMaterial tungstenArmorMaterial = EnumHelper.addArmorMaterial("tungstenArmorMaterial", (480 / 16), new int[]{3,10,8,5}, 5);
}
