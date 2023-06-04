package 메서드;
/*
 * 메소드 종류
 * 메소드 오버로딩
 */
public class Memoth02 {
	// 메소드 정의
	// 1. 매개변수 x 리턴타입 x
	public static void greeting() {
		System.out.println("안녕하세요");
	}
	// 2. 매개변수 o 리턴타입 x
	public static void greeting(String name) {
		System.out.printf("%s님 반가워요\n",name);
	}
	// 3. 매개변수 x 리턴타입 o
	public static String getCurrnetState() {
		return "Good";
	}
	// 4. 매개변수 o 리턴타입 o
	public static String greeting(String name, int age) {
		return String.format("안녕하세요 저는 %s 이구요 나이는 %d 입니다.", name,age);
	}	
	
	public static void main(String[] args) {
		// 사용하기
		greeting();
		greeting("홍길동");
		System.out.println(getCurrnetState());
		System.out.println( greeting("홍길동", 25)  );

	}

}
