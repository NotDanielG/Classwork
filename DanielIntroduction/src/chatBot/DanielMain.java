package chatBot;

import java.util.Scanner;

public class DanielMain {

	static Scanner input;
	static String user;
	static int lineCount;
	static boolean inLoop;
	static Topic school;
	
	public static void main(String[] args) {
		createTopics();
		lineCount = 0;
		//demonstrateStringMethod();
		promptName();
		talkForever();
	}
	public static String getInput(){
		return input.nextLine();
	}
	private static void promptName() {
		print("Hello, human. I am a board covered with "
				+ "semiconductors and other such electronic components. "
				+ "What is your name?");
		user = input.nextLine();
		print("Awesome, I will call you "+user+" until you terminate me.");
	}
	public static void talkForever(){
		inLoop = true;
		while(inLoop){
//			promptInput();
			print("Greetings, " + user +" How are you?");
			String response = getInput();
			if(findKeyword(response,"good",0)){
				print("I'm so happy you are good!");
			}
			else if (response.indexOf("school")>= 0){
				inLoop = false;
				school.talk();
			}
			else{
				print("I'm sorry, I don't understand you.");
			}
		}
	}
	public static void promptInput() {
		print(user +" ,try inputing a String!");
		String userInput = input.nextLine();
		print("You typed: " + userInput);
	}
	public static void print (String s){
//		lineCount++;
		
		String printString = "";
		int cutOff = 35;
		while(s.length() > 0){
			String currentLine = "";
			String nextWord = "";
			//while the currentLine and nextWord are less than the cutioff. Do the following loop. ass
			while(currentLine.length() +nextWord.length() <= cutOff && s.length() > 0){
				currentLine += nextWord;
				s = s.substring(nextWord.length());
				int endOfWord = s.indexOf(" ");
				if(endOfWord == -1){
					endOfWord = s.length()-1;
				}
				nextWord = s.substring(0, endOfWord+1);
			}
			printString += currentLine +"\n";
		}
		
		System.out.println(printString);
	}
	private static void createTopics() {
		input = new Scanner(System.in);
		school = new School();
	}
	public static boolean findKeyword(String searchString, String key, int startIndex){
		//deletes white spaces
		String phrase = searchString.trim();
		phrase = phrase.toLowerCase();
		key = key.toLowerCase();
		//find position of key
		int psn = phrase.indexOf(key);
		//keeps looking for the word
		while(psn >= 0){
			String before = " ";
			String after = " ";
			if(psn + key.length() < phrase.length()){
				after = phrase.substring(psn + key.length(), psn + key.length()+1).toLowerCase();
				
			}
			if(psn >0){
				before = phrase.substring(psn-1, psn).toLowerCase();
			}
			if(before.compareTo("a")< 0 && after.compareTo("a") < 0){
				return true;
			}
			psn = phrase.indexOf(key,psn+1);
		}
		return false;
		
		
	}
	

}
