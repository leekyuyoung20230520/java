package 예외처리;

import java.util.StringTokenizer;

public class UnCheckedDemo {
	public static void exceptoinTest() {
		System.out.println("before try catch~~");
		try {
			System.out.println("in try statement~~");
//			return;
			throw new Exception();			
		} catch (Exception e) {
			System.out.println("in catch statement~~");
			return;
		}finally {
			System.out.println("in finally statement~~");
		}
//		System.out.println("after try catch~~");
	}
	

	public static void main(String[] args) {
		String s = "Time is money";
		StringTokenizer st = new StringTokenizer(s);
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
//		int[] array = {0,1,2};
//		System.out.println(array[3]);  // runtimeException  비검사형
		
		// Exception 상속  -검사형 예외
//		Thread.sleep(10000);
		
		try {
			
		} catch (ArrayIndexOutOfBoundsException | ClassCastException e) {
			// TODO: handle exception
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			// 예외 발생 여부에 관계없이 실행
		}
		
		exceptoinTest();
		
	}

}
