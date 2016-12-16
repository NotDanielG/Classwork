package gui.sampleGames;

public class Sleeper implements Runnable{
	private int number;
	private int sleepTime;
	public static void main(String[] args){
		
	}
	public Sleeper() {
		this.number = number;
		this.sleepTime = (int)(Math.random()*1000);
	}
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
