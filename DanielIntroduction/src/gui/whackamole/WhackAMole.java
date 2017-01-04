package gui.whackamole;

import gui.GUIApplication;

public class WhackAMole extends GUIApplication{
	public static WhackAMole game;
	public static WhackAMoleScreen gameScreen; 
	
	public WhackAMole(int w, int h) {
		super(w,h);
	}

	@Override
	public void initScreen() {
		gameScreen = new WhackAMoleScreen(getWidth(), getHeight());
		setScreen(gameScreen);
	}
	public static void main(String[] args){
		game = new WhackAMole(800,600);
		Thread application = new Thread(game);
		application.start();
	}
}
