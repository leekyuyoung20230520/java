package 상속;
// IS-A 관계   	개는 동물이다.
// IS-HAS 관계 	개는 품종을 포함한다.
public class Demo {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.setName("aaa");
		System.out.println(d.getName());
		d.sleep();
		
		Cat c = new Cat(1, 2, 3);
		System.out.println(c.toString());
		System.out.println(c);
	}

}
