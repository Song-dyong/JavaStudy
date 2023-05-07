package com.sist.exception;

/*
		에러 => 컴파일(.javac) / 실행(.java)
			   ------------	   ---------
			   Check			UnCheck
			   	 |				   |
		자바문법(반드시 예외처리)		생략 가능
		
			*에러 종류
		---------------
		1. 수정 불가능한 에러 (심각한 오류): 메모리 부족 / 윈도우 덤프
		2. 수정 가능한 에러	  (가벼운 오류): 소스 상에서 수정가능 
					ex) 파일읽기할 때 파일명 다름 / 배열의 인덱스를 벗어난 경우 / 웹 연결시 URL주소 틀림
						==> Exception (예외처리)
			*발생 원인
		----------------
		1. 프로그래머의 실수
			   => 초기화 값이 없는 상태에서 비교
			   => 배열 인덱스 오류
			   => 무한루프
			   => 파일명 오류
		2. 사용자 입력 오류
			   => 나누기할 때, 0입력
			   => 정수입력에 문자열 입력
			   		--> 웹에서는 <유효성 검사>를 통해 해결
			
			*예외처리 목적
		-----------------
		1. 견고한 프로그램을 만들기 위해 (비정상 종료 방지)
		2. 사전에 에러를 방지하기 위해 
		
			*예외처리 순서
		-------------------
		1. if문 사용 --> 사전에 에러 방지
		2. 복잡한 에러 or if문으로 해결 불가능한 에러 --> 예외처리 사용
			ex) 웹 404(파일이 없는 경우) / 500(소스오류) / 415(한글변환) / 400(값을 잘못 받은 경우) / 403(접속거부)
													 UTF-8
		
			*예외처리 종류
		-------------------
		1. 예외 발생시 <복구>
			try~catch
				형식)
					try
					{
						<정상수행하는 문장>
						int a=10;
						int b=0;
						double d=a/(double)b;	--> 오류 발생 --> catch로 이동
						System.out.println(d);	(오류발생 뒤의 문장은 수행 x)
					}catch(Exception e)
					{
						<예외 발생시 처리하는 영역>	
					}
					-----이후의 문장-----
					-----이후의 문장-----
					
					사용자로부터 문자열을 받아서 정수 변경 후에,
							  -----------------------catch(NumberFormatException e)	{
					배열에 저장
					--------}catch(ArrayIndexOutOfBoundsException e){
					나누기를 한 후에 출력
					-----------}catch(나누기...){
					}catch(Exception e){기타 모든 오류}
		2. 예외 발생시 <회피>
			throws
		3. 일부러 예외 발생 (테스트할 경우)
			throw
		4. 사용자 정의 예외
			-> 지원하지 않는 예외가 존재
		
			*예외처리의 계층구조
		-----------------------
			  Object
				|
			Throwable
				|
	-------------------------
	|						|
  Error					Exception
  							|
  				----------------------------------------
  				|										|
  			CheckException						UnCheckException 
  				| (반드시 예외처리)							|	(필요시에만 사용)
  				|								RuntimeException
  			IOException	(입출력) 							|												  |
  			-> 메모리, 파일, 네트워크 입출력			1) NumberFormatException							2) NullPointerException
  				java.io -> 클래스가 동일			문자열 ==> 정수형으로 변경					주소가 할당되지 않은 상태에서 참조변수를 사용할 경우
  			SQLException (오라클 연동)				중간에 공백이 들어가면, 오류 발생						객체 초기화가 안된 상태 (참조할 주소가 없음)
  				java.sql -> 네트워크 통신		정상입력을 기본적으로 상정하기 때문에, 오류처리를 굳이 안함		객체를 선언하기만 하면 null값이 배정됨
  			자바응용프로그램 <=====> 오라클			
  				(C)				  (S					3) ArrayIndexOfOutBoundsException			
  			  Client			 Server							배열 범위를 초과하여 값을 부여할 경우
  			웹에 출력하는 모든 데이터 => 오라클				4) ArithmeticException
  				자바	===========> 오라클							0으로 나누기할 경우
  				   		|								5) ClassCastException
  			오라클이 인식하는 언어로 변환(SQL)							클래스 형변환이 틀린 경우
  		ClassNotFindException							6) IllegalArgumentException
																부적절한 인자 전달
	==> 앞서 배운 내용에서는 예외처리를 해도 되고 안해도 됨		7) IndexOfOutBoundsException
		뒤의 라이브러리는 예외처리 필요								문자열 관련
		IO / SQL 등등...
		
		MalformedURLException -> URL주소가 틀린 경우
		InterruptedException  -> 쓰레드 충돌
		

	예외 의미 => 프로그램에서 돌발적으로 (의도하지 않은 상황) 문제가 발생
				-> 프로그램은 에러시에 비정상 종료
				-> 비정상 종료를 방지하고, 정상적으로 종료가 가능하게 만드는 과정 (예외처리)
	
	
*/
class BBBBB
{
	
}
class CCCCC extends BBBBB
{
		// cc.disp('A', 10, 'B');
	public void disp(int a, int b, int c)
	{
		System.out.println("1");
	}
	public void disp(int a, char b, byte c)
	{
		System.out.println("2");
	}
	public void disp(char a, char b, int c)
	{
		System.out.println("3");
	}
}
class Aaaaa
{
	public void display()
	{
		System.out.println("A.display() Call");
	}
	
}
 
public class _02_예외처리1
{
	static String s;					// NullPointerException --> 초기값이 null --> null에 대한 equals는 없기때문에 오류
	static Aaaaa a;
	public static void main(String[] args)	// "  " -->를 부여하면 주소값 배정 
	{
		String ss="Hello Java!!";
		System.out.println(ss.substring(ss.indexOf("e"), ss.lastIndexOf("J")));
		CCCCC cc=new CCCCC();	// java.lang.ClassCastException --> 크기가 작은 클래스를 큰 클래스로 형변환 불가 
//		int[] arr=new int[2];
		cc.disp('A', 10, 'B');
		System.out.printf("%d %c %s\n",10, 65, "30");
//		arr[2]=10;						// 배열의 범위를 초과할 경우, ArrayIndexOutOfBoundsException
		
//		a.display(); 					// 선언만 했을 경우, 메모리가 할당되지 않았으므로 
//		System.out.println(10/0);
		System.out.println("1");
//		if(s.equals("Hello"))
		{
			System.out.println("ok");
		}
		
		int a=10;
		int b=0;
		// 예외처리 if문
		
		if(b!=0)		// 정상 수행 ==> try
		{
			int c=a/b;
			System.out.println("c="+c);
		}
		else			// 예외처리 ==> catch
		{
			System.out.println("0으로 나눌 수 없다");
		}
		// 1. 정상적으로 종료가 되게 만든다
		// 2. 우선 if문으로 처리가 가능한지 확인 ==> 주로, 검색용도 or 사용자 입력 제한
		// 3. if로 불가능하다면, java에서 제공하는 예외처리를 이용
		
//		Thread.sleep(1000);
		
		String page=" 1";
//		System.out.println(Integer.parseInt(page));	// NumberFormatException " 1" --> 공백때문
		
		
		
	}
}
