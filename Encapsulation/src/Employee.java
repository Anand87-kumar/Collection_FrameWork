
public class Employee {
	
	private int empid;
	
	public void setEmpid(int eid) {
		empid = eid;
	}
	public int getEmpid() {
		return empid;
	}

	public static void main (String[] args) {
	Employee e=new Employee();
	e.setEmpid(101);
	System.out.println(e.getEmpid());

	}

}
/*Steps to achieve encapsulation.
 1.Declare the variables of a class as private.
 2.Provide public setter and getter methods to modify and view the variables values.
 
*/