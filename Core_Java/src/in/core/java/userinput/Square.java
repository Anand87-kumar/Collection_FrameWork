package in.core.java.userinput;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		
 
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first Number : ");
		int num=scan.nextInt(); //nextInt() method accepts value form user and returns value entered by user
		int sq=num*num;
		System.out.println("Square of "+num+":"+sq);
	}

}
