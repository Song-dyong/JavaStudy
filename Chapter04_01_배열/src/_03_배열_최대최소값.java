// 임의의 정수 10개를 받아서, 최대값 / 최소값 구하기



import java.util.*;
public class _03_배열_최대최소값 {
	public static void main(String[] args) {
		// 배열 선언
		int [] arr=new int[10];
		// 초기화
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		// 3가지 출력방식 
		// 1. 일반 for
		for(int i= 0; i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		// 2. Arrays.toString(배열이름)
		System.out.println(Arrays.toString(arr));	// [ ] 안에 ,로 구분된 배열 출력
		// 3. for-each => 배열, 컬렉션 (데이터 여러 개가 모아져 있을 경우)
		/*														--> VueJS / React는 대부분 향상된 for문 사용
			for(int a:배열명) ==> 출력용으로 사용 多 --> 웹(브라우저)			Why? 속도가 빠르고 간결하므로
		*/	
		for(int a:arr)
		{
			System.out.print(a+" ");
		}
		
		// 최대값 / 최소값 구하기
		
		int max=arr[0];  // max값은 첫 번째 값으로 주는 것이 좋음 
		int min=arr[0];
		
		for(int a:arr)
		{
			if(max<a)
				max=a;
			if(min>a)
				min=a;
		}
		System.out.println();
		System.out.println("최대값: "+max);
		System.out.println("최소값: "+min);
		
	}
}
