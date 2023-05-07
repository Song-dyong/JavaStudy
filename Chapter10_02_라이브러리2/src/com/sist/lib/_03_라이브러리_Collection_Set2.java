package com.sist.lib;
import java.util.*;

class Student{
	private String name;
	private int age;
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
//	@Override
//	public int hashCode()					// hashCode는 기존에 주소를 비교해서 hashSet에서 제외하도록 해둠
//	{										// 지금은 오버라이딩해서 name과 age를 비교하도록
//		return (name+age).hashCode();
//	}
//	@Override
//	public boolean equals(Object obj)
//	{
//		if(obj instanceof Student)
//		{
//			Student s=(Student)obj;
//			return name.equals(s.name) && age==s.age;
//		}
//		return false;
//	}
//	@Override
//	public String toString()
//	{
//		return name+"("+age+")";
//	}
	public Student(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	/*
		set에 들어가는 값은 중복을 허용하지 않기 떄문에, 같은 값을 가진 객체는 제외된다.
		주소를 기준으로 중복을 제외하기 때문에, 같은 데이터값을 갖더라도 주소가 다르면 저장된다
		만약, set을 사용하면서 다른 주소를 가지면서 동일한 데이터 값을 가진 객체를 저장해야한다면, 
		equals를 오버라이딩해서 equals의 기능을 주소비교가 아닌, 값 비교로 바꾼 뒤 사용하면 된다. 
	
	
	*/
}


public class _03_라이브러리_Collection_Set2
{
	public static void main(String[] args)
	{
		Set set=new HashSet();
		Student s1=new Student("홍길동", 25);
		Student s2=new Student("홍길동", 25);
		
		System.out.println(s1);
		System.out.println(s2);
		
		
		if (s1.equals(s2))
		{
			System.out.println("s1==s2");
		}
		else
		{
			System.out.println("s1!=s2");
		}
		set.add(s1);
		set.add(s2);
		System.out.println(set);
	
		
	}
}
