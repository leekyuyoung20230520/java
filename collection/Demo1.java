package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		// 배열 : 개수가 정해져 있다.
		// collection : 정해지지 않는다. 다양한 서브 메소드가 존재한다
		List<Integer> abc = new LinkedList<>();
		
		System.out.println("abc size = " + abc.size() );
		for (int i = 0; i < 10; i++) {
			abc.add(i);
		}		
		System.out.println("abc size = " + abc.size() );
		abc.remove(0);
		System.out.println("abc size = " + abc.size() );
		System.out.println(abc.get(3));
	}

}
