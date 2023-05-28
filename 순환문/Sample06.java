package 순환문;

public class Sample06 {

	public static void main(String[] args) {
		// 1+2+3+.... 이 합들이 1000을 넘지않으려면 몇까지 더해야 하나?
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			sum += i;
			if(sum > 1000) {
				System.out.println(i-1);
				System.out.println(sum - i);
				break;
			}
		}
//		System.out.println(sum);
	}

}
