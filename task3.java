import java.util.Arrays;
import java.util.Scanner;
/* Создать программу, которая будет:
подсчитывать количество слов в предложении
выводить их в отсортированном виде 
делать первую букву каждого слова заглавной. 
Предложение вводится вручную. (Разделитель пробел (“ ”)).*/

public class Task3 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Insert Sentense:");
		String str = scan.nextLine();
		countWords(str);
		sortArr(str);
		firstLetterUp(str);
	
	}

	private static void countWords(String a) {
		String strAsArr[] = stringToArr(a);
		int n = 0;
		for (String i : strAsArr) {
			String k = i;
			if (k.length() != 0) {
				n++;
			}
		}
		System.out.println("Words in a sentence: " + n);
	}

	public static String[] stringToArr(String a) {
		String[] strAsArr = a.trim().split(" ");
		return strAsArr;
	}

	public static void firstLetterUp(String a) {
		String strAsArr[] = stringToArr(a);
		System.out.println(" ");
		System.out.println("First letter up: ");
		for (String i : strAsArr) {
			String word = i;
			if (word.length() != 0) {
				System.out.print(word.substring(0, 1).toUpperCase() + word.substring(1) + " ");
			}
		}
	}

	public static void sortArr(String a) {
		String strAsArr[] = stringToArr(a);
		System.out.println("Sorted:");
		Arrays.sort(strAsArr);
		for (String i : strAsArr) {
			System.out.print(i + "  ");
		}
	}
}