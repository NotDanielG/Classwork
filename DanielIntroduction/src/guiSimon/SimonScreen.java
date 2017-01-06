package guiSimon;

import java.util.ArrayList;
import java.util.List;

import gui.components.TextLabel;
import guiSimon.PlayerInterface;
import guiSimon.components.ClickableScreen;
import guiSimon.components.Visible;

public class SimonScreen extends ClickableScreen implements Runnable{
	private ArrayList<ButtonInterface> button;
	private PlayerInterface player;
	
	
	public SimonScreen(int x, int y) {
		super(x, y);
		Thread start = new Thread(this);
		start.start();
	}

	public void initAllObjects(List<Visible> viewObjects) {
		button = new ArrayList<ButtonInterface>();
		player = makePlayer();

	}

	private PlayerInterface makePlayer() {
		// TODO Auto-generated method stub
		return new Player(20,20,100,100);
	}

	public void run() {
		// TODO Auto-generated method stub
		
	}

}
