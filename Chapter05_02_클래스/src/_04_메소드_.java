/*
		장르별 노래제목 출력
		
		
*/
import java.util.Scanner;

import javax.lang.model.util.Elements;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
public class _04_메소드_ {

	static int menu()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("======메뉴======");
		System.out.println("1. 가요");
		System.out.println("2. pop");
		System.out.println("3. ost");
		System.out.println("4. 트롯");
		System.out.println("5. jazz");
		System.out.println("9. 종료");
		System.out.println("===============");
		int menu=scan.nextInt();
		return menu;
	}
	
	static void titlePrint(int no)
	{
		final String BASIC_URL="https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230409&genrecode=";
		String[] url= {
				"",					// 인덱스는 0번부터 시작이므로, 메뉴의 1~5번에서 0번이 제외되도록 0을 제외
				"M0100",				// 빌드 패스 -> 컨피규어 빌드패스 -> 클래스 패스 -> 에드 익스터널 잘 -> 추가 (레퍼런스 라이브러리 추가)
				"M0200",
				"M0300",
				"M0107",
				"M0500"
		};
		try
		{
			Document doc=Jsoup.connect(BASIC_URL+url[no]).get();
			org.jsoup.select.Elements title=doc.select("tr.list td.info a.title");
		//	Elements title=doc.select("tr.list td.info a.title");
			for(int i=0;i<title.size();i++)
			{
				System.out.println(title.get(i).text());
			}
		}catch(Exception ex) {}
	}
	
	static void process()
	{
		while(true)						// 계속 눌러볼 수 있도록
		{
			int m=menu();
			if(m==9)
			{
				System.out.println("프로그램 종료");
				break;
			}
			titlePrint(m);
		}
	}
	
	public static void main(String[] args) {
		process();
		
	}
}
