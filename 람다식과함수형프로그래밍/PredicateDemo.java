package 람다식과함수형프로그래밍;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {		
		IntPredicate even = x->x%2==0;
		System.out.println(even.test(12));
		
		IntPredicate even2 = x->x%2==0;
		System.out.println(even.test(12));
		
		IntPredicate one = x->x==1;
		IntPredicate oneorEven = one.or(even);
		System.out.println(oneorEven.test(1)?  "1 또는 짝수" : "1이 아닌 홀수");
		
		Predicate<String> p = x-> x.equals("lambda");
		System.out.println(p.test("lambda"));
		
		BiPredicate<Integer, Integer> bp = (x,y) -> x > y;
		System.out.println(bp.test(10, 20));
		
		
	}

}
