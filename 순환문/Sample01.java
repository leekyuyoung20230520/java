package 순환문;

public class Sample01 {

	public static void main(String[] args) {
		// 1부터 100까지의 숫자중에 짝수들의 합
		int sum = 0;
//		sum += 1;
//		sum += 2;
//		sum += 3;
//		// ....
//		sum += 100;
		// 1. 순환문 안에서 짝수 조건만 만족할때 합을 구한다.
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.printf("sum : %d\n", sum);
		// 2. 순환할때 i의 값이 0 2 4 6 8 10.. 이 되도록 증감식을 고친다.
		sum = 0;
		for (int i = 0; i <= 100; i += 2) {
			sum += i;
		}
		System.out.printf("sum : %d\n", sum);
	}

}
