package reverseInteger;

public class FindReverseIntegerFunction {
	public int reverse(int x) {
		int result = 0;

		while (x != 0) {
			// Get the last digit
			int tail = x % 10;

			// The reverse value, adding last digit and then second to last
			// digit and so on.
			int newResult = result * 10 + tail;

			// If overflow occur, the newresult will not equal to the previous
			// one
			if ((newResult - tail) / 10 != result) {
				System.out.println((newResult - tail) / 10);
				System.out.println(result);
				return 0;
			}

			// Update the result
			result = newResult;

			// Whatever is left in the origin value by taking out last digit and
			// then previous digit til 0
			x = x / 10;
		}
		return result;
	}
}
