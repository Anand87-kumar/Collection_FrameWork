
public class Test1 {
	
	private int age;
	
	
	public void setAge(int a) {
		if(a>=18) {
			this.age=a;
		}
	}
	
	public int getAge( ) {
		return age;
	}

	public static void main(String[] args) {
		Test1 test=new Test1();
		System.out.println(test.age);
		
		System.out.println("After assigning the value");
		test.setAge(20);
		System.out.println(test.age);
		
		test.age=17;
		System.out.println("After assinging value directly.");
		System.out.println(test.age);

	}

}
