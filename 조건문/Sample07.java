package 조건문;

import java.util.Scanner;

public class Sample07 {

	public static void main(String[] args) {
		// 문자열로 표현된 정수를 숫자로 변경
		// String -> int
//		String strNumber = "2023";
//		int number =  Integer.valueOf(strNumber);
//		System.out.println(number + 10);		
		
		// 현재연도를 입력받아서 해당 년도가 윤년인지 평년인지 판단하는 코드
		// 1. Scanner를이용해서 현재 년도를 입력받아 정수로 변환한다.(nextInt())
		// 2. 입력받은 년도가 윤년인지 판단한다.
		System.out.println("input year(ex 2023)");
		Scanner s = new Scanner(System.in);
		int year = s.nextInt();
		
		if(year % 4 == 0) {
			if( (year % 100 ==0) && (year % 400 != 0) ) {
				System.out.println("평년");
			}
			else {
				System.out.println("윤년");
			}
		}
		else {
			System.out.println("평년");
		}
		
		
		if( (year % 100 ==0) && (year % 400 != 0) ) {
			System.out.println("평년");
		}
		
	}

}
