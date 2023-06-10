package 배열_2차원;

// 두개의 2차원 배열의 합
public class Array03 {

	public static void main(String[] args) {
		int[][] ary_1 = {
				{10,2},{1,5},{5,7}
		};
		int[][] ary_2 = {
				{5,2},{3,5},{15,3}
		};
		
		int[][] ary_sum = new int[3][2];
		
		for (int i = 0; i <3 ; i++) {
			for (int j = 0; j <2 ; j++) {
				ary_sum[i][j] = ary_1[i][j] + ary_2[i][j];
			}
		}

	}

}
