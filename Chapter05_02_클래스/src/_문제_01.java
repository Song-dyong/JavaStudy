import java.util.Scanner;
public class _문제_01 {
	/*
			메소드: 클래스의 구성요소(동적)
				1) 특정 기능을 수행하는 명령문의 집합
				 					----- 연산자 / 제어문
				2) 한가지 기능만 수행하도록 설정
					ex) 댓글창
						댓글 목록 출력 / 댓글 쓰기 / 댓글 수정 / 댓글 삭제	=>	4개의 메소드 만들기	=> 1개의 댓글 클래스
						게시판
						글쓰기 / 목록출력 / 상세보기 / 수정 / 삭제
						영화
						목록출력 / 상세보기 / 예약하기 / 추천하기 / 검색하기
				3) 메소드 구성요소
				선언부
					void display()
				구현부
					{
						처리
					}
				선언부: [접근지정어][옵션] 리턴형 메소드명(매개변수...)
											
	
	
	*/
	// 사용자로부터 아이디를 받아서 중복체크하는 메소드 원형
	static boolean idCheck(String id)
	{
		String[] idlist= {
				"song","do","yong"
		};
		String result="";
		boolean bCheck=true;
		int index=0;
		for(int i=0;i<idlist.length;i++)
		{
			if(id==idlist[i])
			{
				bCheck=false;
				index=i;
				break;
			}
			else
			{
				result=id;
			}
		}
		return bCheck;
	}
	//우편번호를 검색하는 메소드 원형
	
	static String[] address(String dong)
	{
		String [] add=new String [10];
		String[] result= new String[20];
		for(int i=0;i<add.length;i++)
		{
			if(add[i].contains(dong))
			{
				System.out.println(add[i]);
				result[i]=add[i];
			}
		}
		return result;
	}
	// 2~9단까지 구구단 출력하는 메소드 원형
	static void dan()
	{
		for(int i=2;i<=9;i++)
		{
			for(int j=1;j<=9;j++)
			{
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}
	}
	
	static void process()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("id입력:");
		String id=scan.next();
		
		boolean a=idCheck(id);
		
			if (a==true);
				System.out.println("사용 가능한 아이디입니다.");
			if (a==false)
				System.out.println("중복된 아이디입니다.");
				
		
		
	}
	
	public static void main(String[] args) {
		process();
	}
}
