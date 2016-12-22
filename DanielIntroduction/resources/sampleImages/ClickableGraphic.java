package sampleImages;

import gui.components.Action;
import gui.components.Clickable;

public class ClickableGraphic extends Graphic implements Clickable{

	private Action action;
	
	public ClickableGraphic(int x, int y, double scale, String imageLocation) {
		super(x, y, scale, imageLocation);
		// TODO Auto-generated constructor stub
	}
	public void setAction(Action a){
		this.action = a;
	}
	public boolean isHovered(int x, int y) {
		if(x > getx() && x < getx()+getWidth() && y > gety() && y < gety()+getHeight()){
			return true;
		}
		return false;
	}
	@Override
	public void act() {
		if(this.action != null){
			this.action.act();
		}
		
	}
	
}
