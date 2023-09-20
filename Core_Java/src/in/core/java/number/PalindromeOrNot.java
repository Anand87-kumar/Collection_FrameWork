package in.core.java.number;

import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {
		// Code to accept a number from user find sum of all digits
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=scan.nextInt();
		int temp=num;
		int rem,sum=0;
		while(num!=0) {
			rem=num%10; 
			sum=sum*10+rem;
			num=num/10; 
			
		}
		if(sum==temp)
			System.out.print("Number is Palindrome");
		else
			System.out.print("Number is not Palindrome");
	}
}
