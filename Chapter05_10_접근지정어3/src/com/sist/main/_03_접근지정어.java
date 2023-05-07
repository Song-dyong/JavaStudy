package com.sist.main;

/*
	접근지정어: 접근 범위 지정 => 생성자, 메소드, 변수
		-private: 자신의 클래스 내에서만 접근 가능
				=> 멤버변수에 주로 사용 (변수의 은닉화 => 메소드를 통해 접근: 캡슐화)
																캡슐화의 목적: 데이터 보호
				다른 클래스와 연동 X --> Getter/Setter를 사용하여, 다른 클래스와 연동
		-default: 같은 패키지 내에서만 접근 가능
				=> 한 파일에 class 2개를 만들지 않음
		-protected: 같은 패키지 내에서만 접근 가능 (상속 받은 패키지의 경우 접근 가능)
		-public: 어디서나 접근 가능
		--------------------------------------------------------------------------
		형식) 
			멤버변수는 private
			메소드, 생성자 -> 다른 클래스와 연동 -> public
		--------------------------------------------------------------------------
										매개변수로 객체 전송 -> 객체가 존재하는 순간, 메모리 주소 존재 (변경 = 메모리 자체가 변경)
											==> 얕은 복사
											class A
											{
											}
											A a=new A();
											A b=a;			--> 얕은 복사
		
		값복사
		주소복사: 주소전송, 원본 --> 배열 / 클래스



*/
class Value{
	int a=10;
	int b=20;
}
public class _03_접근지정어
{
	static void swap(int a,int b)
	{
		int temp=a;
		a=b;
		b=temp;
		System.out.println("a="+a+", b="+b);
	}
	static void swap(Value v)
	{
		int temp=v.a;
		System.out.println(v);
		v.a=v.b;
		v.b=temp;
		System.out.println("v.a="+v.a+", v.b="+v.b);
	}
	public static void main(String[] args)
	{
		int x=10;
		int y=20;
		swap(x,y);
		System.out.println("x="+x+", y="+y);
		
		Value a=new Value();
		System.out.println(a);
		swap(a);
		System.out.println("a.a="+a.a+", a.b="+a.b);

		
	}
}
