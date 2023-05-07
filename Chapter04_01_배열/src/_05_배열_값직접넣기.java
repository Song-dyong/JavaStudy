import java.util.Arrays;

public class _05_배열_값직접넣기 {
	public static void main(String[] args) {
		int[] arr= {10, 20, 30, 40, 50}; // --> 5개 생성
		
//		1. 배열의 크기를 출력
		System.out.println(arr.length);
		
//		2. 3번째 값을 300으로 바꾸기
		arr [2]=300;
		System.out.println(arr[2]);
		System.out.println(Arrays.toString(arr));
		
		
//		3. 5번째 값을 출력
		System.out.println(arr[4]);
		
		
	}
}
