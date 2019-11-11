package subway;

import java.util.*;

public class CalculateRange {
	private double range_sum; // 거리 합계
	private String dep; // 출발역
	private String arr; // 도착역
	private double[] RangeA = {2.0, 2.6, 1.8, 3.2, 3.5, 3.0, 1.7, 1.3};
	private double[] RangeB = {2.0, 2.5, 2.3, 2.2, 1.6, 1.5, 2.5, 2.8, 2.9, 3.0, 1.4, 1.2};
	
	CalculateRange(String d_name, String a_name) {
		range_sum = 0;
		dep = d_name; // a4  
		arr = a_name; // a7 
	}
	
	void SumDisSameLine() {		
		int d = dep.charAt(1) - '0'; // d = 4 
		int a = arr.charAt(1) - '0'; // a = 7
		
		//
		if (d > a) // a7 -> a4 
		{
			for( ; (a-1) < (d-1); a++) 
			{
				System.out.print("각 거리: " + RangeA[a-1] + " ");
				range_sum += RangeA[a-1];
			}
		} 
		else if (d < a) // a4 -> a7 
		{
			for( ; (d-1) < (a-1); d++) 
			{
				System.out.print("각 거리: " + RangeA[d-1] + " ");
				range_sum += RangeA[d-1];
			}
		} 
		else 
		{
			System.out.println("같은 역은 지정 불가");
		}		
		System.out.print("\n");
	}
	
	// 거리 합계를 반환한다.
	double GetDistanceSum() {
		return range_sum;
	}
}
