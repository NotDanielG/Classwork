package gui.whackamole;

import java.util.ArrayList;
import java.util.List;

import gui.Screen;
import gui.components.ClickableScreen;
import gui.components.TextLabel;
import gui.components.Visible;

public class WhackAMoleScreen extends ClickableScreen implements Runnable{
	private ArrayList<MoleInterface> moles;
	private PlayerInterface player;
	private TextLabel label;
	private TextLabel timeLabel;
	private double timeLeft;
	
	public WhackAMoleScreen(int width, int height) {
		super(width, height);
		this.timeLeft = 30.0;
		
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		getAPlayer();
		label = new TextLabel(400,300,100,100,"Ready...");
		viewObjects.add(label);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		getAPlayer();
		label = new TextLabel(400,300,100,100,"Ready...");
		viewObjects.add(label);
	}
	
	private PlayerInterface getAPlayer() {
		return null;
	}

	private MoleInterface getAMole() {
		return null;
	}
	
	@Override
	public void run() {
		
	}

}
