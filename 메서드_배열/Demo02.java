package 매서드_배열;

import java.util.Scanner;

/*
 * 미니 학사관리 프로그램
 * 학생은 국 영 수 과목의 점수를 가진다.
 * 총 학생은 5명이다.
 * 1. 표현하기
 */
public class Demo02 {
	public static void inputJumsu(int[] x) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < x.length; i++) {
			System.out.println("국 영 수 과목점수 입력:");
			x[i] = sc.nextInt();
		}
	}
	public static void inputJumsu(int[][] x) {		
		for (int i = 0; i < x.length; i++) {
			inputJumsu(x[i]);
		}
	}
	
	
	public static void displayJumsu(int[] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// 2명 학생을 관리
		int[][] students = new int[2][3];
		for (int i = 0; i < students.length; i++) {
			inputJumsu(students[i]);			
		}		
		
		for (int i = 0; i < students.length; i++) {
			displayJumsu(students[i]);			
		}	
		
	}

}
