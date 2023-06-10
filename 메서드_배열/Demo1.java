package 매서드_배열;

public class Demo1 {

	// 배열을 전달받는다
	public static void method01(int[] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// 정수형 1차원 배열 만들어서 함수에 전달하기
//		int[] ary = {1,2,3,4,5,6,7,8,9,10};
//		method01(ary);
		int[][] ary2 = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15}
		};
		/*
		 * 1 2 3 4 5
		 * 6 7 8 9 10
		 * 11 12 13 14 15
		 */		
		for (int i = 0; i < ary2.length; i++) {
			method01(ary2[i]);
		}
		

	}

}
