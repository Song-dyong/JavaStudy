package com.sist.exam3;

// 현재 클래스 A는 a, b, name, A(), print() 가지고 있음 (스택 영역에 저장된 인스턴스)
// addr과 display()는 static이므로, 보유하고 있지 않음 ==> static 영역에서 class A의 변수와 메소드를 제어할 수 없음
//								--> 사용을 위해서는 A a=new A(); 를 통해 객체를 생성하고 사용해야함 -> a.a / a.b / a.name / a.print() 

class A
{
	int a;
	int b;
	String name;
	static String addr;
	public A()
	{
		a=10;
		b=20;
		name="hong";
		addr="seoul";
		print();
		display();
		
	}
	public void print()
	{
		
	}
	public static void display()
	{
		addr="Daegu";
		// a=20; --> static은 static만 사용 가능.
	}
}


public class MainClass
{
	public static void main(String[] args)
	{
		
	}
}
