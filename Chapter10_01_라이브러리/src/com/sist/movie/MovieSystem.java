package com.sist.movie;

import java.util.*;
import java.io.*;
public class MovieSystem
{
	private static ArrayList list=new ArrayList();		// static 변수 --> 하나의 데이터를 공유하여 사용 / 멤버변수로 잡으면
														// 매번 인스턴스 변수를 추가해야하기 때문에 서버 메모리 과부하
	
	static {
		try
		{
			// 파일 읽기
			FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
			int i=0;												// 한 글자씩 읽어오기
			StringBuffer sb=new StringBuffer();
			while((i=fr.read())!=-1)
			{
				sb.append((char)i);									// 
			}
			fr.close();												// 파일리더 닫기
			System.out.println(sb.toString());  					// 문자가 들어왔는지 확인
			
			String[] movies=sb.toString().split("\n");				// movies 배열에 1줄씩 나누기 --> 1938개의 배열 movies 생성
			
			
			for(String m:movies)
			{
				StringTokenizer st=new StringTokenizer(m,"|");		// 1줄씩 나눈 movies를 m에 하나씩 넣는 for문 --> 토크나이저로 |마다 나누기
				MovieVO vo=new MovieVO();							// VO를 movies만큼 for문 안에서 생성 --> 
				vo.setNo(Integer.parseInt(st.nextToken()));			// for문 돌아갈 때마다 (m의 0번부터 1938번까지) vo.setXxx로 값 하나씩 넣기
				vo.setTitle(st.nextToken());
				vo.setGenre(st.nextToken());
				vo.setPoster(st.nextToken());
				vo.setActor(st.nextToken());
				vo.setRegdate(st.nextToken());
				vo.setGrade(st.nextToken());
				vo.setDirector(st.nextToken());
				list.add(vo);										// list에 vo(데이터 클래스)자체를 1938개 저장 
			}														// list에는 클래스 형태의 데이터가 1938개 저장되어 있음
			
		} catch (Exception e){}
	}
	
	// 메뉴 만들기
	
	public int movieMenu()
	{
		System.out.println("======= 영화 메뉴 =======");
		System.out.println("1. 목록 출력");
		System.out.println("2. 상세 보기");
		System.out.println("3. 영화 검색");
		System.out.println("9. 종료");
		Scanner scan=new Scanner(System.in);
		System.out.print("메뉴 선택: ");
		return scan.nextInt();
	}
	
	// 페이지별 목록 출력
	public ArrayList movieListData(int page)
	{
		                                                                          
		int totalpage=(int)(Math.ceil(list.size()/10.0));		     // 리스트.size --> 1938/10.0 --> 193.8 --> 올림해서 194
		int start=(page-1)*10;									     // 스타트하는 리스트넘버 --> 0, 10, 20, .... , 190
		int end=page*10;											 // 10개씩 봐야하므로 ----->9, 19, 29, ....., 199 --> 
																	 // subList(start, end) --> end에서 -1을 하므로, end에서 -1 안해도 됨
		if(page==totalpage)											 // 마지막 페이지(194)에서 nullpointException이 생기지 않도록 예외처리
		{
			// 194페이지 요청 --> 194*10 --> 1940-(10-8) = 1938개
			end=(page*10)-(10-list.size()%10);
		}
		ArrayList movieList=new ArrayList(list.subList(start, end));  
		
		return movieList;    // 리턴할 movieList는 원하는 페이지에 출력된 10개의 영화 list   	          
	}
	
	
	// 상세보기
	public MovieVO detailMovieData(int num)
	{
		return (MovieVO)list.get(num-1);
	}
	
	
	// 영화 검색
//	public ArrayList searchMovie(String s)
//	{
//		Scanner scan=new Scanner(System.in);
//		ArrayList search=
//		
//	
//	}
	
	// 조립
	public void process()
	{
		while(true)
		{
			int menu=movieMenu();
			if(menu==9)
			{
				System.out.println("프로그램 종료");
				break;
			}
			else if(menu==1)
			{
				Scanner scan=new Scanner(System.in);
				System.out.println("페이지 번호를 입력하세요(1~194).");
				int page=scan.nextInt();
				ArrayList mList=movieListData(page);
				for(int i=0;i<mList.size();i++)
				{	
					MovieVO vo=(MovieVO)mList.get(i);					// 리턴형이 object이므로, MovieVO로 형변환 필수! 
					System.out.println(vo.getNo()+". "+vo.getTitle());
				}
			}
			else if(menu==2)
			{
				Scanner scan=new Scanner(System.in);
				System.out.println("상세히 볼 영화번호를 입력하세요.(1~1938)");
				int num=scan.nextInt();
				MovieVO vo=detailMovieData(num);
				System.out.println("==========================");
				System.out.println("순위: "+vo.getNo());
				System.out.println("제목: "+vo.getTitle());
				System.out.println("장르: "+vo.getGenre());
				System.out.println("포스터: "+vo.getPoster());
				System.out.println("배우: "+vo.getActor());
				System.out.println("개봉일: "+vo.getRegdate());
				System.out.println("등급: "+vo.getGrade());
				System.out.println("감독: "+vo.getDirector());
			}
		}
	}
	
	
	
	
	
	public static void main(String[] args)
	{
	//	MovieSystem ms=new MovieSystem();			==> 값 읽어졌는지 확인
		
	}
}
