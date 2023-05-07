import java.util.Arrays;

/*
		빈도 수 구하기: 난수 발생 -> 몇 번씩 나왔는지

*/

public class _05_배열응용_빈도수구하기 {
	public static void main(String[] args) {
		int[] arr=new int[100];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*10);
		}
		
		int[] result=new int[10];
		
		for(int i=0;i<arr.length;i++)				// 갯수 세기
		{
			result[arr[i]]++;
		}
		for(int i=0;i<result.length;i++)			// i번째 출력
		{
			System.out.println((i)+":"+result[i]);
		}
		int max=result[0];
		int min=result[0];
		int index1=0, index2=0;
		for(int i=0;i<result.length;i++)
		{
			if(max<result[i])
			{
				max=result[i];
				index1=i;
			}
			if(min>result[i])
			{
				min=result[i];
				index2=i;
			}
		}
	System.out.println("가장 많이 나온 수는 "+index1+", 횟수: "+max);
	System.out.println("가장 적게 나온 수는 "+index2+", 횟수: "+min);
		
		
	}
}
