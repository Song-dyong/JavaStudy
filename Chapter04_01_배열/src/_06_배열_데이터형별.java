import java.util.Arrays;
public class _06_배열_데이터형별 {
	public static void main(String[] args) {
		int[] arr1= {10,'A', 'B', 100, 15}; // 배열 내에 10.5(실수)가 들어가면 에러 발생 
		System.out.println(Arrays.toString(arr1));
		System.out.println(arr1);					// --> 메모리 주소 확인 가능
		double[] arr2= {10,'A', 'B', 100, 15.7};  
		System.out.println(Arrays.toString(arr2));
		char[] arr3= {66,'A', 'c', 78, 97};  			// int를 포함할 수 있음 why? char로 자동 변환
		System.out.println(Arrays.toString(arr3));
		boolean[] arr4= new boolean[5];
		System.out.println(Arrays.toString(arr4));		// boolean 배열의 초기값은 false why? false가 0이므로
		byte[] arr5=new byte[5];
		System.out.println(Arrays.toString(arr5));		// int와 마찬가지로 초기값은 0
		
		// int [] arr; ==> null (주소가 없을 경우) 
		
	}
}	
