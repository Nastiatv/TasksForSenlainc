import java.util.Scanner;
public class Task2 {

	/*Ñîçäàòü ïðîãðàììó, êîòîðàÿ áóäåò âû÷èñëÿòü è âûâîäèòü íà ýêðàí ÍÎÊ (íàèìåíüøåå îáùåå êðàòíîå) è ÍÎÄ (íàèáîëüøèé îáùèé äåëèòåëü)
	 *  äâóõ öåëûõ ÷èñåë, ââåäåííûõ ïîëüçîâàòåëåì. 
	Åñëè ïîëüçîâàòåëü íåêîððåêòíî ââåä¸ò õîòÿ áû îäíî èç ÷èñåë, òî ñîîáùàòü îá îøèáêå.*/

	
@SuppressWarnings("resource")
public static void main(String[] args) {
	 System.out.println("Insert first number");
	 Scanner scan1 = new Scanner(System.in);
	 if(scan1.hasNextInt()){
         int first=scan1.nextInt();
         System.out.println("Insert second number");
         Scanner scan2=new Scanner(System.in);
         if(scan2.hasNextInt()){
             int second=scan2.nextInt();
                     
            System.out.println("NOD=" +countNOD(first,second));
            System.out.println("NOK=" +countNOÊ(first,second));
            		
         }
         else {System.out.println("mistake! You entered not a integer");}} 
     else {System.out.println("mistake! You entered not a integer");}}
         
      
private static  int countNOÊ(int one, int two) {
	int i=0;
	for(i=one+1; ;i++) {
    	if(i%one==0&&i%two==0) {
    		break;
    	}}return i;
	}

private static int countNOD(int one, int two) {
	int i=0;
	for(i=one; i>1;i--) {
    	if(one%i==0&&two%i==0) {
    		break;
    	}}return i;
	}
}
