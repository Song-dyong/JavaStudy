package com.sist.movie;

import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.jsoup.Jsoup;
import org.w3c.dom.Document;


/*
	일별 박스오피스		searchMainDailyBoxOffice.do
	실시간 예매율		searchMainRealTicket.do
	좌석 점유율		searchMainDailySeatTicket.do
	
	사이트 주소 		https://www.kobis.or.kr/kobis/business/main/  (main.do 제외)
	
			https://www.kobis.or.kr/kobis/business/main/searchMainDailyBoxOffice.do
			
			
*/
public class MovieSystem
{
	Movie[] movie = new Movie[10];  		// Movie라는 클래스에 저장된 5개의 변수에 movie라는 이름의 배열로 10개의 값을 채우기
	int menu()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("=============menu============");
		System.out.println("1. 일별 박스오피스");
		System.out.println("2. 실시간 예매율");
		System.out.println("3. 좌석 점유율");
		System.out.println("4. 상세보기");
		System.out.println("9. 종료하기");
		System.out.println("=============================");
		System.out.println("메뉴 선택: ");
		return scan.nextInt();
	}
	
	// 목록 출력
	Movie[] movieListData(int no)
	{
		String[] strUrl= {
				"",
				"searchMainDailyBoxOffice.do",
				"searchMainRealTicket.do",
				"searchMainDailySeatTicket.do"
		};
		String url="https://www.kobis.or.kr/kobis/business/main/"+strUrl[no];
		try {
			// JSON -> 객체표현법
			//	JSONArray => []
			//  JSONObject => {}
			org.jsoup.nodes.Document doc=Jsoup.connect(url).get();
//			System.out.println(doc.toString());
			String msg=doc.toString();
			msg=msg.substring(msg.indexOf("["),msg.lastIndexOf("]")+1);
			System.out.println(msg);
			JSONParser jp=new JSONParser();
			JSONArray arr=(JSONArray)jp.parse(msg);
			for(int i=0;i<arr.size();i++)
			{
				JSONObject obj=(JSONObject)arr.get(i);
				movie[i]=new Movie();
				movie[i].title=(String)obj.get("movieNm");
				movie[i].genre=(String)obj.get("genre");
				movie[i].time=(String)obj.get("showTm");
				movie[i].director=(String)obj.get("director");
				movie[i].story=(String)obj.get("synop");
			}
		}catch(Exception ex) { }
		return movie;
		
	}
	
	Movie movieDetailData(int no)
	{
		return movie[no-1];
	}
	
	/*public static void main(String[] args)
	{
		MovieSystem ms=new MovieSystem();
		Movie[] mm=ms.movieListData(3);
		for(int i=0;i<mm.length;i++)
		{
			System.out.println((i+1)+"."+mm[i].title);
		}
	}*/
	
}
