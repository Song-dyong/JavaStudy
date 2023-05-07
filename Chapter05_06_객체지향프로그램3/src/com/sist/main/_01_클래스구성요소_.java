package com.sist.main;
// import com.sist.main._01_클래스구성요소_;	==> 폴더가 달라질 경우, import를 통해서 불러와야 함
/*
	폴더 => 관련된 java파일 저장 => 찾기쉽게 하려고
	다른 패키지의 클래스를 불러올 때, 반드시 import를 사용해야 함
	다른 패키지에서는 같은 이름의 클래스 생성 가능
		=> 메소드 접근방식: .을 이용
		=> 인스턴스 메소드: static이 없는 메소드 -> 메모리에 따로 저장
	
	
	import com.sist.main.*;
	import java.util.*;	
	
	주의점: 패키지명에는 keyword 사용 금지!
			대소문자 구분 -> 소문자 권장
			=> 식별자 주의점과 동일
	
		클래스
			=데이터형		-> 변수
			=액션(동작) 	-> 메소드
		------------------------
				클래스 분류할 때
			1) 데이터형 클래스	  (변수)
			2) 데이터 처리 클래스 (메소드)
			3) 조립하는 클래스 	  (main)

		메소드
		
			1. 메소드의 구성요소
				리턴타입(결과값) 메소드명(매개변수 -> 요청데이터)  <선언부>
				{
						<구현부>
						return 결과값;
							   ----- 리턴타입과 결과값은 데이터형 동일 (권장)
				}
					리턴타입: 사용자가 요청한 내용을 처리한 결과값의 데이터형
							1) 결과값이 있는 경우
							2) 결과값이 없는 경우 -> void
							리턴타입 / return 항상 일치하는 것 X	
								-> 리턴타입이 항상 크거나 동일
									ex) 리턴타입: int / 결과값: 10.5 -> error
										리턴타입: double / 결과값: 10 -> 가능
							3) 리턴타입이나 결과값은 한 개!만 나올 수 있음
							 	***결과값이 여러 개일 경우, 배열 / 클래스 이용
							 			 why? 배열과 클래스의 결과값은 주소값 1개만 넘어가기 때문 (얕은 복사)
									ex) int[] Display()
										{
											int[] arr=new int[5];
											return arr;
										}
											-> int[] arr = display()
											-> int[] arr=new int[5];
											-> int[] arr2=arr;			--> arr과 arr2의 주소값 동일
				
								리턴형: 기본형 / 배열 / ★★클래스 (사용자 정의 데이터형)★★
								return: int 	-> 10
										double 	-> 10.5
										char 	-> 'A'
										배열		-> 배열명(주소값)
											int[] arr=new int[5];
											return arr;
										클래스	-> 객체명(주소값)
											A a=new A();
											return a;
								매개변수: 사용자 요청값(검색어)
									ex) getView(int page)
									    findData(String s)
										login(String ID, String PWD)

*/			

class Student
{
	int hakbun;
	String name;
	String sex;
	int kor;
	int eng;
	int math;
}

class StudentSystem
{
//	int getHakbun()
//	{
//		return 1;
//	}
//	String getName()
//	{
//		return "홍길동";
//	}
//	String getSex()
//	{
//		return "남자";
//	}
//	int getKor()
//	{
//		return 90;
//	}
//	int getEng()
//	{
//		return 80;
//	}
//	int getMath()
//	{
//		return 78;
//	}
	Student getData()
	{
		Student s=new Student();
		s.hakbun=2;
		s.name="심청이";
		s.sex="여자";
		s.kor=90;
		s.eng=90;
		s.math=100;
		return s;
	}
	
}

public class _01_클래스구성요소_
{
	public static void main(String[] args)
	{
		StudentSystem ss=new StudentSystem();
		Student shim=ss.getData();
	
		
		
//		Student hong=new Student();
//		hong.hakbun=ss.getHakbun();
//		hong.name=ss.getName();
//		hong.sex=ss.getSex();
//		hong.kor=ss.getKor();
//		hong.eng=ss.getEng();
//		hong.math=ss.getMath();	
//		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
