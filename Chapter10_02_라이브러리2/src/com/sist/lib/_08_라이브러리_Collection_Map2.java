package com.sist.lib;
import java.util.*;

class A
{
	public void execute()
	{
		System.out.println("A: execute() Call...");
	}
}
class B
{
	public void execute()
	{
		System.out.println("B: execute() Call...");
	}
}class C
{
	public void execute()
	{
		System.out.println("C: execute() Call...");
	}
}

// 스프링이 돌아가는 원리 --> 클래스 관리자 
class Container				// 클래스 모아서 관리 --> 메모리 누수현상 방지
{
	Map map=new HashMap<>();
	public Container()
	{
		map.put("a", new A());
		map.put("b", new B());
		map.put("c", new C());
	}
	public Object getBean(String key)
	{
		return map.get(key);
	}
}

public class _08_라이브러리_Collection_Map2
{
	public static void main(String[] args)
	{
		Container c=new Container();
		A aa=(A)c.getBean("a");
		aa.execute();
		A bb=(A)c.getBean("a");
		bb.execute();
		System.out.println("aa="+aa);
		System.out.println("bb="+bb);			// 요청할 때마다, new를 통해서 생성하는 것이 아닌, container를 생성하여 처리하기 때문에
												// 메모리 누수가 없음 ==> 싱글턴 (한 개의 객체로 재사용을 하는 프로그램)
	}
}	
