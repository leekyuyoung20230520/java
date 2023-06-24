package 상속;

public abstract class Animall {
	private String name;
	public int a;
	int b;
	protected int c;	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void sleep();
	
}
