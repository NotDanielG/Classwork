package gui.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Button extends TextLabel implements Clickable{
	private Color color;
	private Action action;
	public Button(int x, int y, int w, int h, String text, Color color, Action action) {
		super(x, y, w, h, text);
		this.color = color;
		this.action = action;
		update();
	}
	public void update(Graphics2D g) {
		g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		g.setColor(color);
//		g.fillRoundRect(getx(), gety()-50, 125, 100,25,35);
//		g.drawRoundRect(getx(), gety()-50, 125, 100,25,35);
		g.fillRoundRect(0, 0,getWidth(), getHeight(),25,35);
		g.drawRoundRect(1,1,getWidth()-2, getHeight()-2,25,35);
		super.update(g);
	}
	public boolean isHovered(int x, int y) {
		if(x > getx() && x < getx()+getWidth() && y > gety() && y < gety()+getHeight()){
			return true;
		}
		return false;
	}
	public void act() {
		// TODO Auto-generated method stub
		
	}
}
