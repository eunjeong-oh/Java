import java.util.Scanner;

public class SaveBox {
	int coin =0; // property
	String name = "3번";  // s1,s2,s3 구분하기 위해 이름 입력
	boolean isBroken = false;
	

	public void deposit() {
		if (this.isBroken) {
			System.out.println("이 저금통은 더이상 사용할 수 없습니다.");
			return;
		}
		Scanner scanner = new Scanner(System.in);
		System.out.println(this.name + "에 입금할 금액을 입력해주세요");
		String inputString = scanner.nextLine();
		int inputCoin = Integer.parseInt(inputString);
		
		this.coin = this.coin + inputCoin; 
		
		System.out.println("땡그랑");
		System.out.println("현재 " + this.name + "저금통에 보유한 금액은" + this.coin + "입니다.");
	}
	
	public void withdraw() {
		System.out.println(this.name + "저금통을 깼습니다.");
		System.out.println("전체 출금 금액은" + coin + "입니다.");
		this.isBroken = true;
	}
	
	public void close() {
		
	}

	
	public void setName(String name) {
		this.name = name;
	} // this붙어있는 name 은 무조건 지정값[설정한 property]이 오고, this 붙어있지 않은 오른쪽 name은 새로운 값이 온다
	// 같은 이름이지만 같은 변수 X. 네이밍이 다른것을 안봐도 구조를 파악할 수 있는 가장 편하기때문에 
	

	
}
