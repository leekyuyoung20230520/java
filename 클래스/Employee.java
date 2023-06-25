package 클래스;
// VO  Value Object
// DAO  Data Access Object
public class Employee {

	private String name;
	private String position;
	private double slary;
	public static int publicMoney = 100000; 
	public Employee(String name, String position, double slary) {
		super();
		this.name = name;
		this.position = position;
		this.slary = slary;
	}
	
	public static void staticMetod() {
		System.out.println("called staticMetod() ............");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public double getSlary() {
		return slary;
	}
	public void setSlary(double slary) {
		this.slary = slary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", position=" + position + ", slary=" + slary + "]";
	}
	
}
