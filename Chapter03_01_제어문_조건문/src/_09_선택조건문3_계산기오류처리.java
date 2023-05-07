// 중첩 --> if~else
// 사칙연산 +,-,*,/ 

import java.util.Scanner;
public class _09_선택조건문3_계산기오류처리 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("두 개의 정수 입력(10 20):");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.print("연산자 입력(+,-,*,/)");
		char op=scan.next().charAt(0); // 문자열에서 문자 한 개를 추출할 때 사용. 
													// 0은 문자열의 제일 첫 글자 추출
		if(op=='+' || op=='-' || op=='*' || op=='/')
		{
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
				if(num2!=0)
				System.out.printf("%d/%d=%d\n",num1,num2,num1/num2);
				else
				System.out.println("0으로 나눌 수 없습니다!");
			}
			
		}
		else
		{
			System.out.println("잘못 입력된 연산자입니다!!!");
		}
	}
}
