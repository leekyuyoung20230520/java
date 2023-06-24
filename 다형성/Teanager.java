package 다형성;

public class Teanager extends People{
	public void WhoAmI() {
		System.out.println("Teanager");
	}

	@Override
	public int getPrice() {
		return (int) (this.PRICE*0.6);
	}
}
