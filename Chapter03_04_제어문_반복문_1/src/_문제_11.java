//한 개의 정수를 입력 받아 1부터 입력 받은 정수까지의 합을 출력하라

import java.util.Scanner;
public class _문제_11 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("정수 입력:");
		int num = s.nextInt();
		int sum = 0;
		for(int i =1;i<=num;i++)
		{
			sum+=i;
		}
		System.out.println("1~"+num+"까지의 합: "+sum);
		
	}
}
