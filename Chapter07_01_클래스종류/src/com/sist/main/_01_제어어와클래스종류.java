package com.sist.main;

/*
		1. 제어어
		-------------
			1) static: <공통적인>
					ex) Math의 모든 메소드
					
			2) final: <마지막>	=> 변수(상수-변경 불가능)/class(종단클래스-확장 불가능, 상속x) 
					ex) class final className
						System / String / Math / StringBuffer => dlTsms rmeofh tkdyd
						java.lang의 대부분의 클래스
						
			3) abstract: <추상적인> -> 공통점을 모아줌 -> 프로그램에 맞게 구현
		
		=> 클래스의 종류
			1) 추상클래스
				형식) 
					 public abstract class ClassName
					 {
					 	-------------------------------------
						1. 변수 (멤버변수)
					 	-------------------------------------
					 	2. 메소드: 구현된 메소드
					 	-------------------------------------
					 	3. 메소드: 구현되지 않은 메소드 (선언만 하는)
					 		=> 자신이 메모리 할당할 수 없음
					 		 ex) abstract class A
					 		 	{
					 		 	}
					 		 	A a=new A(); ==> 오류
					 	상속을 받아서, 구현이 안된 메소드 구현 후 사용
					 		=> 오버라이딩
					 		class B extends A
					 		{
					 		}
					 		A a=new B(); => 묵시적 형변환 (자동 형변환)
					 		    ------- a가 가지고 있는 메소드는 B로 대체
					 		B b=new B(); => 
					 	-------------------------------------
					 	4. 생성자
					 	-------------------------------------
					 }
					 
			2) 인터페이스
				=> 추상클래스의 단점을 보완
					1| 단일 상속 -> 다중 상속
					2| 추상 클래스의 일종 (인터페이스도 클래스)
					3| 구성요소
						public interface InterfaceName
						{
						--------------------------------------
						변수 설정
						-> 상수형 변수만 가지고 있음
							int a; 		==> 오류발생
							int a=10; 	==> O
							컴파일할 때, 자동으로 
							public static final int a=10;
							------------------- 추가된다
							 
						--------------------------------------
						메소드 - 구현되지 않은 메소드
							void display(); -> {} 없이 선언만
							컴파일할 때, 자동으로
							public abstract void display();
							---------------추가된다
							문제점)
								interface A
								{
									(public abstract) void display();
								}
								class B implements A
								{	
									<인터페이스 A의 메소드 오버라이딩>
									(default) void display() => 오류발생 
									{							why? 접근지정어 축소되서
									}
									public void display() => 정상작동
									{
									}
								}
							=> 인터페이스의 모든 메소드와 변수는 public 지정
								public외의 접근지정어는 사용 불가
								private int a=10; ==> interface에서는 오류
						--------------------------------------
						메소드 - 구현된 메소드 (jdk 1.8이상)
					(public) default void methodName()  ==> 인터페이스에 선언된 메소드를 추가하면, 
							{								관련된 모든 클래스에 오류 발생
							}			
						--------------------------------------
						메소드 - 구현된 메소드 (jdk 1.8이상)
					(public) static void methodName() 
							{
							}
						--------------------------------------
						}
			=> 추상클래스, 인터페이스는 상속을 받는 경우, 
					반드시 선언만 된 메소드를 구현해서 사용한다. (선언된 모든 메소드 구현해야함)
					
			=> 추상클래스: 입출력, 네트워크, 데이터연결 
			=> 인터페이스: 윈도우 이벤트 처리 (버튼, 마우스클릭, 키보드입력 등등..)
					
					
			3) 내부클래스 (네트워크, 빅데이터)
				1| 멤버 클래스 : 쓰레드(하나의 프로그램 안에 여러 프로그램이 실행되는 것) -> 데이터 공유할 목적
							클래스 안에 클래스 선언(내부클래스라고도 함)
					기존의 방식
					}
					class A
					{
						A,B
					}
					class B
					{
						A a= new A();
						a.A --> 여러번 입력해야 함
					}
					
					class A (서버)
					{
						A,B,C,D,E => 변수나 메소드 
						class B (통신)
						{
							A,B .. => class A의 변수와 메소드를 메모리 할당 없이 사용가능
						}
					
				2| 익명의 크래스: 상속이 없이 오버라이딩 가능하도록
					class A
					{
						B b=new B(){
							void dlsplay(){}
						}
					}
					class B
					{
						void dlsplay(){}
					}
*/

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class _01_제어어와클래스종류 
{
	public static void main(String[] args)
	{
		
	}


}
