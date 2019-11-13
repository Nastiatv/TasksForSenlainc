import java.util.Scanner;
public class task1 {

public static void main(String[] args) {
		

			/*Создать программу, которая будет сообщать, является ли целое число, введенное пользователем, чётным или нечётным, 
			простым или составным.  Если пользователь введёт не целое число, то сообщать ему об ошибке.*/

			
			Scanner scan= new Scanner(System.in);
	        System.out.println("Insert the number");
	                if (scan.hasNextInt()) {
	                    int num = scan.nextInt();
	                    int n=0;
	                    
	                    for(int i=2; i<num ;i++){
	                    	if(num%i==0) {
	                    	n++;
	                    	}	
	                    }
	                    String a = (n!=0 ? "The number is composite and " : "The number is prime and ");
                        System.out.print(a);	
	                    
	                    	String b = (num%2==0 ? "even" : "odd");
	                        System.out.print(b);
	                    }
	                else {System.out.println("mistake! You entered not a integer");
	                }
	                }
	                }