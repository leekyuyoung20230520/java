package 람다식과함수형프로그래밍;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo1 {
	public static void main(String[] args) {
		String[] strings = {
				"시간은 돈이다","우리나라","안녕"
		};
		// 문법
		// (타입 매개변수)     ->          { 실행문;실행문; }
		//   선언분      람다식 연산자        구현부
		
		Arrays.sort(strings,
//				(o1, o2)-> {return o1.length() - o2.length();}
				(o1, o2)-> o1.length() - o2.length()
		);
		
		for (String s : strings) {
			System.out.println(s);
		}
		
		

	}

}
