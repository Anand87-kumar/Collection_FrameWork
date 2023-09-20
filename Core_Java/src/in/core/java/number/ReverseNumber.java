package in.core.java.number;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		// Code to accept a number from user find sum of all digits
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number:");
		/*call method
		 * On execution of above command
		 1.Variable num will be created
		 2.nextInt() method of Scanner class will be called
		 3.Value returned by nextInt method will be assigned to variable num*/
		int num=scan.nextInt();
		int rem,sum=0;
		while(num!=0) {
			rem=num%10; //(12%10)num modules 10 reminder will be return 2
			sum=sum*10+rem;
			num=num/10; //qusent 
			
		}
		System.out.print("Reverse the num is :"+sum);
	}
}



