package com.sist.lib;

class Card
{
	private int number;
	private String type;
	
	public Card()
	{
		number=7;
		type="♥";
	}
	
	public void print()
	{
		System.out.println("번호: "+number+", 타입: "+ type);
	}
}

public class _09_라이브러리_Object_getDeclared
{
	public static void main(String[] args)
	{
		Card c1=new Card();
		c1.print();
		System.out.println("=-=-=-=-=-=-=");
		
		try
		{
			// 객체생성 코딩
			Class clsName=Class.forName("com.sist.lib.Card");
			Object obj=clsName.getDeclaredConstructor().newInstance();
			((Card)obj).print();
		} catch (Exception e)
		{
			
		}
	}
}
