package com.sist.lib;

import java.io.*;
public class _12_라이브러리_String_Buffer
{
	public static void main(String[] args)
	{
		try
		{
			long start=System.currentTimeMillis();
			FileReader fr = new FileReader("c:\\javaDev\\movie.txt");
			int i=0;							// 문자읽기 --> int값으로 읽어옴 --> 다시 문자(char)로 변경해야 함
			StringBuffer data=new StringBuffer();				// String data=""; 로 하면, 하나씩 추가해야하므로 오래 걸림
																// StringBuffer를 사용하면 빠르게 해결
			while((i=fr.read())!=-1)				// -1  (EOF) End Of File (파일의 끝)
			{
				data.append((char)i);
			}
			long end=System.currentTimeMillis();
			fr.close();
			System.out.println(data);		
			System.out.println("걸린 시간: "+(end-start));
		} catch (IOException ex)
		{
			ex.getMessage();
			ex.printStackTrace();  			// 에러 메세지 확인 1. .printStackTrace / 2. getMessage()
		}
	}
}
