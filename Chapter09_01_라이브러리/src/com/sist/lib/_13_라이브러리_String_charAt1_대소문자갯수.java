package com.sist.lib;

import java.util.Scanner;

/*
	String 메소드 (문자열 제어 기능)
	
		String은 문자열 배열
		------ 문자마다 인덱스 번호를 가지고 있음(0부터 시작)
		String s="Hello Java";
			--> char[] s={ 'H', 'e', 'l', 'l', 'o', ' ', 'J', 'a', 'v', 'a' }; --> 9개의 문자 배열
					cf) 오라클의 인덱스는 0이 아니라 1부터 시작
		
	주요기능(310page)
	1) 문자열에서 문자 한 개 추출 => char charAt(int index)


*/
public class _13_라이브러리_String_charAt1_대소문자갯수
{
	public static void main(String[] args)
	{
		String s1="Hello ";
		System.out.println(s1.hashCode());
		s1+="Java";
		System.out.println(s1.hashCode());		// 한 번 결합할 때마다, 메모리 주소가 다르게 저장됨 --> 앞 클래스의 buffer를 사용하지 않으면,
												// 메모리 주소를 계속해서 생성하기 때문에 오래 걸림
		
		// charAt()
		String msg="Hello Java";
		for(int i=0;i<msg.length();i++)
		{
			//System.out.println((i+1)+"번째 문자: "+ msg.charAt(i));
		}
		// 코딩테스트 문제 -> msg를 거꾸로 출력하기
		for(int i=msg.length()-1;i>=0;i--)
		{
			//System.out.println((i+1)+"번째 문자: "+ msg.charAt(i));
			System.out.print(msg.charAt(i));
		}
		System.out.println();
		// 알파벳 문자열을 입력받아서 대문자 몇 개, 소문자 몇 개를 출력하는 프로그램
		Scanner scan=new Scanner(System.in);
		System.out.println("알파벳을 입력하시오");
	//	String pwd=scan.next();									--> next()는 공백까지 읽음 / nextLine()은 enter까지 읽음
		String  pwd=scan.nextLine();
		
		int salpha=0;
		int balpha=0;
		for(int i=0;i<pwd.length();i++)
		{
			if(pwd.charAt(i)>=65 && pwd.charAt(i)<=90)
			{
				balpha++;
			}
			if(pwd.charAt(i)>=97 && pwd.charAt(i)<=122)
			{
				salpha++;
			}
		}
		System.out.println("소문자 갯수: "+salpha);
		System.out.println("대문자 갯수: "+balpha);
		
		
		// 모범답안
		System.out.println("알파벳 입력: ");
		String data=scan.nextLine();
		int a=0,b=0;
		for(int i=0;i<data.length();i++)
		{
			char c=data.charAt(i);
			if(c>='A'&&c<='Z')
				a++;
			else if(c>='a'&&c<='z')
				b++;
		}
		System.out.println("대문자: "+a);
		System.out.println("소문자: "+b);
		
		
		
	}
}
