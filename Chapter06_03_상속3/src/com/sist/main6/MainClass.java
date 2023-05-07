package com.sist.main6;
class Super{
	int a=10;
	int b=20;
}
class Sub extends Super{
	public Sub()
	{
		System.out.println(a+", "+b);
		this.a=100;
		this.b=200;
		System.out.println(a+", "+b);
		System.out.println(super.a+", "+super.b);
	}
}
public class MainClass
{
	public static void main(String[] args)
	{
		Sub sub=new Sub();
		
	}
}
