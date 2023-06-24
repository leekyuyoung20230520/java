package 다형성;

public class Enterance {
	private People[] enters = new People[100];
	private int index = 0;
	public long getTotalPrice() {
		long result = 0;
		for (int i = 0; i < index; i++) {
			result += enters[i].getPrice();
		}
		return result;
	}
	public int getTotalEnters() {
		return index;
	}
	public void checkAge(int age) {
		if(index == enters.length)
			return;
		if (age >= 20)
			enters[index++]= new Adult();
		else if(age >= 14)
			enters[index++]= new Teanager();
		else if(age >= 8)
			enters[index++]= new Child();
		else
			enters[index++]= new Baby();					
	}
}
