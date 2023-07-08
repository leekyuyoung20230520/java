package 스트림;

import java.util.stream.Stream;

public class StreamMap01 {

	public static void main(String[] args) {
		// Nation 스트림을 생성
		Stream<Nation> sn =  Nation.nations.stream();
		sn.map(Nation::getName).limit(3).forEach(Util::printWithParethesis);
		
		sn =  Nation.nations.stream();
		sn.map(Nation::getGdpRank).limit(3).forEach(Util::printWithParethesis);
		

	}

}
