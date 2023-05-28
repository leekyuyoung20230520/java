package 조건문;

import java.util.Scanner;

public class Sample02 {

	public static void main(String[] args) {
//		비만도 계산 방법...BMI지수= 몸무게(kg) ÷ (신장(m) × 신장(m))
		// 키보드로 부터 입력받기 위해서는 Scanner 객체가 필요하다.
		// Scanner 객체 는 Scanner를 타입으로 하는 변수를 말한다.
		// 해당 변수는 기본타입이 아니기때문에 앞으로는 이러한 변수를 객체라고 부른다
		// 그리고 Scanner는 클래스이다.
		// 다시 정리하면 [  클래스 변수  ] 이렇게 코딩하는걸 객체 선언이라고 한다.
		// 객체 만드는 방법은 다음과 같다
		// 클래스명 객체명 = new 클래스명( 적절한 값 );
		
		Scanner s = new Scanner(System.in);  // 한번만 만들어 주면 됨
		
		System.out.println("input your weight(kg) : ");
		int weight = s.nextInt();						// 매 입력할때마다 실행해야 하는 명령어
		System.out.println("input your height(cm) : ");
		double height = s.nextDouble();						// 매 입력할때마다 실행해야 하는 명령어
		
		double bmi = weight / (height * height);
		
		// bmi지수가 25.0 보다크면 비만입니다. 그래서 해당조건을 만족할때 아래 문장을 출력하도록 고치세요
		System.out.println("bmi : " + bmi);
		if(bmi >=25.0) {
			System.out.println("비만"); // 비만입니다.
		}else if(bmi >=23) 
		{
			System.out.println("과체중");
		}else if(bmi >=18.5) 
		{
			System.out.println("정상");
		}else {
			System.out.println("저체중");
		}
		
		
		System.out.println("program terminated......");

	}

}
