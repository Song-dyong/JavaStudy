package com.sist.io;

/*
	IO : Input (읽기) / Output (쓰기)
		1) 자바에서 IO는 Stream을 사용
					  ------- 데이터 이동 통로 (FIFO => Queue)
		  사용)		  
			메모리 입출력
			파일 입출력
			네트워크 입출력
		  특징) 단방향 통신 -> 빨대 (올리거나, 내리거나 둘 중 하나만 가능) - 그 통로를 부르는 명칭 Stream
		  
		2) 읽기 / 쓰기 (1byte, 2byte)
		 	= 1byte => ~InputStream, ~OutputStream
		 			1글자당 1바이트씩 읽기 / 쓰기 => 한글 2byte 저장이므로, 깨져서 나옴
		 				ex) 업로드, 다운로드에 사용
		 	= 2byte => ~Reader, ~Writer
		 			1글자당 2바이트씩 읽기 / 쓰기 => 한글을 읽을 수 있음
		 				ex) 한글 제어
		 	------------------								  ------------
		 	 메모리 (데이터 저장)	======= 자바응용프로그램 =======	모니터 출력
		 	------------------		|					|	  ------------
								InputStream			OutputStream	
								
		356page
		-------
			Stream : 데이터가 이동하는 통로 (단방향) 
					 읽기 통로 - 데이터가 저장된 위치로부터 프로그램에서 데이터를 읽어 들이기 위한 연결
					 			InputStream (바이트 스트림 1byte씩) / Reader (문자 스트림 2byte씩) 
					 			메모리에 있는 데이터
					 			파일에 있는 데이터 
					 			소켓에 있는 데이터 (네트워크)
					 쓰기 통로 - 출력 위치로 프로그램에 전송하는 통로 
					 			OutputStream (바이트 스트림 1byte씩) / Writer (문자 스트림 2byte씩)
			
								IO관련 클래스
			
			바이트 스트림(1byte)					문자 스트림(2byte)
			
			
		InputStream	OutputStream				Reader		Writer
	
	FileInputStream	FileOutputStream			FileReader	FileWriter
  FilterInputStream FilterOutputStream		
											BufferedReader BufferedWriter
BufferedInputStream BufferedOutputStream
ObjectInputStream	ObjectOutputStream								

	=> 업로드 / 다운로드							=> 파일 입출력
	
	
	모드 (mode) => r, w, a
				read, write, append
			   Reader Writer 	-> new FileWriter("파일명", true) => append (추가 --> 기존의 데이터 유지)
								-> new FileWriter("파일명") 		=> create (생성 --> 기존의 데이터 삭제)
	-------------------------------------------------------------------------------------------
	File : 독립 클래스
		1) 파일
		2) 디렉토리 (폴더) 
		
		File 사용방법
			= 생성방법
				File file=new File("c:\\javaDev\\back.png")
					파일 정보 읽어오기
				File file=new File("c:\\javaDev")
					디렉토리 정보 읽어오기
		File 주요기능(메소드)
			= 파일 정보 String
				getName() : 파일명				★★★
				getPath() : 경로명/파일명 			★★★
				getParent() : 경로명
			= 파일 특성  boolean
				canRead() : 읽기 전용
				canWrite() : 쓰기 전용
				isHidden() : 숨김 파일
			= 파일 여부 확인  boolean
				isFile() : 파일인지				★★★
				isDirectory() : 폴더인지
			= 파일 조작
				createNewFile() : 파일 만들기		★★★
				mkdir() : 디렉토리 만들기			★★★
			= 파일 삭제
				delete() : 한개만 (파일이 있는 디렉토리는 삭제가 안됨 --> 파일 먼저 삭제 후 디렉토리 삭제)		★★★
			= 파일이나 디렉토리 존재 여부
				exists() : 파일 존재 여부			★★★
			= 수정 날짜  long
				lastModified()					★★★
			= 파일 크기  long
				length()
			= 디렉토리에 있는 목록 읽기
				listFiles()
		
		+ => read(), write(), close() 		★★★★★★
		
		FileInputStream
		---------------
			int read() write(byte)
		FileReader
		----------
			char read() write(String)
			
			
	CheckedException => 반드시 예외처리 해야 사용 가능 


*/

import java.io.*;
import java.util.*;
import java.text.*;
public class _01_InputOutputMain
{
	public static void main(String[] args)
	{
//		File file=new File("c:\\javaDev\\fox.gif");
//		System.out.println(file.getParent());
//		System.out.println(file.canRead());
//		System.out.println(file.canWrite());
//		System.out.println(file.isHidden());
//		System.out.println(file.isDirectory());
//		System.out.println(file.isFile());
		
		File file=new File("c:\\javaDev\\back.jpg");
		System.out.println("파일 크기: "+file.length()+"Bytes");
		long size=file.length();
		String res="";
		if(size/1024==0)
		{
			res=size+"Bytes";
		}
		else
		{
			size=size/1024;
			res=size+"KB";
		}
		System.out.println("파일 크기: "+res);
		System.out.println("파일 위치: "+file.getPath());
		System.out.println("읽기 전용: "+file.canRead());
		System.out.println("쓰기 전용: "+file.canWrite());
		System.out.println("숨긴 파일: "+file.isHidden());
		System.out.println("수정 날짜: "+new Date(file.lastModified()));
		//System.out.println("수정 날짜: "+new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초").format(file.lastModified());
		System.out.println("경로명: "+file.getParent());
		System.out.println("파일명: "+file.getName());
		System.out.println("경로명+파일명: "+file.getPath());
		
		
		
		
		
	}	
}
