package 다형성;

public class Child extends People{
	public void WhoAmI() {
		System.out.println("Child");
	}

	@Override
	public int getPrice() {		
		return (int) (this.PRICE * 0.1);
	}
}
