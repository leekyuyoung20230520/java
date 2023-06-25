package collection;

import java.util.ArrayList;
import java.util.List;

import 예외처리.Student;

public class List3 {

	public static void main(String[] args) {
		List<Integer> lists = new ArrayList<>();
		for (int i = 10; i < 20; i++) {
			lists.add(i);
		}
		System.out.println(lists.contains(50));
		System.out.println(lists.indexOf(12));
		
		List<Student> students = new ArrayList<>();		
		students.add(new Student());
		students.add(new Student());
		students.add(new Student());
		students.add(new Student());
		students.add(new Student());
		
		for (Student s : students) {
			s.getName();
		}
		
		

	}

}
