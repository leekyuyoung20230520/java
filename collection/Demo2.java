package collection;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {
		// 다형성을 이용한 프로그램 및 디 커플링
		List<String> lists = new ArrayList<>();
		lists.add("a");lists.add("b");lists.add("c");
//		System.out.println(lists.get(0));
		System.out.println(lists);
		
//		for (int i = 0; i < lists.size(); i++) {
//			lists.remove(0);			
//		}
//		System.out.println(lists);
		
		for (String s : lists) {
			System.out.println(s);
			s = "";
		}
		System.out.println(lists);

	}

}
