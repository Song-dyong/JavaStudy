package com.sist.main2;


//Object 클래스는 모든 클래스의 상위 클래스 (모든 클래스는 Object 상속을 받는다 => 최상위 클래스)
/*
		class A (extends Object)
		class B extends A
		
		Object <- A <- B 
			
		Object o=new A()
		Object o=new B()
		
		Object[] a={10, " ", 'a', 10.5, "안녕하세요"}; ---> 여러 데이터형을 한꺼번에 저장할 수 있음 Object는 모든 데이터의 최상위 클래스이므로 ..

*/
public class Container
{
	public Object getBean(int no)
	{
		Object o = null;
		if(no==1)
			o=new A();
		else if(no==2)
			o=new B();
		else if(no==3)
			o=new C();
		else if(no==4)
			o=new D();
		else if(no==5)
			o=new E();
		return o;
	}
}
