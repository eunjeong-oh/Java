import java.util.Arrays;
import java.util.Scanner;
// 1번 저금통 입금 1번 출금 -1 
//	2번 
	
public class SaveBoxMain {
	public static void main(String[] args) {
		SaveBox s1 = new SaveBox();
		SaveBox s2 = new SaveBox();
		SaveBox s3 = new SaveBox();
		s1.setName("1번");
		s2.setName("2번");
		
		System.out.println("입금을 원하는 저금통의 숫자를 입력해주세요");
		System.out.println("만약 출금을 원하시면 -저금통숫자를 눌러주세요(예시 : -1)");
		System.out.println("종료를 원하시면 q버튼을 눌러주세요");

		Scanner scanner = new Scanner(System.in);

		
		for (int i=0; i<9999; i++ ) {	
			String inputstr = scanner.nextLine();

			if (inputstr.equals("q")) {
				System.out.println("종료되었습니다.");
				break;
			}
			int inputNum = Integer.parseInt(inputstr);

			if (inputNum == 1) {
				s1.deposit();
			}else if (inputNum == 2) {
				s2.deposit();
			}else if (inputNum == 3) {
				s3.deposit();
			}else if (inputNum == -1) {
				s1.withdraw();
				
			}else if (inputNum == -2) {
				s2.withdraw();
			}else if (inputNum == -3) {
				s3.withdraw();
			}
		}
		
		String inputstr = scanner.nextLine();
		int inputNum = Integer.parseInt(inputstr);

		
	

	}
}
