package subway;

public class StationDeparture {
	private String dep_name; // ��߿� �̸�

	// ��߿� �̸��� �������ش�.
	StationDeparture(String name) {
		dep_name = name;
	}
	
	// ��߿� �̸��� ��ȯ�Ѵ�.
	String GetName() {
		return dep_name;
	}
}
