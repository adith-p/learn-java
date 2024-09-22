
/**
 * main
 */
import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num1 = sc.nextLong();
		long num2 = sc.nextLong();
		boolean flag = true;
		if (flag) {
			System.out.println(
					"Enter the opertaion to perform + ( addition ), - ( subtration ), * (multiplication), / ( divition )");
			char ops = sc.next().charAt(0);
			if (ops == '+') {
				System.out.println(num1 + num2);
			} else if (ops == '/') {
				if (num1 != 0 && num2 != 0) {
					System.out.println(num2 / num1);
				}
				System.err.println("Zero division error");
			} else if (ops == '*') {
				System.out.println(num2 * num1);
			} else if (ops == '-') {
				System.out.println(num2 - num1);
			}

		}
		sc.close();

	}
}
