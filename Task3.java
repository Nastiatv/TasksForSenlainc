import java.util.Arrays;
import java.util.Scanner;
/* Создать программу, которая будет:
подсчитывать количество слов в предложении
выводить их в отсортированном виде 
делать первую букву каждого слова заглавной. 
Предложение вводится вручную. (Разделитель пробел (“ ”)).*/

public class Task3 {

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
		String strAsArr[] = stringToArr(a);
		int n = 0;
		for (String word : strAsArr) {
			String k = word;
			if (k.length() != 0) {
				n++;
			}
		}
		System.out.println("Words in a sentence: " + n);
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
		String strAsArr[] = stringToArr(a);
		System.out.println("Sorted:");
		Arrays.sort(strAsArr);
		for (String word : strAsArr) {
			System.out.print(word + "  ");
		}
	}
}