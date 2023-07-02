package 람다식과함수형프로그래밍;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		// Bi, Double, Int, ObjDouble, ObInt, ObjLong 변종
//		Consumer<T>   void accept(T t);
		Consumer<String> c = x -> System.out.println(x.toUpperCase());
		c.accept("hello");
		
		BiConsumer<String, String> bi = (x,y)->System.out.println(x+y);
		bi.accept("java", " test");
		
		ObjIntConsumer<String> oc = (x,y) -> {
			for (int i = 0; i < y; i++) {
				System.out.println(x);
			}
		};
		oc.accept("hello", 5);
		
		IntConsumer ic = x-> System.out.println(x);
		IntConsumer ic2 = ic.andThen(x->System.out.println(x+10));
		ic2.accept(10);		
	}

}
