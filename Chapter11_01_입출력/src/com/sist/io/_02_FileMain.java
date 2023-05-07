package com.sist.io;
import java.io.*;

public class _02_FileMain
{
	public static void main(String[] args)
	{
		try
		{
//			// File 설정 
//			File file=new File("c:\\javaDev\\school.txt");
//			// File 존재 여부 확인
//			if(!file.exists())   		// 파일이 존재하지 않는다면,
//			{
//				file.createNewFile();	// 새로운 파일 만들기
//			}
//			System.out.println("파일 만들기 성공");
//			File dir=new File("c:\\java_datas");	// 디렉토리 만들기
//			if(!dir.exists())
//			{
//				dir.mkdir();
//			}
//			System.out.println("폴더 만들기 성공");

			File dir=new File("c:\\javaDev");
			File[] files=dir.listFiles();
			for(File f:files)
			{
				if(f.isFile())
				{
					System.out.println(f.getName()+" "+f.length());
				}
				else if(f.isDirectory())
				{
					System.out.println(f.getName()+" DIR");
				}
			}
			
			
		} catch (Exception e)
		{
			
		}
		
	}
}
