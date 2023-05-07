package com.sist.main2;

import java.util.Scanner;

public class MainClass
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("해당 클래스 번호: ");
		int no = scan.nextInt();
		Container cc= new Container();
		Exec a=(Exec)cc.getBean(no);
		a.execute();
//		if(no==1)
//		{
//			A a= cc.getBean(1); --> 오류 why? 리턴형이 object이므로, 대입되는 클래스(objcet)를 (A)로 명시적 초기화 해야함
//			A a= (A) cc.getBean(1);
//			a.excute();
//		}
//		if(no==2)
//		{
//			B b= (B) cc.getBean(2);
//			b.excute();
//		}
//		if(no==3)
//		{
//			C c= (C) cc.getBean(3);
//			c.excute();
//		}
	}
}
