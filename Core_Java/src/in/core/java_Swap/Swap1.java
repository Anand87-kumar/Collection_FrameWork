package in.core.java_Swap;

public class Swap1 {

	public static void main(String[] args) {
		
		int num1=90;
		int num2=20;
		
		System.out.println("Before asigning");
		System.out.println(num1);
		System.out.println(num2);
		num1=num2;
		num2=num1;
		System.out.println("After assigning");
		System.out.println(num1);//20
		System.out.println(num2);//20


	}

}
