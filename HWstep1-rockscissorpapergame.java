import java.util.Random;
import java.util.Scanner;

public class HWstep1 {
	public static void main(String[] args) {

		System.out.println("가위바위보 게임을 시작합니다.");
		System.out.println("'가위 = 0', '바위 = 1', '보 = 2'의 숫자를 입력해주세요.");
				
		Random r = new Random();
		int pc = r.nextInt(3);
		Scanner s = new Scanner(System.in);
		int user = s.nextInt();
		
		if (user >2 || user < 0  ) {
			System.out.println("입력값이 정확하지 않습니다. 종료후 새로 실행바랍니다.");
				return;
		}
						
		System.out.println( "PC의 값 : " + pc);
		
		if (user ==  pc) {
			System.out.println("사용자 vs PC 결과 = 무승부 ");	
		}else if(user > 0 && pc == (user - 1) || (user == 0 &&  pc == 2)) {
			System.out.println("사용자 vs PC 결과 = 사용자 승");
		}else {
			System.out.println("사용자 vs PC 결과 = PC 승");
		}
	}
}
