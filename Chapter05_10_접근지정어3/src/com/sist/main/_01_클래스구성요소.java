package com.sist.main;

/*
		1. 클래스의 구성요소
			class ClassName
			{
				----------------------------------------------------------
				 변수 (멤버변수)
				 	1) 멤버변수(인스턴스)
				 		=> [접근지정어] 데이터형 변수명; 					// 어느 클래스까지 사용이 가능한지 설정
				 		=> new를 사용할 때마다 메모리가 따로 생성되는 변수
				 		=> new를 이용해서 반드시 메모리를 만들고 사용해야 함
				 		=> 자동 초기화가 됨
				 			기본형
				 				int		=> 0
				 				long	=> 0L
				 				double	=> 0.0
				 				boolean	=> false
				 			참조형(배열, 클래스) => 메모리 주소를 참조해서 
				 								저장된 모든 데이터를 관리
				 							*배열: 같은 크기의 데이터만 관리
				 								ex) 사과박스, 배박스 ...
				 							*클래스: 다른 크기의 데이터 관리
				 								ex) 종합과일세트...
				 							-초기화는 null(주소가 배정되지 않은 상태)
				 	2) 정적변수 (공유변수)
				 		=> 메모리 공간을 한 개만 생성 (모든 객체가 공유)
				 		=> [접근지정어] static 데이터형 변수명;
				 							------- 기본형, 배열, 클래스 모두 가능
				 		=> new를 사용하지 않아도 컴파일러에 의해 자동으로 메모리 생성
				 	
				 	3) 변수 사용 방법
				 		인스턴스 변수
				 		----------
				 			반드시 메모리에 저장 
				 			class A
				 			{
				 				int aa;
				 			}
				 			A a=new A();
				 			a.aa=100;
				 			--> 객체(인스턴스)를 통해서 접근해야함
				 		
				 		정적 변수
				 		-------
				 			class A
				 			{
				 				static int a;
				 			}
				 			메모리 할당을 하지 않아도 저절로 생성
				 			A.a=100;
				 			--> 클래스명을 통해 접근 가능 => 클래스변수, 공유변수
				 	
				 	*** 보안 중심
				 		1) 모든 멤버변수는 private를 통해 데이터 은닉화
				 		2) private 멤버변수는 Getter/Setter를 통해 초기화 및 사용
				 	*** 멤버변수는 사용이 가능한 옵션: static, final(상수)
				----------------------------------------------------------
				생성자
					특징
						1) 생성자는 클래스명과 동일
						2) 생성자는 리턴형이 없음 
						3) 오버로딩 (중복메소드) => 생성자는 필요시에 여러 개 만들 수 있음
							*** 생성자를 만들지 않는 경우 (컴파일러가 자동으로 기본생성자 생성)
							오버로딩: 같은 메소드명으로 여러가지 기능을 만들어서 사용
									-메소드명 동일
									-매개변수의 갯수, 데이터형이 다름
									-한 개의 클래스 안에서 만들어짐
									-리턴형은 관계 없음
								ex) 
									plusInt (int a, int b)
									plusDouble (double d1, double d2)
									plusString (String s1, String s2)
									plusChar (char c1, char c2)
									plusByte (byte b1, byte b2)
									plusIntDoulbe (int a, double d)
									plusCharInt (char c, int a)
									plusStringInt (String s, int a)
									...
									plus (int a, int b)					--> 오버로딩 (같은 메소드를 여러 개 사용) -> 다형성
									plus (double d1, double d2)
									plus (String s1, String s2)
									plus (char c1, char c2)
									plus (byte b1, byte b2)
									plus (int a, double d)
									plus (char c, int a)
									plus (String s, int a)
							= 역할
								게시판
								이름 / 내용 / 제목
								-> 이름 + 제목 / 이름 + 내용 / 이름 + 내용 + 제목...
									method(int a) / method(int b) --> 같은 메소드 (오버로딩x)
								=> 객체 생성시에호출되는 메소드
									생성자 호출시에는 반드시 new + 생성자() 필요
								=> 멤버변수의 초기화
									외부에서 데이터를 읽어서 초기화(구현)할 때 多
										*** 초기화
										1. 명시적 초기화
											class A
											{
												int a=10;
												static int b=20;
											}
										2. 초기화 블록: 멤버변수, static변수 초기화가 가능
											=> this 사용 가능
											class A
											{
												int a;
												{
													for(int i-0;i<10;i++;		// class 블럭 안에서 for문 while 같은 제어문은 사용 불가능
													{							// for문 자체를 초기화 블록으로 감싸야 함.
														a=i;
													}
												}
											}
										3. static 초기화 블록: static만 초기화 가능
											=> this 사용 불가능
										4. 생성자: 멤버변수, static변수 초기화 가능
											=> this 사용 가능
											class A
											{
												int a;
												A(){
													for(int i-0;i<10;i++;		
													{							
														a=i;
													}
												}
											}
											*** 인스턴스 변수는 생성자를 주로 이용
												static변수는 생성자보다 static블록을 많이 사용
													why? static은 new를 사용하지 않으므로, 기본생성자가 생성되지 않기 때문에
															초기화블록은 자동 호출이 가능
					순서
				명시적 초기화 ==> static 블록 ==> 인스턴스 블록 ==> 생성자				
					-> 초기화 ( 1.윈도우 / 2.네트워크 연결 / 3.파일 읽기 / 4.데이터베이스 ) ==> 시작과 동시에 실행해야하는 경우, 초기화 필요!
					-> 오버로딩을 지원 
					   ------ 생성자를 여러 개 사용할 수 있음
					   class A
					   {
					   		this() -> 자신의 생성자를 호출할 때!
					   		----> 구분자: 지역변수와 멤버변수가 같은 경우에 구분
					   		A()
					   		{
					   			=> 기본 생성자 => 생성자가 존재하지 않는 경우 자동 생성				
					   		}
					   		this(10)
					   		A(int a)
					   		{
					   				다른 생성자 호출 가능
					   				this() --> 생성자 블록 첫 줄에만 사용 가능 / 기본 생성자 호출
					   			=> 초기값을 주기 위해서 사용자로부터 받을 때
					   		}
					   		this(10, "")
					   		A(int a, String s)
					   		{
					   			=> 초기값을 주기 위해서 사용자로부터 받을 때
					   		}
					   }
						==> 멤버 메소드 (static이 아닌 메소드)
							=> 모든 멤버변수, 멤버메소드 사용 가능
							=> static은 멤버가 아니기 때문에 (공유), static 메소드는 지역(멤버)를 사용할 수 없음
							=> 사용해야한다면, 객체를 생성(new)한 뒤에!
				----------------------------------------------------------
				메소드: 	다른 클래스와 연결 담당
						멤버변수에 대한 제어
						반복 제거 / 재사용 / 수정 ... 
								--------------
									한 가지 기능만 수행하도록 만들 것!
						메소드는 호출시에 처음부터 끝까지 수행 => 호출한 위치로 돌아감
						웹에서 동작하는 부분 = 메소드
						-----------------------
						메뉴 클릭 / 버튼 클릭 / 이미지 클릭 ... -> 메소드
						
					멤버메소드
						[접근지정어] 리턴타입 메소드명 (매개변수 목록) <선언부>
						{
							<구현부>
						}
					공유메소드
						[접근지정어] static 리턴타입 메소드명 (매개변수 목록) <선언부>
						static [접근지정어] 리턴타입 메소드명 (매개변수 목록) <선언부>
						{
							<구현부>
						}
					
				메소드 호출
					멤버메소드
						클래스 객체명 = new 생성자 ();
						객체명.메소드();
					공유메소드
						클래스명.메소드();

				메소드 유형
				-----------------------
				리턴타입 			매개변수
		(한 개만 사용 가능			여러 개가 있는 경우도 있음 (최소화)
	-> 결과값이 많으면 배열, 클래스)
		 		 -----------------------
					리턴타입		매개변수
		 		 -----------------------
		 		 	  O			  O		==> 가장 많이 사용
		 		 	  자바 자체에서 처리(main 코딩) / 자바에서 브라우저로 데이터 보내기
		 		 -----------------------
		 		 	  O			  X		
		 		 -----------------------
					  X			  O
		 		 -----------------------
					  X			  X
		 		 -----------------------

				ex) 
					사용자 로그인 요청
					boolean 	String id, String pwd
					
					더하기 요청
					int			int a, int b

					검색 요청
					String[]	String 검색어
					--> Stirng[] find (String findData)
					
					상세보기
					Movie detail (int 영화번호)
					
				----------------------------------------------------------
			}



*/
class C
{
	int a;
}
class B extends C
{
	int a=20;
	void display(int a)
	{
		System.out.println(a);				// 지역변수인 a 출력
		System.out.println(this.a);			// 멤버변수인 a 출력
		System.out.println(super.a);		// 상속 받은 상위 클래스의 a 출력
	}
}

class A
{
	int a=10;
	A()
	{
		System.out.println("변경 전 생성자 초기화 블록: a="+a);
		a=1000;
		System.out.println("변경 후 생성자 초기화 블록: a="+a);
		System.out.println("변경 전 생성자 초기화 블록: b="+b);
		b=2000;
		System.out.println("변경 후 생성자 초기화 블록: b="+b);
	}
	static int b=20;
	{
		System.out.println("변경 전 인스턴스 초기화 블록: a="+a);
		a=100;
		System.out.println("변경 후 인스턴스 초기화 블록: a="+a);
	}
	static
	{
		System.out.println("변경 전 static 초기화 블록: b="+b);
		b=200;
		System.out.println("변경 후 static 초기화 블록: b="+b);
	}
	
}

public class _01_클래스구성요소
{
	public static void main(String[] args)
	{
		
		A aa=new A();
		System.out.println(aa.a);
//		System.out.println(aa.b);  --> static 값은 클래스명으로 바로 호출이 가능하기 때문에, 굳이 aa.b로 호출하지 않아도 가능
		System.out.println(A.b);
		
	}
}
