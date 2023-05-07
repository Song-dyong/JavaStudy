package com.sist.lib;

/*
		사용자 정의 클래스 + 라이브러리
		------------------------- 조립 --> 자바 프로그램
		1) 자바의 모든 클래스 (라이브러리 클래스, 사용자 정의 클래스)
			=> 모든 클래스의 상위 클래스 : Object
		
		2) 자바에서 지원하는 라이브러리
			1| java.lang : 자바의 기본 클래스 (가장 많이 사용되는 라이브러리)
					--> import 생략
					--> Object / String / StringBuffer / Wrapper / System / Thread
			2| java.util : 유용하게 사용이 가능하게 만든 라이브러리
					--> Scanner / StringTokenizer / 자료구조(데이터 쉽게 관리) / Date / Calendar ...
													---------------------
			3| java.io : 입출력 관련 (메모리 , 파일, 네트워크) ==> CheckException 
			4| java.net: 네트워크 						==> CheckException
			5| java.sql: 데이터베이스 연결
			6| java.text: 변환할 때 (날짜 형식, 문자열 형식)
		------------------------------------------------------------------------ Web관련 라이브러리
		------------------------------------------------------------------------ Spring 관련 라이브러리
		------------------------------------------------------------------------ 데이터수집 (Jsoup, JSON) 라이브러리
		
		
		자동처리
		1) import.java.lang.*
		2) 메소드에서 리턴
			void method()
			{
				return; => 자동추가
			}
		3) 생성자
			class A
			{
				public A(){} => 자동추가
			}
		4) 상속
			class A extends Object => 자동추가
		---------------------------------------
		java.lang에서 지원하는 클래스는 대부분 final 클래스
			=> 상속을 받아서 확장할 수 없음 (있는 그대로 사용)
			=> 상속을 받아서 확장 가능 (Object클래스)
			=> Object : 모든 데이터형을 받을 수 있음
				ex) Object o=10; / Object o="A"; ...
				--> 데이터형을 여러 개 사용시에는 라이브러리에서 리턴형이 대부분 Object
					--> 형변환을 사용해야 사용 가능
					--> 클래스 형변환 -> (int)new Object()
									 (Integer)new Object()
			 			Wrapper 클래스는 클래스지만 자체에 값을 넣을 수 있음
			 			Integer i=10; (오토박싱)
			 			int i=new Integer(10) (언박싱)
			
			Object
				주요기능)
					finalize() : 소멸자 (메모리할당을 해제할 때 호출)
					toString() : 객체를 문자열로 변환
					clone()	   : 새로운 메모리를 생성하면서, 값들 복사
					getClass() : 클래스 객체 읽기
					equals()   : 객체 자체를 비교할 때
			


*/

class Student{
	private int hakbun;
	private String name;
	
	public Student()
	{
		super.getClass();
		this.hakbun=1;				// this. 은 생략이 가능하지만, 지역변수와 멤버변수(인스턴스)가 같은 이름일 경우, this를 붙여 구분
		this.name="홍길동";			// this는 해당 클래스가 가진 멤버변수를 의미 super의 경우, 상속받은 상위클래스의 변수 혹은 메소드를 호출할 수 있음
		System.out.println("생성자: 멤버변수에 대한 초기화");	// 아무것도 상속받지 않은 상태에서 super는 Object를 의미 
	}
	
	public void print()
	{
		System.out.println("학번: "+hakbun+", 이름: "+name);
	}
	
	// 소멸자 finalize()
	@Override
	protected void finalize() throws Throwable
	{
		System.out.println("객체 메모리 해제");
	}
	
	
	
	
}

public class _02_라이브러리_Object
{
	public static void main(String[] args)
	{
		// 메모리 할당(저장) (new 생성자())
		Student student=new Student();
		// 객체 활용 (메소드 호출, 변수 변경)
		student.print();
		// 객체 메모리 해제 (메모리에서 삭제)	==> 가비지컬렉션 자동호출로 삭제 but! 해제가 안되는 경우 多 --> 강제 해제
		student=null;					// 메모리 주소를 null로 바꿔도 해제하지 않는 경우 多
		System.gc();					// System.gc(); --> finalize() 역할 --> 멀티미디어(동영상)에서 자주 사용됨
		
		
		
		
		
		
		
	}
}
