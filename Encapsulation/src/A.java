
public class A {

	private int value;
	public void setvalue(int x) {
		value = x;
	}
	public int getvalue() {
		
		return value;
	}
	public static void main (String [] args) {
		A r = new A();
		r.value = 100;
		System.out.println(r.value);
	}
}
