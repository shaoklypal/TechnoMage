package shaoklypal.technomage.gui;

import shaoklypal.technomage.TechnoMage;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class GuiCompendiumHome extends GuiContainer {
	
	public final ResourceLocation texture1 = new ResourceLocation("techm", "textures/gui/compendiumhome.png");
	
	public GuiCompendiumHome(InventoryPlayer inventoryPlayer, Item ItemCompendium ) {
		super(new ContainerCompendium(inventoryPlayer, ItemCompendium ));
		
		this.xSize = 176;
		this.ySize = 214;
	}

	
	public void drawGuiContainerBackgroundLayer(float var1, int var2, int var3){
		Minecraft.getMinecraft().getTextureManager().bindTexture(texture1);
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
		
	}
	
	

}
