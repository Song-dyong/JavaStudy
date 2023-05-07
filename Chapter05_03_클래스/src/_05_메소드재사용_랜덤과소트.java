import java.util.Arrays;

public class _05_메소드재사용_랜덤과소트 {
	public static void main(String[] args) {
		int[] arr= new int[10];
		
		_04_메소드조립_셀렉트소트만들기.rand(arr);
		
		_04_메소드조립_셀렉트소트만들기.sort(arr, 1);
		System.out.println(Arrays.toString(arr));
		_04_메소드조립_셀렉트소트만들기.sort(arr, 2);
		System.out.println(Arrays.toString(arr));
	}
}
