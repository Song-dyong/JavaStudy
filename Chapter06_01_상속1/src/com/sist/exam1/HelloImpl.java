package com.sist.exam1;

// loosely couple ring => 결합성이 낮은 프로그램 짜기 --> 다른 클래스에 영향 x (인터페이스)

public class HelloImpl implements Hello{

	@Override
	public void sayHello(String name)
	{
		// TODO Auto-generated method stub
		System.out.println(name+"님 환영합니다");
	}
}	




