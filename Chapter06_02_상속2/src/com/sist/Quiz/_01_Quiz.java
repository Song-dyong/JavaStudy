package com.sist.Quiz;

// 사용자 정의 데이터형 -> 뒤에 ~VO붙이기 (ValueOf)
class SutdaCard{
	private int num;
	private boolean isKwang;
	public int getNum()
	{
		return num;
	}
	public void setNum(int num)
	{
		this.num = num;
	}
	public boolean isKwang()
	{
		return isKwang;
	}
	public void setKwang(boolean isKwang)
	{
		this.isKwang = isKwang;
	}
	
}

class Student{
	private String name;
	private int ban;
	private int no;
	private int kor, eng, math;
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getBan()
	{
		return ban;
	}
	public void setBan(int ban)
	{
		this.ban = ban;
	}
	public int getNo()
	{
		return no;
	}
	public void setNo(int no)
	{
		this.no = no;
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

/*
  	인스턴스 변수: 데이터를 각각 저장할 때
  	정적변수(공유변수): 메모리가 1개만 생성 --> 공통으로 사용되는 변수
  	지역변수: 메소드 내에서 선언되는 변수 (지역변수, 매개변수)
  			-> 메소드 안에서만 사용 {}를 벗어나면 사라짐
  			-> 반드시 초기화 후에 사용
	3번 	
		인스턴스 변수: 2개 
		공유변수: 2개
		지역변수(매개변수): 2개

	4번	
		생성자에 대한 설명으로 옳지 않은 것은?
			1) 모든 생성자의 이름은 클래스명과 동일하다
			2) 생성자는 객체를 생성하기 위한 것이다 X --> new
			3) 클래스에는 생성자를 반드시 하나 이상 있어야 한다 X -> 컴파일러가 자동으로 생성
			4) 생성자는 오버로딩을 지원한다
										b,c, e
	5번
		this에 대한 설명으로 맞지 않은 것은?	b
		1) 모든 클래스는 this를 가지고 있다
		2) 객체 자신을 가리키는 참조변수 (static Object this) => new
			=> this는 생성자, 인스턴스 메소드에서 사용 가능
			class A
			{
				public A(A this--생략됨){
				}
				public void display(A this--생략됨){
				}
				public static void aaa(this 사용 x){
				}
		3) 클래스 내에서는 어디서든 사용 가능 --> x / static에서 사용 불가능
		4) 지역변수와 인스턴스 변수를 구분할 때 자주 사용됨
			class A
			{
				private String name; => heap
				public void display(String name) => stack
				{
					this.name=name; (매개변수)
					---------A 클래스 자체에 설정된 변수
				}
		5) 클래스 메소드(static 메소드) 내에서는 사용할 수 없다.
			
	6번
		오버로딩이 성립하기 위한 조건이 아닌 것은?
										c d
		오버로딩의 조건
		1. 메소드의 이름이 같아야 한다.
		2. 매개변수의 갯수 또는 타입이 달라야 한다.
		3. 매개변수의 데이터형이 같고 (매개변수의 이름)이 다른 경우 오버로딩이 성립되지 않는다	--> display(int a) == display(int b)
		4. 리턴형은 관계 없다
	6-1번 
		add 메소드를 올바르게 오버로딩 한 것은? a빼고 다 (매개변수 2개 같은 데이터형임)
	7번 
		다음 중 초기화에 대한 설명으로 옳지 않은 것은?
											e --> 클래스변수는 컴파일시에 / 인스턴스 변수는 new 생성시  
	8번 
		다음 중 인스턴스 변수의 초기화 순서가 올바른 것은? a
	9번
		다음 중 지역변수에 대한 설명으로 옳지 않은 것은? a, (d), e
	10번
		다음 중 접근제어자를 접근범위가 넓은 것에서 조은 것의 순으로 바르게 나열한 것은?
					a
	11번
		접근 제어자에 대한 설명으로 옳지 않은 것은?
		c	
		접근제어자가 사용될 수 있는 곳: 클래스, 멤버변수, 메소드, 생성자
		지역변수는 static, 접근지정어, abstract는 사용 불가능 (멤버변수에서만 사용 가능)
		유일하게 사용가능 -> final

*/
public class _01_Quiz
{
	public static void main(String[] args)
	{
		
	}
}
