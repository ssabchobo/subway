package subway;

import java.util.*;

public class Driver {
	public static void main(String[] args) {
		
		String dep, arr; // ��߿�, ������
		Scanner scan = new Scanner(System.in);
		StationDeparture sd;
		StationArrival sa;
		CalculateRange cr;
		CalculateTime ct;
		
		// ��߿�, �������� �Է¹޴´�.
		System.out.print("��߿��� �Է��ϼ���: ");
		dep = scan.next();
		System.out.print("�������� �Է��ϼ���: ");
		arr = scan.next();
		
		sd = new StationDeparture(dep);
		sa = new StationArrival(arr);
		cr = new CalculateRange(dep,arr);
		ct = new CalculateTime(dep,arr);
	
		// �� ���� ���� �����̶��
		if( dep.charAt(0) == arr.charAt(0) )
		{
			cr.SumDisSameLine();
			ct.SumTimeSameLine();
		} 
		
		// �� ���� �ٸ� �����̶��
		// 
		
		System.out.println("\n��߿�: " + sd.GetName());
		System.out.println("������: " + sa.GetName());
		System.out.println("�Ÿ� �հ�: " + cr.GetDistanceSum());
		System.out.println("�ð� �հ�: " + ct.GetTimeSum());
	}
}