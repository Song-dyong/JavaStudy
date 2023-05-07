/*
			   <자바>
			기초: 변수 (하나의 데이터 저장) 			/ 데이터형 (정수: int, byte, long, double, boolean, char)
			 	 연산자 (단항: ++, --, !, 형변환	/ 제어문 (조건문: if / if else / else if  
			 	 	    이항: 산술, 비교, 논리, 대입			 반복문: for / while / 2차 for / for-each
			 	 	    삼항						)		 반복제어문: break / continue 				)
			 	 배열 (1차 배열)
				 문자열 String 
				 		1) equals (문자열 비교)
				 			boolean equals(String s)	=> true / false
				 			DB: WHERE name='홍길동'
				 		2) startsWith (시작문자 비교)
				 			boolean startsWith(String s)=> true / false
				 			DB: WHERE name LIKE='홍%'
				 		3) endsWith (끝 문자비교)
				 			boolean endsWith(String s)	=> true / false
				 			DB: WHERE name LIKE='%홍'
				 		4) contains (문자 포함 비교)
				 			boolean contains(String s)	=> true / false
				 			DB: WHERE name LIKE='%홍%'
				 		5) length (문자 갯수)
				 			int length()				=> 정수
				 		6) indexOf (앞에서부터 문자, 문자열의 위치)
				 			int indexOf(char / String)	=> 정수
				 				**0번부터 시작**
				 			s.indexOf('a' / "a")
				 		7) lastIndexOf (뒤에서부터 문자, 문자열의 위치)
							int lastIndexOf(char / String)
						8) trim (좌우 공백제거)
							String tirm()
						9) valueOf (모든 데이터형을 문자열로 변환)
							valueOf(1) => "1"
								**윈도우 / 웹 => 모든 데이터형이 문자열**
							static String valueOf(모든 데이터형)  => String에서 유일한 static
							String.valueOf(1)
							------- static이므로, 클래스명.valueOf(매개변수) 
						10) replace() (변환 - 문자열, 문자)
							String replace(char, char)
							String replace(String, String)
											a	->	b
						11) replaceAll (변환 - 문자열)
							String replaceAll(String, String)
											  ------ regexp => 정규식
							ex) replaceAll("[가-힣]","") -> 한글 전체를 공백으로 바꾸기
											[A-Z] / [a-z] / [0-9] 
						12) substring (문자열 자르기)
							String substring(int s) => s번부터 끝가지
							String substring(int s, int e) => s번부터 e-1번까지
 							
			class: 설계 -> 속성 	 /	  기능 
						 -----		 -----
						변수(정적)   메소드(동적)
					웹 -> 출력내용 (변수)
						 메뉴, 버튼 (기능 - 메소드)
						 ----------------------------> 요구사항 분석: 필요한 기능들을 찾아내기 (설계의 과정)
						 									-> 추상화: 기능 / 데이터를 단순화
						 										ex) 사원: 사번 / 이름 / 근무지 .. (변수)
						 												 출근하기 / 퇴근하기 / 일하기 .. (메소드)
						 											---------------------------------------
						 											현실의 객체 -> 추상화 -> class 설계 -> new ClassName(); -> 메모리에 저장 (인스턴스)	 
																		cf) Spring은 new 사용 x -> new없이 저장하기 reflection
			1. 구성요소
				class ClassName
				{
					-------------------------------------------------
					변수(속성): 멤버변수
								- 인스턴스 변수  => new 사용시마다 메모리 할당
								- 정적변수 (static) => 한 개의 공간만 생성 (공유변수)
									 			  => 컴파일러에 의해 자동 생성
					-------------------------------------------------
					메소드(동작): 
					-------------------------------------------------
					생성자: 멤버변수(인스턴스) 초기화
							메모리에 저장시 처음으로 호출되는 메소드
					-------------------------------------------------
				}
			2. 사용법
				1) 메모리에 저장
					class A
					{
						변수 / 메소드
					}
					A a; 			선언
					a=new A(); 		메모리에 저장
					
					A a=new A();	선언과 동시에 메모리에 저장
					
					class A
					{
						int sabun;
						String name;
						String getName(){}
						int getSabun(){}
						void run(){}
					}
					A a=new A();
					---
					 a.sabun ==> 100 메모리 주소의 sabun데이터 값 가져오기
					 				.은 메모리 주소 접근 연산자
					--a--
					 100
					-----		new => 데이터메모리를 모아줌 + 주소 확정
							100(주소)-------------------
							sabun 저장 공간 1
							name 저장 공간 "홍길동"
							---------------------------
							getSabun()	=> a.getSabun()
							getName()	=> a.getName()
							---------------------------
							
					
			3. 접근범위 지정
			4. 객체지향의 3대 요소
			5. 클래스의 종류
			6. 예외처리
	------------------------------
		API => 지정된 라이브러리 사용법
	
	class Out
	{
		int aa;
	}
	static class System
	{
		Out out=new Out();
	}
	B b=new B();

			=> System.out.aa
	
	
	class A
	{
		int aa;
	}
	class B
	{
		A a=new A();
	}
	class C
	{
		B b=new B();
	}
	
	C c= new C();
	
	c.b.a.aa -> 접근 방식	if) class c가 static이라면, C.b.a.aa --> static은 클래스명 자체로 호출
	
*/

class Student
{
	int hakbun;
	String name;
}

public class _01_클래스의구성요소_이론
{
	public static void main(String[] args)
	{
		Student hong=new Student();
		
		// hong에 학번, 이름 저장
		hong.hakbun=1;
		hong.name="홍길동";
		Student shim=hong;
		shim.hakbun=2;
		shim.name="심청이";			// 주소가 같기 때문에, hong.name과 hong.bakbun은 심청이와 동일 (얕은 복사)
		System.out.println(hong.hakbun);
		System.out.println(hong.name);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
