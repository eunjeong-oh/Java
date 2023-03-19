import java.util.Random;
import java.util.Scanner;

public class HWstep3 {
	public static void main(String[] args) {
		
		System.out.println("가위바위보 게임을 시작합니다.");
		System.out.println("'가위 = 0', '바위 = 1', '보 = 2'의 숫자를 입력해주세요.");
		System.out.println("종료를 원하시면 'q'를 입력하세요.");


		Scanner s = new Scanner(System.in);
		Random r = new Random();
		
		int sumNumberTie = 0;
		int sumNumberPc = 0;
		int sumNumberTotal = 0;
		int sumNumberUser = 0;

		for(int i = 0; i < 99999; i++) {
			String userInput = s.nextLine();
			int pcNumber = r.nextInt(3);
		
			if(userInput.equals("q")) {
				System.out.println("종료합니다.");
				break;
			}
			
			int userNumber = Integer.parseInt(userInput);
			
			if(userNumber >2 || userNumber <0 ) {
				System.out.println("0~2사이의 값을 입력하세요.");
				
			}else {
				System.out.println("PC의 값 :" + pcNumber);				
				sumNumberTotal = sumNumberTotal + 1 ;//i가 전체돌린횟수이기때문에 전체횟수다
				
				
				if (userNumber ==  pcNumber) {
					System.out.println("사용자 vs PC 결과 = 무승부 ");
					sumNumberTie = sumNumberTie + 1;//sumNumberTie++;
				}else if((userNumber > 0 && pcNumber == (userNumber - 1)) || (userNumber == 0 &&  pcNumber == 2)) {
					System.out.println("사용자 vs PC 결과 = 사용자 승");
					sumNumberUser = sumNumberUser +1;
				}else {
					System.out.println("사용자 vs PC 결과 = PC 승");
					sumNumberPc = sumNumberPc + 1;
				}
			}					
		}
		System.out.println("총 게임 횟수는" + sumNumberTotal + "입니다.");
		System.out.println("PC 승리 횟수는" + sumNumberPc + "입니다.");
		System.out.println("사용자 승리 횟수는" + sumNumberUser + "입니다.");
	}
}
