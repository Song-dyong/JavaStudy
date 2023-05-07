package com.sist.main;

/*
 		Spring => 가급적이면 상속없이 독립적인 클래스 (POZO 방식)
 				  가급적이면 new 사용 X (new없이 메모리 형성 가능)
 				  
 		
		상속	= 재사용 (is-a)
		단점: 실행 속도가 느려짐 (사용빈도 극히 드묾) ---> 포함 클래스 (has-a)
			상속		/	  포함
			---			  --- 제공한 그대로 사용 (오버라이딩 가능 - 익명의 클래스)	
기능 수정(메소드) or 변수 추가해서 사용			
			
			=> 상속을 받는 경우
				class A
				{
					int a;
					int b;
					static int c;
				}
				class B extends A
				{
					ind d;
					int e;
					(int a;
					 int b;)
				}
				
				B b=new B();	=>		A객체가 먼저 생성 후 B객체 생성
				
		기존 클래스의 재사용, 수정, 추가 가능
		--> 소스코딩량을 줄일 수 있음
		--> 코드를 공통적으로 사용하기 때문에 관리 용이
		
		B클래스가 A클래스에게 상속을 받는다 --> A 클래스의 인트 a,b를  B b=new B(); b가 사용, 수정할 수 있다 (오버라이딩) 
		-> A 클래스와 B클래스는 각자의 메모리 공간을 가지고 있다 --> b라는 메모리 주소는 A의
		

*/

class Super
{
	int a, b;
	static int c;
	
	public Super() // 생성자 호출 => 메모리 할당
	{
		System.out.println("Super 클래스 메모리 할당");
	}
}

class Sub extends Super
{
	int d;
	int e;
	public Sub()
	{
		System.out.println("Sub 클래스 메모리 할당");
	}
}

public class MainClass
{
	public static void main(String[] args)
	{
		Sub sub=new Sub();
		
	}
}
