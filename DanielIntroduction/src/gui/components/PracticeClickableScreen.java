package gui.components;

import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import sampleImages.ClickableGraphic;
import sampleImages.Graphic;

public class PracticeClickableScreen extends ClickableScreen implements MouseListener{

	private ClickableGraphic kol;
	public PracticeClickableScreen(int x, int y) {
		super(x, y);
		
	}

	public void initAllObjects(List<Visible> viewObjects) {
		kol = new ClickableGraphic(30,30,.5,"resources/sampleImages/kol.png");
		kol.setAction(new Action(){
			public void act(){
				kol.setX(kol.getx() +5);
			}
		});
		viewObjects.add(kol);
	}

	
}
