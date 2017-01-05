package gui.whackamole;

import java.util.ArrayList;
import java.util.List;

import gui.Screen;
import gui.components.Action;
import gui.components.ClickableScreen;
import gui.components.TextLabel;
import gui.components.Visible;

public class WhackAMoleScreen extends ClickableScreen implements Runnable{
	private ArrayList<MoleInterface> moles;
	private PlayerInterface player;
	private TextLabel label;
	private TextLabel timeLabel;
	private double timeLeft;
	
	public WhackAMoleScreen(int width, int height) {
		super(width, height);
		this.timeLeft = 30.0;
		Thread play = new Thread(this);
		play.start();
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		getAPlayer();
		label = new TextLabel(350,220,100,40,"Ready...");
		timeLabel = new TextLabel(360,40,80,40,"30.0");
		viewObjects.add(player);
		viewObjects.add(label);
		viewObjects.add(timeLabel);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		
	}
	
	private PlayerInterface getAPlayer() {
		return null;
	}

	private Mole getAMole() {
		return new Mole((int)Math.random()*getWidth(), (int) Math.random()*getHeight());
	}
	
	@Override
	public void run() {
		changeText("Ready...");
		changeText("Set...");
		changeText("Go...");
		label.setText("");
		
		while(timeLeft > 0){
			updateTimer();
			updateAllMoles();
			appearNewMole();
			
		}
	}

	private void appearNewMole() {
		double chance = .2*(60-timeLeft/timeLeft);
		if(Math.random()< chance){
			final MoleInterface mole = getAMole();
			mole.setAppearanceTime((int) (500+Math.random()*2000));
			mole.setAction(new Action(){
				public void act() {
					player.increaseScore(1);
					remove(mole);
					moles.remove(mole);
				}
			});
			addObject(mole);
			moles.add(mole);
		}
	}

	private void updateAllMoles() {
		for(int i = 0; i < moles.size();i++){
			MoleInterface m = moles.get(i);
			int screenTime = m.getAppearanceTime()-100;
			m.setAppearanceTime(screenTime);
			if(m.getAppearanceTime() <= 0){
				remove(m);
				moles.remove(m);
				i--;
			}
		}
		
	}

	private void updateTimer() {
		try {
			Thread.sleep(100);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		timeLeft-=.1;
		timeLabel.setText(""+(int)(timeLeft*10)/10.0);
	}

	private void changeText(String string) {
		label.setText(string);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
