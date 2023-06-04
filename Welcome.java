import java.util.Scanner;

public class Welcome {
	// 프로그램 정보를 디스플레이 하는 함수
	public static void displayIntro() {
		System.out.println("***********************************************");
		System.out.println("******* Welcome to Shopping Mall **************");
		System.out.println("******* Welcome to Book Market  ***************");
	}
	// 메뉴정보를 디스플레이 하는 메소드 만들기 : 
	public static void displayMenu() {
		System.out.println("***********************************************");
		System.out.println("1.고객정보 확인하기\t\t4. 장바구니에 항목 추가하기");
		System.out.println("2.장바구니 상품 목록 보기\t5. 장바구니에 항목 수량 줄이기");
		System.out.println("3.장바구니 비우기\t\t6. 장바구니 항목 삭제하기");
		System.out.println("7.영수증 표시하기\t\t8. 종료");
		System.out.println("***********************************************");
	}
	// 1.고객정보 확인하기
	public static void menuGuestInfo(String name, String phone) {
		System.out.println("현재 고객정보 : ");
		System.out.printf("이름 %s		연락처 %s\n",name,phone);
	}
	// 2.장바구니 상품 목록 보기
	public static void menuCartItemList() {} 
	// 3.장바구니 비우기
	public static void menuCartClear() {}
	// 4. 장바구니에 항목 추가하기
	public static void menuCartAddItem() {}
	// 5. 장바구니에 항목 수량 줄이기
	public static void menuCartRemoveItemCount() {}
	// 6. 장바구니 항목 삭제하기
	public static void menuCartRemoveItem() {}
	// 7.영수증 표시하기
	public static void menuCartBill() {}
	// 8. 종료
	public static void menuExit() {
		System.out.println("이용해 주셔서 감사합니다.");
		return;
	}
	// 사용자 입력을 처리하는 함수
	public static String getData(String str) {
		System.out.println(str);
		Scanner sc = new Scanner(System.in);
		String data = sc.next();
		return data;
	}
	
	public static void main(String[] args) {		
		String name = getData("이름을 입력하세요");
		String phone = getData("전화번호를 입력하세요");
		
		
		displayIntro(); // 프로그램 정보 출력
		while(true) {			
			displayMenu(); // 메뉴출력			
			int choiceMenu = Integer.valueOf( getData("메뉴 번호를 선택 해 주세요") );
			switch (choiceMenu) {
			case 1:			
				menuGuestInfo(name,phone);
				break;
			case 2:			
				menuCartItemList();
				break;
			case 3:		
				menuCartClear();
				break;
			case 4:			
				menuCartAddItem();
				break;
			case 5:			
				menuCartRemoveItemCount();
				break;
			case 6:			
				menuCartRemoveItem();
				break;
			case 7:		
				menuCartBill();
				break;
			case 8:
				menuExit();				
				return;				
			default:
				break;
			} // end switch	
		} // end while		
	} // end main

} // end class
