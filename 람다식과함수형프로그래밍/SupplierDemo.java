package 람다식과함수형프로그래밍;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
//		Supplier<T> 	T get();
		Supplier<String> s1 = () ->"dog";
		System.out.println(s1.get());
		
		int[] x = {0};
		IntSupplier s2 = ()-> x[0]++;
		s2.getAsInt();s2.getAsInt();s2.getAsInt();
		System.out.println(x[0]);
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Supplier<String> s3 = ()->format.format(new Date());
		System.out.println(s3.get());

	}

}
