package 클래스;

public class CatDemo {

	public static void main(String[] args) {
//		int a;
//		System.out.println(a);
		
		Cat c = new Cat();	
		c.setBreed("ABC");
		if(c != null) {
			System.out.println( c.getBreed() );	
		}
	}
}
