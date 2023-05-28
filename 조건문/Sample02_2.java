package 조건문;

import java.util.Scanner;

public class Sample02_2 {

	public static void main(String[] args) {
//		비만도 계산 방법...BMI지수= 몸무게(kg) ÷ (신장(m) × 신장(m))
		// 사용자로부터 키를 입력받아서 정상일때의 몸무게의 범위를 찾아낸다.
		
		// B = W / (H*H)
		// (H*H)*B = W
		// W = (H*H)*B
		// B 18.5 ~ 23
		// MINW = (H*H)*18.5  최소값
		// MAXW = (H*H)*23  최대값
		//  MINW ~ MAXW		
		
		Scanner s = new Scanner(System.in);  // 한번만 만들어 주면 됨
		
		
		System.out.println("키를 단위에 주의해서 입력하세요(m) : ");
		double height = s.nextDouble();						// 매 입력할때마다 실행해야 하는 명령어
		
		double weightMin = 0.0, weightMax = 0.0;
		weightMin = (height*height)*18.5 ;
		weightMax = (height*height)*23 ;		
		System.out.printf("비만지수가 정상이려면 적절한 몸무게는 %.2f ~ %.2f 사이 입니다.\n",weightMin,weightMax);

	}

}
