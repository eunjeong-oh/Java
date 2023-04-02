import java.util.Scanner;

public class KaupMain {
	public static void main(String[] args) {
		
		System.out.println("키와 몸무게를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		double yourcm = scanner.nextDouble(); //키
		double yourkg = scanner.nextDouble(); //몸무게
		
		Kaup kaup = new Kaup();
		kaup.KaupIndex(yourcm, yourkg); // kaupIndex 메서드 안에 sysout까지 다 포함되어있으니까
										//해당 메서드를 실행시키기만 해도 모든 sysout이 다 된다 
										//만약 메서드 안에서 return 값만을 가지고 있는다면 그 return값을
										//새로운 변수로 저장하고 그 변수를 가공해서 새롭게 활용가능하다
		
//		double res = kaup.KaupIndex(yourcm, yourkg); return 값을 불러와서 새롭게 활용하는 방법
//		if (res >=30) {								// 만약 이 방법이라면 KaupIndex에 if sysout없고 return만 있는게 좋다
//			System.out.println("비만");
//		}else if (res >=24) {
//			System.out.println("과체중");
//		}else if (res >20) {
//			System.out.println("정상");
//		}else if (res >13) {
//			System.out.println("여윔");
//		}else {
//			System.out.println("실조증");
//		}		

//		System.out.println(kaup.KaupIndex(yourcm, yourkg));
		//double res = kaup.KaupIndex(yourcm, yourkg);
	}
}
