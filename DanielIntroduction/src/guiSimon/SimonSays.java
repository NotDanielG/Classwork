package guiSimon;

public class SimonSays extends GUIApplication {
	
	private static SimonSays game;
	public SimonSays(int width, int height) {
		super(width, height);
	}

	@Override
	public void initScreen() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		game = new SimonSays(800,600);
		Thread app = new Thread(game);
		app.start();
	}

}
