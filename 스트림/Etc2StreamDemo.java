package 스트림;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Etc2StreamDemo {

	public static void main(String[] args) {
		IntStream is = IntStream.iterate(10, x->x+2);
		is.limit(10).forEach(x->System.out.print(x + " "));
		
		System.out.println();
		
		IntStream is2 = new Random().ints(0,10);
		is2.limit(10).filter(x-> x>5 ).forEach(x->System.out.print(x + " "));
		
		System.out.println();
		
		Stream<Double> ds = Stream.generate(Math::random);
		ds.limit(3).map(x->x*10).forEach(x->System.out.print(x + " "));
		
		System.out.println();
		
		IntStream is3 = IntStream.range(1, 5);
		is3.forEach(x->System.out.print(x + " "));
//		System.out.println(is3.sum());

	}

}
