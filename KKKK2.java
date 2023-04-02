import java.util.Scanner;

public class KKKK2 {
	//교수님 해설 Property 사용

	// 동일 변수를 한 클래스 내의 모든 메서드에서 사용하고 싶으면, class 바로 밑에서 변수를 선언한다  / 클래스 내 중괄호 안에서 모두 사용가능!!! 
//		property : 객체마다 가질 수 있는 값
	
		double weight = 0; // property 
		double height = 0;

		//입력
		public void inputVar() {
			System.out.println("몸무게를 입력해주세요 (단위 kg)");
			Scanner scanner = new Scanner(System.in);
			String inputString = scanner.nextLine();
			weight = Double.parseDouble(inputString);

			System.out.println("키를 입력해주세요 (단위 cm)");
			inputString = scanner.nextLine();
			height = Double.parseDouble(inputString);
			height = height / (double)100;
			
		}
		
		
		// 카우프 계산
		public void calcKup () {
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


