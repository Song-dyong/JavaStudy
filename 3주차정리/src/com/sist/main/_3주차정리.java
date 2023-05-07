package com.sist.main;

/*
  
  		인강 듣기 4 -> 예제 다시 따라하기 4 -> 
  
  
		class: 한 개에 대한 설계 (사원 -> 1명 / 자동차 -> 1대 / 영화 -> 1개)
		-----------------------------------------------------------
		변수 	====> 배열 					====> 구조체 					====> 클래스		
		---한 개만 저장 --- 같은 데이터형 여러 개 저장	  ----다른 데이터형 여러 개 저장	 ------ 다른 데이터형 여러 개 저장 + 메소드
												(클래스가 있기 때문에 없어짐 C에서만 존재)
		
		명령문 => 변수선언 + 연산처리 + 제어문
				----------------------- 
				  메	 	  소		  드
		
		클래스: 변수 여러 개 ---> 사용자 정의 데이터형 (일반 기본형과 동일)
			  변수 + 메소드		└배열 이용 가능 / 형변환 가능
			  ----------
		==> 클래스 영역
			--------- 선언 / 구현
			변수 선언
			int a;	->  선언과 동시에 초기화 가능: int a=10;
			a=10; 	-> 구현x => 생성자 / 초기화블록
			메소드 선언
			리턴형 메소드명 (매개변수목록)
			{
				구현
			}
			
								클래스 내에서 구현하려면,,,	구현? 제어문, 변수값 읽기, 변수 변경, 파일 읽기
			class A
			{
				{					=> 1) 초기화 블록
				}
				A()					=> 2) 생성자 블록: 시작과 동시에 변수 초기화
				{
				}
				void display()		=> 3) 메소드 블록: 사용자 요청시에 초기화 (일반 메소드)
				{
				}
			}
			
		
		생성자
			1. 클래스명과 동일
			2. 리턴형이 없음
			3. 생성자는 여러 개를 만들 수 있음 (오버로딩)
			4. 생성자를 사용하지 않으면 자동 기본 생성자가 첨부
			5. 사용처
				명시적 초기화가 안되는 부분에서 주로 사용
				시작과 동시 처리가 있는 경우 (데이터베이스 연결, 서버 연결 등...)
				객체 생성시 호출되는 메소드
			6. 호출시에는 new 생성자()
					   -----------
				class A
				{
					int a;
					static int b;
					void aaa(){}
					static void bbb(){}
					A(){}
				}
				
				a, aaa() 호출하려면?
				A aa=new A()
				aa.a, aa.aaa() ==> 인스턴스 호출시 (객체를 통해서 접근)
				
				b, bbb() 호출하려면?
				A.b, A.bbb()
				
				A()
				new A()
				
				****** 인스턴스 메소드: 인스턴스 변수, 메소드, static 변수, static 메소드
										전체를 사용 가능
				****** static 메소드: static변수, static메소드만 사용 가능
						=> 인스턴스를 사용하기 위해서는 객체 생성 후에 사용 가능
				
			3-1) 오버로딩: 같은 메소드이름으로 다른 기능을 수행하게 만드는 기법
					=> 중복 메소드 정의
						-같은 클래스 안에서 생성
						-메소드명이 동일해야함
						-매개변수의 갯수나 데이터형이 달라야 함
						-리턴형은 관계 없음
				----------------------------------------------------
				void aaa()				==> aaa() 메모리 상 저장
				int aaa(int a)			==> aaa(int a) 메모리 상 저장	--> 2번째와 3번째는 같은 메소드로 인식되어 오류 발생 
				double aaa(int a)		==> aaa(int a) 메모리 상 저장
				char aaa(int a, int b)	==> aaa(int a, int b) 메모리 상 저장
					

*/
import javax.swing.*;
class Sawon	// 오버로딩
{
	int sabun;
	String name;
	String dept;
	String loc;
	//기본생성자
	Sawon(){
		// 변수의 초기화가 동일
		sabun=1;
		name="홍길동";
		dept="개발부";
		loc="서울";
	}
	Sawon(int sabun1, String name1)
	{
		this();											// 디폴트로 지정했던 "개발부"와 "서울"을 받음 Sawon()호출 
		sabun=sabun1;									// 생성자 내에서 생성자를 호출할 때 this (생성자 안에서만 사용 가능 / 가장 첫 줄에 와야함)
		name=name1;
	}
	Sawon(int sabun1, String name1, String dept1)
	{
		sabun=sabun1;
		name=name1;
		dept=dept1;
	}
//	Sawon(int sabun1, String name1, String dept1, String loc1)
//	{
//		sabun=sabun1;
//		name=name1;
//		dept=dept1;
//		loc=loc1;
//	}
	public Sawon(int sabun, String name, String dept, String loc) // alt + shift + s -> generate constract using fields
	{
		this.sabun = sabun;
		this.name = name;
		this.dept = dept;
		this.loc = loc;
	}
	
}

class Student	// 변수 우선순위
{
	int hakbun;
	String name="홍길동";
	static String school_name;
	// 변수의 우선순위 = 지역변수 > 멤버변수 
	void display() {
		String name="박문수";			// 위의 전역변수에 "홍길동"을 주더라도, 인스턴스 메소드 내에 인스턴스 변수 "박문수"를 주면, "박문수" 출력
		System.out.println(name);
		System.out.println(this.name); // this를 사용하면, 클래스 자신이 가지고 있는 변수 자체(멤버변수)를 의미
	}								
	
	void aaa()
	{
		hakbun=1;
		name="홍길동";
		school_name="SIST";
		bbb();
	}							// 인스턴스 메소드 내에서는 모두 사용 가능
	static void bbb()
	{
		school_name="SIST2";	// static 메소드 내에서는 static만 사용 가능
		Student s=new Student();	// 따라서, Student 클래스의 객체를 반드시 생성해야함.
		s.hakbun=2;
		s.name="심청이";
		s.aaa();
	}
}
public class _3주차정리 extends JFrame
{
	JButton b,b2;
	
	_3주차정리()
	{
		b=new JButton("click");
		b2=new JButton("Click");
		add("North",b);
		add("South",b2);
		setSize(350,350);
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
//		new _3주차정리();
		Sawon s1=new Sawon();
		System.out.println(s1.sabun);	// 1
		System.out.println(s1.name);	// 홍길동
		System.out.println(s1.dept);	// 개발부
		System.out.println(s1.loc);		// 서울 
		
		Sawon s2=new Sawon(2,"박문수");
		System.out.println(s2.sabun);	// 초기값으로 생성 -> 기본 생성자 값을 가져옴 
		System.out.println(s2.name);	// but! 매개변수 2개를 사용하면, 2번째 생성자를 사용하므로, dept와 loc가 null 값
		System.out.println(s2.dept);	
		System.out.println(s2.loc);
//		Sawon s3=new Sawon(3,"심청이","자재부");
//		System.out.println(s3.sabun);	
//		System.out.println(s3.name);	
//		System.out.println(s3.dept);	
//		System.out.println(s3.loc);	
//		Sawon s4=new Sawon(4,"이순신","기획부","부산");
//		System.out.println(s4.sabun);	
//		System.out.println(s4.name);	
//		System.out.println(s4.dept);	
//		System.out.println(s4.loc);		
		
		
		
	}
}
