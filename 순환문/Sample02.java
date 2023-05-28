package 순환문;

import java.util.Scanner;

public class Sample02 {
	public static void main(String[] args) {
		// 키보드로부터 숫자를 3번 입력받아서 합을 구하는 문제
		Scanner s = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			System.out.println("input number : ");
			int num = s.nextInt();
			sum += num;
		}
		System.out.printf("sum : %d\n",sum);
	}
}
