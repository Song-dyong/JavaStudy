package com.sist.main;

import java.util.Arrays;

/*
		상속이 있는 경우 -> 객체 생성 방법
		class A
		class B extends A
		A	(상위)
		↑
		B	(하위)
		
		=> 크기 (범위): 상위 > 하위										// 클래스는 데이터의 양으로 크기를 비교할 수 없음 
		 ------- 상속, 포함이 있는 경우에만 크기 비교 가능  					ex) class A { int a,b,c,d,e,f,g; }
		 	A > B														class B { int h; }		-> 클래스 A와 B 비교 불가
		 
		A a=new A();
		A b=new B();
		B c=new A(); --> 불가능
		B d=(A)new A(); --> 불가능
		
		상속
		1. 형식
			class A extends B (단일 상속만 가능)
		2. 클래스 크기
			상속 내린 클래스 > 상속 받은 클래스
		3. 형변환
			작은 클래스 = 큰 클래스
		4. 자바의 최상위 클래스: Object 
		5. 상속의 예외: static / 블록 초기화 / 생성자 / private은 상속은 되지만, 접근 불가 (protected를 쓰던가, getter/setter)
		6. 상위클래스는 하위클래스에 추가된 내용에 접근할 수 없음 
		7. 변수에 대한 접근은 선언된 클래스에 등록된 변수까지만 가능
		8. 메소드의 실행은 뒤의 생성자 클래스를 따라감 (클래스명과 생성자명이 다를 경우)
			7, 8번 --> 클래스명 변수명 = new 생성자명()
					  ------- 변수 제어	 ------- 메소드 제어	
		-------------
		
		
*/

class Human{
	int a=10;
	int b=20;
	static int c=30;
	public void display()
	{
		System.out.println("Human: display() Call...");
	}
}
class Student extends Human{
	int c=40;
	int d=50;
	// 오버라이딩의 조건
	// 상속 必 -> 메소드명 동일 -> 매개변수 동일 -> 리턴형 동일 -> 접근지정어는 확장만 가능 

	public void display()
	{
		System.out.println("Student: display() Call...");
	}
}
public class MainClass2
{
	public static void main(String[] args)
	{
		Human h=new Human(); // a,b,c			
		
		Student s=new Student();	// a,b,c,d,e
		Human h1=new Student();		// a,b,c --> 클래스가 Human이므로, Human클래스의 데이터에만 접근 가능.
//		Student s1=new Human();
//		Student s2=(Student)new Human();		// 형변환 --> 오류
		Student s3=(Student)h1;					// h1은 Human 클래스지만, 생성자가 Student이므로, h1을 Student로 형변환 시킬 경우 ㄱㅊ
//		Student s4=(Student)h;					// h는 생성자가 Human이므로, ClassCastException-형변환 오류
		
		h.display();
		s.display();
		h1.display();
		s3.display();
		
		
		
		
		
		
		
	}
}
