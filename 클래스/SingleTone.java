package 클래스;
/*
 * 싱글톤 디자인 패턴
 */
public class SingleTone {
	
	private static SingleTone instance = null;
	private SingleTone() {}  // 생성자를 사용 못하게.. 즉 객체생성 못하게 
	
	public static SingleTone getInstance() {
		if(instance == null) {
			instance =  new SingleTone();
		}
		return instance;
	}
	
	public int data1;
	public int data2;
	/*
	 * @Override public String toString() { return "SingleTone [data1=" + data1 +
	 * ", data2=" + data2 + "]"; }
	 */
	

}
