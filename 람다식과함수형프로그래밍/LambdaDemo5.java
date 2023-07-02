package 람다식과함수형프로그래밍;
/*
 * 람다식 유의 사항
 * 람다식 외부에서 선언된 변수와 동일한 이름의 변수를 람다식에서 사용 못함
 * 람다식에 사용된 지역변수는 final
 * 람다식의 this키워드는 람다식을 실행한 외부 객체
 */

interface UseThis{
	void use();
}

public class LambdaDemo5 {
	public void lambda() {
		String hi = "Hi";
		UseThis u1 = new UseThis() {
			public void use() {
				String hi = "hello";
				System.out.println(hi);
			}			
		};
		u1.use();
		
		UseThis u2 = ()->{
//			String hi = "lambda hi";
			System.out.println(hi);
			};
		u2.use();
	}	

	public String toString() {
		return "UseThisDemo";
	}


	public static void main(String[] args) {		
		int one = 1;
		new LambdaDemo5().lambda();
		
		LambdaDemo5 temp = new LambdaDemo5();
		System.out.println(temp);

	}

}
