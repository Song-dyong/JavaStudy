package com.sist.main;

class Member{
	private String name;	// 변수: 메모리에 쓰기 or 메모리 쓰기
	private static Member mem;	// static으로 생성 --> 하나의 공간만 존재 --> 아래에서 여러 개 생성하더라도, 하나의 메모리로 귀결
	// 메모리에 저장된 데이터 읽기
	public String getName()
	{
		return name;
	}

	// 메모리에 저장
	public void setName(String name)
	{
		this.name = name;
	}
	
	public static Member newInstance()
	{
		if(mem==null)
			mem=new Member();	// 생성한 순간 null이기 때문에, 계속 mem만 리턴 --> 하나의 객체만 사용하게 됨
		return mem;
	}
	
}


public class _04_정적초기화_싱글턴	// 싱글턴: 하나의 객체만 사용할 때! when? 서버 돌릴 때
{
	public static void main(String[] args)
	{
		Member m1=Member.newInstance();
		m1.setName("홍길동");
		Member m2=Member.newInstance();
		m2.setName("심청이");
		Member m3=Member.newInstance();
		m3.setName("박문수");
		System.out.println(m1.getName());
		System.out.println(m2.getName());
		System.out.println(m3.getName());
		System.out.println("m1="+m1);
		System.out.println("m2="+m2);
		System.out.println("m3="+m3);
	}
}
