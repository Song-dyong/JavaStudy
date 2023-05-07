package com.sist.lib;

/*
		getClass -> 타입을 읽어옴
		
		A a=new A();
		a.getClass() => class A
		
		String s="";
		s.getClass(); => java.lang.String


*/

class Student3
{
	
}

public class _08_라이브러리_Object_getClass
{
	public static void main(String[] args)
	{
		Student3 s=new Student3();
		System.out.println(s.getClass()); 			// class com.sist.lib.Student3 데이터형 확인
		String s2="";
		System.out.println(s2.getClass()); 			// class java.lang.String
 	}
}
