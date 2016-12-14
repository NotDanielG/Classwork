package gui.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Button extends TextLabel {
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
		g.fillRoundRect(getx(), gety()-50, 125, 100,25,35);
		g.drawRoundRect(getx(), gety()-50, 125, 100, 25, 35);
		super.update(g);
//		g.setFont(new Font(getFont(),Font.PLAIN,getSize()));
//		if(this.getText()!=null){
//			g.drawString(this.getText(), getx()+15, this.gety()+10);
//		}
	}
}
