import java.util.Arrays;

public class _08_배열_배열확장_arraycopy {
	public static void main(String[] args) {
		int[] arr1= {10,20,30,40,50};
		int[] arr2= new int[10];
		System.arraycopy(arr1, 1, arr2, 0, 3); 		// 복사할 배열, 첫 복사 위치, 복사되는 배열, 첫 복사할 위치 , 복사 갯수 
		System.out.println(Arrays.toString(arr2));	// [20, 30, 40, 0, 0, 0, 0, 0, 0, 0]
		System.arraycopy(arr1, 0, arr2, 0, arr1.length); // --> 더 큰 배열로 확장하려면, arraycopy를 사용함
		System.out.println(Arrays.toString(arr2));	// [10, 20, 30, 40, 50, 0, 0, 0, 0, 0]
													// 배열의 확장이 번거롭기 때문에, 사용빈도가 적어지는 추세
		
	}
}
