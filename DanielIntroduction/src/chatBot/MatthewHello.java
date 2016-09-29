package chatBot;

import groupFiles.MatthewMain;

public class MatthewHello implements Topic{

	private boolean inHelloLoop;
	private String helloResponse;
	
	private int helloCount;
	
	private static String[] calmResponses = {"we've already said our hellos, Remeber?","Yes, hello to you too. Let's actually talk."};
	private static String[] angryResponses = {"Okay, seriously. This has to stop.","You are beginning to annoy me.","We've SAID HELLO"};
//	public MatthewHello(){
//		helloCount = 0;
//		while(inHelloLoop){
//			helloCount++;
//			printResponse();
//		}
//	}
	private void printResponse() {
		int responseIndex = 0;
		if(helloCount <= 5){
			responseIndex = (int)(Math.random()*calmResponses.length);
			MatthewMain.print(calmResponses[responseIndex]);
		}
		else{
			responseIndex = (int)(Math.random()*angryResponses.length);
			MatthewMain.print(angryResponses[responseIndex]);
		}
		
	}
	public void talk() {
		inHelloLoop = true;
		while(inHelloLoop){
			helloCount++;
			printResponse();
			helloResponse= MatthewMain.getInput();
			if(!isTriggered(helloResponse)){
				inHelloLoop= false;
				MatthewMain.talkForever();
			}
		}
		
	}

	public boolean isTriggered(String userInput) {
		String[] triggers = {"school","class","teacher"};
		//Can loop to find the particular keyword;
		if(MatthewMain.findKeyword(userInput, "hi", 0)>= 0){
			return true;
		}
		if(MatthewMain.findKeyword(userInput, "hello", 0)>= 0){
			return true;
		}
		return false;
	}

}
