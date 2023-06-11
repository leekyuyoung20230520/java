package 클래스;

public class StudentDemo2 {

	public static void main(String[] args) {
		// 3명의 학생
		// Student 객체 3개를 만든다
//		Student s1 = new Student();
//		Student s2 = new Student();
//		Student s3 = new Student();
		
//		Student[] s = new Student[3];
//		s[0] = new Student();
//		s[1] = new Student();
//		s[2] = new Student();		
		Student[] s = {
				new Student(),
				new Student(),
				new Student()
		};			
		// 각 학생들의 과목점수 셋팅
		s[0].setKor(90);s[0].setEng(95);s[0].setMath(93);
		s[1].setKor(80);s[1].setEng(85);s[1].setMath(83);
		s[2].setKor(70);s[2].setEng(75);s[2].setMath(73);
		
		// 각 학생들의 총점 계산
		s[0].setTotal();s[1].setTotal();s[2].setTotal();
		// 각 학생들의 평균 계산
		s[0].setAvg();s[1].setAvg();s[2].setAvg();
		// 각 학생들의 성적 출력(총점, 평균)
		System.out.println("s1 : "+s[0].getTotal() + " " + s[0].getAvg());
		System.out.println("s2 : "+s[1].getTotal() + " " + s[1].getAvg());
		System.out.println("s3 : "+s[2].getTotal() + " " + s[2].getAvg());
		
		

	}

}
