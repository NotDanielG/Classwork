package shoppingCart;

import java.util.ArrayList;

public class Shop {
	static ArrayList<Item> shoppingList;
	public static void main(String[] args){
		
		String[] justDescriptions = getDescriptions();
		initList(justDescriptions);
		doShopping();
		printPurchasedItem();
	}
	private static String[] getDescriptions() {
		String[] test = {"Eggs","Dee","Whale"};
		return test;
	}
	private static void printPurchasedItem() {
		for(int i = 0; i < shoppingList.size();i++){
			if(shoppingList.get(i).getPurc()){
				System.out.println(shoppingList.get(i).getDesc());
				shoppingList.remove(i);
				i--;
			}
		}
	}
	private static void doShopping() {
		shoppingList.get(0).setPurchase(true);
		shoppingList.get(1).setPurchase(true);
		
	}
	private static void initList(String[] justDescriptions) {
		shoppingList = new ArrayList<Item>();
		for(int i = 0; i < justDescriptions.length;i++){
			shoppingList.add(new Item(justDescriptions[i]));
		}
		
	}
}
