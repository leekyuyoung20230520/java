package 스트림;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Array2StreamDemo {

	public static void main(String[] args) {
		int[] ia = {1,2,3,4,5};
		IntStream is = Arrays.stream(ia);
		is = IntStream.of(ia);
		
		String[] str = {"a","b","c"};
		Stream<String> ss = Arrays.stream(str);
		ss = Stream.of(str);
		
		double[] d = {1.2,3.5};
		DoubleStream ds =  Arrays.stream(d);
		ds = DoubleStream.of(d);		

	}

}
