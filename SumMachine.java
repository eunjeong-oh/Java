
public class SumMachine {
	public int  makeSum(int startValue, int endValue) {
		int start = startValue;
		int end = endValue;
		int sum = 0;
//		
//		for (int i = start; i <= end; i++) {
//			sum = sum +i;			
//		}// end for
//		
//		System.out.println("시작값:" + start);
//		System.out.println("종료값:" + end);
//		System.out.println("총 합:" + sum);
		
		for (int i= start; i<=end; i++) {
			sum = sum + i;
			}// end for
		return sum;
		
	}
	
		

}
