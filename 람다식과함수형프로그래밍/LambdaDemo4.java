package 람다식과함수형프로그래밍;

interface Mathmatical{
	double calculate(double d);
}
interface Pickable{
	char pick(String x, int i);
}

interface Computable{
	int compute(int x, int y);
}
class Utils{
	int add(int a, int b) {
		return a+ b;
	}
}
interface Applyable{
	boolean apply(Box a, Box b);
}

class Box{
	int no;
	public Box(int no) {
		this.no = no;
	}
	boolean isSame(Box b) {
		return this.no == b.no;
	}
}


public class LambdaDemo4 {

	public static void main(String[] args) {
		Mathmatical m;
		Pickable p;
		Computable c;
		
		// 기존 클래스의 static 메서드 참조
		Math.abs(-11);
		m =  Math::abs;
		System.out.println(m.calculate(-3.141579));
		// 람다식으로 직접 구현
		m = x-> x > 0? x:-x;
		System.out.println(m.calculate(-3.141579));
		
		// 기존 클래스의 static이 아닌 non-static 메소드를 참조		
		System.out.println("abc".charAt(0)); // a
		
		p = String::charAt;
		System.out.println(p.pick("abc", 0));
		
		Utils utils = new Utils();
		c = (a,b) -> a+b;
		c = (a,b) -> utils.add(a, b);
		c = utils::add;
		
		Box b1 = new Box(10);
		Box b2 = new Box(10);
		System.out.println(b1.isSame(b2));
		
		Applyable app = (a,b)->a.isSame(b);
		app.apply(new Box(10), new Box(10));
		app = Box::isSame;

	}

}
