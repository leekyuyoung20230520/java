package 클래스;
/*
 * name
 * location
 * totalEmployees
 * toString override
 */
/*
 * 생성자
 * 	기본 생성자
 * 		public 클래스명(){}  --> 기본생성자 : 아무  생성자가 없을때 제공해주는 생성자
 * 	매개변수 생성자
 * 		public 클래스명(매개변수,매개변수, ....){} -> 매개변수 생성자 : 기본생성자가 사라진다.
 */
public class Company {
	private String name;
	private String loaction;
	private int totalEmployees;	
	// 스페셜....???? 특이한 애. 메소드는 아니에요. 리턴타입이 없으니깐
	// 그런데 왜 메소드 형태를 취하는가?--> 애도 호출당하는 애
	// 	
	public Company(String name, String loaction, int totalEmployees) {
		super();
		this.name = name;
		this.loaction = loaction;
		this.totalEmployees = totalEmployees;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoaction() {
		return loaction;
	}
	public void setLoaction(String loaction) {
		this.loaction = loaction;
	}
	public int getTotalEmployees() {
		return totalEmployees;
	}
	public void setTotalEmployees(int totalEmployees) {
		this.totalEmployees = totalEmployees;
	}
	@Override
	public String toString() {
		return "Company [name=" + name + ", loaction=" + loaction + ", totalEmployees=" + totalEmployees + "]";
	}
	

	
	
	
}
