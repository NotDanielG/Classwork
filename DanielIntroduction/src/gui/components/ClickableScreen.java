package gui.components;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import gui.Screen;

public abstract class ClickableScreen extends Screen implements MouseListener{
	
	private ArrayList<Clickable> clickables;
	
	public ClickableScreen(int x, int y) {
		super(x,y);
	}
	
	@Override
	public MouseListener getMouseListener(){
		return this;
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		for(Clickable c: clickables){
			if(c.isHovered(e.getX(), e.getY())){
				c.act();
			}
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public abstract void initAllObjects(ArrayList<Visible> viewObjects);
	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		initAllObjects(viewObjects);
		clickables = new ArrayList<Clickable>();
		for(Visible v: viewObjects){
			if(v instanceof Clickable){
				clickables.add((Clickable) v);
			}
		}
		
	}
}
