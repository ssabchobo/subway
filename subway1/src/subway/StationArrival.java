package subway;

public class StationArrival {
	private String arr_name; // 도착역 이름

	// 도착역 이름을 설정해준다.
	StationArrival(String name) {
		arr_name = name;
	}
	
	// 도착역 이름을 반환한다.
	String GetName() {
		return arr_name;
	}
}
