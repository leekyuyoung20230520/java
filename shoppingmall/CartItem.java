package shoppingmall;

import java.util.Arrays;
import java.util.Objects;

public class CartItem {

	private final int DEFAULT_BOOK_COUNT = 10;
	private Book[] itemBook = new Book[DEFAULT_BOOK_COUNT];
	private int totalPrice;
	private int quantity;	
	
	
	public void displayItems() {
		for (int i = 0; i < itemBook.length; i++) {
			if(itemBook[i]!=null) {
				System.out.println(itemBook[i]);
			}
		}
	}
	
	/*
	 * 장바구니 추가
	 * 1. 배열이 꽉 차이 있염 오류를 발생하고 중지한다
	 * 2. 배열을 순환하면서 null을 찾아서 해당 위치에 추가한다	
	 * 3. 수량과 가격을 업데이트 한다
	 * 4. 숙제..... 장바구니가 찾을때.. 장바구니를 늘려보자? 장바구니 업데이트  
	 */
	public void addItem(Book book) {
		if(itemBook.length == quantity) {
			System.out.println("full cart");
			return;
		}				
		for (int i = 0; i < itemBook.length; i++) {
			if(itemBook[i] == null) {
				itemBook[i] = book;
				totalPrice += book.getPrice();
				quantity++;
				break;
			}
		}		
	}
	private Book findBookByID(String id) {
		return null;
	}
	/*
	 * 카트에서 상품제거
	 * 1. 카트에서 상품아이디에 해당하는 book 객체를 찾아서
	 * 카트에서 제거한다 제거의 의미로 배열의 해당 인덱스의 값을 null로 변경한다.
	 * 2. 수량과 가격을 업데이트 한다.
	 */
	public boolean removeItem(String bookId) {
		boolean isSuccess = false;
		for (int i = 0; i < itemBook.length; i++) {
			if(itemBook[i].getBookID().equals(bookId) ) {
				quantity--;
				totalPrice -= itemBook[i].getPrice(); 
				itemBook[i] = null;				
				isSuccess=true;
				break;
			}
		}
		return isSuccess;
	}
	
	public int getTotalPrice() {
		return totalPrice;
	}
	

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Book[] getItemBook() {
		return itemBook;
	}

	@Override
	public String toString() {
		return "CartItem [DEFAULT_BOOK_COUNT=" + DEFAULT_BOOK_COUNT + ", itemBook=" + Arrays.toString(itemBook)
				+ ", totalPrice=" + totalPrice + ", quantity=" + quantity + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(itemBook);
		result = prime * result + Objects.hash(quantity, totalPrice);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CartItem other = (CartItem) obj;
		return Arrays.equals(itemBook, other.itemBook) && quantity == other.quantity && totalPrice == other.totalPrice;
	}
	
	
	
}
