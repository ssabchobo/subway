package subway;

public class StationDeparture {
	private String dep_name; // 출발역 이름

	// 출발역 이름을 설정해준다.
	StationDeparture(String name) {
		dep_name = name;
	}
	
	// 출발역 이름을 반환한다.
	String GetName() {
		return dep_name;
	}
}
