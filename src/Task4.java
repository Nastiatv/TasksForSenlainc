import java.util.Scanner;

public class Task4 {

	/*
	 * ������� ���������, ������� ������������ ������� ��� ������������� ����� �
	 * ������ (��� ����� ��������). ����� � ����� �������� �������.
	 */

	public static void main(String[] args) {
		System.out.println("Insert text:");
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();
		System.out.println("Insert word:");
		String word = scan.nextLine();
		printWordCounter(text, word);
		scan.close();
	}

	public static void printWordCounter(String text, String word) {
		String[] arraySentence = text.replaceAll("[!.,&^%$#@*(?)]", " ").toLowerCase().split(" ");
		word = word.toLowerCase().trim();
		int counter = 0;
		for (String words : arraySentence) {
			if (words.equals(word)) {
				counter++;
			}
		}
		System.out.println("Number of repetitions: " + counter);
	}
}