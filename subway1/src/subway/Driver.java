package subway;

import java.util.*;

public class Driver {
	public static void main(String[] args) {
		
		String dep, arr; // 출발역, 도착역
		Scanner scan = new Scanner(System.in);
		StationDeparture sd;
		StationArrival sa;
		CalculateRange cr;
		CalculateTime ct;
		
		// 출발역, 도착역을 입력받는다.
		System.out.print("출발역을 입력하세요: ");
		dep = scan.next();
		System.out.print("도착역을 입력하세요: ");
		arr = scan.next();
		
		sd = new StationDeparture(dep);
		sa = new StationArrival(arr);
		cr = new CalculateRange(dep,arr);
		ct = new CalculateTime(dep,arr);
	
		// 두 역이 같은 라인이라면
		if( dep.charAt(0) == arr.charAt(0) )
		{
			cr.SumDisSameLine();
			ct.SumTimeSameLine();
		} 
		
		// 두 역이 다른 라인이라면
		// 
		
		System.out.println("\n출발역: " + sd.GetName());
		System.out.println("도착역: " + sa.GetName());
		System.out.println("거리 합계: " + cr.GetDistanceSum());
		System.out.println("시간 합계: " + ct.GetTimeSum());
	}
}