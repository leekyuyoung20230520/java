package shoppingmall;
import java.util.Scanner;

public class Welcome {
	// 회원가입 - Person 객체를 생성하는 과정
	//          생성된 회원정보를 배열에 저장
	// 로그인
	//       - 배열에 저장된 회원정보에서 인증
	// 기본적으로 3명의 회원이 있다고 가정하고 시작 - 회원생성하는 임시 메소드
	// 서점에 비치된 책(기본 5권)
	private PersonManager pm = new PersonManager();
	private Book[] books = new Book[100];
	private CartItem cartItem = new CartItem();
	
	private void init() {		
		for (int i = 0; i < 3; i++) {
			Person p = new Person("abc"+i, "010-111-222"+i);
			pm.signUp(p);
		}		
		for (int i = 0; i < 5; i++) {
			Book b = new Book("ISBN123"+i, "제목"+i, 27000, "저자"+i, "요약내용"+i, "IT서적", "20230618");
			books[i] = b;
		}
		
	}		
	// 프로그램 정보를 디스플레이 하는 메소드
	public void displayIntro() {
		System.out.println("***********************************************");
		System.out.println("******* Welcome to Shopping Mall **************");
		System.out.println("******* Welcome to Book Market  ***************");
	}
	// 메뉴정보를 디스플레이 하는 메소드 만들기 :
	public void displayMenu() {
		System.out.println("***********************************************");
		System.out.println("1.고객정보 확인하기\t\t4. 장바구니에 항목 추가하기");
		System.out.println("2.장바구니 상품 목록 보기\t5. 장바구니에 항목 수량 줄이기");
		System.out.println("3.장바구니 비우기\t\t6. 장바구니 항목 삭제하기");
		System.out.println("7.영수증 표시하기\t\t8. 종료");
		System.out.println("***********************************************");
	}

	// 1.고객정보 확인하기
	public Person menuGuestInfo(String name, String phone) {
		Person p = pm.login(new Person(name, phone));		
		if(p==null) {
			System.out.println("not find person... ");
			return null;
		}
		return p;
		
	}

	// 2.장바구니 상품 목록 보기
	public void menuCartItemList() {
		cartItem.displayItems();
	}

	// 3.장바구니 비우기
	public static void menuCartClear() {
	}

	// 도서목록 출력
	public static void displayBooks() {
		
	}
	//  장바구니에 item 추가하기
	public void cartAddItem() {
		boolean isfind = false;
		while(true) {			
			String id = getData("input book id");			
			for (int i = 0; i < books.length; i++) {
				if(books[i]!=null && id.equals(books[i].getBookID())) {
					cartItem.addItem(books[i]);
					isfind = true;
					break;
				}
			}
			if(!isfind) System.out.println("not find book!");
			
			String yesNo =  getData("add to cart? Y | N");
			if(!yesNo.toUpperCase().equals("Y")) {
				break;					
			}
		}
	}
	// 4. 장바구니에 항목 추가하기

	// 5. 장바구니에 항목 수량 줄이기	

	// 6. 장바구니 항목 삭제하기	

	// 7.영수증 표시하기	

	// 8. 종료
	public static void menuExit() {
		System.out.println("Thank you.");
		return;
	}

	// 사용자 입력을 처리하는 함수
	public static String getData(String str) {
		System.out.println(str);
		Scanner sc = new Scanner(System.in);
		String data = sc.nextLine();
		return data;
	}

	public static void main(String[] args) {
		Welcome welcome = new Welcome();
		welcome.init();
		welcome.displayIntro();		
		
		while (true) {
			welcome.displayMenu();			
			int choiceMenu = Integer.valueOf(getData("choice menu"));
			switch (choiceMenu) {
			case 1:
				String name = getData("input your name");
				String phone = getData("input your phoneNumber");
				Person p =  welcome.menuGuestInfo(name, phone);
				System.out.println("welcome to our shop " + p.getName());
				break;
			case 2:		
				welcome.menuCartItemList();
				break;
			case 3:				
				break;
			case 4:
				for (int i = 0; i < welcome.books.length; i++) {
					if(welcome.books[i] == null)
						break;
					System.out.println(welcome.books[i]);
				}
				welcome.cartAddItem();
				break;
			case 5:				
				break;
			case 6:				
				break;
			case 7:
				break;
			case 8:
				return;
			default:
				break;
			} // end switch
		} // end while

	} // end main

} // end class
