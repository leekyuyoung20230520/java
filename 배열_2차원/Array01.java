package 배열_2차원;

import java.util.Scanner;

/*
 * 2차원 배열
 */
public class Array01 {

	public static void main(String[] args) {
		// 국어, 수학, 평균 을 저장하는 1차원배열을 2개 가지는 2차원 배열
		double[][] marks = new double[2][3];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 2; i++) {
			System.out.println("학생번호 : " + i+1);
			System.out.println("국어점수를 입력하세요 ");
			marks[i][0] = sc.nextDouble();
			
			System.out.println("수학점수를 입력하세요 ");
			marks[i][1] = sc.nextDouble();
			
			marks[i][2] = (marks[i][0] +marks[i][1]) / 2;
		}	
		
		for (int i = 0; i < 2; i++) {
			System.out.println("학생번호 : " + i+1);
			System.out.println("국어:"+marks[i][0]+"  수학:"+marks[i][1]+"  평균:"+marks[i][2]);
		}
		
	}

}
