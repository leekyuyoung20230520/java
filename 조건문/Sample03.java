package 조건문;

import java.util.Scanner;

public class Sample03 {

	public static void main(String[] args) {
		// 정수를 입력받아서 짜 홀을 판단하는 문제
		// 입력 객체 선언 및 초기화
		Scanner s = new Scanner(System.in);
		// 안내메세지 출력
		System.out.println("정수를 입력하세요 : ");
		// 사용자로부터 데이터 입력
		int number = s.nextInt();
		// 짝 홀 판다
		if(number % 2 == 0) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
		
		// 해당 메세지는 조건문과 상관없이 항상 출력되는 메세지
		System.out.println("조건문에 상관없이 출력되는 메세지 입니다.");
				

	}

}
