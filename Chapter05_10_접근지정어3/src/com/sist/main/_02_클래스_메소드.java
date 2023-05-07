package com.sist.main;
import static java.lang.Math.random;

import java.util.Scanner;

/*
		import 패키지명.클래스명
		import 패키지명.*
		import static java.lang.Math.random;
		java.lang.* => 자동 로딩 => import 사용x
		------------------String, Math
		
		void method()
		{
			return; ==> 자동설정 -> compiler가 자동으로 생성 (생략되어있음 - 리턴형이 void일 경우!)
			-> 항상 마지막 x -> 중간에 있을수도 있음
			
		}
		
		class A
		{
			기본생성자	=> compiler가 자동생성 (생략)
			A()
			{
			}
		}



*/
public class _02_클래스_메소드
{
	public static void main(String[] args)
	{
		int a=(int)(random()*100)+1;
		System.out.println(a);
		
		int b=10;
		if(b%2!=0)
		{
			System.out.println("b="+b);
			return;
		}
		System.out.println("1");			// 메소드는 return이 들어간 뒤로는 실행 x 
		System.out.println("2");			// cf) 반복문의 break;와 동일
		System.out.println("3");
		return;
		
	}
}
