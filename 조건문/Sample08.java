package 조건문;

public class Sample08 {

	public static void main(String[] args) {
		// 거스름돈 문제
		// 상점에서 물건을 구매했는데.. 13,000원
		// 소비자가 20,000을 지불했음
		// 이때 거스름돈은 얼마? 7,000원  5000원 1장과 1000원 2장이 필요		
		int product = 13000;
		int payMoney = 20000;
		int diff = payMoney - product;  // 7000
		int change5000 = 0, change1000 = 0;
		
		// 7000원을 5000으로 나눈다.. 이때 몫은  change5000 저장하고
		// 만약에 나머지가 있으면 나머지 값을 구해서
		// 해당 나머지 값을 1000으로 나눈다. 이때 몫은 change1000 에 저장한다.
		change5000 = diff / 5000;
		change1000 =  (diff % 5000) / 1000;
		System.out.printf("5000 : %d,  1000 : %d\n",change5000,change1000 );
		
		if(diff % 5000 != 0) { // 5000원으로 나눴을때 나머지(잔돈)이 있다면
			change5000 = diff / 5000; 
			int diffrent = diff % 5000;
			if(diffrent % 1000 != 0) { // 1000원으로 나눴을대 잔돈이 있다면				 
				diffrent = diffrent % 1000; 
				change1000 = diffrent / 1000; 
			}
		}
	}

}
