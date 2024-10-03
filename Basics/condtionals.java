/**
 * condtionals
 */
public class condtionals {

	public static void main(String[] args) {
		// Declare and initialize three integer variables
		int num1 = 5;
		int num2 = 10;
		int num3 = 3;

		// Find the largest of the three numbers using if-else conditions

		// Check if num1 is greater than num2
		if (num1 > num2) { // The code would only be 3 line if we use logical ops since we have not
					// discussed we will stick with this
			// If num1 is also greater than num3, num1 is the greatest
			if (num1 > num3) {
				System.out.println("The greatest value is " + num1);
			} else {
				// If num1 is not greater than num3, then num3 is the greatest
				System.out.println("The greatest value is " + num3);
			}

		} else {
			// If num2 is greater than num1, compare num2 with num3
			if (num2 > num3) {
				System.out.println("The greatest value is " + num2);
			} else {
				// If num2 is not greater than num3, then num3 is the greatest
				System.out.println("The greatest value is " + num3);
			}
		}
	}
}
