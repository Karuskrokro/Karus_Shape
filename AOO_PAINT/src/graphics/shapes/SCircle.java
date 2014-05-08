package graphics.shapes;

import graphics.shapes.visitor.ShapeVisitor;

import java.awt.Point;
import java.awt.Rectangle;

public class SCircle extends Shape
{

	private int radius;
	private Point loc; // le point du carré en haut a gauche du cercle
	
	public SCircle (int radius,Point loc)
	{
		this.loc=loc;
		this.radius=radius;
	}
	
	@Override
	public Point getLoc() 
	{
		return this.loc;
	}

	@Override
	public void setLoc(Point p) 
	{
		this.loc=p;
	}

	@Override
	public void translate(int a, int b) 
	{
		this.loc.translate(a, b);
	}

	@Override
	public Rectangle getBounds() 
	{
		return new Rectangle(loc.x,loc.y,2*radius,2*radius);
	}

	@Override
	public void accept(ShapeVisitor s) 
	{
		s.visitCircle(this);
	}

}
