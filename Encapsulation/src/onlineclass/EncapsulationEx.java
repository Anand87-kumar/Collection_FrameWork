package onlineclass;

class Employee{
	private String name;
	//method or properties
	public void setName(String name) {
		this.name=name;
		
	}
	public String getName() {
		return name;
	}
}

public class EncapsulationEx {

	public static void main(String[] args) {
		
		Employee e= new Employee();
		e.setName("Anand");
		System.out.println("Nmae is :" +e.getName());

	}

}
