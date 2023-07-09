package 스트림;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Demo2 {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();		
		numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		// 짝수만 출력
		List<Integer> even_list = numbers.stream().filter(x -> x%2 == 0).collect(Collectors.toList());
		System.out.println(even_list);
		
		// numbers 각 원소에 10을 더한다
		
		numbers.stream().map(x->x+10).forEach(Util::print);
		
		System.out.println();				
		// reduce를 적용해서 1부터 10까지의 합을 출력
		Optional<Integer> allsum = numbers.stream().reduce((x,y) -> x+y);
		System.out.println(allsum.get());
		
		// 1~10까지 스트림에서 5개만 출력
		List<Integer> limits = numbers.stream().limit(5).collect(Collectors.toList());
		System.out.println(limits);

	}

}
