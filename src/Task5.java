import java.util.Scanner;

public class Task5 {

	/*
	 * ������� ���������, ������� � ������������������ �� 0 �� N, ������� ���
	 * �����-���������� (���������� �������� ����� �������������). �����
	 * ������������������ N �������� ������� � �� ������ ��������� 100
	 */

	public static void main(String[] args) {
		System.out.println("Insert number from 0 to 100 ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if (num > 100) {
			System.out.println("The length of the sequence must not exceed 100");
		}
		printPalindromeNumbersbefore(num);
		scan.close();
	}

	public static boolean isPalindrome(String number) {
		StringBuilder reverse = new StringBuilder(number).reverse();
		String reverseToString = reverse.toString();
		return number.equalsIgnoreCase(reverseToString);
	}

	public static void printPalindromeNumbersbefore(int num) {
		for (int i = 0; i < num; i++) {
			if (isPalindrome(String.valueOf(i))) {
				System.out.println(i);
			}
		}
	}
}