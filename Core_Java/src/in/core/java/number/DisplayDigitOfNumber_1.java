package in.core.java.number;

import java.util.Scanner;

public class DisplayDigitOfNumber_1 {

	public static void main(String[] args) {
		// Code to accept a number from user and display digits of that number
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number:");
		/*call method
		 * On execution of above command
		 1.Variable num will be created
		 2.nextInt() method of Scanner class will be called
		 3.Value returned by nextInt method will be assigned to variable num*/
		int num=scan.nextInt();
		int rem;
		while(num!=0) {
			rem=num%10; //(12%10)num modules 10 reminder will be return 2
			System.out.println(rem);
			num=num/10; //qusent 
			
		}

	}
}
