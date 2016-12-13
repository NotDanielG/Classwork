package gui;

import java.awt.Graphics;

import javax.swing.JFrame;

import gui.screens.CoordinateScreen;

public abstract class GUIApplication extends JFrame{
	private Screen currentScreen;
	public GUIApplication(int width, int height){
		super();
		setBounds(20,20,width,height);
		//20,20 = coordinates it appears
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initScreen();
		setVisible(true);
	}

	public abstract void initScreen();
//	public static void main(String[] args){
//		new GUIApplication(800,600);
//		new Screen(800,600);
//	}
	public void paint(Graphics g){
		g.drawImage(currentScreen.getImage(),0,0,null);
	}

	public void setScreen(CoordinateScreen cs2) {
		// TODO Auto-generated method stub
		this.currentScreen = cs2;
	}

}
