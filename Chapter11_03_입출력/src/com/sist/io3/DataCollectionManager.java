package com.sist.io3;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;



public class DataCollectionManager
{
	public static void main(String[] args)
	{
		List<MovieVO> list=new ArrayList<MovieVO>();
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		
		try
		{
			fos=new FileOutputStream("c:\\java_datas\\movie_daum.txt");
			oos=new ObjectOutputStream(fos);
			// 사이트 연결
			String[] urls= {
					"https://movie.daum.net/ranking/reservation",
					"https://movie.daum.net/ranking/boxoffice/weekly"
			};
			
			int k=1;	// 고유번호
			for(int i=0;i<urls.length;i++)
			{
				Document doc=Jsoup.connect(urls[i]).get();
				Elements title=doc.select("div.selection_ranking a.moviename");
				Elements rated=doc.select("span.txt_tag");
				Elements poster=doc.select("div.movie-list div.movie-list-info img");
		//		Elements hit=doc.select("table.list-wrap td.info a.albumtitle");
				Elements avg=doc.select("span.txt_grade");
				Elements reservationRate=doc.select("div.item_poster span.info_txt span.txt_num");
				Elements regDate=doc.select("div.item_poster span.txt_info span.txt_num");
				Elements contents=doc.select("div.item_poster a.link_story");
				
				for(int j=0;j<title.size();j++)
				{
					System.out.println("고유번호: "+k);
					System.out.println("카테고리 번호: "+(i+1));
					System.out.println(title.get(j).text()); 			// title의 j(50까지)번째의 text
		//			System.out.println(rated.get(j).text());
					System.out.println(poster.get(j).attr("src"));
		//			System.out.println(hit.get(j).text());
		//			System.out.println(avg.get(j).text());
		//			System.out.println(reservationRate.get(j).text());
		//			System.out.println(regDate.get(j).text());
		//			System.out.println(contents.get(j).text());
					
					
					MovieVO vo=new MovieVO();
			//		vo.setNo(k);
					vo.setCno(i+1);
					vo.setTitle(title.get(j).text());
			//		vo.setSinger(singer.get(j).text());
			//		vo.setAlbum(album.get(j).text());
					vo.setPoster(poster.get(j).attr("src"));
			//		vo.setState(state);
			//		vo.setIdcrement(Integer.parseInt(id));
			//		vo.setKey(youtubeKeyData(title.get(j).text()));
					list.add(vo);
					k++;
					
				}
				
				
				
			}
			oos.writeObject(list);
			System.out.println("저장 완료!!");
		}catch(Exception e)
		{
			
		}
		finally
		{
			try
			{
				fos.close();
				oos.close();
			} catch (Exception e2)
			{
				// TODO: handle exception
			}
		}
	}
}