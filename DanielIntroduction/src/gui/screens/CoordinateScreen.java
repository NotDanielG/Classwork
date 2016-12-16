package gui.screens;

import java.awt.Color;
import java.util.ArrayList;

import gui.Screen;
import gui.components.Action;
import gui.components.Button;
import gui.components.TextLabel;
import gui.components.Visible;

public class CoordinateScreen extends Screen {

	private Button button;
	public CoordinateScreen(int width, int height) {
		super(width, height);
	}

	public void initObjects(ArrayList<Visible> viewObjects) {
//		TextLabel text = new TextLabel(20,200,500,40,"Some text");
//		viewObjects.add(text);
//		40,50
		button = new Button(20,100, 100,40,"The Button", Color.orange, new Action(){
			public void act(){
				
			}
		});
		viewObjects.add(button);
	}

}
