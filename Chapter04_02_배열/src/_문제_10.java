//정수 10개를 입력받은 후 세번째, 다섯번쨰와 마지막으로 입력받은 정수를 차례로 출력하는 프로그램

import java.util.Scanner;
public class _문제_10 {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int[] arr=new int[10];
		System.out.println("정수 입력:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		
		System.out.println(arr[2]+", "+arr[4]+", "+arr[arr.length-1]);// arr.length-1 --> 마지막 숫자
		
	}
}

