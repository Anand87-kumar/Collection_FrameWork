package onlineclass;

public class Main {

	public static void main(String[] args) {


		Emp1 e= new Emp1();
		e.setId(101);
		e.setName("anand");
		e.setSalary(123333);
		
		System.out.println("Name :"+e.getName()+"\n"+ "id "+e.getId()+"\n"+"salary "+e.getSalary());
	}

}
