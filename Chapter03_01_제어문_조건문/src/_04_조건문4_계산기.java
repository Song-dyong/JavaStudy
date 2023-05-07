/*
 	54page
 	
 	단일 조건문 
 	1. 형식 
 	if(조건)
 	{
 		수행문 -> 조건이 true일 경우, 수행하는 문장
 	}
 	=> {}이 없는 경우에는 한 개의 문장만 수행 가능
 	=> 여러 개를 동시에 제어할 경우, 반드시 {}을 사용
 	
 	2. if 중첩 조건문
 	if(조건)	======================> if(조건 && 조건)
 	{
 		if(조건)
 		{
 		}
 	}	
 	
*/
// 계산기 만들기 (사칙연산) ==> 1. 정수 2개 / 2. 연산자

import java.util.Scanner;
public class _04_조건문4_계산기 {
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("첫 번째 정수 입력:");
		int num1 = scan.nextInt();
		System.out.println("두 번째 정수 입력:");
		int num2 = scan.nextInt();
		System.out.println("연산자를 입력(+,-,*,/):");
		char op = scan.next().charAt(0); // 문자열을 받아서 char를 한 개 가지고 옴
		
		System.out.println("num1="+num1);
		System.out.println("num2="+num2);
		System.out.println("op="+op);
		
		// 계산기
		if(op=='+')
		{
			System.out.printf("%d+%d=%d\n",num1,num2,num1+num2);
		}
		if(op=='-')
		{
			System.out.printf("%d-%d=%d\n",num1,num2,num1-num2);
		}
		if(op=='*')
		{
			System.out.printf("%d*%d=%d\n",num1,num2,num1*num2);
		}
		if(op=='/')
		{
			if(num2==0)
			{
				System.out.println("0으로 나눌 수 없습니다");	// 오류처리
			}
			if(num2!=0)
			{
				System.out.printf("%d/%d=%d\n",num1,num2,num1/num2);				
			}
		}
		
	}
}
