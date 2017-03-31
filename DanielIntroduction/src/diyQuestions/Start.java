package diyQuestions;

public class Start {
	public static void main(String[] args){
		System.out.println(printStuff(6,9));
	}
	public static int printStuff(int a, int b){
		while(a > b || b >= a){
			int x = a + b;
			int y = a - b;
			a = x + y;
			b = y - x;
	}
	return a + b;
	}


}
