import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		System.out.println("Insert first number");
		Scanner scan = new Scanner(System.in);
		try {
			int first = scan.nextInt();
			System.out.println("Insert second number");
			int second = scan.nextInt();
			System.out.println("NOD=" + countNOD(first, second));
			System.out.println("NOK=" + countNOÊ(first, second));

		} catch (InputMismatchException e) {
			System.out.println("mistake! You entered not a integer");
		} finally {
			scan.close();
		}
	}

	private static int countNOÊ(int one, int two) {
		int i = 0;
		for (i = one + 1;; i++) {
			if (i % one == 0 && i % two == 0) {
				break;
			}
		}
		return i;
	}

	private static int countNOD(int one, int two) {
		int i = 0;
		for (i = one; i > 1; i--) {
			if (one % i == 0 && two % i == 0) {
				break;
			}
		}
		return i;
	}
}
