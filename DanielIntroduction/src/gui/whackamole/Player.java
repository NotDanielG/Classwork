package gui.whackamole;

import java.awt.Color;
import java.awt.Graphics2D;

import gui.components.Components;
import guiSimon.components.Visible;

public class Player extends Components implements PlayerInterface, Visible {
	private int score;
	public Player(int x, int y, int w, int h) {
		super(20, 20, 100, 100);
		
	}

	@Override
	public void increaseScore(int i) {
		score++;
		update();
	}

	@Override
	public void update(Graphics2D g) {
		g.setColor(new Color (200,220,255));
		g.fillOval(0, 0, 99, 99);
		g.setColor(Color.black);
		g.drawOval(0, 0, 99, 99);
		g.drawString("Score = "+score, 40, 55);
	}

}
