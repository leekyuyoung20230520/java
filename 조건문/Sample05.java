package 조건문;

import java.util.Scanner;

public class Sample05 {

	public static void main(String[] args) {
		System.out.println("3개의 숫자를 입력하세요(10 20 30) : ");
		Scanner s = new Scanner(System.in);
		
		int x = s.nextInt();
		int y = s.nextInt();
		int z = s.nextInt();		
		System.out.printf("x y z = %d %d %d\n",x, y, z);
		
		// 판단
		if(x > y) {
			if(x > z) {
				System.out.println("x는 가장 큰 정수 입니다.");
			}
			else {
				System.out.println("x는 가장 큰 정수가 아닙니다.");
			}
		}
		else {
			System.out.println("x는 가장 큰 정수가 아닙니다.");
		}
		
		

	}

}
