package com.sist.main2;


class Member{
	private int mno;				// Member 클래스 안에서만 사용 가능
	public int getMno()
	{
		return mno;
	}
	public void setMno(int mno)
	{
		this.mno = mno;
	}
	public String name;				// 모든 클래스 (패키지가 달라도) 사용 가능
	protected String address;		// 같은 패키지 내에서 사능 가능 (상속받은 클래스의 경우, 다른 패키지에서도 가능)
	String tel;						// 같은 패키지 내에서 접근 가능 
}

public class _03_접근지정어
{
	public static void main(String[] args)
	{
		Member m = new Member();
		m.name = "홍길동";
		m.address="서울";
		m.tel="010-1234-5678";
		m.setMno(1);
		System.out.println(m.getMno()+" "+m.name+ " "+ m.address+" "+ m.tel);
	}
}
