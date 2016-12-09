package gui;

import java.awt.Graphics;

import javax.swing.JFrame;

public class GuiApplication extends JFrame{
	private Screen currentScreen;
	public GuiApplication(int width, int height){
		super();
		setBounds(20,20,width,height);
		//20,20 = coordinates it appears
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initScreen();
		setVisible(true);
	}
	public void initScreen() {
		// TODO Auto-generated method stub
		currentScreen = new Screen(getWidth(), getHeight());
	}
	public static void main(String[] args){
		new GuiApplication(800,600);
		new Screen(800,600);
	}
	public void paint(Graphics g){
		g.drawImage(currentScreen.getImage(),0,0,null);
	}

}
