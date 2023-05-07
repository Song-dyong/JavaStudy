package com.sist.main5;

public class Member extends Human
{
	public void print() {								// 초록 화살표 오버라이딩
		System.out.println("Member: print Call...");
	}
	public void aaa()
	{
		System.out.println("Member: aaa Call...");
	}
	public void bbb()
	{
		System.out.println("Member: bbb Call...");
	}
}
