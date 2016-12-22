package gui.sampleGames;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import gui.Screen;
import gui.components.Action;
import gui.components.Button;
import gui.components.Visible;
import gui.screens.CoordinateScreen;

public class MyScreen extends Screen implements MouseListener{
	public Button button;
	public MyScreen(int w,int h) {
		super(w, h);
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		button = new Button(100,100, 100,40,"The Button", Color.pink, new Action(){
			public void act(){
				MouseFollower.game.setScreen(MouseFollower.cs);
			}
		});
		viewObjects.add(button);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		if(button.isHovered(e.getX(), e.getY())){
			button.act();
		}
	}
	public MouseListener getMouseListener(){
		return this;
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
