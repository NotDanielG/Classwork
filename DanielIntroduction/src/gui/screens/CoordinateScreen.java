package gui.screens;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import gui.Screen;
import gui.components.Action;
import gui.components.Button;
import gui.components.TextLabel;
import gui.components.Visible;

public class CoordinateScreen extends Screen implements MouseMotionListener{
	private TextLabel text;
	private Button button;
	public CoordinateScreen(int width, int height) {
		super(width, height);
	}

	public void initObjects(ArrayList<Visible> viewObjects) {
		text = new TextLabel(20,200,500,40,"Some text");
		viewObjects.add(text);
		button = new Button(20,100, 100,40,"The Button", Color.orange, new Action(){
			public void act(){
				
			}
		});
		viewObjects.add(button);
	}
	public void mouseDragged(MouseEvent event) {
		
	}

	public void mouseMoved(MouseEvent event) {
		text.setText("Mouse at " +event.getX() +" and at "+event.getY());
	}
	public MouseMotionListener getMouseMotionListener(){
		return this;
	}

}
