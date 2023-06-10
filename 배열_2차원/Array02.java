package 배열_2차원;
/*
 * 2차원 배열 초기화
 */
public class Array02 {

	public static void main(String[] args) {
		// 1차원 배열 초기화를 통해 2차원 배열 초기화를 이해한다
		int[] ary = {
				1,2,3
				};
		
		int[][] ary_2dim = {
				{1,2,3},
				{4,5,6},				
		};
		// 2차원 배열의 모든 값의 합을 구해서 출력
		int sum = 0;
		// 먼저 1차원 배열의 합을 구하는 방법
		for (int i = 0; i < ary.length; i++) {
			sum += ary[i];
		}
		
		// 2차원 배열의  합을 구하는 방법  중첩for문
		int sum_2dim = 0;
		// 전체 2차원배열의 행의 갯수 만큼.. 즉 1차원 배열을 원소로하는 숫자만큼
		for (int i = 0; i < 2; i++) {
			// 아래 for문은 2차원 배열의 요소인 1차원 배열을 순환하는 for
			for (int j = 0; j < 3; j++) {
				sum_2dim += ary_2dim[i][j];
			}
		}

	}

}
