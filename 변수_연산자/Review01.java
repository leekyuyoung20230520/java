package 변수_연산자;

public class Review01 {

	public static void main(String[] args) {
		// 변수  각각 두개 씩
		// 1. 정수형 변수 만들고 적당한 값으로 초기화  
		int num1 = 0, num2 = 0;
		// 2. 실수형 변수 만들고 적당한 값으로 초기화
		double dnum1=0.0, dnum2 = 0.0;
		// 3. 문자열 변수 만들고 적당한 값으로 초기화
		String str1 = "", str2="";
		
		// 연산자
		// 1. 정수형 변수들끼리 연산하기 (+ - * / %  ++  -- )
		num1 = 5; num2 = 2;
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.printf("%d / %d = %d\n", num1,num2, num1 / num2);	
		System.out.printf("%d / %d = %f\n", num1,num2, (double)num1 / (double)num2);
		System.out.printf("%d / %d = %.2f\n", num1,num2, (double)num1 / (double)num2);
		System.out.printf("변수 str1에 있는 값은 %s 이고 변수 str2에 있는 값은 %s 입니다.\n",str1, "임의의 값" );
		
		// 2. 비교 또는 복합 대입연산자  ( > < >= <= == != += -= /= *= %=)
		System.out.printf("%d > %d = %b\n", num1 , num2, num1 > num2);

	}

}
