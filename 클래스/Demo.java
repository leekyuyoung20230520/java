package 클래스;

// starter
public class Demo {

	public static void main(String[] args) {
		// Person 클래스의 객체를 만든다
//		Person p; // p는 Person의 객체가 아니다. null
//		p = new Person();  // p는 Person의 객체다
//		p.hashCode();
		
		Person p = new Person();
		p.method();
		
		Person p2 = new Person();
		
		int age = -25;		
		p.setAge(age);
		
		

	}

}
