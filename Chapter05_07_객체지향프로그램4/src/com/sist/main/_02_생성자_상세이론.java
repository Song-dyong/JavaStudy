package com.sist.main;

/*
		초기화
	1. 디폴트 값
		int => 0 / String => null / boolean => false
		class A
		{
			int a;
		}
	2. 명시적 초기화: 직접 값을 설정
		class A
		{
			int a=10;
		}
	3. 생성자 초기화
		class A
		{
			int a;
			A(){
				a=100;
			}
		}
	4. 초기화 블록
		class A
		{
			int a;
			//a=1000;		-> 오류 why? 메모리 배정하기 전에 값을 배정하므로
			{
				a=1000;		-> 블럭만 열면 초기화 가능 but! 굳이 생성자와 같이 사용하지 않음 
			}					why? 순서- 디폴트 -> 명시적 -> 초기화 블록 -> 생성자
		}							생성자에서 초기화된 값을 우선 순위로 봄

*/
class Student
{
	int hakbun;
	String name;
	Student(){										// 이 생성자를 주석처리할 경우, 아래의 매개변수가 없는 호출은 에러
		System.out.println("Student() call...");	// 아래의 생성자만 존재하기 때문 (기존의 기본 생성자가 생기지 않음)
		hakbun=1;									
		name="홍길동";
	}
	Student(int h,String n)
	{
		hakbun=h;
		name=n;
	}
//	{
//		hakbun=100;			// ★★★ 연산처리, 제어문, 파일 읽기 등.. 명시적 초기화가 불가능할 경우, 초기화 블럭 / 생성자를 활용하여 초기화 ★★★
//	}
//	{
//		hakbun=10000;
//	}
}

public class _02_생성자_상세이론
{
	public static void main(String[] args)
	{
		Student s=new Student();		// 주소를 저장한 것은 -> 클래스 내의 변수를 가져다가 쓰기 위해
		System.out.println(s.hakbun);	
		System.out.println(s.name);
		new Student();					// 주소값을 부여하지 않으면, 클래스 내의 실행문 자체만 사용
		// 생성자 호출시에, 반드시 앞에 new 붙일 것
		Student s1=new Student();
		System.out.println(s1.hakbun);
		System.out.println(s1.name);	// 단, 클래스의 생성자 내에서 값을 지정하면, 모두 같은 값을 갖게 됨
		
		Student s2=new Student(2,"심청이");	// 매개변수를 사용하여 클래스 내 변수들의 값을 바꿀 수 있음
		Student s3=new Student(3, "박문수");	
		System.out.println(s2.hakbun);
		System.out.println(s2.name);
		System.out.println(s3.hakbun);
		System.out.println(s2.name);
		
	}
}
