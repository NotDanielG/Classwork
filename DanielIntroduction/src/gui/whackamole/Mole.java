package gui.whackamole;

import sampleImages.ClickableGraphic;

public class Mole extends ClickableGraphic implements MoleInterface {
	
	private int appearanceTime;
	
	public Mole(int x, int y) {
		super(x, y, .3, "resources/sampleImages/molecule.png");
	}

	@Override
	public int getAppearanceTime() {
		return appearanceTime;
	}

	@Override
	public void setAppearanceTime(int screenTime) {
		appearanceTime = screenTime;

	}

}
