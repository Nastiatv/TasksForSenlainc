import java.util.Scanner;
public class Task1 {
	
	/*Ñîçäàòü ïðîãðàììó, êîòîðàÿ áóäåò ñîîáùàòü, ÿâëÿåòñÿ ëè öåëîå ÷èñëî, ââåäåííîå ïîëüçîâàòåëåì, ÷¸òíûì èëè íå÷¸òíûì, 
	ïðîñòûì èëè ñîñòàâíûì.  Åñëè ïîëüçîâàòåëü ââåä¸ò íå öåëîå ÷èñëî, òî ñîîáùàòü åìó îá îøèáêå.*/

public static void main(String[] args) {
		
			@SuppressWarnings("resource")
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
