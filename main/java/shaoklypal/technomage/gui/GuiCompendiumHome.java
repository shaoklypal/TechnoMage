package shaoklypal.technomage.gui;

import org.lwjgl.opengl.GL11;

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
	public final ResourceLocation btnHomeUp = new ResourceLocation("techm","textures/gui/btnhomeup.png");
	public final ResourceLocation btnHomeDown = new ResourceLocation("techm", "textures/gui/btnhomedown.png");
	public int activeTab = 0;
	public int y = 0;
	public int x = 0;
	public int scale = 10;
	public float scaleX = (1.0F / (scale));
	public float scaleY = (1.0F / (scale));
	
	public GuiCompendiumHome(InventoryPlayer inventoryPlayer, Item ItemCompendium ) {
		super(new ContainerCompendium(inventoryPlayer, ItemCompendium ));
		
		this.xSize = 176;
		this.ySize = 214;
	}

	
	public void drawGuiContainerBackgroundLayer(float var1, int var2, int var3){
		Minecraft.getMinecraft().getTextureManager().bindTexture(texture1);
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
		x = guiLeft;
		y = guiTop;
		layout();
	}
	
	public void layout(){
		//x = ((width - xSize) / 2) - 24;
		switch(activeTab){
		case 0:
			GL11.glScalef(scaleX, scaleY, 1F);
			Minecraft.getMinecraft().getTextureManager().bindTexture(btnHomeDown);
			drawTexturedModalRect(((x - 25)*scale),(y*scale),0,0,((25*scale)),((25*scale)));
		}
	}

}
