package 배열;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		// 투표 시스템
		//  후보자... 1 홍길동 2 김철이 3 이미애
		// 유권자 10명.. 한명의 후보만 투표
		// 개표.. 홍길동 :4, 김철이 : 3 , 이미애 :3
		final int MAXNUM = 10; // 유권자수
		Scanner sc = new Scanner(System.in);
		int[] vote = new int[3];
		for (int i = 0; i < MAXNUM; i++) {
			System.out.println("후보자는 1번부터 3번까지 있고 각각의 번호로 투표하세요");			
			int number = sc.nextInt();
			vote[number-1]++;
		}
		// 투표결과 발표
		for (int i = 0; i < vote.length; i++) {
			System.out.printf("%d 번 후보는 : %d\n",i+1,vote[i]);
		}
		

	}

}
