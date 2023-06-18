package shoppingmall;

import java.util.Objects;

public class Person {
	private String name;
	private String phone;
	private String address;
	
	
	public Person(String name, String phone) {		
		this.name = name;
		this.phone = phone;		
	}
	
	public Person(String name, String phone, String address) {		
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", phone=" + phone + ", address=" + address + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, name, phone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(address, other.address) && Objects.equals(name, other.name)
				&& Objects.equals(phone, other.phone);
	}
	
	
	
}
