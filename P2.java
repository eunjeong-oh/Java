import java.util.Scanner;

public class P2 {
	public static void main(String[] args) {
		Sort sort = new Sort(); 
		sort.doSort(); 
		sort.abc();
		
//		Sort //클래스 sort //객체 = new Sort(); // 객체생성
//										(); 괄호 안은 객체에게 지정해주는것
//		sort.doSort(); // . 뒤가 매서드 
// 			
		
		SumMachine summachine = new SumMachine();
		summachine.makeSum(1, 100);
		summachine.makeSum(20, 200);
		int result = summachine.makeSum(30, 300);
		System.out.println(result);
		

		
		
		
	}	
}
