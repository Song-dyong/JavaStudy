package com.sist.main;

/*
											cf) 인터페이스가 어디서 사용되는지? --> 응용을 통해 깨닫기
		
		
		인터페이스: 추상클래스의 일종 (보완)
			1) 특징
				1| 다중 상속
				2| 인터페이스는 클래스와 동일 (상속을 받으면 상위클래스)
				3| 설계만 되어 있음 (구현이 안된 메소드의 모음) 
				4| 선언만 되어있으므로, 상속을 통해 구현해야함 (오버라이딩)
			2) 장점
				1| 기능 설계 --> 개발시간의 단축
				
					cf) 프로그램 설계 과정 
					 <아키텍쳐 PM>    <DBA>							<퍼블리셔>   <웹 프로그래머>	<테스터>   <PL>
					 	(3개월)			(1개월)						(1개월)		(2개월)		(1개월)	(1개월)
					 요구사항 분석 --> 데이터베이스 설계 --> 데이터 수집 --> 화면 UI제작 --> 구현 --> 	테스트 --> 배포 
					-------------------------------------------	  	
					추상클래스 / 인터페이스 설계의 과정 	
					
				2| 표준화 가능: 같은 메소드 사용
					------Spring (통합)
					프레임워크
				
				3| 서로 관계없는 클래스 연결해서 사용 가능
				4| 유지보수 편리 (수정)
				5| 독립적으로 사용 가능
		--------------------------------------------------
			인터페이스의 핵심: 클래스 여러 개를 묶어서 한 개의 이름으로 제어
								 class List(★★★)		
										|	-> 가변형 배열 (Map, Set, 
				-------------------------------------------------
				|			|			|			|			|
			ArrayList   LinkedList	  Vector	  Queue		  Stack
		
		List list = new ArrayList();
		list = new Vector();
		list = new linkedList();
		list = new Queue();
		list = new Stack();

		웹에서 가장 많이 사용하는 3대 라이브러리
		--------------------------------
		1. String
		2. List
		3. Integer(int를 사용하기 편리하게 만든 클래스)
		
			웹 / 윈도우 --> 모든 데이터형 (String)
		page=1 --> "1" => 1 (Wrapper 클래스 - 데이터형에 기능을 추가한 클래스)
		 ex)
		 	<input type=text>    -->  문자열로 입력
		 	JTextField --> 문자열로 넘어옴 --> 필요에 따라 데이터형으로 바꿔야 함 (Wrapper 사용)
		 	
		 	3) 형식
		 		[접근지정어] interface InterfaceName
		 		{
		 		-----------------------------------------------
				상수
					int a; --> 오류	(앞에 public static final 생략) 
					int a=10; --> 항상 값을 부여 (상수형이므로)
					(public static final) int a=10; 
		 		-----------------------------------------------
		 		추상메소드
		 			void display();  --> 추상메소드이므로 선언만!
		 			(public abstract) void display(); 생략되어있음
		 			
		 		-----------------------------------------------
		 		}
		
		cf) 자동으로 컴파일러가 생성하는 5가지
		1. import java.lang.*; --> String / Math / System 등등
		2. return; --> 메소드 void aaa()
							{ (return;) }
		3. 생성자	   --> class A
						{ A(){}	}
		4. 인터페이스
			변수선언: (public static final) int a=10;
		5. 인터페이스
			메소드 	1) (public abstract) void display();
				 	2) (public) default void aaa(){}		
		==> interface는 상수, 메소드 상관없이 모두 public이어야 함!!!
			
			4) 상속과정
				interface A { }
				class B extends A { } --> 오류 --> extends(확장)가 아니라, implements(구현)을 써야함
				
				1| interface ===> 	interface
					interface A
					interface B extends A 		--> interface는 구현이 불가능하므로, 같은 인터페이스에 내려주는 것은 상속(extends)
				2| interface ===> 	class
					interface A
					class B implements A 		--> class는 구현해야하므로, 구현(implements)
				3| class	 ===> 	interface
					class A
					interface B (   ) A 		--> 오류
				
				ex)
					interface A
					interface B extends A
					class C implements B 	==> 단일상속
					
					interface A
					interface B
					class C implements A, B ==> 다중상속
					
					interface A
					interface B
					class C
					class D extends C implements A, B ==> 클래스와 인터페이스에게 동시에 상속받기
					
					class E extends JFrame implements MouseListener, KeyListener, ActonListener, Runnable
						=> 게임을 만들기 위해, 마우스, 키보드, 버튼, 쓰레드 인터페이스를 동시에 상속받기
		247page
		
		 인터페이스에서 일반메소드 불가능!!
		 			-------- void a(){}
		 			추상메소드: void a();   					==> (public abstract) 생략
		 			디폴트메소드: default void a(){} --> 가능!	==> (public) 생략
		
					
		interface A
		{
			void aaa();
		}
	
		class B implements A
		{
			void aaa(){} ==> 오류 public이 없으므로
		}
		
		class B implements A
		{
			public void aaa(){} --> O 
		}			
			
		1) 인터페이스는 객체를 생성할 수 없다 => 구현이 안된 메소드를 가지고 있기 때문에, 메모리에 저장이 불가능하다!
			인터페이스 = new 구현한 클래스 ()
			단! 익명의 클래스를 이용하면 객체를 생성할 수 있음.
		2) 인터페이스는 다중상속 가능
			class A implements 인터페이스, 인터페이스, 인터페이스 .... (, 를 이용해서 다중상속)
					
					
					
*/

//interface AA
//{
////	private int a=10; 		// interface는 무조건 public --> 접근지정어를 private로 하면 오류
//	void display();			// public abstract 생략되어있음
//	
//}

interface AAA
{
	int a=10;
	void aaa();
}
interface BB
{
	int a=20;
	void bbb();
}
class CC implements AAA, BB
{
	//AA.a BB.a --> 변수명이 같아도 충돌하지 않음 
	public void print() {
		System.out.println(AAA.a);
		System.out.println(BB.a);
	}

	@Override
	public void bbb()
	{
		// TODO Auto-generated method stub
		System.out.println("BB.bbb()구현");
	}

	@Override
	public void aaa()
	{
		// TODO Auto-generated method stub
		System.out.println("AAA.aaa()구현");
		
	}
}

public class _03_인터페이스
{
	public static void main(String[] args)
	{
//		CC c=new CC();
//		c.print();
//		c.aaa();
//		c.bbb();
		CC c=new CC();	// c는 print(), aaa(), bbb() 모두 호출 가능
		c.print();
		c.aaa();
		c.bbb();
		System.out.println();
		
		///////////////////////////
		AAA aaa=new CC();	// implements도 extends와 동일하게 적용됨 --> 단, AAA의 aaa를 만들었으므로, BBB의 메소드는 사용할 수 없음
		aaa.aaa();			// aaa.bbb(); 불가능 							aaa메소드는 class C에서 구현된 메소드를 사용
		System.out.println("aaa.a = "+aaa.a);
		
		BB bb=new CC();		
		bb.bbb();
	}
}
