package subway;

public class StationArrival {
	private String arr_name; // ������ �̸�

	// ������ �̸��� �������ش�.
	StationArrival(String name) {
		arr_name = name;
	}
	
	// ������ �̸��� ��ȯ�Ѵ�.
	String GetName() {
		return arr_name;
	}
}
