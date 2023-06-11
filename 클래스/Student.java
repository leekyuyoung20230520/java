package 클래스;

public class Student {
	// 국어,영어,수학,평균,총점,학점
	private int kor,eng,math,total;
	private double avg;
	private String grade;
	// Shift+Alt+s -> Generate Getter and  Setter -> Select All -> Generate 버튼 클릭
	public int getKor() {		
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal() {
		this.total = kor + eng + math;
	}
	
	public double getAvg() {
		return avg;
	}
	
	public void setAvg() {
		setTotal();
		this.avg = total / 3.0;
	}
	
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
}
