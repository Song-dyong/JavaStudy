//5개 정수를 입력받은 후 차례로 출력하는 프로그램

import java.util.Arrays;
import java.util.Scanner;
public class _문제_08 {
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		int[] arr=new int[5];
		System.out.println("정수 5개 입력: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
		
	}
}
// 