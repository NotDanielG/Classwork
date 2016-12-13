package gui;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import gui.components.Visible;

public abstract class Screen {
	private BufferedImage image;
	private ArrayList<Visible> viewObjects;
	
	public Screen(int width, int height) {
		viewObjects = new ArrayList<Visible>();
		initObjects(viewObjects);
		initImage(width, height);
	}
	public abstract void initObjects(ArrayList<Visible> viewObjects);
	public void initImage(int width, int height) {
		image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		update();
		
	}
	public BufferedImage getImage(){
		return image;
	}
	public int getWidth(){
		return image.getWidth();
	}
	public int getHeight(){
		return image.getHeight();
	}
	public void update() {
		Graphics2D g = image.createGraphics();
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(Color.pink);
		g.fillRect(0,0,image.getWidth(),image.getHeight());
		for(int i = 0; i <viewObjects.size();i++){
			
		}
//		g.setColor(Color.black);
//		g.drawString("Hello World!",  49, 100);
//		g.drawOval(30, 70, 100, 50);
	}

}
