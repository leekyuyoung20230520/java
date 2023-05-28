package 조건문;

import java.util.Scanner;

public class Sample01 {

	public static void main(String[] args) {
//		int number = 0;  // 여기서 number는 int 타입의 변수로.. 그냥 변수다.
//		String name = "kim";  // 사실 name은 String 타입의 객체
//		String name2 = new String("hong");
//		System.out.println(name);
//		System.out.println(name2);
		
		
		
		System.out.print("input your age : ");
		// 키보드로 부터 입력을 받기위해 Scanner라는 타입으로 변수를 생성하고 초기화 한다.
		// 기본타입으로 만드는 변수가 아닌 변수는 객체(object)라고 부른다
		// 여기서 input은 Scanner라는 클래스타입의 변수가 아니라.. 객체라고 한다
		Scanner input = new Scanner(System.in);
		// 콘솔에 입력하는 값들은 숫자여도 문자열로 인식한다.
		int age = input.nextInt(); //input.nextInt() 은 콘솔창에서 사용자 입력을 받아서 결과를 정수로 반환하는 명령어
		System.out.printf("input age : %d\n", age);
		
		// 조건문... 만약 나이가 20보다 크면 성인이다 라는 문장을 출력
		if(age > 20) {
			System.out.println("your age over 20.......");	
		}
		
		
		System.out.println("program terminate......");
		
		

	}

}
