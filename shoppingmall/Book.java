package shoppingmall;

import java.util.Objects;

public class Book {	
	private String bookID;
	private String title;
	private int price;
	private String auth; // 저자
	private String summaryCommant;
	private String bookType; // 종류
	private String publicDate; // 날자
	
	public Book(String bookID, String title, int price) {
		this.bookID = bookID;
		this.title = title;
		this.price = price;
	}
	
	public Book(String bookID, String title, int price, String auth, String summaryCommant, String bookType,
			String publicDate) {		
		this.bookID = bookID;
		this.title = title;
		this.price = price;
		this.auth = auth;
		this.summaryCommant = summaryCommant;
		this.bookType = bookType;
		this.publicDate = publicDate;
	}

	public String getBookID() {
		return bookID;
	}

	public void setBookID(String bookID) {
		this.bookID = bookID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getAuth() {
		return auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}

	public String getSummaryCommant() {
		return summaryCommant;
	}

	public void setSummaryCommant(String summaryCommant) {
		this.summaryCommant = summaryCommant;
	}

	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	public String getPublicDate() {
		return publicDate;
	}

	public void setPublicDate(String publicDate) {
		this.publicDate = publicDate;
	}

	@Override
	public String toString() {
		return "Book [bookID=" + bookID + ", title=" + title + ", price=" + price + ", auth=" + auth
				+ ", summaryCommant=" + summaryCommant + ", bookType=" + bookType + ", publicDate=" + publicDate + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(auth, bookID, bookType, price, publicDate, summaryCommant, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(auth, other.auth) && Objects.equals(bookID, other.bookID)
				&& Objects.equals(bookType, other.bookType) && price == other.price
				&& Objects.equals(publicDate, other.publicDate) && Objects.equals(summaryCommant, other.summaryCommant)
				&& Objects.equals(title, other.title);
	}
	
	
	
}
