package sampleImages;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

import gui.components.Visible;

public class Graphic implements Visible {

	private BufferedImage image;
	private boolean loadedImages;
	private int x;
	private int y;
	
//	public Graphic(int x ,int y ,int w, int h, String imageLocation) {
	public Graphic(int x ,int y ,double scale, String imageLocation) {
		this.x = x;
		this.y = y;
		
		loadedImages = false;
//		loadImages(imageLocation, w,h);
		loadImages1(imageLocation, scale);
	}

	private void loadImages1(String imageLocation, double scale) {
		try{
			ImageIcon icon = new ImageIcon(imageLocation);
			int newWidth = (int)(icon.getIconWidth()*scale);
			int newHeight = (int)(icon.getIconHeight()*scale);
			if(newWidth <= 0 && newHeight <= newHeight){
				//full
				image = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(),BufferedImage.TYPE_INT_ARGB);
				Graphics2D g = image.createGraphics();
				g.drawImage(icon.getImage(),0,0,null);
			}
			else{
				image = new BufferedImage(newWidth,newHeight,BufferedImage.TYPE_INT_ARGB);
				Graphics2D g = image.createGraphics();
				//xCoord of destination,yCoord destination,width of dest,height,xCoord of target, yCoord of target, w + h of target, null
				g.drawImage(icon.getImage(),0,0,newWidth,newHeight,0,0,icon.getIconWidth(),icon.getIconHeight(),null);
			}
			loadedImages=true;
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

	private void loadImages(String imageLocation, int w, int h) {
		// TODO Auto-generated method stub
		try{
			ImageIcon icon = new ImageIcon(imageLocation);
			if(w<= 0 && h <= 0){
				//full
				image = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(),BufferedImage.TYPE_INT_ARGB);
				Graphics2D g = image.createGraphics();
				g.drawImage(icon.getImage(),0,0,null);
			}
			else{
				image = new BufferedImage(w,h,BufferedImage.TYPE_INT_ARGB);
				Graphics2D g = image.createGraphics();
				//xCoord of destination,yCoord destination,width of dest,height,xCoord of target, yCoord of target, w + h of target, null
				g.drawImage(icon.getImage(),0,0,w,h,0,0,icon.getIconWidth(),icon.getIconHeight(),null);
			}
			loadedImages=true;
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	@Override
	public BufferedImage getImage() {
		// TODO Auto-generated method stub
		return image;
	}

	@Override
	public int getx() {
		// TODO Auto-generated method stub
		return x;
	}

	@Override
	public int gety() {
		// TODO Auto-generated method stub
		return y;
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return image.getWidth();
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return image.getHeight();
	}

	@Override
	public boolean isAnimated() {
		return false;
	}

	public boolean isLoadedImages() {
		return loadedImages;
	}

	public void setLoadedImages(boolean loadedImages) {
		this.loadedImages = loadedImages;
	}

	public void setX(int x) {
		this.x = x;
		update();
	}
	public void setY(int y) {
		this.y = y;
		update();
	}

	public void setImage(BufferedImage image) {
		this.image = image;
	}

	@Override
	public void update() {
		//Does nothing, image stays the same for now

	}

}
