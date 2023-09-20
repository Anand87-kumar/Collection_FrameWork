
public class thread3 extends Thread{
	int n1,n2,n3;
	public thread3(int i,int j, int k)
	{
		n1=i;
		n2=j;
		n3=k;
	}
public void run()
{
	System.out.println(n1);
	System.out.println(n2);
	System.out.println(n3);

}
}
