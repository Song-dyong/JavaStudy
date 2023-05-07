package com.sist.lib;
/*
		clone => 복제할 때 사용 (메모리가 새롭게 생성됨) (prototype이라 부름)
		
		implements Cloneable --> 복제할 수 있는 클래스를 상속받기

*/

class Sawon	implements Cloneable
{
	private int sabun;
	private String name;
	
	// 생성자는 생성할 때마다, 새로운 주소를 부여하기 떄문에 
	// 인스턴스 변수를 변경하려면 getter/setter를 해야함 --> 생성자는 한 번만 호출되어야 함
	
	public int getSabun()
	{
		return sabun;
	}

	public void setSabun(int sabun)
	{
		this.sabun = sabun;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Sawon(int sabun, String name){
		// 지역변수가 우선순위이므로, this를 붙여서 멤버변수/지역변수 구분하기
		this.sabun=sabun;
		this.name=name;
		/*
			오버로딩
			생성자 -> 여러 개 사용 가능 / 객체 생성시에 호출
				 -> 무조건 1개 이상 존재
				 -> 생성자를 생성하지 않으면, 자동으로 기본생성자를 추가
				 -> 시작과 동시에 필요한 내용을 서술
				 	ex) 데이터베이스 연결하려면, 드라이버 설정을 해야함 (드라이버는 클래스로 만들어져 있음)
				 	 	thin드라이버 (연결만 해주는 역할) 
		*/
	}
	// 재정의 --> 오버라이딩(Object) --> 오버라이드 임플먼트 기능으로 clone 불러오기

	@Override
	protected Object clone() throws CloneNotSupportedException	// throws가 붙으면 CheckException이므로, 사용할 때 예외처리 필수
	{
		return super.clone();
	}
	
	public void print()
	{
		System.out.println("사번: "+sabun+", 이름: "+name);
	}
	
}

public class _03_라이브러리_Object_clone
{	
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Sawon s1=new Sawon(1, "홍길동");
		s1.print();
		Sawon s2=s1;
		s2.print(); 				// 참조를 사용했으므로, s1과 s2는 같은 주소를 갖고 있음
		s1.setSabun(2);
		s1.setName("심청이"); 		// s1의 값을 2, 심청이로 변경한 후 s3는 그 값 자체를 복사
		System.out.println("s1: "+s1+"\ns2: "+s2); // 같은 주소를 사용했으므로, s2를 통해 값을 변경하면 s1의 값도 변함
		
		
		// 깊은 복사 (clone, 복제)
		
		Sawon s3=(Sawon)s1.clone();		// 예외처리 필요 --> 1. throws or 2. try~catch
										// s1.clone()은 Object 클래스이므로, Sawon보다 큰 클래스임 --> 형변환 필수
		s3.print();
		System.out.println("s3: "+s3);
		s3.setSabun(3);
		s3.setName("박문수");
		s3.print();
		
		s1.print();
		s2.print(); 					// s1과 s2는 같은 주소를 참조하므로, 위에서 변경한 값을 동일하게 가져감
										// s3는 clone으로 복제했기 때문에, 따로 값을 변경한다면 다른 객체에 영향을 주지 않으며 변경 가능
										
	}
}
