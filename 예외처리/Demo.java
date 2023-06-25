package 예외처리;

import 상속.Cat;

public class Demo {

	public static void main(String[] args) {
		int[] ary = {1,2,3};	
		
		try {
			System.out.println("try 구문 시작");
//			System.out.println(ary[3]);
			System.out.println(10/0);
			Object o = new Object();
			System.out.println((Cat)o);
			System.out.println("try 구문 종료");
		}
		catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
			e.printStackTrace();
			System.out.println("배열범위넘거나 0으로나누는 예외 발생시 처리할 공통 로직");
		}
//		catch (ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
//			System.out.println("배열범위를 넘어갔으므로 적절한 조치를 취한다.");
//		} 
//		catch (ArithmeticException e) {
//			e.printStackTrace();
//			System.out.println("0으로 나눌수 없으니 적절한 조치를 취한다.");
//		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("catch 구문 시작");
			System.out.println("예외 발생시 처리할 로직");
			System.out.println("catch 구문 종료");
		}
		
		
		
		
		System.out.println("자 이제 시작 에러가 있어서 이 부분은 시작되어야 합니다.");

	}

}
