package 순환문;

import java.util.Scanner;

/*
 * 사용자로부터 데이터를 입력받아서 짝홀을 구분해서출력
 * 매번 사용자로부터 계속할지 여부를 물어본다
 */
public class While04 {

	public static void main(String[] args) {
		
		boolean isContinue = true;		
		Scanner sc = new Scanner(System.in); // Scanner 객체 sc
		while (isContinue) {
			System.out.println("input number");
			int number = sc.nextInt();
			if(number %2 == 0) {
				System.out.println("odd");
			}
			else {
				System.out.println("not odd");
			}			
			System.out.println("is Continue? (y/n");
			String input = sc.next(); // 키보드 문자열을 있는 그대로 입력
			// 사용자가 입력한 Y, y 를 소문자로 변경하고 비교한다
			// 사용자가 y외에 다른 값을 입력했을때
			if (!input.toLowerCase().equals("y")) {				
				isContinue=false;
			}			
		}
	}

}
