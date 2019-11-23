import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
	/*
	 * Создать программу, которая будет сообщать, является ли целое число, введенное
	 * пользователем, чётным или нечётным, простым или составным. Если пользователь
	 * введёт не целое число, то сообщать ему об ошибке.
	 */
	public static void evenOrOdd(int num) {
		String b = (num % 2 == 0 ? "even" : "odd");
		System.out.print(b);
	}

	public static void compositeOrPrime(int num) {
		int n = 0;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				n++;
			}
		}
		String a = (n != 0 ? "The number is composite and " : "The number is prime and ");
		System.out.print(a);
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Insert the number");
		try {
			int num = scan.nextInt();
			compositeOrPrime(num);
			evenOrOdd(num);
			scan.close();

		} catch (InputMismatchException e) {
			System.out.println("mistake! You entered not a integer");
		}
	}
}