import java.util.Arrays;

public class P3 {
	public static void main(String[] args) {
		
		int [] numbers = {0,0,0}; //배열 
		int a =0; // 인트 하나의 변수 값
		System.out.println(numbers[0]); // 배열의1요소, 하나의 변수 값
		System.out.println(numbers); // 변수가 아니고 주소
		
		int [] mm;
		mm = numbers; // -> 변수가 아니라 주소값을 옮긴것다. mm의 주소와 numbers의 주소가 같아서
						// mm과 numbers는 같은 배열을 가리킨다.
		
						//mm[1] 을 고치나 numbers[1]을 고치나 같은 영향
		
		mm[1] = numbers[1]; 
		mm[0] = numbers[0];
		
//		하나하나 다 바꿔줘야하기때문에 System.arraypcopy 기능 사용가능
		
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(mm));
		
		
		
		
	}
}
