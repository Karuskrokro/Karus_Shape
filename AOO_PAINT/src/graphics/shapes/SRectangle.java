package graphics.shapes;

import graphics.shapes.visitor.ShapeVisitor;

import java.awt.Point;
import java.awt.Rectangle;

public class SRectangle extends Shape
{

	private Rectangle rect;
	
	public SRectangle (Point loc, int width,int height)
	{
		this.rect = new Rectangle(loc.x,loc.y,width,height);
	}
	
	
	@Override
	public Point getLoc() 
	{
		return this.rect.getLocation();
	}

	@Override
	public void setLoc(Point p) 
	{
		this.rect.setLocation(p);
	}

	@Override
	public void translate(int a, int b) 
	{
		this.rect.translate(a, b);
		
	}

	@Override
	public Rectangle getBounds() 
	{
		return this.rect;
	}

	@Override
	public void accept(ShapeVisitor s) 
	{
		s.visitRectangle(this);
	}

}
