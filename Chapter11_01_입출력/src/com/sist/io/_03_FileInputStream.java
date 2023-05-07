package com.sist.io;

import java.io.FileInputStream;
import java.io.FileReader;

/*
		FileInputStream : 단위 byte (1byte씩 읽어온다)		/  FileReader : 2byte씩 읽어옴 (한글 지원)
			=> 한글이 포함된 데이터는 읽을 수 없음
			.zip / .ppt / .png ... ==> 업로드 / 다운로드 (웹에서 자료실, 갤러리 게시판 만들기 등..)
			
			주요 메소드
				read() => 1byte (리턴형 int)
				close() => 닫기
			
			생성자
				new FileInputStream(File file)		=> 파일로 생성하기
				new FileInputStream(String path)	=> 경로명으로 생성하기 



*/

public class _03_FileInputStream
{
	public static void main(String[] args)
	{
		try {
			// 파일 읽기
			// System.in / System.out
			// 표준 입력	 /	표준 출력		 
			
			// 파일 읽기 
			FileInputStream fis= new FileInputStream("C:\\javaDev\\javaStudy\\Chapter11_01_입출력\\src\\com\\sist\\io\\_01_InputOutputMain.java");
			int i=0; 		// 1개의 문자를 읽어온다 --> 문자번호로 넘어오기 때문에, 이것을 char로 변환하여 읽기
							// i는 문자 번호를 받아서 하나씩 출력하는 역할 (while)
			while((i=fis.read())!=-1)	// -1은 EOF(End Of File)은 파일의 끝을 의미
			{
				System.out.print((char)i);
			}
			fis.close();
			FileReader fr=new FileReader("C:\\javaDev\\javaStudy\\Chapter11_01_입출력\\src\\com\\sist\\io\\_01_InputOutputMain.java");
			int j=0;
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i);
			}
			fr.close();
			
		}catch(Exception e) {}
	}
}
