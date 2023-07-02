package 람다식과함수형프로그래밍;

import java.util.Arrays;

class Rectangle implements Comparable<Rectangle>{
	private int width,height;	
	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	public int findArea() {
		return width*height;
	}
	
	@Override
	public int compareTo(Rectangle o) {		
		return findArea()-o.findArea();
	}
	
}

public class ComparableDemo {
	// 정렬 기준이 변경되면?
	public static void main(String[] args) {
		Rectangle[] rectangle = {new Rectangle(3, 5),
				new Rectangle(2, 10), new Rectangle(5, 5)				
		};
		Arrays.sort(rectangle);
		for (Rectangle r : rectangle) {
			System.out.print(r.findArea()+" ");
		}
		System.out.println();
		
//		Integer[] ary = {5,4,1,6,12,9};
//		Arrays.sort(ary);
//		for (Integer i : ary) {
//			System.out.print(i+" ");
//		}
//		System.out.println();

	}

}
