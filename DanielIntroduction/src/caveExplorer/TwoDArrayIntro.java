package caveExplorer;

import java.util.Arrays;

public class TwoDArrayIntro {

	public static void main(String[] args) {
		
//		int[] arr = {0,1,2,3,4,5,6,7};
//		//rows, columns
//		String[][] arr2D = new String[8][10];
//		
//		for(int i = 0; i < arr2D.length; i++){
//			for(int j = 0; j < arr2D[i].length;j++){
//				arr2D[i][j] = "(" + i + "," + j + ")";
//			}
//		}
//		for(String[] row: arr2D){
//			for(String s: row){
//				System.out.println(s);
//			}
//		}
		
		//[(0,0),(0,1),(0,2)]
		//[(1,0),(1,1),(1,2)]
		//[(2,0),(2,1),(2,2)]
		//[(3,0),(3,1),(3,2)]
		//rows = 4, columns = 3
		//rows = arr2D.length column = arr2D[0].length
		String[][] pic = new String[10][12];
		for(int row = 0; row < pic.length; row++){
			for(int col = 0; col < pic[row].length;col++){
				pic[row][col] = ".";
				
			}
		}
		for(int row = 7; row < pic.length; row++){
			for(int col = 0; col < pic[row].length;col++){
				pic[row][col] = "M";
				
			}
		}
		pic[1][2] = "O";
		pic[0][2] = "|";
		pic[2][2] = "|";
		pic[1][1] = "-";
		pic[1][3] = "-";
		pic[0][1] = "\\";
		pic[2][3] = "\\";
		pic[0][3] = "/";
		pic[2][1] = "/";
		
		for(int i = 0; i < 4; i++){
			for(int j = 5; j < 11;j++){
				if(rand(0,5)== 4){
					pic[i][j] = "v";
				}
			}
		}
		
		
		System.out.println(rand(0,3));
		printPic(pic);
	}
	public static int rand(int low, int high){
			return (int) (Math.random()*high)+low;
	}
	public static void printPic(String[][] pic){
		for(int row = 0; row < pic.length; row++){
			for(int col = 0; col < pic[row].length;col++){
				System.out.print(pic[row][col]);
			}
			System.out.println("");
		}
	}

}
