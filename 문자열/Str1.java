package 문자열;

public class Str1 {

	public static void main(String[] args) {
		String str = "a";
		String str2 = "a";
		System.out.println(str == str2);
		
		String str3 = new String("a");
		String str4 = new String("a");
		System.out.println(str3 == str4);		

	}

}
