package 상속;
/*
 * 클래스를 만들때는
 * 캡슐화 - getter/setter
 * 생성자 - 기본생성자는 반드시 제공 추천 
 * protected - 상속에서만 사용하도록 설정되는 변수들(주의점은 같은 패키지에서는 사용)
 */


public class Cat extends Animall{
	//　생성자
	public Cat(int a, int b, int c) {		
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public Cat() {}
	
	@Override
	public void sleep() {
		System.out.println("z");		
	}


	@Override
	public String toString() {
		return "Cat [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	

}
