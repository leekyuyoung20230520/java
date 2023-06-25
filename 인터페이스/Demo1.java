package 인터페이스;
/*
 * 완전 추상화 클래스
 * 	맴버메소드들이 일반 메소드는 없고 전부 추상 메소드 들만 존재할때
 */
public class Demo1 {
	public static void paint(Drawable d) {
		d.paint();
	}	
	
	public static void main(String[] args) {
		paint(new Scatch());
		paint(new Draw());
		
	}
}
