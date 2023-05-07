/*
	-----------------------------------------------
	1. 변수 / 2. 연산자 / 3. 제어문 / 4. 메소드 / 5. 클래스
	==> 필수적으로 이해해야하는 것들	
	-----------------------------------------------
									메소드: 연산자 + 제어문
		
		이항연산자
	
	피연산자가 2개
	------------
	1) 산술연산자 	*** ( + , - , * , / , % )
	2) 쉬프트연산자(비트이동연산자) ( << , >> )
	3) 비트연산자			( & , | , ^ )
	4) 비교연산자	***		( == , != , < , > , <= , >= )
	5) 논리연산자	***		( & 직렬 , | 병렬 ) 
		&& => true
		(조건) && (조건)   --> 앞 조건이 false일 경우, 뒤의 조건을 고려하지 않음 (효율적인 연산)
		|| => true(1)
		(조건) || (조건)	--> 앞 조건이 true일 경우, 뒤의 조건을 고려하지 않음.
	6) 대입연산자	***		( = , += , -= , op= ) operation

	page38 : 산술연산자
	
	+ , - , * => 형변환 ***자바에서 모든 연산은 같은 데이터형끼리만 연산
				 ----
				 int + double 
				 ---- double
				 double + double => double
				 ex) 10 + 20.5 => 10.0 + 20.5 ==> 30.5 (자동으로 큰 데이터형으로 변경 후에 계산 )
					'A' + 10 (char+int) => 65 + 10 => 75
					*** char는 모든 연산자를 이용해서 연산처리를 하면, 자동으로 int가 됨.
					 ex) 'A' < 60 -> false
				*** int 이하 (byte, short, char 데이터형 연산시 결과값은 int
				int+long => long
				int+double => double
				char+long => long
				byte+int => int
				char+char => int
				byte+byte => int
				
	/ (나누기) : 정수 / 정수 = 정수 ex) 5/2 = 2, 10/3 = 3 
	           따라서, 평균 구하기에서는 정수 / 실수의 형태로 써야함
	            + 0으로 나누면 에러 발생
																	cf) 프로그램의 기본 (코딩테스트)
																		1) 오류처리 
																		  ex) 문자열을 입력받아서 좌우대칭인지 확인
																		    --> 우선, 글자수가 짝수인지 확인해야함
																		   ==> 프로그램은 항상 견고할 것!
																		   		종료되어선 안됨

	% (나누고 나머지 값) : 결과값은 왼쪽 부호가 남음
			5 % 2 = 1
			-5 % 2 = -1
			5 % -2 = 1
			-5 % -2 = -1
	
	사용자가 정수 3개를 입력 => 결과값 (1.총점, 2.평균)






*/
import java.util.Scanner;   	// 외부에서 클래스를 불러온다
// 키보드로부터 입력된 값을 얻어오는 클래스 : Scanner(scanf())
// BufferedReader => 예외처리

public class _01_산술연산자 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // 클래스 선언   ==> 입력 명령어
//								-- 동적 메모리 할당
//										-------- 키보드 입력값
		System.out.print("국어점수 입력:");
		int kor= scan.nextInt();
		System.out.println("kor="+kor);
		System.out.print("수학점수 입력:");
		int math= scan.nextInt();
		System.out.println("math="+math);
		System.out.print("영어점수 입력:");
		int eng= scan.nextInt();
		System.out.println("eng="+eng);
		// 총점
		int total=kor+eng+math;
		System.out.println("총점은="+total);
		//평균
		double avg = total/3.0;         // 평균값을 계산할 때, 실수가 나와야하므로 데이터형에 double 부여
		//System.out.println("평균은="+avg);
		System.out.printf("ㅇㅇ:%.2f",avg);	// 평균값에서 2자리까지만 출력할 때 명령어 이름(평균):%.2f, 변수이름 (마지막 자리는 반올림)
		scan.close();
	}
}
