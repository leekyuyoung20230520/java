package 배열;

import java.util.Scanner;

// 5명의 학생점수를 입력받아서
// 총점
// 평균
// 가장 높은 점수
// 가장 낮은 점수
// 출력하기
public class Array02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input 5 numbers...");
		// 정수형 데이터 5개를 처리할수 있는 배열 변수 선언
		int[] ary = new int[5];
		// 배열을 이용해서 5개의 점수를 입력받음
		for (int i = 0; i < ary.length; i++) {
			ary[i] = sc.nextInt();			
		}
		// 배열에 있는 모든 값의 합과 평균을 구하고
		int sum = 0;
		double avg = 0.0;
		for (int i = 0; i < ary.length; i++) {
			sum += ary[i];
		}
		avg = (double)sum / (double)ary.length;
		int min = ary[0], max = ary[0];
		// 배열에 있는 모든 값을 조사해서 가장 큰값을 찾고
		// 배열에 있는 모든 값을 조사해서 가장 작은값을 찾고
		for (int i = 1; i < ary.length; i++) {
			if(max < ary[i]) {
				max = ary[i];
			}
			if(min > ary[i]) {
				min = ary[i];
			}
		}
		// 총점 평균 최대 최소 출력
		System.out.printf("%d %f %d %d\n",sum,avg,max,min);
		

	}

}
