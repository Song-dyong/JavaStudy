package com.sist.main;

/*
		객체지향 프로그램 (커리큘럼)
	1) 클래스 구성요소 => 클래스(모델링)
	2) 객체지향의 3대 요소
		1| 캡슐화: 데이터 보호 (데이터 손실, 변경)
			-> 접근하는 범위 지정 (접근 지정어)
		2| 상속/포함: 재사용
		3| 오버라이딩/오버로딩: 다형성 (수정, 추가)
	3) 클래스의 종류
		1| 추상 클래스 / 인터페이스
		2| 내부 클래스
		3| 종단 클래스
		4| 공유 클래스 
	------------------------------------------ 객체지향
	4) API : 자바에서 지원하는 클래스 (라이브러리)
		java.lang
		java.util
		java.io
		java.net
	5) 클래스 조립법: 사용자 정의 + 라이브러리 
	-------------------------------------------
	오라클
	오라클 - 자바 연동
	-------------------------------------------
	웹: HTML / CSS / JavaScript
		+ 오라클 + 자바	
	  ------------------------ JSP -> 출력 / 데이터관리 => MVC
	--------------------------------------------
	스프링
	--------------------------------------------
	AWS 
	--------------------------------------------기본 과정
	SpringBoot + JPA + React -> 개인프로젝트 
	
	
		접근 지정어 (127p)
	1. 접근 지정어의 종류
	----------------------------------------------------------------------------------------------------------------
		자신의 클래스 내에서만 사용		같은 패키지 내에서 사용		같은 패키지 내에서 사용 				모든 클래스에서 접근
															(상속 받은 클래스는 
																다른 패키지에서도 접근)
	----------------------------------------------------------------------------------------------------------------
			private
			(은닉화)
			멤버변수
	class A
	{
		private int age;
	}
	----------------------------------------------------------------------------------------------------------------
										default
									
									class A
									{
										int age;
									}
	----------------------------------------------------------------------------------------------------------------
																protected
															class A
															{
																protected int age;
															}
	----------------------------------------------------------------------------------------------------------------
																								public
																							class A
																							{
																								public int age;
																							}
	----------------------------------------------------------------------------------------------------------------
	
	private < default < protected < public 순으로 접근 크기 설정
	
	
	1) 변수 		==> private가 기본
	2) 메소드		==> 다른 클래스와 연결 (통신수단) ==> public
	3) 생성자 	==> public (다른 클래스에서 메모리 할당 후에 사용)
	4) 클래스		==> 특별한 경우가 아니라면 public 
		--> 조립: 모든 클래스의 연결 (변수를 제외하고, 연결이 필요하므로 public) 
				변수는 private --> 메소드를 사용하여 접근
				----------은닉화 --> 캡슐화
					1| 변수를 다른 클래스나 자신의 클래스에서 사용
					   --- 읽기, 쓰기
					      ----	----
					     getter/setter
				
				캡슐화를 사용하는 이유
			외부에서 잘못된 사용이나 변수에 대한 손상을 방지하기 위해 사용
			=> 캡슐화를 사용하기 위해서 만드는 방법 => 접근 지정어 (private)
			
	
	cf) 객체지향의 3대 특성은 문법 사항 X --> 권장사항 (실무에서 캡슐화 기본)
			멤버변수를 private로 설정--> 메소드를 통해 접근하는 방식 (캡슐화)
	
	// 패키지명이 다르면, 사용 전에 반드시 import로 그 패키지를 가져올 것
	   
	   		패키지 별 작업
	   1. 데이터형 모으기 (변수 묶음) 			==> 사용자 정의 데이터형
	   2. 기능을 가지고 있는 클래스 (메소드 모음)	
	   3. 사용자에게 보여주는 클래스 (조립) 		==> 웹 메인 페이지 
	
	

*/
class Student{
	private int hakbun;
	private String name;
	private int kor, eng, math;
	
	public int getHakbun()
	{
		return hakbun;
	}

	/*
		1. 지역변수
			-> 메소드 안에서 선언되는 변수, 매개변수
		2. 멤버변수
			-> 클래스에서 선언되는 변수
		===================================> 저장 위치가 다르기 때문에, 변수명이 동일할 수 있음
		class Human
		{
			String name;						--> 멤버변수 (클래스 전체에서 사용 + 다른 클래스에서도 사용) = 저장위치 heap
			public void setName(String name)	--> 지역변수 (매개변수)								 = 저장위치 stack
			{
				int a=10;						--> 지역변수 (메소드 안에서 선언되는 변수)					= 저장위치 stack
				// 지역변수 우선순위
				 System.out.println(name);  			==> 지역변수가 우선순위이므로, 매개변수가 출력됨
				 	==> 지역변수와 멤버변수가 같은 경우 구분 필요
				 		how? this. (클래스 자신을 의미)
				 			this.name (class Human이 가지고 있는 name 변수)
					==> 클래스변수와 지역변수명이 다른 경우
							지역변수에서 해당 값이 없는 경우, 멤버변수에서 찾아옴  
				 
				this.name = name;
			}
		}
	
	*/
	public void setHakbun(int hakbun)
	{
		this.hakbun = hakbun;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getKor()
	{
		return kor;
	}
	public void setKor(int kor)
	{
		this.kor = kor;
	}
	public int getEng()
	{
		return eng;
	}
	public void setEng(int eng)
	{
		this.eng = eng;
	}
	public int getMath()
	{
		return math;
	}
	public void setMath(int math)
	{
		this.math = math;
	}
	
	
	
}


public class _01_접근지정어_
{
	public static void main(String[] args)
	{
		Student hong=new Student();
		// hong이라는 Student 공간 속에 hakbun, name, kor, eng, math 5개의 저장공간이 생성되었음.
		// 1. 변수 초기화 하기.
		hong.setHakbun(1);
		hong.setName("홍길동");
		hong.setKor(97);
		hong.setEng(78);
		hong.setMath(79);
		System.out.println(hong.getHakbun());
		System.out.println(hong.getName());
		System.out.println(hong.getKor());
		
		
	}
}
