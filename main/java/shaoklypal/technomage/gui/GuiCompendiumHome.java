package shaoklypal.technomage.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class GuiCompendiumHome extends GuiScreen {
	
	public final ResourceLocation texture1 = new ResourceLocation("techm", "textures/gui/compendiumhome.png");
	public final ResourceLocation btnHomeUp = new ResourceLocation("techm","textures/gui/btnhomeup.png");
	public final ResourceLocation btnHomeDown = new ResourceLocation("techm", "textures/gui/btnhomedown.png");
	public final ResourceLocation btnStatsUp = new ResourceLocation("techm","textures/gui/btnstatsup.png");
	public final ResourceLocation btnStatsDown = new ResourceLocation("techm","textures/gui/btnstatsdown.png");
	public final ResourceLocation btnInfoUp = new ResourceLocation("techm","textures/gui/btninfoup.png");
	public final ResourceLocation btnInfoDown = new ResourceLocation("techm","textures/gui/btninfodown.png");
	public final ResourceLocation titleTechnoMage = new ResourceLocation("techm","textures/gui/hometitle.png");
	
	public int activeTab = 0;
	public int y = 0;
	public int x = 0;
	public int scale = 10;
	public float scaleX = (1.0F / (scale));
	public float scaleY = (1.0F / (scale));
	public int textureSizeX = 0;
	public int textureSizeY = 0;
	public int locX = 0;
	public int locY = 0;
	
	@SideOnly(Side.CLIENT)
	public GuiCompendiumHome(InventoryPlayer inventoryPlayer, Item ItemCompendium ) {
		super();
		this.buttonList.clear();
		//drawScreen();
		
	}
	
	public void initGui(){
		//ControlList.clear();
		this.buttonList.clear();
		//drawScreen();
		
	}
	
	@SideOnly(Side.CLIENT)
	public void drawScreen(int par1, int par2, float par3){
		drawDefaultBackground();
		textureSizeX = 176;
		textureSizeY = 214;
		locX = ((this.width / 2)- textureSizeX);
		locY = (int) (this.height * 0.1);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		GL11.glScalef(1.0F, 1.0F, 1.0F);
		Minecraft.getMinecraft().getTextureManager().bindTexture(texture1);
		drawTexturedModalRect(locX, locY, 0, 0, textureSizeX, textureSizeY);
		drawTexturedModalRect((locX + textureSizeX), locY, 0, 0, textureSizeX, textureSizeY);
		
		x = locX;
		y = locY;
		
		//GL11.glScalef(scaleX, scaleY, 1F);
		this.buttonList.add(new GuiButton(1,((x - 25)),(y),(25),(25),""));
		this.buttonList.add(new GuiButton(2,((x - 25)),((y + 25)),(25),(25),""));
		this.buttonList.add(new GuiButton(3,((x - 25)),((y + 50)),(25),(25),""));
		if(activeTab == 0){
			activeTab = 1;
		}
		//homeContents();
		layout();
		//homeContents();
		//super.drawScreen(par1, par2, par3);
	}
	
	protected void actionPerformed(GuiButton guibutton){
		switch(guibutton.id){
		case 1:
			activeTab = 1;
			//homeContents();
			layout();
			
			break;
		case 2:
			activeTab = 2;
			layout();
			break;
		case 3:
			activeTab = 3;
			layout();
		}
	}
	
	public void layout(){
		switch(activeTab){
		case 1:
			GL11.glScalef(scaleX, scaleY, 1F);
			Minecraft.getMinecraft().getTextureManager().bindTexture(btnHomeDown);
			drawTexturedModalRect(((x - 25)*scale),(y*scale),0,0,(25*scale),(25*scale));
			Minecraft.getMinecraft().getTextureManager().bindTexture(btnStatsUp);
			drawTexturedModalRect(((x - 25)*scale),((y+25)*scale),0,0,(25*scale),(25*scale));
			Minecraft.getMinecraft().getTextureManager().bindTexture(btnInfoUp);
			drawTexturedModalRect(((x - 25)*scale),((y+50)*scale),0,0,(25*scale),(25*scale));
			GL11.glScalef((float)scale, (float)scale, 1F);
			//homeContents();
			break;
		case 2:
			GL11.glScalef(scaleX, scaleY, 1F);
			Minecraft.getMinecraft().getTextureManager().bindTexture(btnHomeUp);
			drawTexturedModalRect(((x - 25)*scale),(y*scale),0,0,((25*scale)),((25*scale)));
			Minecraft.getMinecraft().getTextureManager().bindTexture(btnStatsDown);
			drawTexturedModalRect(((x - 25)*scale),((y+25)*scale),0,0,((25*scale)),((25*scale)));
			Minecraft.getMinecraft().getTextureManager().bindTexture(btnInfoUp);
			drawTexturedModalRect(((x - 25)*scale),((y+50)*scale),0,0,(25*scale),(25*scale));
			GL11.glScalef((float)scale, (float)scale, 1F);
			break;
		case 3:
			GL11.glScalef(scaleX, scaleY, 1F);
			Minecraft.getMinecraft().getTextureManager().bindTexture(btnHomeUp);
			drawTexturedModalRect(((x - 25)*scale),(y*scale),0,0,((25*scale)),((25*scale)));
			Minecraft.getMinecraft().getTextureManager().bindTexture(btnStatsUp);
			drawTexturedModalRect(((x - 25)*scale),((y+25)*scale),0,0,((25*scale)),((25*scale)));
			Minecraft.getMinecraft().getTextureManager().bindTexture(btnInfoDown);
			drawTexturedModalRect(((x - 25)*scale),((y+50)*scale),0,0,(25*scale),(25*scale));
			GL11.glScalef((float)scale, (float)scale, 1F);
			break;
		}
		
	}
	public void homeContents(){
		GL11.glScalef(1F, 1F, 1F);
		Minecraft.getMinecraft().getTextureManager().bindTexture(titleTechnoMage);
		drawTexturedModalRect(((int)((this.width)/2)-400), ((int)((this.height)/2)-150),0,0,(800),(300));
		
	}

}
