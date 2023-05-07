
/*
 *  
     1 page 
    1995년 5월 23일 자바 탄생 (javaday) 
    --------------------- Java Applet (동적 => 브라우저)
    이전 => 자바 (게임기) => 세븐스타 (듀크) => 임베디드 => 모바일 
    ---- 리모콘 (통합 => 그린 프로젝트 => 제임스 고슬링 / 아서 벤)
    ---- 후언금이 없어서 망하다. 
    ---- 인수업체 => 네스케이프 (웹 업체) --> 이로 인해, 자바는 웹과 모바일에 특화
                   네스케이프 => 자바스크립트 => 웹 프로그램 발전
    1995년 5월 23일 자바 탄생 : 자바
    						Java(제임스의 ja / 벤의 va)
    MYSQL을 인수 => 부도 ==> 오라클이 인수 : 자바의 유료화 
    제임스 고슬링 => 연봉협상 실패 => 구글 (GO)
    
    1970 / 1980
    ----   ----
     C     C++(C With Class)   ==> Java( 단순화 )
     							   ------------ CBD (component develope data --> 검색해서 찾아오기)
 *  한줄 주석
 *  여러줄 주석  --> ctrl + shift + /  or 드래그 한 부분에 ctrl + /     /// 주석 풀기 : ctrl+ shift + \
    = 기본 문법 사항 ( 19 page )
		
		1. 파일명과 클래스명은 동일하다
		   Class A = A.java
		
		2. 클래스 안에는 반드시 main() 영역 하나를 포함해야된다.
									----- 시행시에 제일 먼저 찾아주는 영역 ( 시작점 )
		3. 클래스명의 첫자는 대문자로 시작 (문법이 아닌 java 개발자간의 약속!)
		   클래스명은 한글로도 가능 (but! 한글 인식이 안되는 경우가 잦으므로, 영어로)
		4. 자바의 표현법
		   문자열   ==> 문자 여러 개 사용 ==> "  "
		   문자    ==> 한 개의 글자 ==> '  ' ex) 'H', '홍'
		   숫자    
		       ==>  정수 / 실수 
		        -> 10진법
		        ->  8진법
		        -> 16진법
		        ->  2진법, 0b000111
		        -> 10.11, 10.11F
		           double float
		           8byte  4byte
		   논리    ==> true / false
		   특수문자 ==> \t  tab 일정 간격
		   			  \n
		   			  \"
		   			  \\
		   메소드 : 기능 수행 (java)
		   함수   : 기능 수행 (C / Python)
			--> 차이점? class 안에 있는지 여부
			============================
			메소드와 함수의 차이점 / 오버로드와 오버라이딩   --> 기술 면접의 단골문제

=========================================================

		1. 표현법
		   정수 / 실수
		   10진법  10, 20....
		   8진법  0XXX (0~7)
		   16진법 0xXXX (0~9, A~F)
		   				0~15 10(A) 0xA 0xFF
		   2진법  0bXXXX (0~1)
		
		2. 문자
			문자 여러 개 " " / 한 개 ' '
		
		3. 논리
			true / false
		
		4. 주석 
		한 줄 주석   //
		여러 줄 주석 /*
		
		5. 실행 과정
		A.java ======> 컴퓨터가 인식하는 언어로 변경 ======> 실행
		-----			컴파일 ( javac ) ==> A.class   인터프리터 java
		               컴파일은 0,1의 컴퓨터가 이해하는 언어로 바꾸는 것.
		           이클립스 내에서의 ctrl f11은 컴파일과 실행을 한 번에
		원시소스 (프로그래머만 아는 언어)
		
		=> 언어에는 2가지 방식이 있음
		 1) 컴파일 방식 : C / C++ 
		 2) 인터프리터  : HTML / XML / Java
		
		
		
 */



public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		  System.out.println("Hello Java!!"); System.out.println("Hello Java!!");
//		  
//		  
//		  System.out.println(012); // 앞에 0이 붙어있으므로, 8진법  ==> 출력 : 10
//		  System.out.println(0x13); // 0x가 붙으면 16진법 ==> 출력 : 19 ex) 0x111 ==> 196 + 16 + 1 --> 217
//		  System.out.println(0b000111); // 7  --> 1 + 2 + 4   
//		  									// x -> 16 / b -> 2 / 0 -> 8
//
//		  System.out.println("Hello\tJava"); // \t   tab으로 일정 간격 부여
//		  System.out.println("Hello\nJava"); // \n   다음 줄 출력      (사용 빈도 多)
//		  System.out.println("\"홍길동\"");   // \"   " 표시 
//		  System.out.println("Hello \\ Java");   // \\   \ 표시       (사용 빈도 多)
//		  System.out.println("C:\\javaDev"); // 파일 경로를 쓸 때, 자주 사용
//		  System.out.println(10);
//		  System.out.println('A');
//		  System.out.println(true);          // 같은 프린트 함수이지만, ""로 사용되는 함수와 정수, 문자, 논리의 함수는 다른 함수
//		  									 //  오버로딩 --> 하나의 함수에 여러 메소드가 활용되는 것.
		 
		
		
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	}

}
