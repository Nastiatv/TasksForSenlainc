import java.util.Arrays;
import java.util.Scanner;

/* Создать программу, которая будет:
подсчитывать количество слов в предложении
выводить их в отсортированном виде 
делать первую букву каждого слова заглавной. 
Предложение вводится вручную. (Разделитель пробел (“ ”)).*/

import java.util.stream.Stream;

public class Task3Version2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insert Sentense:");
		String str = scan.nextLine();
		scan.close();
		countWords(str);
		sortArr(str);
		firstLetterUp(str);

	}

	private static void countWords(String a) {
		System.out.println(Stream.of(stringToArr(a)).count());

	}

	public static String[] stringToArr(String a) {
		String[] strAsArr = a.trim().replaceAll("[!.,?]", "").split(" ");
		return strAsArr;
	}

	public static void firstLetterUp(String a) {
		String strAsArr[] = stringToArr(a);
		System.out.println("\nFirst letter up: ");
		for (String word : strAsArr) {
			if (word.length() != 0) {
				System.out.print(word.substring(0, 1).toUpperCase() + word.substring(1) + " ");
			}
		}
	}

	public static void sortArr(String a) {
		System.out.println("Sorted:");
		Stream.of(stringToArr(a)).map(x -> x + " ").sorted().forEach(System.out::print);
	}
}