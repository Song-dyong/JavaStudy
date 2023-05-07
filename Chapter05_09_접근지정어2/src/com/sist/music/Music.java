package com.sist.music;

/*
	1. 재사용
		-상속 => is-a
			기존의 클래스를 확장해서 사용
						---- extends
				=> 자바는 단일 상속만 가능
			ex)	class A
				class B entends A
				class C extends JFrame ==> 보통 라이브러리를 상속받음
				--------------------
				class A
				class B
				class C extends A,B --> 오류 (C언어는 다중상속 가능)
				C = A + B + 알파
				
				class A
				class B extends A
				class C extends B
				------------------
				class A
				class B
				--> A와 B는 다른 클래스 => 크기를 가지지 않음 (크기 비교x)
				------------------------
				float(4) > long(8)
				
				class A(int a, b)
				class B(int c) extends A
								--------> int a, b, c
						A > B ==> 크기는 상속을 내리는 클래스가 더 크다
								
								동물
								 |
						-----------------
						|		|		|
					  포유류	  양서류	   조류
						|
					   인간			남자는 인간이다 -> 인간은 포유류이다 -> 포유류는 동물이다
					    |				==> 즉, 상속을 내리는 클래스의 크기가 더 크다
					   ---					----> 상위 클래스 > 하위 클래스
					   | |				**** 모든 클래스는 Object 상속을 받고 있음	
					 남자 여자			Object: 모든 클래스의 최상위클래스
										cf) 상속의 예외조건
										 생성자 / static / private / 초기화 블록
				
		-포함 => has-a (***** 더 많이 사용됨)



*/
public class Music
{
	private int rank;
	private String state;		
	private String title;
	private String singer;
	private String album;
	private int idcrement;
	
	
	public int getRank()
	{
		return rank;
	}
	public void setRank(int rank)
	{
		this.rank = rank;
	}
	public String getState()
	{
		return state;
	}
	public void setState(String state)
	{
		this.state = state;
	}
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	public String getSinger()
	{
		return singer;
	}
	public void setSinger(String singer)
	{
		this.singer = singer;
	}
	public String getAlbum()
	{
		return album;
	}
	public void setAlbum(String album)
	{
		this.album = album;
	}
	public int getIdcrement()
	{
		return idcrement;
	}
	public void setIdcrement(int idcrement)
	{
		this.idcrement = idcrement;
	}	
}
