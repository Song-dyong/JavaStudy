
//문제1. 정수 한 개를 입력받아서, 그 수가 50 이상의 수인지 50미만의 수인지 
//         판단해보자.

import java.util.Scanner;
public class _문제_01 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("정수를 입력하세요!");
		int num= scan.nextInt();
		
		if(num>=50) 
		{
			System.out.println("50 이상입니다.");
		}
		else
		{
			System.out.println("50 미만입니다.");
		}
		
	}
}
