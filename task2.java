import java.util.Scanner;
public class task2 {

	/*������� ���������, ������� ����� ��������� � �������� �� ����� ��� (���������� ����� �������) � ��� (���������� ����� ��������)
	 *  ���� ����� �����, ��������� �������������. 
	���� ������������ ����������� ����� ���� �� ���� �� �����, �� �������� �� ������.*/

	
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
            System.out.println("NOK=" +countNO�(first,second));
            		
         }
         else {System.out.println("mistake! You entered not a integer");}} 
     else {System.out.println("mistake! You entered not a integer");}}
         
      
private static  int countNO�(int one, int two) {
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
	}}