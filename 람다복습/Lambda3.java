package 람다복습;

/*
 * 두개의 값을 받아서 계산하는 기능(+ - * 1 % ...)
 */

interface calc<T>{
	T apply(T a, T b);
}

public class Lambda3 {	
	public static void main(String[] args) {
		calc<Integer> c1 = (x, y)-> x + y;
		System.out.println(c1.apply(10, 20));
		
		c1 = (x, y)-> x / y;
		System.out.println(c1.apply(15, 3));
		
		c1 = (x, y)-> x * y;
		System.out.println(c1.apply(15, 3));
		
		c1 = (x, y)-> x - y;
		System.out.println(c1.apply(15, 3));
		
		c1 = (x, y)-> x % y;
		System.out.println(c1.apply(17, 3));
		
	}

}
