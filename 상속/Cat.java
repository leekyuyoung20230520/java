package 상속;

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
