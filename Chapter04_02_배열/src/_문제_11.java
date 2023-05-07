//10개의 정수를 입력받아 그 중 가장 큰 수를 출력하는 프로그램

import java.util.Arrays;
import java.util.Scanner;
public class _문제_11 {
	public static void main(String[] args) {
		
//		Scanner s=new Scanner(System.in);
//		int[] arr=new int[10];
//		System.out.println("정수 입력:");
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=s.nextInt();
//		}
//		int max = 0;
//		for(int i=0;i<arr.length;i++)
//		{
//			if(max<arr[i])
//				max=arr[i];
//		}
//		System.out.println(max);
//		
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		int max=arr[0];
		for(int i:arr)
		{	if(max<i)
				max=i;
		}
		System.out.println("최대값: "+max);
		
		
		
	}
}
