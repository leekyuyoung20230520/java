package 람다식과함수형프로그래밍;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class CarDemo {

	public static void main(String[] args) {
		// 가솔린 차량만 추출
//		List<Car> lists = Car.cars;
		List<Car> result = new ArrayList<Car>();

		for (Car c : Car.cars) {
			if(c.isGasoline())
				result.add(c);
		} 
//		2.가솔린 차량만
//		CarPredicate cp = c->c.isGasoline();
//		for (Car c : Car.cars) {
//			if(cp.test(c))
//				result.add(c);
//		}
		result = find(Car.cars, c->c.isGasoline());
//		3. 년식이 10년 이상된 차만 추출
//		cp = c->c.getAge() >=10; 
//		for (Car c : Car.cars) {
//			if(cp.test(c))
//				result.add(c);
//		}
		result = find(Car.cars, c->c.getAge() >=10);		
//		4. 디젤자동차만 추출
		result = find(Car.cars, c-> !c.isGasoline() );
//		5. 10년 이상이면서 가솔린차량
		result = find(Car.cars, c->c.isGasoline() && c.getAge()>=10);
		printCars(result, c->System.out.printf("연식 : %s\n",c.getAge()));	
		
	}
	
	public static void printCars(List<Car> cars, CarConsumer carconsumer) {
		for (Car c : Car.cars) {
			carconsumer.apply(c);
		}
	}
	
	public static List<Car> find(List<Car> cars, CarPredicate cp){
		List<Car> result = new ArrayList<Car>();
		for (Car c : Car.cars) {
			if(cp.test(c))
				result.add(c);
		}
		return result;
	}

}
