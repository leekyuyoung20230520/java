package 람다식과함수형프로그래밍;

interface Negative{
	int neg(int x);
}

public class LambdaDemo2 {
	public static void main(String[] args) {
		Negative n;		
//		n = new Negative() {			
//			@Override
//			public int neg(int x) {				
//				return -x;
//			}
//		};
//		n.neg(10);
		
		n = (int x) -> {return -x ;};
		System.out.println(n.neg(10));
		
		
	}

}
