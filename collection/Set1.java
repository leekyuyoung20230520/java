package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set1 {

	public static void main(String[] args) {
		List<Integer> lists = new ArrayList<>();
		lists.add(10);lists.add(10);lists.add(15);
		System.out.println(lists);
		Set<Integer> sets = new HashSet<>(lists);
		System.out.println(sets);
		
		lists = new ArrayList<>(sets);
		
//		sets.add(10);sets.add(10);sets.add(15);		
//		System.out.println(sets);
//		for (Integer i : sets) {
//			System.out.println(i);
//		}
	}

}
