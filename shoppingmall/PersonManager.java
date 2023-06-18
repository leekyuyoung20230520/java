package shoppingmall;
/*
 * Person 객체를 생성해서 배열에 저장
 * 주어진 정보를 이용해서 배열에 있는 person을 찾는다
 */

public class PersonManager {
	private final int MAX_PERSON_COUNT = 100;
	private Person[] members = new Person[MAX_PERSON_COUNT];
	private int memberCount;
	public void signUp(Person person) {
		if(memberCount == MAX_PERSON_COUNT) {
			System.out.println("member is full");
			return;
		}
		members[memberCount++] = person;
	}
	public Person login(Person person) {
		for (int i = 0; i < members.length; i++) {
			if (members[i].equals(person) ) {
				return members[i];
			}
		}
		return null;
	}
}
