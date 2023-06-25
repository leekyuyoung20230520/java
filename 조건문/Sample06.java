package 조건문;
import java.util.Scanner;
public class Sample06 {
	public static void main(String[] args) {
		System.out.println("등급을 A~F까지 입력하세요 : ");
		Scanner s = new Scanner(System.in);
		String grade = s.next(); // 키보드 값 그대로 입력
		switch (grade) {
		case "A":
//			System.out.println("매우 우수");			
//			break;
		case "B":
//			System.out.println("우수");
//			break;
		case "C":
//			System.out.println("좋음");
			System.out.println("잘했어요.");
			break;
		default:
			System.out.println("노력이 필요함");
			break;
		}
	}
}
