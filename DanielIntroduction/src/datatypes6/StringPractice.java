package datatypes6;

public class StringPractice {

	public static void main(String[] args) {
//		String text = new String("Hello world");
//		
//		String text1 = "Hello World";
//		String text2 = "Hello ";
//		String text3 = "World";
//		
//		if(text1.equals(text2+text3)){
//			System.out.println("These strings are equal.");
//		}
		String[] numbers = {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King","Ace"};
		String[] suits = {"Diamond","Clubs","Hearts","Spades"};
		
		for(int i = 0; i < 100; i++){
			System.out.println(numbers[PickNumber(numbers.length)-1] + " of " + suits[PickSuit(suits.length)-1]);
		}
	}
	public static int PickNumber(int par){
		double rand = Math.random();
		int result = (int)(rand*par);
		return result+1;
	}
	
	public static int PickSuit(int par){
		return PickNumber(par);
	}
}

