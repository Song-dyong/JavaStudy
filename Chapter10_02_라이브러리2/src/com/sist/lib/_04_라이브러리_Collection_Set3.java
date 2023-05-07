package com.sist.lib;
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

// 클래스명.구분자명을 통해서 select() 사이에 넣기
public class _04_라이브러리_Collection_Set3
{
	public static Set geniMusic() 
	{
		Set set=new HashSet();
		
		try
		{
			
			for(int i=1;i<=2;i++)
			{
				Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20230428&hh=11&rtm=Y&pg="+i).get();
				Elements title=doc.select("table.list-wrap a.title");
				//  <table class="list-wrap"> -> table.list-wrap a.
				for(int j=0;j<title.size();j++)
				{
					//System.out.println(title.get(j).text());
					set.add(title.get(j).text());
				}
			}
		} catch (Exception e){}
		
		return set;
	}
	
	public static Set melonMusic() 
	{
		Set set=new HashSet();
				
				try
				{
					Document doc=Jsoup.connect("https://www.melon.com/chart/index.htm").get();	// 멜론 웹사이트의 파일(데이터) 가져오기
					Elements title=doc.select("div.wrap_song_info div.rank01 a");
					for(int i=0;i<title.size();i++)
					{
						//System.out.println(title.get(i).text());
						set.add(title.get(i).text());
					}
				} catch (Exception e){}
				
		return set;
	}
	
	public static void main(String[] args)
	{
		// 지니뮤직 읽기
		Set genie=geniMusic();
		System.out.println(genie);
		// 멜론뮤직 읽기
		Set melon=melonMusic();
		System.out.println(melon);
		
		// 지니뮤직만 가지고 있는 곡 찾기
//		genie.removeAll(melon);			// removeAll차집합 --> 같은 내용 제거하기
//		System.out.println(genie);		// [1,2,3,4,5] - [1,2,3,6,7] ==> [4,5] 
//		for(Object obj:genie)
//		{
//			System.out.println(obj.toString());
//		}
		
		// 교집합만 가져오기
		melon.retainAll(genie);
		for(Object obj:melon)
		{
			System.out.println(obj.toString());
		}
		System.out.println("멜론과 지니뮤직의 동일한 곡 수: "+melon.size());
		
	}
}
