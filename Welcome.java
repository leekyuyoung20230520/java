import java.util.Scanner;

public class Welcome {
	public static final int NUM_BOOK = 3;
	public static final int NUM_ITEM = 7;
	public static String[][] booklist = new String[3][7];
	// 기본 책 정보를 생성하는 메소드
	public static void bookList(String[][] book) {
		
		book[0][0] = "ISBN1234";book[0][1] = "제목1";book[0][2] = "27000";
		book[0][3] = "저자1";book[0][4] = "요약내용1";book[0][5] = "IT서적";
		book[0][6] = "2023/05/02";
		
		book[1][0] = "ISBN1235";book[1][1] = "제목2";book[1][2] = "27000";
		book[1][3] = "저자1";book[1][4] = "요약내용2";book[1][5] = "IT서적";
		book[1][6] = "2023/05/02";
		
		book[2][0] = "ISBN1236";book[2][1] = "제목3";book[2][2] = "27000";
		book[2][3] = "저자1";book[2][4] = "요약내용3";book[2][5] = "IT서적";
		book[2][6] = "2023/05/02";		
	}
	
	// 프로그램 정보를 디스플레이 하는 메소드
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
		System.out.printf("이름 %s		연락처 %s\n", name, phone);
	}

	// 2.장바구니 상품 목록 보기
	public static void menuCartItemList() {
	}

	// 3.장바구니 비우기
	public static void menuCartClear() {
	}

	// 도서목록 출력
	public static void displayBooks() {
		for (int i = 0; i < booklist.length; i++) {
			for (int j = 0; j < booklist[0].length; j++) { // 구성요소인 1차원 배열의 개수
				System.out.print(booklist[i][j] + " | ");
			}
			System.out.println();
		}	
	}
	//  장바구니에 item 추가하기
	public static void cartAddItem() {
		while(true) {
			System.out.println("장바구니에 추가할 도서의 ID를 입력하세요");
			Scanner sc = new Scanner(System.in);
			String id = sc.nextLine();			
			// 찾기
			int numId = -1;  // 2차원배열에서 주어진 id로 찾은 배열의 인덱스(행,row)		
			for (int i = 0; i < booklist.length; i++) {
				if (booklist[i][0].equals(id) ) {
					numId = i;				
				}
			}
			// 장바구니에 도서 추가
			if( numId != -1  ) 
			{
				System.out.println("장바구니에 추가 하시겠습니까? Y | N");
				String yesNo = sc.nextLine();
				if(yesNo.toUpperCase().equals("Y")) {
					System.out.println(booklist[numId][0] + " 도서가 장바구니에 추가되었습니다.");					
				}
				break;
			}else {
				System.out.println("잘못 입력했습니다.계속 하시겠습니까? Y | N");
				String yesNo = sc.nextLine();
				if(!yesNo.toUpperCase().equals("Y")) {
					break;
				}				
			}
		}
	}
	// 4. 장바구니에 항목 추가하기
	public static void menuCartAddItem() {
		// 도서 생성 및 저장
		bookList(booklist);
		// booklist 메소드에 의해서 생성된 booklist 2차원 배열을 출력
//		booklist.length  --> 2차원 배열의 개수(행,row)
		// 도서목록 출력
		displayBooks();	
		// 도서id 입력, 장바구니에 아이템 추가하기
		cartAddItem();
		
	}

	// 5. 장바구니에 항목 수량 줄이기
	public static void menuCartRemoveItemCount() {
	}

	// 6. 장바구니 항목 삭제하기
	public static void menuCartRemoveItem() {
	}

	// 7.영수증 표시하기
	public static void menuCartBill() {
	}

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
		while (true) {
			displayMenu(); // 메뉴출력
			int choiceMenu = Integer.valueOf(getData("메뉴 번호를 선택 해 주세요"));
			switch (choiceMenu) {
			case 1:
				menuGuestInfo(name, phone);
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
