package com.sist.io3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;


public class MovieSystem
{
private static List<MovieVO> list = new ArrayList<MovieVO>();
	
	static {
		// 초기화 블록
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		try
		{
			fis=new FileInputStream("c:\\java_datas\\movie_megabox.txt");
			ois=new ObjectInputStream(fis);
			list=(List<MovieVO>)ois.readObject();
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		finally {
			try
			{
				fis.close();
				ois.close();
			} catch (Exception e2)
			{
			}
		}
	}
	public void movieCategoryData(int cno)
	{
		for(MovieVO vo:list)
		{
			if(vo.getCno()==cno)
			{
				System.out.println(vo.getTitle());
			}
		}
	}
	public static void main(String[] args)
	{
		MovieSystem ms=new MovieSystem();
		try
		{
			BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("1,2,3,4");
			String cno=in.readLine();
			ms.movieCategoryData(Integer.parseInt(cno));
			
		} catch (Exception e)
		{
		}
	}
}
