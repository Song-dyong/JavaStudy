import java.util.Arrays;

public class _03_메소드_배열메소드만들기 {
	static int[] rand()
	{
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		return arr;
	}
	
	static void rand2(int[] arr)										// 배열은 call by reference로 void를 통해 매개변수를 받아서, 
	{																	// 값을 채우는 편이 좋음
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
	}
	
	static void process()
	{
		int[] arr1=rand();
		System.out.println(Arrays.toString(arr1));			// 리턴형으로 값 채우기
		
	}
	
	public static void main(String[] args) {
		process();
		int[] arr2=new int[5];
		rand2(arr2);
		System.out.println(Arrays.toString(arr2));			// 매개변수를 이용해서 값 채우기 -> 활용도 高
	}
}	
