/*
	자바에서 지원하는 제어문 : 반복 / 조건 / 선택 / 반복 제어
		
		=> 변수 / 연산자 / 제어문 --> 프로그램 생성
			|	------------
		  여러개  	메소드 (재사용)
		
		***자바에서 지원하는 모든 제어문은 밑에 있는 명령문만 제어할 수 있음***
			if(조건)
			  문장 1 => 제어
			  문장 2 => if문과 관련없는 문장
			따라서, 2개 이상의 명령문을 수항할 시 반드시 {} 중괄호
			
			if(조건)
			{
				문장 1
				문장 2
			}
			
			
			
		
		 1. 제어문
		
		1) 조건문		1| 단일 조건문
						if(조건 -> 부정연산자(!), 비교연산자, 논리연산자) => 결과값은 true / false
						{
							조건이 true일 경우에만 수행하는 문장을 작성
						}
					2| 선택 조건문
						
					3| 다중 조건문
							
		2) 선택문
		
		3) 반복문		1| while
					
					2| do~while
					
					3|for ① 일반 for
						  ②	향상된 for for-each (웹에서 핵심)
		
		4) 반복제어문	1| break;
					
					
					2|continue
					
					
		=================================응용 (연산자) 54page

	Start		main{->Start	
	  |
	문장(명령문)
	  |
	문장(명령문)
	  |
	문장(명령문)
	  |
	 End		} -> End
	 
-----------------------------------

	Start		main{->Start	
	  |
	문장(명령문)
	  |
	 조건			==> 조건에 맞아야 수행 (if)
	  |					-> 주로, 에러처리에 사용
	문장(명령문)
	  |
	 End		} -> End







*/


//		조건문 (단일 조건문) => 짝수 / 홀수
import java.util.Scanner;
public class _01_조건문_짝수홀수 {
	public static void main(String[] args) {
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("정수 입력: ");
//		int num = scan.nextInt();
//		if(num%2==0) // 짝수 조건
//			System.out.println(num+"는(은) 짝수입니다.");
//			System.out.println("num="+num);				// 조건문과 상관없이 무조건 수행하는 문장
//		if(num%2==1) // 홀수 조건
//			System.out.println(num+"는(은) 홀수입니다.");
//			System.out.println("프로그램 종료!!");			// 조건문과 상관없이 무조건 수행하는 문장
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("정수 입력: ");
//		int num = scan.nextInt();
//		if(num%2==0) // 짝수 조건
//		{
//			System.out.println(num+"는(은) 짝수입니다.");
//			System.out.println("num="+num);
//		}
//		if(num%2==1) // 홀수 조건
//		{
//			System.out.println(num+"는(은) 홀수입니다.");
//			System.out.println("num="+num);
//		}
//		System.out.println("프로그램 종료!!");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요!");
		int num = scan.nextInt();
		
		if(num%2==0)
		{
			System.out.println("num="+num);
			System.out.println("짝수입니다.");
		}
		
		if(num%2!=0)
		{
			System.out.println("num="+num);
			System.out.println("홀수입니다.");

		}
		
		
	
	}
}
