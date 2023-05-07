package com.sist.lib;


import java.util.*;

class Person implements Cloneable
{
	// 은닉화
	private String name;
	private int age;
	
	// 캡슐화
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	
	// Object의 toString 메소드 오버라이딩하기 (기존의 toString()은 주소값)
//	public String toString()
//	{
//		return name+"("+age+")";
//	}
	
	// clone --> 복제 : 새로운 메모리를 만들어서 사용 
	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	// 생성자 만들기
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	
	
}

public class _02_라이브러리_Collection_Set
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Set set=new HashSet();
		Person p1=new Person("홍길동", 25);
		Person p2=new Person("홍길동", 25);	// p1과 p2는 저장된 데이터는 같지만, 다른 객체
		System.out.println("p1="+p1);
		System.out.println("p2="+p2);
		Person p3=p1;						// 참조만 같으므로, 메모리 저장이 되지 않음
		System.out.println("p3="+p3);
		Person p4=(Person)p1.clone();		// 클론 메소드는 예외처리를 해야하므로, throws로 예외처리! + clone()에서의 리턴은 Object이므로 형변환
		System.out.println("p4="+p4);
		System.out.println(p4.getAge());
		System.out.println(p4.getName()); 	
											// p4는 clone을 통해 새로운 메모리를 형성했으므로, 다른 메모리에 저장
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		System.out.println(set);    		// set을 바로 출력하면 [] 안에 값들 나열
		
		
		
	}
}
