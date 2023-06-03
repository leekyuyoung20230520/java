package 순환문;
/*
 * 중첩 순환문
 */
public class While05 {
	public static void main(String[] args) {
		// 아래 출력결과를 눈으로 확인 해 보고ㄱ
		// 우리가 알고있는 구구단으로 표현해 보기
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d x %d = %d\n",i,j, i*j);
			}
		}
		System.out.println("**********************************************");
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d x %d = %d\t",i,j, i*j);
			}
			System.out.println();
		}
		System.out.println("**********************************************");
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.printf("%d x %d = %d\t",j,i, i*j);				
			}
			System.out.println();
		}
	}

}
