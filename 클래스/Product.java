package 클래스;
/*
 * 상품명 name
 * 가격 price
 * 수량 quantity
 * 캡슐화
 */
public class Product {
	private int price;
	private String name;
	private int quantity;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {		
		this.price = price;		
	}

	@Override
	public String toString() {
		return "Product [price=" + price + ", name=" + name + ", quantity=" + quantity + "]";
	}		
	

}
