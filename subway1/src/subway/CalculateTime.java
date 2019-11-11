package subway;
public class CalculateTime {
	private double time_sum; // 시간 합계
	private String dep;
	private String arr;
	private double[] TimeA = { 2.0, 3.0, 2.0, 3.2, 3.3, 2.8, 2.0, 1.0  };
	private double[] TimeB;
	
	CalculateTime(String d_name, String a_name) {
		time_sum = 0;
		dep = d_name;
		arr = a_name;
	}
	
	void SumTimeSameLine() {		
		int d = dep.charAt(1) - '0'; // d = 4 
		int a = arr.charAt(1) - '0'; // a = 7
		
		if (d > a) // a7 -> a4
		{
			for( ; (a-1) < (d-1); a++) 
			{
				System.out.print("각 시간: " + TimeA[a-1] + " ");
				time_sum += TimeA[a-1];
			}
		} 
		else if (d < a) // a4 -> a7 
		{
			for( ; (d-1) < (a-1); d++) 
			{
				System.out.print("각 시간: " + TimeA[d-1] + " ");
				time_sum += TimeA[d-1];
			}
		} 
		else 
		{
			System.out.println("같은 역은 지정 불가");
		}		
	}
	
	// 거리 합계를 반환한다.
	double GetTimeSum() {
		return time_sum;
	}
}
