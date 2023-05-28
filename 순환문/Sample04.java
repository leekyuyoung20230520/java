package 순환문;

public class Sample04 {

	public static void main(String[] args) {
		// 순환문에서 break
		for (int i = 0; i < 10; i++) {
			if(i == 5) {
				System.out.println("Escape....");
				break;
			}			
			System.out.print(i + " ");
		}
		System.out.println("--------------------------------------");
		// 순환문에서 continue
		for (int i = 0; i < 10; i++) {
			if(i == 5) {
				System.out.println("Continue....");
				continue;
			}			
			System.out.print(i + " ");
		}
	}

}
