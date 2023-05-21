
public class Welcome {

	public static void main(String[] args) {
		String greeting = "Welcome to Shoopping Mall";
		String greeting2 = "Welcome to Book Market";
		String menu1 = "1. 고객정보 확인하기";
		String menu2 = "2. 장바구니 상품 목록 보기";
		String menu3 = "3. 장바구니 비우기";
		String menu4 = "4. 장바구니에 항목 추가하기";
		String menu5 = "5. 장바구니에 항목 수량 줄이기";
		String menu6 = "6. 장바구니에 항목 삭제하기";
		String menu7 = "7. 영수증 표기하기";
		String menu8 = "8. 종료";
		
		System.out.println("************************************************************");
		System.out.println("\t\t"+greeting);
		System.out.println("\t\t"+greeting2);
		System.out.println("************************************************************");
		System.out.println(menu1 + "\t" + menu4+"\n");
		System.out.println(menu2 + "\t" + menu5+"\n");
		System.out.println(menu3 + "\t\t" + menu6+"\n");
		System.out.println(menu7 + "\t\t" + menu8+"\n");
		System.out.println("************************************************************");

	}

}
