package 순환문;

public class Return {

	public static void main(String[] args) {
		int number = 10;
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		for (int i = 0; i < 10; i++) {
			if(i == 5) {
//				break;
				return;
			}
			System.out.println(i);
		}
		System.out.println(4);
		System.out.println(5);
		if(number == 10) {
			return;			
		}
		
		System.out.println(6);
	}
}
