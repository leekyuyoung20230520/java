package 접근제한자02;

import 접근제한자01.ClassA;

public class Demo {
	public static void main(String[] args) {
		// 동일 패키지에서는 전부  사용가능하다는 전제조건
		// private은 안됨
		ClassA a = new ClassA();
		System.out.println(a.a_1);
	}
}
