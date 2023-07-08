package 스트림;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMap2 {

	public static void main(String[] args) {
		Stream<String> lists = List.of("안녕 자바","잘가 자바","어서와 자바","자바 좋아요").stream();
		
		lists.map(x->x.split(" ")).map(Arrays::asList).forEach(Util::print);
		System.out.println();
		
		lists = List.of("안녕 자바","잘가 자바","어서와 자바","자바 좋아요").stream();
		lists.flatMap( s -> Arrays.stream(s.split(" "))).forEach(Util::print);
		System.out.println();
		
		List<String> list1 = List.of("a","b");
		List<String> list2 = List.of("aa","bb","ccc");
		List<String> list3 = List.of("aaa","bbb","ccc","ddd");
		Stream<List<String>> ss = Stream.of(list1,list2,list3);
		ss.flatMap(x ->{
			if(x.size()>3)
				return x.stream();
			else
				return Stream.empty();
		}).forEach(Util::print);
		
	}

}
