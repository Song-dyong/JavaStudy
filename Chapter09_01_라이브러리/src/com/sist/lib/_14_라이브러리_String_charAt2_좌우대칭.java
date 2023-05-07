package com.sist.lib;

import java.util.Scanner;

/*
	문자열을 입력해서 좌우대칭여부 확인
	ABBA
	
*/
public class _14_라이브러리_String_charAt2_좌우대칭
{
	public static void main(String[] args)
	{
		System.out.println("문자열 입력: ");
		Scanner scan=new Scanner(System.in);
		String msg=scan.nextLine();
		
		char[] msgg= new char[msg.length()];
		for(int i=0;i<msg.length();i++)
		{
			char c=msg.charAt(i);
			msgg[i]=c;
		}
		for(int i=0;i<msg.length();i++)
		{
			if(msgg[i]==msgg[(msg.length()-1-i)])
			{
				System.out.println(msg+"는(은) 좌우대칭입니다.");
				break;
			}
			else
				System.out.println(msg+"는(은) 좌우대칭이 아닙니다.");
				break;
		}
		
		// 모범답안
		String data="";
		while(true) 
		{
			System.out.println("문자열 입력");
			data=scan.next();
			if(data.length()%2!=0)
			{
				System.out.println("문자 갯수는 짝수여야합니다.");
				continue;
			}
			break;
		}
		System.out.println("data="+data);
		boolean bCheck=false;
		int j=data.length()-1;
		for(int i=0;i<data.length()/2;i++)
		{
			if(data.charAt(i)==data.charAt(j))
			{
				bCheck=true;
			}
			j--;
		}
		if(bCheck==true)
		{
			System.out.println(data+"는(은) 좌우대칭입니다.");
		}
		else
		{
			System.out.println(data+"는(은) 좌우대칭이 아닙니다.");
		}
		
	}
}	
