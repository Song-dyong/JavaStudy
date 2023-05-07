/*
	클래스가 되기 위한 조건:  데이터  /  기능
						(명사형)	 (동사형)
		
	게시판의 경우
		데이터: 번호 / 작성자 / 내용 / 제목 / 작성일 / 비밀번호 / 조회수
		기능	: 글쓰기 / 수정하기 / 내용보기 / 삭제하기 / 조회수올리기 
		
	학생	=> 유형
	게시판 => 무형
	---------------- 모든 것을 단순화 (객체 지향 프로그램)	
	
	클래스
		= 변수 여러개를 저장하는 공간 -> 사용자정의 데이터형(데이터형 클래스)
			~VO(ValueObject - Spring), ~DTO(DataTransforObject - MyBatis) , ~Bean(JSP)
		
		= 기능만 설정하는 클래스: ~DAO(Data Access Object - oracle), ~Service, ~Manager
							데이터베이스와 연결						브라우저 전송  Jsoup (액션 클래스)
							
		= 변수 + 메소드 혼합 (극히 드묾)					
							
*/

class Board
{
	int no;
	String name;
	String subject;
	String content;
	String pwd;
	String regdate;
	int hit;
	
}
public class _02_사용자정의데이터형_게시판
{
	public static void main(String[] args)
	{
		// 첫번째 게시물
		Board b1=new Board();
		System.out.println("b1="+b1);	// => 메모리 주소 내, 7개를 저장할 수 있는 데이터 공간 생성
		b1.no=1;
		b1.name="홍길동";
		b1.subject="메모리 공간 만들기(사용자 정의)";
		b1.content="class를 이용해서 데이터를 모아 관리";
		b1.regdate="2023-04-12";
		b1.pwd="1234";
//		b1.hit=0;	-> new를 주면, 자동 초기화가 되어 0이므로 생략 가능.
		
		System.out.println("게시물 번호:"+b1.no);
		System.out.println("작성자: "+b1.name);
		System.out.println("제목: "+b1.subject);
		System.out.println("내용: "+b1.content);
		System.out.println("작성일: "+b1.regdate);
		System.out.println("조회수: "+b1.hit);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
