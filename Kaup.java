import java.util.Scanner;

public class Kaup {
	

	public double KaupIndex (double height, double weight){
		
		double index;

		index = (weight / ((height*0.01) * (height*0.01)));
		System.out.println(index);
		
		if (index >=30) {
			System.out.println("비만");
		}else if (index >=24) {
			System.out.println("과체중");
		}else if (index >20) {
			System.out.println("정상");
		}else if (index >13) {
			System.out.println("여윔");
		}else {
			System.out.println("실조증");
		}
		
		return index;

	}
}

