package 클래스;

// starter
public class Demo {

	public static void main(String[] args) {
		// Person 클래스의 객체를 만든다
//		Person p; // p는 Person의 객체가 아니다. null
//		p = new Person();  // p는 Person의 객체다
//		p.hashCode();
		
//		Person p = new Person();
//		p.method();
//		
//		Person p2 = new Person();
//		
//		int age = -25;		
//		p.setAge(age);
		
//		Product p = new Product();
//		p.setName("ABC");
//		p.setPrice(10000);
//		p.setQuantity(5);
//		
//		System.out.println(p);
		
//		Company[] ary = {
//				new Company("A","korea",100),
//				new Company("B","America",200)
//				};
		
//		Employee e = new Employee("kim","manager",2000);
//		Employee.staticMetod();  // static method called
//		e.getName(); // non static method called
//		e.getSlary();
//		System.out.println(Employee.publicMoney);
//		Employee.publicMoney = 0;
//		
//		Employee e2 = new Employee("lee","staff",1000);
//		e2.getName();
//		Employee.staticMetod();  // static method called
//		e2.getSlary();
//		System.out.println(Employee.publicMoney);
		
		SingleTone a = SingleTone.getInstance();
		
		SingleTone a2 = SingleTone.getInstance();
		a2.data1 = 100;
		a2.data2 = 200;		
		
		SingleTone a3 = SingleTone.getInstance();
		
		
		System.out.println(a);
		System.out.println(a2);
		System.out.println(a3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
