package shoppingmall;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		int[] itemBook = {1,2,3,4,5};
		int[] newItemBook = new int[(int) (itemBook.length*1.5)];
		
		System.out.println( Arrays.toString(itemBook) );
		
		
		for (int i = 0; i < itemBook.length; i++) {
			newItemBook[i] = itemBook[i];
		}
		
		itemBook = newItemBook;
		System.out.println( Arrays.toString(itemBook) );
		

	}

}
