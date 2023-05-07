package com.sist.lib;

class Sawon2
{
	private int sabun;
	private String name;
	
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

	public Sawon2(int sabun, String name)
	{
		this.sabun=sabun;
		this.name=name;
	}

	@Override
	public boolean equals(Object obj)
	{
		Sawon2 s=(Sawon2)obj;						// equals() --> 괄호 안에 들어오는 값은 object로 설정되어 있으므로, Sawon2로 형변환
													// 형변환된 s의 값과 기존의 this.의 값들이 같은지 비교하여 리턴 --> true / false로 나오도록
		return name.equals(s.name) && sabun==s.sabun;
	}
	
	public void print()
	{
		System.out.println("이름= "+name);
	}
	
}

public class _07_라이브러리_Object_equals2
{
	public static void main(String[] args)
	{
//		Sawon2 s1=new Sawon2(1, "홍길동");
//		System.out.println(s1);
//		s1=new Sawon2(2, "박문수");
//		System.out.println(s1);
		
		Sawon2 s1=new Sawon2(1, "홍길동");
		Sawon2 s2=new Sawon2(1, "홍길동");
		s1.print();
		if(s1.equals(s2))
		{
			System.out.println("같은 사원입니다.");
		}
		else
		{
			System.out.println("다른 사원입니다."); 
		}
		new Student2("박문수").print();
	}
}
