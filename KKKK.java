//교수님 해설

import java.util.Scanner;

public class KKKK {
// 동일 변수를 모든 메서드에서 사용하고 싶으면, class 바로 밑에서 변수를 선언한다 
//	property : 객체마다 가질 수 있는 값
	// 할 수 있는 일은 동일하나 표현디는 값은 다르다??? 
	
	//입력
	public double inputWeight() {
		System.out.println("몸무게를 입력해주세요 (단위 kg)");
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		double weight = Double.parseDouble(inputString);
		return weight;
		
	}
	
	public double inputHeight() {
		System.out.println("키를 입력해주세요 (단위 cm)");
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		double height = Double.parseDouble(inputString);
		height = height / (double)100;
		return height;
		
	}
	
	
	// 카우프 계산
	public void calcKup (double weight, double height) {
		double result = (double)weight / (height * height);
		
		if (result>=30) {
			System.out.println("비만");
		}else if (result>24) {
			System.out.println("과체중");		
		}else if (result>20){
			System.out.println("정상");		
		}else if (result>15){
			System.out.println("저체중");		
		}else if (result>13){
			System.out.println("여윔");		
		}else {
			System.out.println("소모증");
		}
	}

}
