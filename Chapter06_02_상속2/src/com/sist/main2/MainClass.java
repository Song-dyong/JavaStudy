package com.sist.main2;

/*
		오버라이딩 (재정의)
			-변수	오버라이딩: 변수명이 동일해야함
			-메소드	오버라이딩: 메소드명이 동일해야함
	----------------------------------------------
		
					오버로딩			오버라이딩			==> 다형성
		------------------------------------------
		클래스 관계	같은 클래스		상속 관계
		------------------------------------------
		메소드명		  동일			  동일
		------------------------------------------
		리턴형		관계없음			  동일
		------------------------------------------
		매개변수	갯수, 데이터형 다름	  	  동일
		------------------------------------------
		접근지정어		관계없음			확장만 가능
		------------------------------------------
		목적		 새로운 기능 추가	  기존 기능 수정 
		------------------------------------------
		==> 오버라이딩은 메소드 변경
		==> 오버로딩은 매개변수 변경 및 메소드 기능 추가	(204page)
		
		
*/
class Human
{
	int a=10;
}
class Student extends Human{
	int a=20;
	public Student()
	{
		a=100;
		int a=30;
		this.a=1000;
		System.out.println("a= "+a);
		System.out.println("this.a= "+this.a);
		System.out.println("super.a= "+super.a);
	}
//	public void student()
//	{
//		int a=40;
//		System.out.println("a= "+a);
//		System.out.println("this.a= "+this.a);
//		System.out.println("super.a= "+super.a);
//	}
}

public class MainClass
{
	public static void main(String[] args)
	{
		Student s=new Student();
		System.out.println(s.a);
		
	}
}
