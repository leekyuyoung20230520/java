package 클래스;

public class StudentDemo3 {
	private static final int STUDENT_NUM = 3;
	
	public static Student[] createStudent(int studentNum) 
	{
		Student[] s = new Student[studentNum];
		for (int i = 0; i < studentNum; i++) {
			s[i] = new Student();
		}
		return s;
//		return new Student[studentNum];  // null point exception
	}	
	public static void setJumsu(Student s, int kor, int eng, int math) {
		s.setKor(kor);s.setEng(eng);s.setMath(math);
		s.setAvg();
	}	
	public static void displayStduentInfo(Student[] s) {
		for (int i = 0; i < s.length; i++) {
			System.out.println(i+1+ " : "+s[i].getTotal() + " " + s[i].getAvg());			
		}
		
	}	
	public static void main(String[] args) {		
		// 3명의 학생		
		Student[] s = createStudent(STUDENT_NUM);
		// 각 학생들의 과목점수 셋팅, 총점,평균 자동 계산
		setJumsu(s[0],90,95,93);
		setJumsu(s[1],80,85,83);
		setJumsu(s[2],70,75,73);			
		// 각 학생들의 성적 출력(총점, 평균)
		displayStduentInfo(s);
	}

}
