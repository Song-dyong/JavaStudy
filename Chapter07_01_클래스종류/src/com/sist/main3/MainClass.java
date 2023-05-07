package com.sist.main3;

/*
	인터페이스 간의 상속
	interface A
	interface B extends A
				------- 
	
	interface A
	{
		void aaa();
	}
	interface B extends A		 A>B
	{
	  ( void aaa(); )
		void bbb();
	}
																					 인터페이스가 클래스보다 더 큰 개념은 아님 (인터페이스도 클래스이므로)
	class C implements B		 B>C  => interface도 클래스와 동일 (상속 내린 쪽이 더 큼) => 구분(클래스는 단일상속만 가능 / 인터페이스는 다중상속)
	{
		public void aaa(){}
		public void bbb(){}
	}

*/
interface A
{
	
}
interface B extends A		 
{
  
	
}

																				 
class C implements B		 
{
	
}
class D implements A
{
	
}
public class MainClass
{
	public static void main(String[] args)
	{
		A a=new C();
		B b=new C();
		C c=new C(); // --> 한 번에 모아서 처리하기 편함
		D d=new D();
		
		if(d instanceof B)
		{
			System.out.println("o");
		}
//		if(c instanceof A) // instanceof --> 하위클래스 확인 --> 앞이 뒤의 소속인가? (c객체는 A에 포함되었다)
//		{
//			System.out.println("c instanceof A: o");
//		}
//		if(c instanceof B)
//		{
//			System.out.println("c instanceof B: o");
//		}
//		if(b instanceof A)
//		{
//			System.out.println("b instanceof A: o");
//		}
//		if(a instanceof C)
//		{
//			System.out.println("a instanceof C: o");
//		}
//		if(a instanceof B)
//		{
//			System.out.println("a instanceof B: o");
//		}
		
		String s = "";
		StringBuffer sb=new StringBuffer();
		Object o=new Object();
		if(s instanceof Object)
		{
			System.out.println("s instanceof Object: o");
		}
		if(sb instanceof Object)
		{
			System.out.println("sb instanceof Object: o");
		}
		if(o instanceof String)
		{
			System.out.println("o instanceof String: o");
		}
	}
}
