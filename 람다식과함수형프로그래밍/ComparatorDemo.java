package 람다식과함수형프로그래밍;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorDemo {
	public static void main(String[] args) {
		String[] strings = {
				"시간은 돈이다","우리나라","안녕"
		};
		Arrays.sort(strings,new Comparator<String>() {			
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
				}
			} // end new Comparator
		);
		for (String s : strings) {
			System.out.println(s);
		}
		
		

	}

}
