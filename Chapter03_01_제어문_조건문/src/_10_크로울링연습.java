import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.util.Scanner;
/*

*/
// BBdC1rl5sKY // BBdC1rl5sKY\u0026pp=YAHIAQE%3D
public class _10_크로울링연습 {
	public static void main(String[] args) {
//		try
//		{
//			Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
//			Elements title=doc.select("tr.list a.title");
//			Elements singer=doc.select("tr.list a.artist");
//			for(int i=0;i<title.size();i++) {
//				System.out.println(title.get(i).text()+" "
//						+singer.get(i).text());
//			}
//		}catch(Exception ex) {
//			
//		}
//		
		
		
		try
		{
			Scanner scan = new Scanner(System.in);
			System.out.print("검색어 입력:");
			String fd=scan.next();
			
			Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			Elements title=doc.select("tr.list a.title");
			Elements artist=doc.select("tr.list a.artist");
			for(int i =0;i<title.size();i++) 
			{
				
				String s = title.get(i).text();
				if(s.contains(fd))
				{
				System.out.println(i+1+". "+title.get(i).text()+" - "
							+artist.get(i).text());
				}
			}
			Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe "
					+"http://youtube.com/embed/BBdC1rl5sKY\\u0026pp=YAHIAQE%3D");
		}catch(Exception ex)
		{
			
		}
		
		
		
		
		
	}
}
