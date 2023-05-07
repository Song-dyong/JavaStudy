package com.sist.lib;

/*
	equals --> Object에서는 객체비교 / String에서는 문자열 비교 (보통 String)
*/

class Student2{
	private String name;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	public Student2(String name) {
		this.name=name;
	}

	// Object equals는 오버라이딩을 해야하므로, 사용빈도가 높지 않음
	// String equals는 실제 문자열만 비교하는 오버라이딩이 되어있기 때문에, 자주 쓰인다.
	
	@Override
	public boolean equals(Object obj)					// equals 오버라이딩해서 디폴트인 주소 비교를 내용비교로 바꾸기
	{
		if(obj instanceof Student2)
			return name==((Student2)obj).name;
		else
			return false;
	}
	
	public void print()
	{
		System.out.println(this.name);
	}
	
}
public class _06_라이브러리_Object_equals
{
	public static void main(String[] args)
	{
		Student2 s1=new Student2("홍길동");
		Student2 s2=new Student2("홍길동");
		
		System.out.println("s1: "+s1);
		System.out.println("s2: "+s2);
		
		if(s1==s2)
			System.out.println("주소가 같다");
		else
			System.out.println("주소가 같지 않다");
		if(s1.equals(s2))
			System.out.println("주소가 같다");
		else
			System.out.println("주소가 같지 않다");
		if(s1.getName().equals(s2.getName()))
			System.out.println("내용이 같다");
		else
			System.out.println("내용이 같지 않다");
			
		
	}
}
