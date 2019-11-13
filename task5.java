import java.util.Scanner;

public class task5 {

	/*������� ���������, ������� � ������������������ �� 0 �� N, ������� ��� �����-���������� 
	 * (���������� �������� ����� �������������). ����� ������������������ N 
	 * �������� ������� � �� ������ ��������� 100. 
*/
	
	
	public static void main(String[] args) {
	 System.out.println("Insert number from 0 to 100 ");
	 Scanner scan = new Scanner(System.in);
	 int num=scan.nextInt();
	 if(num>100) {
		 System.out.println("The length of the sequence must not exceed 100");
	 			}
	 printPalindromeNumbers(num);
		 
		 
	}
	 
	public static boolean isPalindrome(String number) {
        StringBuilder reverse = new StringBuilder(number).reverse();
        String reverseToString = reverse.toString();
        return number.equalsIgnoreCase(reverseToString);
    }

    public static void printPalindromeNumbers(int num) {
       for (int i = 0; i < num; i++) {
            if (isPalindrome(String.valueOf(i))) {
                System.out.println(i);
            }
        }
    }
}