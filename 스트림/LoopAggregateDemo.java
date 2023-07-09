package 스트림;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class LoopAggregateDemo {

	public static void main(String[] args) {
		Stream<Nation> sn =  Nation.nations.stream().peek(Util::printWithParethesis);
//		sn.max(Comparator.comparing(Nation::getPopulation));
		Optional<Nation> on = sn.max(Comparator.comparing(Nation::getPopulation));
		System.out.println();
		System.out.println(on.get());

	}

}
