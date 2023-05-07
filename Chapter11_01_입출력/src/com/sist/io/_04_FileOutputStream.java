package com.sist.io;


import java.util.*;
import java.io.*;
public class _04_FileOutputStream
{
	public static void main(String[] args)
	{
		try
		{
			
			// 파일 지정
			File file=new File("c:\\java_datas\\school.txt");
			// 파일 존재여부 확인
			if(!file.exists())
			{
				file.createNewFile();
			}
			// 파일이 존재할 때 사용
			FileOutputStream fos=new FileOutputStream(file, true);
			String msg="안녕하세요 지금은 파일의 입출력을 하고 있습니다.\r\n";
//			System.out.println((int)'안');	// 50504
			fos.write(msg.getBytes());		// String --> bytes[]로 변경  getBytes();
			fos.close();					// 여러 번 연속으로 생성하더라도, 붙여서 여러번 쓰이는 것이 아니라 새로 생성됨 (기존의 데이터 지워짐)
											// file, true로 append모드 사용시 실행시마다 계속 추가됨
			System.out.println("저장 완료!!");
			
		} catch (Exception e)
		{
		}
	}
}	
