package gui.screens;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import gui.Screen;
import gui.components.Action;
import gui.components.Button;
import gui.components.TextArea;
import gui.components.TextLabel;
import gui.components.Visible;
import gui.sampleGames.MouseFollower;
import sampleImages.ClickableGraphic;
import sampleImages.Graphic;

public class CoordinateScreen extends Screen implements MouseMotionListener, MouseListener{
	private TextLabel text;
	private Button button;
	private TextArea textA;
	private ClickableGraphic kol;
	public CoordinateScreen(int width, int height) {
		super(width, height);
	}

	public void initObjects(ArrayList<Visible> viewObjects) {
		text = new TextLabel(40,45,760,40,"Sample Text");
		viewObjects.add(text);
		button = new Button(500,100, 100,40,"The Button", Color.orange, new Action(){
			public void act(){
				MouseFollower.game.setScreen(MouseFollower.screen);
			}
		});
		viewObjects.add(button);
//		textA = new TextArea(40,200,550,100,"This is a whole paragraph. Notice how as the paragraph gets to the edge of the page,"
//				+ " a new line is created.");
//		viewObjects.add(textA);
		kol = new ClickableGraphic(30,30,.5,"resources/sampleImages/kol.png");
		kol.setAction(new Action(){
			public void act(){
				kol.setX(kol.getx() +5);
			}
		});
		viewObjects.add(kol);
	}
	@Override
	public void mouseDragged(MouseEvent event) {
		
	}
	@Override
	public MouseListener getMouseListener(){
		return this;
	}
	public MouseMotionListener getMouseMotionListener(){
		return this;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(button.isHovered(e.getX(), e.getY())){
			button.act();
		}
		if(kol.isHovered(e.getX(), e.getY())){
			kol.act();
		}
		
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
	@Override
	public void mouseMoved(MouseEvent event) {
		text.setText("Mouse at " +event.getX() +" and at "+event.getY());
		text.setX(event.getX());
		text.setY(event.getY());
		
	}

}
