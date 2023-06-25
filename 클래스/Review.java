package 클래스;

public class Review {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		Product p = new Product();
		p.setName("a"); p.setPrice(0); p.setQuantity(0);
		
		Product p2 = new Product();
		p2.setName("a"); p2.setPrice(0); p2.setQuantity(0);
		
		
		if (a == b ) {
			System.out.println("same a and b");
		}		
				
		if(p == p2) {
			System.out.println("001: same p and p2");
		}
		
		if(p.equals(p2)) {
			System.out.println("002: same p and p2");
		}		

	}

}
