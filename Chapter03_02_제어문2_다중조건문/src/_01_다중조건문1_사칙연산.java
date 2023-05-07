/*
	다중조건문 : 조건이 맞는 문자을 수행하고 종료 ( 한 개의 문장만 수행 )
				=> 여러 개의 조건을 수행하려면, 단일 조건문을 사용해야 함
					ex) 1~100까지 숫자 중에 3의 배수, 5의 배수, 7의 배수의 합을 출력하시오.
						=> 3개의 조건에 부합하는 3가지 변수를 추출해야 함. -> 단일 조건문 3개 사용
			
			-형식 
				if ( 조건문 )
				{
					true일 때 수행하는 문장
					false일 때 다음 조건으로 이동
				}
				else if ( 조건문 )
				{
					true일 때 수행하는 문장
					false일 때 다음 조건으로 이동
				}
				else if ( 조건문 )
				{
					true일 때 수행하는 문장
					false일 때 다음 조건으로 이동
				}
				else 		-> 	else 생략 가능
				{
					해당 조건이 없을 경우, 실행되는 default 문장 ( 보통, 잘못 입력되었을 경우 수행되는 문장 )
				}





*/
// 사칙연산
import java.util.Scanner;
public class _01_다중조건문1_사칙연산 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("첫 번째 정수 입력:");
		int num1 = scan.nextInt();
		System.out.println("두 번째 정수 입력:");
		int num2 = scan.nextInt();
		System.out.println("연산자 입력(+, -, *, /):");	// +, -, *, / => charAt(1) : -를 가져오고 싶을 때
		char op = scan.next().charAt(0); // 문자열 중에 첫 번째에 있는 문자를 추출할 때 (0)
															//자바의 단점: 입력값을 받을 때, char는 받을 수 없다.
															//  			(무조건 문자열로 입력받음)
		// 경우의 수 : 4가지 ( + - * / ) + 다른 문자 입력시 (else) => 5가지
		
		if (op=='+')
		{
			System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
		}
		else if (op=='-')
		{
			System.out.printf("%d+%d=%d\n",num1,num2,num1-num2);
		}
		else if (op=='*')
		{
			System.out.printf("%d*%d=%d\n",num1,num2,num1*num2);

		}
		else if (op=='/')
		{
			if(num2==0)
			{
				System.out.println("0으로 나눌 수 없다");
			}
			else
			{
				System.out.printf("%d/%d=%.2f\n",num1,num2,(double)num1/num2);
			}
			
		}
		else
		{
			System.out.println("잘못된 연산자입니다.");
		}
	}
}
