package com.sist.io;

/*
	메모리 입출력
	파일 입출력 ===> 객체단위 저장 (프로젝트에서 이용)
	--------- ObjectInputStream / ObjectOutputStream
				=> 객체 단위로 읽기		=> 객체 단위로 파일에 저장
		
	객체 단위로 저장
	------------
	
	stack 영역에 객체의 주소 저장 => heap 영역에 객체의 변수값(데이터) 저장	=> 생성자가 변수값을 초기화 
	----------------------------------------------------------------------------------
	객체명.메소드 or 변수를 통해 데이터에 접근 가능   354page 필기
	
	
	



*/
import java.io.*;
import java.util.*;

public class _01_입출력_Object_InputOutput 
{
	public static void main(String[] args) throws Exception
	{
		List<Sawon> list=new ArrayList<Sawon>();
		list.add(new Sawon(1,"홍길동","개발부","대리",4500));
		list.add(new Sawon(2,"심청이","영업부","과장",5500));
		list.add(new Sawon(3,"이순신","기획부","사원",3000));
		list.add(new Sawon(4,"박문수","자재부","부장",6500));
		list.add(new Sawon(5,"강감찬","총무부","대리",4500));
		FileOutputStream fos=new FileOutputStream("c:\\java_datas\\sawon.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);		// --> 저장을 파일 단위(문자열)에서 객체 단위로 변경 <ObjectInputStream>
		oos.writeObject(list);
		fos.close();
		oos.close();
		System.out.println("객체 단위 저장 완료!!");
		
		
		
		
	}
}
