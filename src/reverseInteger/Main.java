package reverseInteger;

public class Main {
	public static void main(String[] args) {
		int x = 214748364;
		
		System.out.println("Input: " + x);
		
		FindReverseIntegerFunction solution = new FindReverseIntegerFunction();
		
		System.out.println("Reverse: " + solution.reverse(x));
		
	}
}
