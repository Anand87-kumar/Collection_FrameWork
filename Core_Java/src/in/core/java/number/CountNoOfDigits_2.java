package in.core.java.number;

import java.util.Scanner;

public class CountNoOfDigits_2 {

	public static void main(String[] args) {
		// Code to accept a number from user count digits of that number
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number:");
		/*call method
		 * On execution of above command
		 1.Variable num will be created
		 2.nextInt() method of Scanner class will be called
		 3.Value returned by nextInt method will be assigned to variable num*/
		Long num=scan.nextLong(); // accept the user num =123
		Long count=(long) 0;
		while(num!=0) {
			count++;
			num=num/10; //qusent 
			
		}
		System.out.println("It has "+count+" number");

	}

}
