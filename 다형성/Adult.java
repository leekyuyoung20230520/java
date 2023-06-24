package 다형성;

public class Adult extends People{
	public void WhoAmI() {
		System.out.println("Adult");
	}

	@Override
	public int getPrice() {		
		return this.PRICE;
	}
}
