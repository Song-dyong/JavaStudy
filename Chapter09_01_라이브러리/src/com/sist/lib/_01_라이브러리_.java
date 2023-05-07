package com.sist.lib;

/*
		1. java.lang
			-Object : 모든 클래스의 상위 클래스 (모든 클래스는 Object의 상속을 받음) 
				기능(메소드)
					1| toString() : 객체의 문자열화
						=> 오버라이딩
					2| clone()	: 객체 복제 --> prototype
									참조- 같은 메모리를 이용 (얕은 복사)
									복제- 다른 메모리를 제작 (깊은 복사)
					3| finalize() : 소멸자 함수 (호출되면 메모리 해제)
					4| equals() : 객체 비교
			-String : 문자열 저장 및 관리 클래스
				기능(메소드)
					1| equals() : 문자열 비교		ex)로그인 처리, 상세보기, 아이디 중복체크, 비밀번호 비교
								==은 주소값 비교 / equals()는 값 자체를 비교
					2| startsWith : 시작 문자열 비교 		true / false
					3| endsWith : 끝나는 문자열이 같은 경우 	true / false
					4| contains : " "문자열 포함 여부 비교  	true / false
					5| replace	: 문자, 문자열 변경
					6| replaceAll : 문자, 문자열 변경 (정규식) => 문자열의 형태
									[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3} ==> 전 세계 아이피 주소
					7| trim	: 좌우 공백 제거
					8| split : " "기준으로 잘라서 배열 생성 --> String[] 
					9| valueOf : 모든 데이터형을 문자열로 변경
					10| length : 문자의 갯수
					11| substring : 인덱스 번호만큼 자르기
				StringBuffer, StringBuilder ...
				Wrapper : 기본형을 클래스로 변경
					Byte / Integer / Double / Boolean / Float / Long...
				System
				Math
				Thread
				---------------- java.lang은 import 생략 가능

		2. java.util
			-Date / Calendar
			-StringTokenizer
			-Collection
				|
		-----------------
		|		|		|
	   **List   Map	  Set(interface) => **HashSet/TreeSet      
	   	|	**HashMap / Hashtable		
	 **ArrayList	
 Queue LinkedList
	 Vector
	 Stack
		 2-1. java.text
		3. java.io
		4. java.net
		5. java.sql
		-------------- 기본 라이브러리
		6. javax.xml
		7. javax.servlet.http
		8. 외부 라이브러리 (Open API)
			ex) Jsoup / simple-json : mvnrepository.com
				org.***
				com.***	
		
			---------------- 1) DB (MyBatis, Hibernate(JPA))
							 2) XML, JSON (VueJS, Ajax, React)
							 3) 프레임워크 : Spring / Spring-Boot / Struts
							 *** JSP 

*/

class A
{
	int a=10;
	int b=20;
	@Override
	public String toString()
	{
		// TODO Auto-generated method stub
		return "a="+a+", b="+b;
	}
}
public class _01_라이브러리_
{
	public static void main(String[] args)
	{
		A a=new A();
		System.out.println(a.toString());	// toString이 생략되어있음.
		System.out.println(a);
	}

}
