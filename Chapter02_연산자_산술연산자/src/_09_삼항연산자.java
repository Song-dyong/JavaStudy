/*
		(조건)? 값1 : 값2
		-------
		true => 값1
		false => 값2
		=====> if~else
		웹/게임 多
		

		(조건)? 값1 : 값2
*/

import java.util.Scanner;

public class _09_삼항연산자 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
//					 ----- new가 있어야 메모리에 저장
		System.out.print("정수 입력: ");
		int num=scan.nextInt();
		
		System.out.println(num%2==0? "짝수입니다.":"홀수입니다.");
		
//		if(num%2==0)    ==> 위의 삼항연산자와 같음. 제어문 형식
//		{
//			System.out.println("짝수입니다.");
//		}
//		else
//		{
//			System.out.println("홀수입니다.");
//		}
//		
		scan.close();
		
		
	}
	
}
