package 클래스;
/*
 * 캡슐화 : private
 * 	- getter setter  : public
 */
public class Cat {

	private String breed;
	private String color;
	
	
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	void eat() {
		System.out.println("eating");
	}
	void scrach() {
		System.out.println("scraching");
	}
	void meow() {
		System.out.println("ya~oung");
	}
	@Override
	public String toString() {
		return "Cat [breed=" + breed + ", color=" + color + "]";
	}	
	
	
}
