package 다형성;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Enterance enterance = new Enterance();
		boolean isNotFull = true;
		int count = 1;
		while (isNotFull) {
			System.out.print("input age : ");
			int age = Integer.valueOf(sc.nextLine());
			isNotFull = enterance.checkAge(age);
			if(count++ % 5 == 0) {
				System.out.println("is Continue?(y/Y) :");
				String isContinue = sc.nextLine().toUpperCase();
				if(!isContinue.equals("Y"))
					break;
			}			
		}
		// 정산
		DecimalFormat formatter = new DecimalFormat("#,###");
		String totalPrice = formatter.format(enterance.getTotalPrice());
		System.out.printf("총 수입 : %s원  입장객 수 : %d\n", 
				totalPrice,enterance.getTotalEnters());
	}

}
