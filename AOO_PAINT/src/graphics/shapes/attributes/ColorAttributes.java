package graphics.shapes.attributes;

import java.awt.Color;

public class ColorAttributes extends Attributes
{
	// Public car cette classe est un n-uplet, on va 
	//juste initialiser ou lire les attributs, on peut les mettre public
	public final/*constante*/ static/*de classe*/ String ID = "colors";
	public Color strokedColor; //couleur de contour
	public Color filledColor;	// coulour de remplissage
	public boolean filled;	// rempli ?
	public boolean stroked;	// contour ?
	
	public ColorAttributes() //constructeur par défaut
	{
		this.strokedColor = Color.BLACK;
		this.filledColor = Color.WHITE;
		this.stroked = true;
		this.filled = false;
	}
	
	public ColorAttributes(boolean filled, boolean stroked, Color strokedColor, Color filledColor) //constructeur par défaut
	{
		this.strokedColor = strokedColor;
		this.filledColor = filledColor;
		this.stroked = stroked;
		this.filled = filled;
	}
	
	public String getId() 
	{
		return ID; // plutot que return "colors";
	}

}
