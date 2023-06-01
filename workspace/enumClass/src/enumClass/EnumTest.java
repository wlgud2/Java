package enumClass;

public class EnumTest {

	public static void main(String[] args) {
		Status status = Status.SUCCESS;
		System.out.println("status: " + status);

		// values: 모든 요소 반납
		for (Status stat : Status.values()) {
			System.out.println(stat);
		}

		// valueOf: 해당 문자열과 같은 값을 가지는 요소 반납
		System.out.println(Status.valueOf("실패"));

	}
}
