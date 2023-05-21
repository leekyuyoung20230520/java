package test;

public class ExampleDemo {

	public static void main(String[] args) {	
		
		sample03();
	}
	
	public static void sample01() {
		int day = 10;
		System.out.println(day);
		int speed;
		speed = 20;
		System.out.println(speed);
		
	}
	
	public static void sample02() {
		final double PI = 3.14;
		double radius = 3.0;
		
		System.out.println("반지름 3인 원의 넓이를 구합니다.");		
		System.out.println(radius*radius*PI);
	}
	// 메소드
	public static void sample03() {
//		String str = "Java";
//		String str2 = "Program";
//		System.out.println(str + " " + str2);
		String myName = "홍길동";
		int myAge = 20;
		System.out.print("이름 : \t"+ "\"" + myName + "\"" +"\n");
		System.out.print("나이 : \t"+myAge+"\n");
		System.out.println("C:\\Program Files");
	}
	
	public static void sample04() {		
		System.out.println(10 > 20); // false
		System.out.println(10 < 20); // true
		System.out.println(10 >= 20); // false
		System.out.println(10 <= 20); // true
		System.out.println(10 == 20); // false
		System.out.println(10 != 20); // true
		System.out.println(true);   // true
		System.out.println(!true);  //flase
		System.out.println( !(10 > 20) ); // true
		System.out.println( !(10 < 20) ); // false
		System.out.println( !(10 >= 20) ); // true
		System.out.println( !(10 <= 20) ); // false
		System.out.println( !(10 == 20) ); //true
		System.out.println( !(10 != 20) ); // false		
		
	}
	
	

}
