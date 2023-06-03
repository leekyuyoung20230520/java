package 메서드;

public class Method01 {
	public static void method1() {
		System.out.println("call method1..");
	}
	public static String mehtod2() {
		return "return method2..";
	}
	
	public static void main(String[] args) {
		// 전달받는값 x , 리턴(반환)하는 값이 없는형태
		// public static void 이름() { }
		method1();
		
		// 전달받는값 x , 리턴(반환)하는 값이 있는형태
		// public static 리턴(반환)하는타입 이름(){ return 리턴(반환)하는타입 의 값(변수)}
		System.out.println( mehtod2()  );

	}

}
