package 클래스;

import java.util.Objects;

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
	
	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
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

	@Override
	public int hashCode() {
		return Objects.hash(name, price, quantity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(name, other.name) && price == other.price && quantity == other.quantity;
	}		
	
	// overload
//	public boolean equals(Product obj) {
//			Product target = (Product)obj;
//			
//			return name.equals(target.getName()) 
//					&& price == target.getPrice() 
//					&& quantity == target.getQuantity();			
//			
//		}
	

}
