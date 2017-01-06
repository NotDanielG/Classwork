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
	}

	public void initAllObjects(List<Visible> viewObjects) {
		// TODO Auto-generated method stub

	}

	public void run() {
		// TODO Auto-generated method stub
		
	}

}
