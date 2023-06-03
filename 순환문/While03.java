package 순환문;

import java.util.Random;

public class While03 {

	public static void main(String[] args) {
		// 클래스 객체 = new 클래스명()  --> 객체생성
		Random r = new Random(); // 랜덤객체
		int num;		
		while( (num = r.nextInt(100) )%3 !=0 ) {			
			System.out.println(num);
		}
	}

}
