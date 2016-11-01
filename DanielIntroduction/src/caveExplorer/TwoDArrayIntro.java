package caveExplorer;

import java.util.Arrays;

public class TwoDArrayIntro {

	public static void main(String[] args) {
		
		int[] arr = {0,1,2,3,4,5,6,7};
		//rows, columns
		String[][] arr2D = new String[4][3];
		
		for(int i = 0; i < arr2D.length; i++){
			for(int j = 0; j < arr2D[i].length;j++){
				arr2D[i][j] = "(" + i + "," + j + ")";
			}
		}
		for(String[] row: arr2D){
			System.out.println(Arrays.toString(row));
		}
		
		//[(0,0),(0,1),(0,2)]
		//[(1,0),(1,1),(1,2)]
		//[(2,0),(2,1),(2,2)]
		//[(3,0),(3,1),(3,2)]
		//rows = 4, columns = 3
		//rows = arr2D.length column = arr2D[0].length
	}

}
