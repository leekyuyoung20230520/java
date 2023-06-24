package 다형성;

public class Demo2 {
	public static void main(String[] args) {
//		People p = new People();
//		p.WhoAmI();
//		
//		p = new Adult();
//		p.WhoAmI();
//		
//		p = new Teanager();
//		p.WhoAmI();
//		
//		p = new Child();
//		p.WhoAmI();				
		
		People[] p = {
				new Child(),new Child(),
				new Adult(),new Teanager()
		};
		
		for (int i = 0; i < p.length; i++) {
			p[i].WhoAmI();
		}

	}

}
