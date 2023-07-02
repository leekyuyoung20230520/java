package 람다식과함수형프로그래밍;

import java.util.function.Function;

public class FunctionalDemo {

	public static void main(String[] args) {
//		Function<T, R>  R apply(T t);
		
		Function<Integer, Double> divide;
		divide = x -> x / 3.0;	
		System.out.println(divide.apply(17));
		
		divide = x -> {
			double result = x / 3.0;
			result = (int)(result*100);			
			result /= 100.0;
			return result;
		};
		System.out.println(divide.apply(17));
	}

}
