//	15)	Scanner 클래스를 이용하여 2자리의 정수(10~99사이)를 입력받고,
//		십의 자리와 1의 자리가 같은 지 판별하여 출력하는 프로그램을 작성하라.

import java.util.Scanner;
public class _문제_15 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("정수 입력:");
		int num = s.nextInt();
		
		if(num<10 || num>=100)
		{
			System.out.println("잘못된 입력");
		}
		else
		{
			if(num%11==0)
			{
				System.out.println(num+"은(는) 10의 자리와 1의 자리의 숫자가 같다.");
			}
			else
			{
				System.out.println(num+"은(는) 10의 자리와 1의 자리의 숫자가 같지 않다.");
			}
		}
		
		
	}
}
