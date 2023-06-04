package 배열;

import java.util.Scanner;

public class Array01 {

	public static void main(String[] args) {
		// 문자열을 저장할 배열을 선언 갯수는 3
		String[] ary = new String[3];
		// 배열의 길이
		System.out.println(ary.length);
		// 배열의 마지막 인덱스 : 배열의 길이 -1
		int lastIndex = ary.length-1;
		// 배열을 순환하면서 값을 저장
		// 배열은 구조상 인덱스를 가지며 이 인덱스는 0부터시작하는 특징
		// 예를들어 5개면..... 인덱스는 0부터 4  -> 이건 마치 for문의 기본 문법과 너무 흡사
		// 그래서 배열과 for문은 찰떡궁합
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 3개를 입력하세요");
		for (int i = 0; i < ary.length; i++) {
			ary[i] = sc.nextLine();
		}
		// 배열에 사용자기 입력한 문자열이 들어가 있다.
		// 해당 문자열을 공백을 추가해서 합친다음 출력
		for (int i = 0; i < ary.length; i++) {
			System.out.print(ary[i]+" ");
		}
		

	}

}
