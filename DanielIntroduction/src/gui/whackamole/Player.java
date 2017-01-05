package gui.whackamole;

import java.awt.Color;
import java.awt.Graphics2D;

import gui.components.Components;

public class Player extends Components implements PlayerInterface {
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
		g.setColor(Color.black);
		g.drawOval(0, 0, 99, 99);
		g.drawString("Score = "+score, 40, 55);
	}

}
