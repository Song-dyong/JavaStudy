package com.sist.lib;

/*
	toString() : 객체를 문자열화 시킨다
		(String)
		.toString()
		----------- 문자열 변환
		class A
		{
		}
		A a=new A();
		1) 명시적 --> System.out.println(a.toString()); 	==> a의 주소값 출력
		2) 묵시적 --> System.out.println(a);				==> a의 주소값 출력 (.toString) 생략되어있음	


*/

// toString --> 객체를 문자열로 변환 

class Member
{
	private int mno;
	private String name;
	
	public Member(int m, String n)
	{
		mno=m;
		name=n;							// 매개변수와 멤버변수의 이름이 다르므로, this. 을 붙여서 구분하지 않아도 됨
	}									// 지역변수, 매개변수 우선 --> 없으면 멤버변수 

	@Override							// Object의 상속을 받고 있기때문에, toString 클래스를 오버라이딩 할 수 있음 
	public String toString()			// toString 메소드의 기능 변경해보기 : 기존에 주소값 출력 --> mno와 name 출력
	{
		return "회원번호: "+mno+", 이름: "+name;
	}
	
	
	
}

public class _04_라이브러리_Object_toString
{
	public static void main(String[] args)
	{
		Member m1=new Member(1, "박문수");
		Member m2=new Member(2, "심청이");
		
		System.out.println("묵시적 호출 m1\n "+m1);
		System.out.println("명시적 호출 m1\n "+m1.toString());

		System.out.println("묵시적 호출 m2\n "+m2);
		System.out.println("명시적 호출 m2\n "+m2.toString());
		
	}
}
