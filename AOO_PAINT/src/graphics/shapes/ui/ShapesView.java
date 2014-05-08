package graphics.shapes.ui;

import graphics.shapes.Shape;
import graphics.ui.Controller;
import graphics.ui.View;

import java.awt.Graphics;
import java.awt.Graphics2D;


public class ShapesView extends View // mvc, une vue a un modèle. Le modèle (ici un rectangle).
{
	private ShapeDraftman draftman;
	
	public ShapesView(Object model)  //constructeur
	{
		super(model);
		this.draftman = new ShapeDraftman();
	}
	
	
	
	protected void paintComponent(Graphics g) // code qui dessine la vue, a redéfinir,
	{
		super.paintComponent(g); // par defaut que cette ligne
		System.out.println("I am printing");
		
		this.draftman.setGraphics((Graphics2D) g);
		
		Shape model = (Shape) this.getModel(); // récupère le modèle (ici forme)
		if(model==null) return;
		
		model.accept(this.draftman); // le fameux "visite moi"
	}
	
	public Controller defaultController(Object Model)
	{
		return new ShapesController(model);
	}
}
 //Rq: on ne dessine pas a l'écran, mais dans une image mémoire avant de l'appliquer a l'écran'