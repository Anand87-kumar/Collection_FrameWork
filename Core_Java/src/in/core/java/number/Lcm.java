package in.core.java.number;

public class Lcm {

	public static void main(String[] args) {
		

		int num1=12;
		int num2=16;
		int max=num1>num2?num1:num2;
		int temp=max;
		while(true)
		{
			if(temp%num1==0 && temp%num2==0) {
				System.out.println(temp);
				break;
			}
			temp+=max;
		}
		

	}

}
