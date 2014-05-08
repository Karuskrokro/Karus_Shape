package graphics.shapes;

import graphics.shapes.attributes.FontAttributes;
import graphics.shapes.visitor.ShapeVisitor;

//import java.awt.Color;
//import java.awt.Font;

import java.awt.Point;
import java.awt.Rectangle;


public class SText extends Shape
{

	private String text;
	private Point loc;
	private FontAttributes fa;
	
	public SText(Point loc, String text)
	{
		this.text=text;
		this.loc=loc;
		this.fa = new FontAttributes()  ;   //arret ici
		
	}
	
	public String getText() 
	{
		return this.text;
	}
	
	public Point getLoc() 
	{
		return this.loc;
	}

	@Override
	public void setLoc(Point loc) 
	{
		this.loc=loc;
	}

	@Override
	public void translate(int a, int b) 
	{
		this.loc.translate(a, b);
	}

	@Override
	public Rectangle getBounds()  // un FA possède un rectangle (cadre), on peut donc le récupérer pour les bounds du texte associé
	{
		Rectangle r = new Rectangle (loc.x,loc.y,fa.getBounds(this.text).width,fa.getBounds(this.text).height);
		return r;
	}

	@Override
	public void accept(ShapeVisitor s) 
	{
		s.visitText(this);
	}

	/*public FontAttributes getFa() {
		return fa;
	}

	public void setFa(FontAttributes fa) {
		this.fa = fa;
	}
*/
}
