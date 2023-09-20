package in.core.java.userinput;

import java.util.Scanner;

public class addTwoNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first number :");
		int num1 = scan.nextInt();
		System.out.print("Second the second number :");
		int num2 = scan.nextInt();
		int sum=num1+num2;
		System.out.println("Sum of "+num1+" and "+num2+" is :"+sum);
		

		
	}

}
