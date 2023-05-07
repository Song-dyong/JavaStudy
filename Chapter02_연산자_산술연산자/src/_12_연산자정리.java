import java.util.Scanner;

/*
	38page : 산술연산자
	41page : 증감연산자
	44page : 비교연산자
	45page : 논리연산자
	48page : 조건연산자 (삼항연산자)
	==> 대입연산자
	-------------------------------------------
		자바에서 지원하는 연산자
	-------------------------------------------
	1. 단항연산자
		1) 증감연산자 : (++, --) 한 개 증가, 한 개 감소 
							=> 반복문에서 주로 사용 (for, while, do~while)
			1| 전치 연산자 : 먼저 증가한 후에 다른 연산자를 수행
				ex) 
					int a = 10;
					int b = ++a;
						 -- ---
						    ①증감 -> a=11
						②대입     -> b에 11을 대입
			2| 후치 연산자 : 다른 연산자를 수행, 나중에 증감
				ex)
					int a = 10;
					int b = a++;
						 --- ---
						 ①대입  		-> b에 증가되지 않은 a값을 대입
						     ②연산 	-> a에 1 증가
				char c = 'A';
					System.out.println(c++)  --> 'A'
					System.out.println(++c)  --> 'C'
				
				ex) 
					int a = 10;
					int b = a++;
					a=9, b=10
					
					int a = 10;
					int b = --a;
					a=9, b=9
				============ 1개 증가 : a++ ++a a=a+1 a+=1
							 1개 감소 : a-- --a a=a-1 a-=1
					=======> byte, short, int, long, float, double, char 증감연산 가능 
					
		2) 부정연산자 (!) : boolean만 사용 가능
			true => !true = false
					!false = true
					
				ex)
					int a = 10;
					  a%2=0		  ==> true
					!(a%2=0)      ==> false  // 논리연산자
					a%2!=0
		
		3) 형변환연산자 (데이터형)
			
			1| 자동형변환
				① 작은 데이터형 -> 큰 데이터형에 대입
					int a = 'A' --> 65
					long a = 10 --> 10L
					double d = 10 --> 10.0
					int + double --> double + double
					----------------------
					int a = 10.5 (X) --> 강제형변환 필요 int a = (int) 10.5;
				② 연산처리시
			2| 강제형변환
				: 큰 데이터형을 작은 데이터형으로 변경할 경우
				
				데이터 크기 순서: byte < char < int < long < double
				
	-------------------------------------------
	2. 이항연산자
		
		1) 산술연산자 : +, -, *, /, %
				
				+ : 산술처리
						ex) 10+10 => 20
					문자열 결합
						ex) 10+"10" => 1010
							"10"+10 => 1010
							7+"7"+7 => 777
				/ :
			
				% :
				
		2) 비교연산자 : == , != , < , > , <= , >=
		
		3) 논리연산자 : && , ||
		
		4) 대입연산자 : =, +=, -=
		
	-------------------------------------------
	3. 삼항연산자
		(조건) ?  값1  :  값2
			   true / false
	-------------------------------------------



	1. 메모리 저장
		int=a;	int=b;
		-----	-----	4byte
		  3		 a+5	
		-----a	-----b
		
	2. System.out.printf() => JDK1.5 => C언어에서 도입 (printf())
	 	서식이 있는 출력 
	 	%d : 정수값 
	 	%f : 실수값 
	 	%c : 문자값
	 	%s : 문자열
	 	
	 	int a = 10;
	 	double d - 10.5;
	 	char = 'A';
	 	
	 	System.out.println("a="+a+,",d="+d+",c="+c);
	 	System.out.printf("a=%d,b=%.1f,c=%c",a,b,c); --> .1f : 소수점 첫째자리까지
	 	System.out.printf("a=%3d,b=%4.1f,c=%2c",a,b,c); --> 칸 간격 조절 가능

	1. 변수			|	int a,b;
	2. 초기화			|	Scanner
	3. 연산처리		|	a-b, a*b
	4. 결과 출력 		|	
	
	데이터 저장  ==================> 			데이터 가공 (연산처리) ==========> 결과값 출력
		|										| 연산자				System.out.println()
	1) 직접 값 입력 (int a=?;)											보통은 ln / f도 사용
	2) 사용자로부터 입력받기 (Scanner.nextInt())
	3) 난수 (Math.random())
	----------------메모리 내에서 해결
	4) 파일에 읽기
	5) 오라클에서 값 읽기


	cf) Scanner scan = new Scanner(System.in) --> in 입력을 받으라는 뜻.

import java.util.Scanner;
public class _문제_11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("두 개의 정수입력(20 30):"); --> 입력할 때, 정수 띄고 정수 ex)20 30
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println(num1-num2);
		System.out.println(num1*num2);


	변수(variable) - 하나의 값을 저장하기 위한 공간
	상수(constant) - 한 번만 값을 저장할 수 있는 공간, 모든 내용 대문자 (final)
	리터럴(literal) - 그 자체로 값을 의미하는 것 ( 값 )
		
	변수의 초기화 : 변수에 처음으로 값을 저장하는 것 
		cf) 지역변수는 사용되기 전에 반드시 '초기화'해주어야 함.
			----- main method 내에서 사용하는 변수
	
	형변환: boolean을 제외한 7개의 기본형은서로 형변환 가능
	
		int i = 300;
		i = (byte)300;		
		System.out.println(i);	=> 44 (값 손실 o)
	
	 System.out.printf("%d,%dm%d\n",a);
	 import java.util.Scanner
	 (Math.random()*i)+1;
	 Scanner scan = new Scanner(System.in);
	 int i = scan.nextInt()



*/

public class _12_연산자정리 {
	public static void main(String[] args) {
//		double d = 10.0;
//		d++;
//		System.out.println(d);
		int a = 10;
		boolean b = a%2!=0;
		System.out.println(b);
		
		
	}
}
