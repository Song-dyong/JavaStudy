

class JurasicWorld
{
	int no;			// 페이지 넘버
	String nameKor;
	String nameEng;
	String date;
	String type;
	String country;
	String rank;
	String runningTime;
	double point;
	String boxOffice;	// int boxOffice ==> why? 수시로 변동되므로
	String synop;
	String poster;		// 웹사이트 주소 => String 
}

class News
{
	int no;
	int pageNo;
	String[] img;
	String[] title;
	String[] subject;
	String[] date;
	String company;
}

/*
	String poster;
	String author;
	String regdate;
	String content;
	String title;
		
*/
class FoodList
{
	int no;	
	String[] thumbNail;		// String thumbnail
	String title;			// title
	String subTitle;		
	
}

class Mirai
{
	int no;
	String title;
	String add1;
	String add2;
	String telNum;
	String type;
	String price;
	String parking;
	String time;
	String[] menu;
	String[] foodPrice;
	
	
}

class RiceCake
{
	int no;
	String title;
	String name;
	String 조회;
	int cnt;
	String video;
	String star;
	double point;
}

/*
	String poster;
	String title
	String chef;
	String chefImage;
	int star;
	int hit;	
*/
class MusicList
{
	int no;					// int rank;
	String title;			// String state;
	String singer;			// String poster;
	String album;			// String title;
	String img;				// String singer;
	int hit;				// String album;
	String state;			// int like;
	int upDown;				// 
	int rank;
	
}

class Sale
{
	int no;					// int sale => "↓" + sale + "%"
	String[] img;			// String poster;
	String name;			// String name;
	String price;			// int price;  ==> 총합 계산에서 int를 사용해야하므로
	String salePer;			// 
}

class Act
{
	int no;
	String name;
	String poster;
	String type;
	String date;
	String location;
	String actors;
	String rank;
	String runningTime;
}

/*
	String poster
	String name
	boolean isShow
	String genre;
	String date
	String grade
	String actors;
	String runnningtime
	String location
*/
public class _문제_변수잡기
{
	public static void main(String[] args)
	{
		
	}
}
