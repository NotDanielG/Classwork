package caveExplorer;

import java.util.Scanner;

public class CaveExplorer {

	public static CaveRoom[][] caves;
	private static Scanner in;
	public static CaveRoom currentRoom;
	private static Inventory inventory;
	public static CaveRoom[][] empty;

	
	public static void main(String[] args){
		in = new Scanner(System.in);
		empty = new CaveRoom[2][2];
		caves = new CaveRoom[5][5];
//		for(int i = 0; i < caves.length; i++){
//			for(int j = 0; j < caves[i].length; j++){
//				caves[i][j] = new CaveRoom("This cave has coordinates "+i+", "+j);
//			}
//		}
//		currentRoom = caves[0][1];
//		currentRoom.enter();
//		caves[0][1].setConnection(CaveRoom.EAST,caves[0][2],new Door());
//		caves[0][2].setConnection(CaveRoom.SOUTH,caves[1][2],new Door());
//		caves[1][2].setConnection(CaveRoom.SOUTH,caves[2][2],new Door());
//		inventory = new Inventory();
//		startExploring();
		
		for(int row = 0; row < caves.length; row++){
			for(int col = 0; col < caves[row].length; col++){
				if(row == 0 && col == 0){
					printTop(caves[0].length);
					System.out.println("");
				}
				if(col == 0){
					printCell(0);
				}
				else{
					printCell(1);
				}
			}
			System.out.println("");
		}
	}

	private static void printTop(int i){
		for(int j = 0; j < i; j++){
			System.out.print(" __");
		}
	}
	private static void printCell(int i) {
		if(i == 0){
			System.out.print("|");
			System.out.print("__");
			System.out.print("|");
		}
		else{
			System.out.print("__");
			System.out.print("|");
		}
	}


	private static void startExploring() {
		
		while(true){
			System.out.println(inventory.getDescription());
			System.out.println(currentRoom.getDescription());
			System.out.println("What would you like to do?");
			String input = in.nextLine();
			currentRoom.interpretInput(input);
		}
	}
	
	
	
}
