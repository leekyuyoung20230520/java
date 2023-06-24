package 다형성;

public class Baby extends People{

	@Override
	public void WhoAmI() {		
		System.out.println("Baby");
	}

	@Override
	public int getPrice() {		
		return 0;
	}

}
