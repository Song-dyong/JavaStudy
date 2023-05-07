import java.util.Arrays;

public class _07_배열_주소참조이론_clone {
	public static void main(String[] args) {
		int[] arr1= {10,20,30,40,50};
		int[] arr2=arr1.clone();							// 배열의 대입 가능   // 별칭 (참조데이터)	
		System.out.println("arr1:"+Arrays.toString(arr1));		// .clone()을 사용해야 새로운 공간을 만들어서 저장 --> 다른 주소에 참조
		System.out.println("arr2:"+Arrays.toString(arr2));		// 값까지 복사가 가능 --> 복사된 값도 다시 저장하므로, 한 번에 메모리 값을 변경할 때 용이
		
		System.out.println("=====배열값 변경=====");
//		arr2[0]=100;
//		arr2[1]=200;
//		arr2[2]=300;
//		arr2[3]=400;
//		arr2[4]=500;
		System.out.println("arr2:"+Arrays.toString(arr2));
		System.out.println("arr1:"+Arrays.toString(arr1));		// 카피된 배열을 바꾸면, 기존의 배열값도 바뀜
																// arr1에 할당된 메모리 공간의 값은 arr2 역시 참조 중 ==> arr2에서 메모리 공간의 값을 바꾸면
		System.out.println(arr1);														// arr1이 참조할 메모리 공간의 값도 동일한 것을 참조
		System.out.println(arr2);				// arr1과 arr2의 주소값이 동일 ==> 같은 주소의 메모리를 참조
		
		int[] arr3=new int[5];					// --> 기존에 값을 복사하기 위해서는 for문을 통해 하나씩 대입해야함
		for(int i=0;i<arr1.length;i++)			// --> .clone() 을 사용하면 for문을 사용하지 않아도 빠르게 복사 가능
		{
			arr3[i]=arr1[i];
		}
		System.out.println(Arrays.toString(arr3));	// --> 복사할 배열보다 같거나 더 큰 배열이어야 복사가 가능	
													// --> 작은 값의 배열일 경우, 에러
													// 배열은 고정적이므로, clsss화 시키기 --> <collection>
	}
}
