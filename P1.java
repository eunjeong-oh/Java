// sort - selection sort (선택정렬)
import java.util.Arrays;
import java.util.Random;

public class P1 {
	public static void main(String[] args) {
		
	
		int [] numbers = {0,0,0,0,0,0,0,0,0,0} ;
		
		
		//random 세팅
		Random random = new Random();
		for(int i =0; i< numbers.length; i++) {
			numbers[i] = random.nextInt(100) + 1;			
		}
	
		System.out.println(Arrays.toString(numbers));

			// sort (selection sort) 선택정렬
		
		for (int i =0; i<numbers.length-1; i++) {
			for(int j= i+1; j<numbers.length; j++) {
				if(numbers[i] > numbers[j]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
	}
}

