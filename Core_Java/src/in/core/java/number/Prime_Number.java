package in.core.java.number;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println("Divided by 2 so it is not prime");
			
		}
		else {
			int sq=(int) Math.sqrt(num);
			int flag = 0;
			for(int ctr=3;ctr<=sq;ctr+=2)
			{
				if(num%ctr==0) {
					System.out.println("Divided by"+ctr+" so it not prime");
					flag=1;
					break;

				}
			}
			if(flag==0) {
				System.out.println("Number is Prime");
			}
		}

		
	}

}
/*
 1.Variable sr will be created
 2.sqrt method of Math class will be called
 3.Value retruned by sqrt method will be converted into int
 4.Value converted into int will be assigned to sr*/
