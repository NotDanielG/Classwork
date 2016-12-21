package gui.sampleGames;

import gui.GUIApplication;
import gui.screens.CoordinateScreen;

public class MouseFollower extends GUIApplication {
	public static MouseFollower game;
	//Declaration
	//Arrays: int<-Primitve Type [] numbs
	//ArrayList: ArrayList<Integer> <---Wrapper Class*\ numbs
	
	//Instantiation numbs
	//Arrays:new int[5]
	//ArrayList:nums = new ArrayList<Integer>()
	
	//Adding Items
	//num[i] = 4
	//nums.add(new Integer(5))
	//Appends to list
	
	public static CoordinateScreen cs;
	public static MyScreen screen;
	
	public MouseFollower(int width, int height) {
		super(width, height);
	}

	public void initScreen() {
		cs = new CoordinateScreen(getWidth(), getHeight());
		
		setScreen(cs);
		screen = new MyScreen(getWidth(),getHeight());
	}
	
	public static void main(String[] args) {
		game = new MouseFollower(800,600);
		
		Thread app = new Thread(game);
		app.start();
	}

}
