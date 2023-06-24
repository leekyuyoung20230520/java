package 다형성;

public class Demo {

	public static void main(String[] args) {
		// People에서 상속받은 각각의 클래스의 객체를 생성
//		Adult adult = new Adult();		
//		Teanager teanager = new Teanager();
//		Child child = new Child();
//		adult.WhoAmI();
		
		People people = new Child();
		People[] peopleArray = {new Child(), 
				new Teanager(),
				new Adult(),				
				};
		
		if (people instanceof Adult) {			
			System.out.println("ok");
		}
		for (int i = 0; i < peopleArray.length; i++) {
			if(peopleArray[i] instanceof Child) {
				Child temp = (Child)peopleArray[i];
				temp.WhoAmI();
			}
			else if(peopleArray[i] instanceof Adult) {
				Adult temp = (Adult)peopleArray[i];
				temp.WhoAmI();
			}
			else if(peopleArray[i] instanceof Adult) {
				Teanager temp = (Teanager)peopleArray[i];
				temp.WhoAmI();
			}			
			
		}
		
		
		
		
		

	}

}
