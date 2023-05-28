package 순환문;

public class Sample03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 1. ~ 10 까지의 숫자중에 짝수만 출력
		
		for (int i = 1; i < 11; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		// 2. 아래 구구단중에 5단 출력을 순환문을 이용해서 표현
		for (int i = 1; i <= 9; i++) {
			System.out.printf("5 x %d = %d\n",i,  5*i);
		}
		
		// 1~10까지의 숫자를 역순으로 출력해 보기
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}
	}

}
