package 스트림;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Demo1 {

	public static void main(String[] args) {
		// 1. 리스트 데이터 생성
		List<Integer> lists = new ArrayList<Integer>();
		Random R = new Random();
		for (int i = 0; i < 10; i++) {
			lists.add(R.nextInt(30));
		}
		List<Integer> gt10 = new ArrayList<Integer>();
		for (Integer data : lists) {
			if(data<10)
				gt10.add(data);
		}
		// 리스트 정렬
		Collections.sort(gt10, (o1,o2)-> -(o1-o2)  );		
		// 출력
		System.out.println(gt10);
		// 스트림을 이용한 필터링 그리고 정렬 그리고 출력
		lists.stream().filter(x -> x % 2 == 0).sorted( (o1,o2)-> o2-o1 ).forEach(x->System.out.print(x+" "));		

	}

}
