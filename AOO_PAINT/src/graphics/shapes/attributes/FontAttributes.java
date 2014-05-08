package graphics.shapes.attributes;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.font.FontRenderContext;
import java.awt.image.BufferedImage;

public class FontAttributes extends Attributes
{
	
	public static final String ID = "font";
	// getGraphics du Graphics 2D ... ?
	public static final Graphics2D DEFAULT_GRAPHICS = (Graphics2D) new BufferedImage(1 ,1, BufferedImage.TYPE_INT_ARGB).getGraphics();
	public Font font;
	public Color fontColor;
	
	public FontAttributes()
	{
		this.font = new Font("Dialog",Font.PLAIN,11);
		this.fontColor = Color.BLACK;
	}
	
	public FontAttributes(Font font, Color fontColor)
	{
		this.font= font;
		this.fontColor = fontColor;
	}

	
	public String getId() 
	{
		return ID;
	}
	
	public Rectangle getBounds(String s) //ici pour translate et voir ce que ca donne avec le texte ?
	{
		FontRenderContext frc = DEFAULT_GRAPHICS.getFontRenderContext();
		Rectangle bound = font.getStringBounds(s, frc).getBounds();
		return bound;
	}
	
}
