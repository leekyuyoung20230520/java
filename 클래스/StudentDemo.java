package 클래스;

public class StudentDemo {

	public static void main(String[] args) {
		// 3명의 학생
		// Student 객체 3개를 만든다
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		// 각 학생들의 과목점수 셋팅
		s1.setKor(90);s1.setEng(95);s1.setMath(93);
		s2.setKor(80);s2.setEng(85);s2.setMath(83);
		s3.setKor(70);s3.setEng(75);s3.setMath(73);
		
		// 각 학생들의 총점 계산
		s1.setTotal();s2.setTotal();s3.setTotal();
		// 각 학생들의 평균 계산
		s1.setAvg();s2.setAvg();s3.setAvg();
		// 각 학생들의 성적 출력(총점, 평균)
		System.out.println("s1 : "+s1.getTotal() + " " + s1.getAvg());
		System.out.println("s2 : "+s2.getTotal() + " " + s2.getAvg());
		System.out.println("s3 : "+s3.getTotal() + " " + s3.getAvg());
		
		

	}

}
