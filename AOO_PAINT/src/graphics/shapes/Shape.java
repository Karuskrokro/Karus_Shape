package graphics.shapes;

import graphics.shapes.attributes.Attributes;
import graphics.shapes.visitor.ShapeVisitor;

import java.awt.Point;
import java.awt.Rectangle;
import java.util.Map;
import java.util.TreeMap;

public abstract class Shape 
{
	
	private Map attributes;
	
	public Shape () // on peut mettre un constructeur dans une classe abstraite, il faut pas juste pas l'appeler. ( a part avec les classes filles et super())
	{
		this.attributes = new TreeMap();
	}
	
	public void addAttributes(Attributes a)
	{
		this.attributes.put(a.getId(), a);
	}
	
	public Attributes getAttributes(String s)
	{
		return (Attributes) this.attributes.get(s);
		
	}
	
	public abstract Point getLoc();
	public abstract void setLoc(Point p);
	public abstract void translate(int a, int b);
	public abstract Rectangle getBounds();
	public abstract void accept(ShapeVisitor s);

	public String getText() 
	{
		// TODO Auto-generated method stub
		return null;
	}
}
