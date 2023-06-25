package 예외처리;

public class Demo3 {

	public static void main(String[] args) {
		Student s = new Student();
		try {
			s.setScore(10);
			s.setName("");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
