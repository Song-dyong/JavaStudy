package com.sist.io2;
// 데이터 수집용 임시 클래스
/*
 * 
 		
 		크롤링 하는 방법
 		
 <table class="list-wrap">

   <tbody>
<tr class="list rank-1" songid="101268096">
    <td class="check"><input type="checkbox" class="select-check" title=" I AM ">
   </td><td class="number">1
       <span class="rank"><span class="rank-none"><span class="hide">유지</span></span></span>
   </td>
   ! <td><a href="#" class="cover" onclick="fnViewAlbumLayer(83665559); return false;" ontouchend="fnViewAlbumLayer(83665559); return false;"><span class="mask"></span><img onerror="this.src='//image.genie.co.kr/imageg/web/common/blank_68.gif';" src="//image.genie.co.kr/Y/IMAGE/IMG_ALBUM/083/665/559/83665559_1681116738103_1_140x140.JPG/dims/resize/Q_80,0" alt="I AM"></a></td>
    <td class="link"><a href="#" class="btn-basic btn-info" onclick="fnViewSongInfo(101268096); return false;" ontouchend="fnViewSongInfo(101268096); return false;">곡 제목 정보 페이지</a></td>
     ! <td class="info">
         !  <a href="#" class="title ellipsis" title="I AM" onclick="fnPlaySong('101268096;','1'); return false;" ontouchend="fnPlaySong('101268096;','1'); return false;">
I AM</a>
          !  <a href="#" class="artist ellipsis" onclick="fnViewArtist(81271496); return false;" ontouchend="fnViewArtist(81271496); return false;">IVE (아이브)</a>           <div class="toggle-button-box" id="hide-button">
               <button type="button" class="btn artist-etc" onclick="fnRelationArtistList('101268096'); artist_etc_layer._show(this);return false;" ontouchend="fnRelationArtistList('101268096'); artist_etc_layer._show(this);return false;">외</button>
               <dl class="list" id="RelationArtist_101268096">
               </dl>
           </div>
            <i class="bar">|</i>
          !  <a href="#" class="albumtitle ellipsis" onclick="fnViewAlbumLayer(83665559); return false;" ontouchend="fnViewAlbumLayer(83665559); return false;">I've IVE</a>
        </td>
 
 img --> 클래스 a의 cover의 img	=> table.list-wrap a.cover img
*/
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.*;
import java.net.*;
public class DataCollectionManager
{
	public static void main(String[] args)
	{
		List<GenieMusicVO> list=new ArrayList<GenieMusicVO>();
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		
		try
		{
			fos=new FileOutputStream("c:\\java_datas\\genie_music.txt");
			oos=new ObjectOutputStream(fos);
			// 사이트 연결
			String[] urls= {
					"https://www.genie.co.kr/genre/M0100",
					"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230502&genrecode=M0200",
					"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230502&genrecode=M0300",
					"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230502&genrecode=M0107",
					"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230502&genrecode=M0500",
					"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230502&genrecode=M0600"
			};
//			private int no;
//			private String title;
//			private String singer;
//			private String album;
//			private String poster;
//			private int idcrement; 	// 증폭
//			private String state;	// 유지, 상승, 하강
//			private int cno;		// 구분자 
//			private String key;		// 동영상
			int k=1;	// 고유번호
			for(int i=0;i<urls.length;i++)
			{
				Document doc=Jsoup.connect(urls[i]).get();
				Elements title=doc.select("table.list-wrap td.info a.title");
				Elements singer=doc.select("table.list-wrap td.info a.artist");
				Elements album=doc.select("table.list-wrap td.info a.albumtitle");
				Elements poster=doc.select("table.list-wrap a.cover img");
				Elements etc=doc.select("table.list-wrap span.rank");				// idcrement, state 같이 가져오기
				/*
					<a>값</a>	=> a 사이의 값은 text()로 가져오기
					<img src="이미지 주소">	=> img값은 attr("src") 로 가져오기 (속성명)
				
				*/			
				for(int j=0;j<title.size();j++)
				{
					System.out.println("고유번호: "+k);
					System.out.println("카테고리 번호: "+(i+1));
					System.out.println(title.get(j).text()); 			// title의 j(50까지)번째의 text
					System.out.println(singer.get(j).text());
					System.out.println(album.get(j).text());
					System.out.println(poster.get(j).attr("src"));
					String ss=etc.get(j).text();
					//System.out.println(ss);
					String state="";
					String id="";	// 등폭
					if(ss.contains("유지"))
					{
						state="유지";
						id="0";
					}
					// 상승, 하강일 경우 id와 state가 붙어서 나옴 --> 4상승 --> 전부 공백으로 지우기
					else if(ss.contains("new"))
					{
						state="NEW";
						id="0";
					}
					else
					{
						state=ss.replaceAll("[0-9]", "");	// state에 4를 지우고 상승만 남기기
						id=ss.replaceAll("[가-힣]", "");		// id에 상승을 지우고 4만 남기기
					}
					
					System.out.println("상태: "+state);
					System.out.println("등폭: "+id);
				//	System.out.println("동영상: ");
					System.out.println("=============================");
					// GenieMusicVO에 값 채워주기
					GenieMusicVO vo=new GenieMusicVO();
					vo.setNo(k);
					vo.setCno(i+1);
					vo.setTitle(title.get(j).text());
					vo.setSinger(singer.get(j).text());
					vo.setAlbum(album.get(j).text());
					vo.setPoster(poster.get(j).attr("src"));
					vo.setState(state);
					vo.setIdcrement(Integer.parseInt(id));
					vo.setKey(youtubeKeyData(title.get(j).text()));
					list.add(vo);
					k++;
				}
			}
			oos.writeObject(list);
			System.out.println("저장 완료!!");
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		finally {
			try
			{
				fos.close();
				oos.close();
			} catch (Exception e2)
			{
			}
		}
	}
	public static String youtubeKeyData(String title)
	{
		String key="";
		try
		{
			String url="https://www.youtube.com/results?search_query="+URLEncoder.encode(title,"UTF-8");
						// %EC%95%84%EC%9D%B4%EB%B8%8C	=> title을 바이트 데이터로 만들어주는 메소드 encode 
			Document doc=Jsoup.connect(url).get();
			String data=doc.toString();							
			Pattern p=Pattern.compile("/watch\\?v=[^가-힣]+");	// 저 url 소스 내에 /watch?v= 로 시작하는 패턴 /watch?v=는 동영상키
													//	[^가-힣] --> 한글을 제외하고,, + --> 여러 개가 있다는 뜻
			Matcher m=p.matcher(data);		// Matcher --> data안에 패턴 p 형식을 가진것을 가져오기.
			while(m.find())					// m이 존재한다면,
			{	
				String s=m.group();			// 값 찾아서 s에 대입하기			"/watch?v=aeJOyqdsMlU\u0026pp=ygUJ7JWE7J2067iM"
				s.substring(s.indexOf("=")+1,s.indexOf("\""));				// 찾은 값에서 = 부터 "까지 짜른 값을 key에 대입하기
				key=s;														// ==> aeJOyqdsMlU\u0026pp=ygUJ7JWE7J2067iM
				break;
			}
			
		} catch (Exception e)
		{
		}
		finally {
			
		}
		return key;
	}
}
