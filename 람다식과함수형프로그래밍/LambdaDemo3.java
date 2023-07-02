package 람다식과함수형프로그래밍;
/*
 * 1.인터페이스에서 정의한 메소드를 사용하려면
 * 2.인터페이스를 상속받아서 구현 한 클래스
 * 3.클래스를 이용해서 객체화
 * 
 * 4. 익명 클래스
 * 5. 구현된 메소드
 * 
 * 6.람드
 */

interface Negative2{
	int neg(int x);
}

interface Printable{
	void print();
}

public class LambdaDemo3 {

	public static void main(String[] args) {
		Negative2 n =  (int x) -> {return -x;} ;
		n = (x) -> {return -x;};
		n = x -> {return -x;};
		n = (int x)-> -x;
		n = (x) -> -x;
		n = x -> -x;
		
		// n은 객체
		System.out.println(n.neg(10));
		
		Printable p = () -> System.out.println("hello");
		p.print();

	}

}
