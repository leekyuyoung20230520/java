package 순환문;

public class While01 {

	public static void main(String[] args) {
		// 0부터 9까지 출력
		// For 문
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		// 위의 코드를 while문으로 변경
		int i = 0;		
		while (i < 10) {
			System.out.println(i);
			i++;
		}

	}

}
