package 순환문;

import java.util.Random;

public class While02 {

	public static void main(String[] args) {
		// 클래스 객체 = new 클래스명()  --> 객체생성
		Random r = new Random(); // 랜덤객체
//		int num = r.nextInt(100); // 0~100사이의 임의의 숫자를 반환
//		System.out.println(num);
		
		while(true) {
			int num = r.nextInt(100);
			System.out.println(num);
			if(num % 3 == 0) { // 임의의 숫자가 3의 배수일때
				break;
			}
			
		}
	}

}
