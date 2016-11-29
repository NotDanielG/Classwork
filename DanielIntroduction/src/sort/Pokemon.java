package sort;

public class Pokemon {
	private int level;
	private int hp;
	private String name;
	private boolean posioned;
	
	public Pokemon(String poke, int lvl){
		hp = 100;
		this.posioned = false;
		this.level = lvl;
		this.name = poke;
	}
	public void iChooseYou(){
		System.out.println(name +", " + name + "!");
	}
	public int getHP(){
		return hp;
	}
	public String getName(){
		return name;
	}
	public void setHP(int newHP){
		hp = newHP;
	}
	public void setPosioned(boolean b){
		posioned = b;
	}
	public void lapse(){
		if(posioned){
			hp-=15;
		}
	}
}
