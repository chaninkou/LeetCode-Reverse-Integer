package reverseInteger;

public class FindReverseIntegerFunction {
	public int reverse(int x){
		// Negative or not
		boolean isNegative = false;
		
		// Check if it is negative
		if(x < 0){
			// Set it to true
			isNegative = true;
			
			// Make it to a positive
			x = x * -1;
		}
		
		// result
		long reversedResult = 0;
		
		// while it is not equal to 0
		while(x > 0){
			// x % 10 will get last digit
			// result * 10 will get the right amount of digits
			reversedResult = (reversedResult * 10) + (x % 10);
			
			// Delete the last digit from x
			x = x / 10;
		}
		
		// Checking if the reversed integer overflows, return 0 if it does
		if(reversedResult > Integer.MAX_VALUE){
			return 0;
		}
		
		// If its negative, make the result to negative by * -1, if not, return the result 
		return isNegative ? (int) (-1 * reversedResult) : (int) reversedResult;
	}
	
	// Another way to do it
//	public int reverse(int x) {
//		int result = 0;
//
//		while (x != 0) {
//			// Get the last digit
//			int tail = x % 10;
//
//			// The reverse value, adding last digit and then second to last
//			// digit and so on.
//			int newResult = result * 10 + tail;
//
//			// If overflow occur, the newresult will not equal to the previous
//			// one
//			if ((newResult - tail) / 10 != result) {
//				System.out.println((newResult - tail) / 10);
//				System.out.println(result);
//				return 0;
//			}
//
//			// Update the result
//			result = newResult;
//
//			// Whatever is left in the origin value by taking out last digit and
//			// then previous digit til 0
//			x = x / 10;
//		}
//		return result;
//	}
}
