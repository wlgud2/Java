package enumClass;

public enum Status {
	SUCCESS("성공", 0), STOP("중단", 1), FAIL("실패", 2);

	private final String statusString;
	private final int value;

	private Status(String statusString, int value) {
		this.statusString = statusString;
		this.value = value;
	}

	public String getStatusString() {
		return this.statusString;
	}

	public int getValue() {
		return this.value;
	}
}
