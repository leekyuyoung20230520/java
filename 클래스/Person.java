package 클래스;

public class Person {
	
	private int age, height, weight;
	
	
	
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void method() {
		method2();
	}
	private void method2() {
		System.out.println("very important");
	}
	public void setAge(int age) {
		if( age >0 && age <150) {
			this.age = age;
		}
	}
	public int getAge() {
		return age;
	}
	
	
}
