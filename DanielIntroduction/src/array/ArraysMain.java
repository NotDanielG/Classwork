package array;

public class ArraysMain {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		String[] someStrings = new String[100];
		populateArray(someStrings);
		changeString(someStrings[99]);
		printArray(someStrings);
		
		long endTime = System.currentTimeMillis();
		System.out.print("Completed method in " + (endTime-startTime) + " milliseconds");
	}
	private static void changeString(String s) {
		s = "This string has been changed.";
	}
	private static void printArray(String[] b) {
		for(String a: b){
			System.out.println(a);
		}
		
	}
	private static void populateArray(String[] a) {
		for(int i =0; i<a.length;i++){
			a[i] = "value " + (i + 1);
		}
		
	}
	public static void arrayIntroMethod(){
		// Construct 2 integer arrays
		// Same arrays, these two arrays fill with zeroes.
		int[] zeroes1 = {0,0,0};
		int[] zeroes2 = new int[3];
		
		boolean[] booleans = new boolean[3];
		String[] strings1 = {"","",""};
		//Empty strings, full of spaces
		String[] strings2 = new String [3]; 
		//Will be full of nulls.
		//iterate in two ways
		//index of the data is important to reference
		//you need to customize how you iterate, (+2, backwards)
		for(int i = 0; i<booleans.length; i++){
			System.out.println(i+"). "+ booleans[i]);
		}
		//second method - always goes in order, does not keep track of index
		//easier to type
		for(boolean b: booleans){
			System.out.println(""+b);
		}
	}
}