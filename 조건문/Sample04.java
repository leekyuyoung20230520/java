package 조건문;

import java.util.Scanner;

public class Sample04 {

	public static void main(String[] args) {
		// 점수를 입력받아서 학점을 출력
		// 점수는 정수로 입력받고 사용자가 0 ~ 100 사이의 값을 입력한다는 조건임
		
		// 사용자 입력을 처리 할 수 있는 환경 셋팅
		Scanner s = new Scanner(System.in);
		System.out.println("점수를 입력하세요 : ");
		int jumsu =  s.nextInt();
		if(jumsu >= 90) {
			System.out.println("A");
		}
		else if(jumsu >=80) {
			System.out.println("B");
		}
		else if(jumsu >=70) {
			System.out.println("C");
		}
		else if(jumsu >=60) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}

	}

}
