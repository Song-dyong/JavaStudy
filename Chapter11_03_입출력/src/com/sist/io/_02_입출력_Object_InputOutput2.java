package com.sist.io;

import java.util.*;
import java.io.*;

public class _02_입출력_Object_InputOutput2
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream fis=new FileInputStream("c:\\java_datas\\sawon.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		// 객체 단위로 값 읽어오기
		List<Sawon> list=(List<Sawon>)ois.readObject();
		for(Sawon s:list)
		{
			System.out.print(s.getSabun()+" ");
			System.out.print(s.getName()+" ");
			System.out.print(s.getDept()+" ");
			System.out.print(s.getJob()+" ");
			System.out.println(s.getPay());
		}
	}
}
