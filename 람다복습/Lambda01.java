package 람다복습;

interface calculator{
	int calc(int x,int y);
}
class Sample implements calculator{
	@Override
	public int calc(int x, int y) {		
		return x+y;
	}	
}
class Sample2 implements calculator{
	@Override
	public int calc(int x, int y) {		
		return x-y;
	}	
}
public class Lambda01 {

	public static void main(String[] args) {
		// 값 두개 전달받아서 더하는 기능
		calculator calc = new calculator() {			
			@Override
			public int calc(int x, int y) {				
				return x+y;
			}
		};	
		calc.calc(0, 0);
		calc = new calculator() {
			
			@Override
			public int calc(int x, int y) {				
				return x*y;
			}
		};
		calc.calc(0, 0);
		
		calc = (int x, int y) -> {				
			return x+y;
		};
		
		calc = (x,y)->x+y;  // 클래스안의 함수를 구현한 클래스 객체		
		
	}

}
