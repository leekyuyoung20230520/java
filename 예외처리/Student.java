package 예외처리;

public class Student {
	private int score;  // 0 ~ 100 사이의 값을 갖는다
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) throws BedName {
		// 이름중에 특정 단어가 들어가면 예외발생(금지)	
		if(name.isBlank())
			throw new BedName("공백은 허용하지 않습니다.");
		
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) throws Exception {
		if(score>100 || score < 0)
			throw new IllegalArgumentException("out of range 0 to 100");
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [score=" + score + "]";
	}
	
		
}
