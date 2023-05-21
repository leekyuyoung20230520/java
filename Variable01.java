package test;


public class Variable01 {
	static int instance_number = 0; // 인스턴스 변수(글로벌 변수)
	
	
	public static void main(String[] args) {		
		int local_number = 0; // 지역 변수
		int static_number = 0;
		System.out.println(instance_number);
		
	}
	
	public static void main2() {
		System.out.println(instance_number);
	}
	

}
