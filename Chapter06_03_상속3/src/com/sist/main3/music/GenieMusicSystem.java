package com.sist.main3.music;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class GenieMusicSystem
{
	protected Music[] musics=new Music[50];	// 노래 50개 배열 만들기  +  누구든 같은 데이터를 봐야하므로 static 
	protected String title="지니뮤직 Top50";
	
	// 0. 변수 설정
	// 1. 값 초기화 --> 데이터값 집어넣기 
/*			1) 인스턴스 블록
 			2) static 블록 
			------------- 자동호출
			3) 생성자 
			------------- 직접호출 (new)
			
			예외처리: 에러 (소스 상에서 처리할 수 없는 심각한 에러) 	ex) 메모리 공간 부족	
			
			 		예외 (수정이 가능한 가벼운 에러)
			 		  -예외복귀 / 예외회피   ==>  비정상 종료 방지!
			 		  	(io, network, thread, web)
			 io: 파일경로명, 파일명 / network: IP, URL / thread: 충돌 / web:  	
			 		  	
*/
	
	{
//		try { 
//			
//		}catch(Exception ex) {}							// try 예외 발생시 ==> catch 예외 복구
		try
		{																				// Jsoup은 html 번역기
			Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200").get();	// doc 문장만 사용했을 경우, 예외처리가 없기 때문에 오류
			// Document --> 문서 저장 공간 => html을 저장 (웹 크롤링)
			/*
			  	HTML => tag<> => Markup language
			  	<a> 값 </a>
				Element(자바) => tag 
				Elements(자바) => 같은 태그 여러 개를 모아준 것
			
			*/
			// 노래명		<table class="list-wrap">
			// 구분자 => 모든 태그의 구분자: <class(중복가능)> or <id(중복불가능)>
			// class => . / id => #    ==> 자바에서 class는 .으로 / id는 #으로 구분하기 
			Elements title =doc.select("table.list-wrap td.info a.title");
			//System.out.println(title);
			//가수명
			Elements singer=doc.select("table.list-wrap td.info a.artist");
			//앨범명,
			Elements album=doc.select("table.list-wrap td.info a.albumtitle");
			//상태,
			Elements etc=doc.select("table.list-wrap td.number span");
			//등폭
			//System.out.println(singer);
			//System.out.println(etc);
			
			for(int i=0;i<title.size();i++)
			{
//				System.out.println("순위: "+(i+1));
//				System.out.println("노래명: "+title.get(i).text()); 		// title의 i번째의 값에 text()를 통해 태그 사이의 값만 추출
//				System.out.println("가수명: "+singer.get(i).text()); 		
//				System.out.println("앨범명: "+album.get(i).text());
				String s=etc.get(i).text();
				String state="";
				String value="";
				if(s.equals("유지"))
				{
					state="유지";
					value="0";
				}
				else
				{
					state=s.replaceAll("[0-9]", "");				// 상승, 하강일 경우, 숫자를 지우기		==> 숫자만 들어옴
					value=s.replaceAll("[가-힣]", "");				// 상승 하강일 경우, 가-힣까지 지우기 		==> 상승, 하강 둘 중 하나만 들어옴
					/*
						split / replaceAll
						--> 정규식 (한글형태, 숫자형태 --> 패턴)
						[0-9] ==> 숫자 전체
						[가-힣] ==> 한글 전체
						[A-Za-z] ==> 알파벳 전체
					
					*/
				}
//				System.out.println("상태: "+state);
//				System.out.println("등폭: "+value);
//				System.out.println("=============================");
				
				musics[i]=new Music();				// musics[i]마다 주소 부여
				musics[i].setRank(i+1);				// 주소에 값 넣어주는 과정
				musics[i].setTitle(title.get(i).text());	// musics의 i번째 title에 tetile.get(i).text() 노래 제목 넣기
				musics[i].setSinger(singer.get(i).text());
				musics[i].setAlbum(album.get(i).text());
				musics[i].setState(state);
				musics[i].setIdcrment(value);		// 초기화 과정
			}
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}								
		
	}
	
// 		2. 기능 (메소드)
	public Music[] musicAllData()
	{
		return musics;
	}
	
//  		1) 목록 출력
//				결과값을 전송: 리턴형 => 웹에 리턴값을 보내줘야 클라이언트에서 볼 수 있음 
//				자체 출력: void	  => void는 자체에서 출력 --> 서버에서만 볼 수 있음 
//		type 1: 제목 / 2: 가수명 / 3. 앨범명 ... 
	public Music[] musicFind(String fd, int type)
	{
		int i=0;
		for(Music m:musics)
		{
			boolean bCheck=false;
			if(type==1)
			{
				bCheck=m.getTitle().contains(fd);
				if(bCheck==true)
				i++;
			}
			else
			{
				bCheck=m.getSinger().contains(fd);
				if(bCheck==true)
				i++;
			}
		}
		Music[] mm=new Music[i];
		System.out.println("'"+fd+"'이(가) 포함된 노래 갯수: "+i);
		i=0;
		for(Music m:musics)
		{
			boolean bCheck=false;
			if(type==1)
			{
				bCheck=m.getTitle().contains(fd);
			}
			else
			{
				bCheck=m.getSinger().contains(fd);
			}
			
			if(bCheck==true)
			{
				mm[i]=m;
				i++;
			}
		}
		return mm;
	}
	
// 			2) 검색
// 			3) 

	
	
	public static void main(String[] args)
	{
		GenieMusicSystem g=new GenieMusicSystem();
		Music[] aa= g.musicFind("사", 2);
		Music[] m= g.musicAllData();
		for(Music k: g.musics)
		{
			System.out.println(k);
		}
		
	}
}
