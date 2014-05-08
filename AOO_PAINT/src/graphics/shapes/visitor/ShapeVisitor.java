package graphics.shapes.visitor;

import graphics.shapes.SCircle;
import graphics.shapes.SCollection;
import graphics.shapes.SRectangle;
import graphics.shapes.SText;

public interface ShapeVisitor
{
	public abstract void visitRectangle (SRectangle sr);
	
	public abstract void visitCircle (SCircle sc);
	
	public abstract void visitCollection (SCollection scol);

	public abstract void visitText(SText t);
	
	
}
