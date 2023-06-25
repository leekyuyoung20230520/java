package 예외처리;

public class Demo2 {

	public static void main(String[] args) {
		// 문자열로 된 숫자를 정수로 변경
		String strNumber = "123";
		int number = Integer.valueOf(strNumber);
		
		// 숫자로 변경해서 각각 5를 곱해서 출력한다.
		String[] strNumbers = {"123","22","600-","22","125"};
		for (int i = 0; i < strNumbers.length; i++) {			
			try {
				System.out.print(Integer.valueOf(strNumbers[i])*5);
				
			} catch (NumberFormatException e) {				
				System.out.print("exception : " +  e.getMessage() );
			}finally {
				System.out.println(" "+i + " ,이문장은 언제 실행될까요? ");
				
			}
		}
		
		
		System.out.println("간혹 예외가 발생할수 있어도 이부분은 실행되어야 함");
		

	}

}
