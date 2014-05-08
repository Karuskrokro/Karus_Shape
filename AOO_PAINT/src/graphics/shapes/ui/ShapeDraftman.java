package graphics.shapes.ui;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;

import graphics.shapes.SCircle;
import graphics.shapes.SCollection;
import graphics.shapes.SRectangle;
import graphics.shapes.SText;
import graphics.shapes.attributes.ColorAttributes;
import graphics.shapes.attributes.FontAttributes;
import graphics.shapes.visitor.ShapeVisitor;

public class ShapeDraftman implements ShapeVisitor
{
	private final static ColorAttributes DEFAULT_COLOR_ATTRIBUTES = new ColorAttributes(); // meme si ya pas de couleur, on récupere les couleurs par defaut
	private static final FontAttributes DEFAULT_FONT_ATTRIBUTES = null;
	private Graphics2D g;
	
	public void setGraphics(Graphics2D g)
	{
		this.g=g;
	}

	@Override
	public void visitRectangle(SRectangle sr) 
	{
		//System.out.println("Jdessine un rectangle");
		//System.out.println(sr.getBounds()); // juste pour la console
		
		
		
		
		Rectangle rect = sr.getBounds(); //récup le rectangle a dessiner
		ColorAttributes ca = (ColorAttributes) sr.getAttributes(ColorAttributes.ID); // demande ses attributs
		if(ca==null) ca = DEFAULT_COLOR_ATTRIBUTES; // teste si ya un ca, si y'en a pas, bah ya un ca defini par default
		
		//Dessine le rectangle dans la console, d'abord le fond et apres le contour
		if(ca.filled)
		{
			g.setColor(ca.filledColor);
			g.fillRect(rect.x, rect.y, rect.width, rect.height);
		}
		
		if(ca.stroked)
		{
			g.setColor(ca.strokedColor);
			g.drawRect(rect.x, rect.y, rect.width, rect.height);
		}
		
		
		
		
	}

	
	
	@Override
	public void visitCircle(SCircle sc) 
	{
		System.out.println("Jdessine un cercle");
		
		Rectangle rect = sc.getBounds(); 
		ColorAttributes ca = (ColorAttributes) sc.getAttributes(ColorAttributes.ID); // demande ses attributs
		if(ca==null) ca = DEFAULT_COLOR_ATTRIBUTES; // teste si ya un ca, si y'en a pas, bah ya un ca defini par default
		
	
		if(ca.filled)
		{
			g.setColor(ca.filledColor);
			g.fillOval(rect.x, rect.y, rect.width, rect.height);
		}
		
		if(ca.stroked)
		{
			g.setColor(ca.strokedColor);
			g.drawOval(rect.x, rect.y, rect.width, rect.height);
		}
		
		g.setColor(ca.filledColor);
		
		
	}


	public void visitCollection(SCollection scol) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitText(SText t) 
	{
		Rectangle rect = t.getBounds(); 
		Point loc = t.getLoc();
		
		ColorAttributes ca = (ColorAttributes) t.getAttributes(ColorAttributes.ID); // demande ses attributs
		if(ca==null) ca = DEFAULT_COLOR_ATTRIBUTES;
		

		FontAttributes fa = (FontAttributes) t.getAttributes(FontAttributes.ID); // demande ses attributs
		if(fa==null) fa = DEFAULT_FONT_ATTRIBUTES;
		
		if(ca.filled)
		{
			g.setColor(ca.filledColor);
			g.fillRect(rect.x, rect.y, rect.width, rect.height);
		}
		
		if(ca.stroked)
		{
			g.setColor(ca.strokedColor);
			g.drawRect(rect.x, rect.y, rect.width, rect.height);
		}
		
		//g.setFont(fa.font); //
		g.setColor(ca.filledColor); //
		g.drawString(t.getText(),loc.x, loc.y);
	}

	
	

	
	
}
