package gui.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class TextLabel extends Components {
	
	private String text;
	private String font;
	private int size;
	
	
	public TextLabel(int x, int y, int w, int h,String text) {
		super(x, y, w, h);
		this.text = text;
		this.font = "Helvetica";
		this.size = 20;
		update();
	}
	
	public void update(Graphics2D g) {
		g = clear();
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(Color.black);
		if(text != null){
			g.setFont(new Font(font,Font.PLAIN,size));
			g.drawString(text, 4, getHeight()-5);
		}
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
		update();
	}

	public String getFont() {
		return font;
		
	}

	public void setFont(String font) {
		this.font = font;
		update();
	}

	public int getSize() {
		return size;
		
	}

	public void setSize(int size) {
		this.size = size;
		update();
	}

}
