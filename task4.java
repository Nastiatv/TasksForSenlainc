import java.util.Scanner;

public class Task4 {

/*Создать программу, которая подсчитывает сколько раз употребляется слово в тексте (без учета регистра). Текст и слово вводится вручную.*/

	
		public static void main(String[] args) {
		 System.out.println("Insert text:");
		 @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		 String text=scan.nextLine();
		 System.out.println("Insert word:");
		 String word=scan.nextLine();
		 printWordCounter(text, word);
	}
	
	public static void printWordCounter(String text, String word) {
        String[] arraySentence = text.replaceAll("[!.,&^%$#@*(?)]"," ").toLowerCase().split(" ");
        word = word.toLowerCase().trim();
        int counter = 0;
        	for (String x : arraySentence) {
        		if (x.equals(word)) {
                counter++;
        		}}
        System.out.println("Number of repetitions: " + counter);
    }}