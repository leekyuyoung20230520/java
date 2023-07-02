package 람다복습;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Person{
	String name;
	int age;
	public Person(String name, int age) {		
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
public class Lambda2 {
	public static void main(String[] args) {				
		List<Person> people = new ArrayList<Person>();
		people.add(new Person("kim", 15));
		
		people = Arrays.asList(
				new Person("kim", 15),new Person("lee", 20),
				new Person("whang", 5),new Person("hong", 30),
				new Person("bark", 25),new Person("Dave", 45)
				);
		System.out.println(people);
//		people.sort(null);   // int compare(T o1, T o2); 기능을 구현한 객체--> 람다
		people.sort( (o1,o2) -> o1.name.compareTo(o2.name));		
		System.out.println(people);
		
		
		
				
	}

}
