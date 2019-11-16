import java.util.Scanner;

public class Task2 {

	/*
	 * Создать программу, которая будет вычислять и выводить на экран НОК
	 * (наименьшее общее кратное) и НОД (наибольший общий делитель) двух целых
	 * чисел, введенных пользователем. Если пользователь некорректно введёт хотя бы
	 * одно из чисел, то сообщать об ошибке.
	 */

	private static final String eror = "mistake! You entered not a integer";

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Insert first number");
		Scanner scan = new Scanner(System.in);
		if (scan.hasNextInt()) {
			int first = scan.nextInt();
			System.out.println("Insert second number");
			if (scan.hasNextInt()) {
				int second = scan.nextInt();

				System.out.println("NOD=" + countNOD(first, second));
				System.out.println("NOK=" + countNOК(first, second));

			} else {
				System.out.println(eror);
			}
					} else {
			System.out.println(eror);
		}
		

	}

	private static int countNOК(int one, int two) {
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