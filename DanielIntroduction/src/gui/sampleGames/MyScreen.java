package gui.sampleGames;

import java.awt.Color;
import java.util.ArrayList;

import gui.Screen;
import gui.components.Action;
import gui.components.Button;
import gui.components.Visible;

public class MyScreen extends Screen{
	public Button button;
	public MyScreen(int w,int h) {
		super(w, h);
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		button = new Button(100,100, 100,40,"The Button", Color.pink, new Action(){
			public void act(){
				
			}
		});
		viewObjects.add(button);
	}

}
