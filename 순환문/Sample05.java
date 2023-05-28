package 순환문;

public class Sample05 {

	public static void main(String[] args) {
		// 1 ~ 10 짝수만 출력  continue만 이용해서
		for (int i = 1; i <= 10; i++) {
			if(i % 2 !=0) {  // 홀수일때 continue 한다
				continue;		// 이 문장 아래부터는 실행안되고 for문 다음 사이클로 돌아간다
			}
			System.out.println(i); // for 항상실행되는 문장 
		}

	}

}
