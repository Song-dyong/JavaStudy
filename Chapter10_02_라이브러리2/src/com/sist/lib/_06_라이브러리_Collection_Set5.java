package com.sist.lib;



import java.util.*;
public class _06_라이브러리_Collection_Set5
{
	public static void main(String[] args)
	{
		// Set에 랜덤정수 10개 넣어주기
		Set set=new HashSet();
		for(int i=0;i<10;i++)
		{
			int r=(int)(Math.random()*100)+1;
			set.add(r);
			
		}
		// 출력
		System.out.println(set);
		System.out.println(set.size());
		
		// 50보다 작은 수, 큰수
		for(Object o:set)
		{
			int a=(int)o;
			if(a<50)
			{
				System.out.print(a+" ");
			}
		}
		System.out.println();
		for(Object o:set)
		{
			int a=(int)o;
			if(a>=50)
			{
				System.out.print(a+" ");
			}
		}
		System.out.println("=====================");
		// TreeSet
		// 		1. 자동 정렬 		2. 검색이 빠름
		
		
		TreeSet tSet=new TreeSet();
		for(int i=0;i<10;i++)
		{
			int r=(int)(Math.random()*100)+1;
			tSet.add(r);
		}
		System.out.println(tSet);
		System.out.println("tSet갯수: "+tSet.size());
		for(Object o:tSet)
		{
			int a=(int)o;
			if(a<50)
				System.out.print(o+" ");
		}
		System.out.println();
		for(Object o:tSet)
		{
			int a=(int)o;
			if(a>=50)
				System.out.print(o+" ");
		}
		System.out.println();
		System.out.println(tSet.tailSet(50));
		System.out.println(tSet.headSet(50));
		
		
		
	}
}
