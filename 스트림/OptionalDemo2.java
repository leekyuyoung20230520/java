package 스트림;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class OptionalDemo2 {	
	
	public static void main(String[] args) {
		String s1 = "안녕!";
		Optional<String> o = Optional.ofNullable(s1);
		if(s1 != null)
			Util.print(s1);
		else
			Util.print("없음");
		
		if(o.isPresent())
			Util.print(o.get());
		else
			Util.print("없음");
		
		String s2 = o.orElse("없음");
		Util.print(s2);
		
		o.ifPresentOrElse(Util::print, ()->System.out.println("없음"));
	
		System.out.println();
		Stream<Nation> st =  Nation.nations.stream();
		st.filter(x -> x.getPopulation()>100).forEach(Util::printWithParethesis);
		
		
		
		
		
		
	}

}
