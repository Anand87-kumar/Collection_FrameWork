package in.core.java.userinput;

import java.util.Scanner;

public class addTwoNumberforloop {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		int sum=0;
		for(int c=1;c<=5;c++)
		{
			System.out.print("Enter the number"+c+":");
			int num=scan.nextInt();
			sum=sum+num;
		}
		System.out.println("Sum="+sum);

	}

}
