package graphics.shapes.ui;

import java.awt.event.MouseEvent;

import graphics.ui.Controller;

public class ShapesController extends Controller // les events de souris
{

	public ShapesController(Object newModel)  //constructeur
	{
		super(newModel);
	}
	
	//implémenter les evenements controlleur (en rouge)
	
	public void mousePressed(MouseEvent e)
	{
		System.out.println("mousse pressed");
	}

	public void mouseReleased(MouseEvent e)
	{
		System.out.println("mousse released");
	}

	public void mouseClicked(MouseEvent e)
	{
		System.out.println("mousse clicked");
	}
	
	public void mouseDragged(MouseEvent evt)
	{
		System.out.println("mousse dragged");
	}
}
