package 배열;

public class Array04 {

	public static void main(String[] args) {
		// 1차원 배열 만들고 적당한 값을 넣어서 내용 확인하기
		int temp = 0; // 정수형 변수
		
		int[] ary; // 배열 변수
		ary = new int[3];
		System.out.println(ary);
		System.out.println(ary[0]);
		
		ary[0] = 10; ary[1] = 20; ary[2] = 30;
//		ary[3] = 40;  // error
		// 배열의 마지막 요소는 배열의 길이 -1
		System.out.println("last index = " + (ary.length - 1) );
		
		// 배열에 있는 값을 전부 출력
		for (int i = 0; i < ary.length; i++) {
			System.out.println(ary[i]);
		}
		
	}

}
