package guiSimon;

import java.awt.Color;

import guiSimon.components.Action;
import guiSimon.components.Button;
import guiSimon.components.Visible;

public class ColorButton extends Button implements ButtonInterface, Visible {
	private int colorIdentifier;
	private Action buttonAction;
	public ColorButton(int x, int y, int w, int h, String text, Color color, Action action, int value) {
		super(x, y, w, h, text, color, action);
		colorIdentifier = value;
		buttonAction = action;
		
	}
	@Override
	public int sendValue() {
		return colorIdentifier;
	}
	@Override
	public void checkNumberOfButtonsClicked() {
		SimonScreen.setAmountClicked();
		
	}

}
