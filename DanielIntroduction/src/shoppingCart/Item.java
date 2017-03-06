package shoppingCart;

public class Item {
	private String desc;
	private boolean purchase;
	public Item(String des){
		this.desc = des;
	}
	public void setPurchase(boolean b){
		this.purchase = b;
	}
	public String getDesc(){
		return this.desc;
	}
	public boolean getPurc(){
		return this.purchase;
	}
}
