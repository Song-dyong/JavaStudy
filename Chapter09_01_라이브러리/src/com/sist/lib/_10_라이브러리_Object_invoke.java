package com.sist.lib;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

class Aa
{
	public void aaa() {
		System.out.println("aaa() Call...");
	}
	public void bbb() {
		System.out.println("bbb() Call...");
	}
	public void ccc() {
		System.out.println("ccc() Call...");
	}
	public void ddd() {
		System.out.println("ddd() Call...");
	}
	public void eee() {
		System.out.println("eee() Call...");
	}
}

public class _10_라이브러리_Object_invoke
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("메소드명 입력: ");
		String m=scan.next();
//		A a=new A();
//		if(m.equals("aaa"))
//			a.aaa();
//		else if(m.equals("bbb"))
//			a.bbb();
//		else if(m.equals("ccc"))
//			a.ccc();
//		else if(m.equals("ddd"))
//			a.ddd();
//		else if(m.equals("eee"))
//			a.eee();					서버에서 메소드(기능)가 추가될 때마다, else if를 통해 코딩을 추가해야함
										// 아래처럼 메소드(기능)의 이름만 알면, 호출하는 코딩을 작성해야 추가 작업없이 실행이 가능한 프로그램.

		try
		{
			// 리플렉션 --> 클래스 이름으로 클래스 정보 읽기 --> 모든 제어가 가능
			// 모든 제어? 변수, 자동 메모리 할당, 메소드 호출 등등 
			// Class.forName을 통해 모든 정보 사용 가능
			
			Class clsName=Class.forName("com.sist.lib.Aa");
			Object obj=clsName.getDeclaredConstructor().newInstance();
			
			Method[] methods=clsName.getDeclaredMethods();
		//	System.out.println(Arrays.toString(methods));
			for(Method mm: methods)
			{
				if(m.equals(mm.getName()))
				{
					mm.invoke(obj, null);			// 메소드 호출 invoke
				}
			}
		} catch (Exception ex)
		{
			
		}
		
	}
}
