package com.sist.io;

import java.io.Serializable;

// 직렬화 
public class Sawon implements Serializable		// Serializable --> 직렬화	데이터를 일렬로 나란히 저장
{
	private int sabun;
	private String name;
	private String dept;
	private String job;
	private int pay;
	
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
	public String getDept()
	{
		return dept;
	}
	public void setDept(String dept)
	{
		this.dept = dept;
	}
	public String getJob()
	{
		return job;
	}
	public void setJob(String job)
	{
		this.job = job;
	}
	public int getPay()
	{
		return pay;
	}
	public void setPay(int pay)
	{
		this.pay = pay;
	}
	public Sawon(int sabun, String name, String dept, String job, int pay)
	{
		this.sabun = sabun;
		this.name = name;
		this.dept = dept;
		this.job = job;
		this.pay = pay;
	}
	
	public Sawon() {
		// 디폴트 생성자 설정해두기	=>  새로운 객체를 생성할 때, 기본 생성자가 없으면 생성이 번거롭기 때문..
	}
	
	
}
