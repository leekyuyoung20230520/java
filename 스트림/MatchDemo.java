package 스트림;

import java.util.stream.Stream;

public class MatchDemo {

	public static void main(String[] args) {		
		boolean b1 = Stream.of("a","b","c").anyMatch(x->x.startsWith("b"));
		System.out.println(b1);
		
		b1 = Stream.of("a","b","c").allMatch(x->x.startsWith("b"));
		System.out.println(b1);
	}

}
