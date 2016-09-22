package datatypes6;

import java.util.Scanner;

public class StringPractice {

	static Scanner input;
	static String user;
	static int lineCount;
	
	public static void main(String[] args) {
		createAScanner();
		lineCount = 0;
		//demonstrateStringMethod();
		promptName();
		talkForever();
	}
	private static void promptName() {
		print("Hello, human. I am a board covered with "
				+ "\nsemiconductors and other such electronic components. "
				+ "\nWhat is your name?");
		user = input.nextLine();
		print("Awesome, I will call you "+user+" until you terminate me.");
	}
	public static void talkForever(){
		while(true){
			promptInput();
		}
	}
	public static void promptInput() {
		print(user +" ,try inputing a String!");
		String userInput = input.nextLine();
		print("You typed: " + userInput);
	}
	public static void print (String s){
		lineCount++;
		System.out.println("Line #" + lineCount +": "+ s);
	}
	private static void createAScanner() {
		input = new Scanner(System.in);
		
	}
	public static void demonstrateStringMethod(){
		String text1 = "Hello World";
		String text2 = "Hello ";
		String text3 = "World";
		
		if(text1.equals(text2+text3)){
			System.out.println("These strings are equal.");
		}
	}
}
