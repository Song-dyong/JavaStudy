import java.util.Arrays;

// Api 사용법		==>  DESC(올림차순)로는 불가능	--> 역순으로 출력

public class _10_배열응용_알고리즘4_Api사용법 {
	public static void main(String[] args) {
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
			for(int j=0;j<i;j++)
			{
				if(arr[i]==arr[j])
				{
					i--;
					break;
				}
			}
		}

		System.out.println("=======정렬 전=======");
		System.out.println(Arrays.toString(arr));
		System.out.println("=======정렬 후=======");
		Arrays.sort(arr);								// -> 버블정렬의 메소드
		System.out.println(Arrays.toString(arr));
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	
	}
}
