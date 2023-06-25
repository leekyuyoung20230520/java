package 인터페이스;

import 상속.Cat;

public class Draw extends Parents implements Drawable, Paintable{

	@Override
	public void test() {		
		int a = Drawable.number;
		int b = Paintable.number;
		// TODO Auto-generated method stub		
	}
	@Override
	public void makeColor() {
		// TODO Auto-generated method stub		
	}
	@Override
	public void paint() {
		// TODO Auto-generated method stub		
	}
}
