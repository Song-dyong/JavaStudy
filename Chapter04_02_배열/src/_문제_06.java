// 양의 정수 10개 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력하는 프로그램을 작성하라

import java.util.Scanner;
public class _문제_06 {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int[] arr=new int[10];
		System.out.println("정수를 입력하시오");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
//			if(arr[i]%3==0)
//			{
//				System.out.print(arr[i]+" ");
//			}
		}
		
			for(int i:arr)
			{
				if(i%3==0)
				System.out.print(i+" ");
			}
		
		
		
	}
}
