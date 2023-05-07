package com.sist.exam;

// MemberVO or MemberDTO로 설정해서 관리 (데이터 모으기) => 사용자 정의 데이터형 (읽기 / 쓰기)
// 캡슐화 코딩: private로 변수 지정 --> Getter / Setter로 데이터 관리

public class Member
{
	private String id;
	private String name;
	private String sex;
	
	public String getId()
	{
		return id;
	}
	public void setId(String id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getSex()
	{
		return sex;
	}
	public void setSex(String sex)
	{
		this.sex = sex;
	}
	
}
