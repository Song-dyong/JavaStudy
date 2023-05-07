/*
	Ⅰ. 변수 : 한 개의 데이터를 저장하는 메모리 공간의 이름
		------
		1. 종류
			1) 지역변수: 메소드 안에 선언하는 변수
				Stack 공간에 저장, { }을 종료하면 사라지는 변수
				단점! 초기화가 없는 상태이기 때문에, 반드시 초기화 후 사용
					scope{사용범위}: { 블록 }을 벗어나면, 범위를 벗어났기 때문에 사라짐	
														 			---------> 현재, 지역변수까지
			2) 매개변수: 메소드 
			
			3) 공유변수: 클래스
			
			4) 멤버변수
			
		2. 데이터형
			1) 기본형: 자바 지원	
					-정수: byte / int (★) / long
					-실수: double (★)
					-문자: char
					-논리: boolean (★)
			
			2) 참조형: 사용자 정의 	=> 배열 / 클래스
		--------------------------------------------------------------------
	
	Ⅱ. 데이터 가공
		연산자
			1. 단항연산자: ++, 	형변환 (type), !
					(전치, 후치)
			2. 이항연산자: +, -, *, /, %
						==, !=, <, >, <=, >=
						+=, =, -=
				
			   주의) char는 연산시에 정수형으로 변경
				 	int이하는 연산시에 결과값이 int형으로 나옴
				 	모든 연산은 같은 데이터형끼리만 가능
				 	비교연산자는 기본형만 가능 (문자열은 비교연산자 사용X)
				 	boolean은 ==, !=만 비교가능
				 	&&, || 는 효율적인 연산을 함
	Ⅲ. 데이터 흐름  
		
		=> 제어문
		--------------------------------------------------------------------
		
	데이터를 관련된 것끼리 묶어서 관리: 배열 (같은 데이터) / 클래스 (다른 데이터)
	
	관련된 명령어끼리 묶어서 처리: 메소드
	
		---------------------------------------------------------------------	+ Component (class)

	데이터만 묶은 클래스	: ~VO(ValueObject)
	
	기능만 묶은 클래스	: ~DAO(DataAccessObject) / ~Manager / ~Service

	혼합 클래스 		: ~Model / ~Controller


==================================================================================================

	2주차 정리
	
		1. 조건문 / 선택문
			-------------> 상세보기, 검색, 로그인, 아이디체크, 우편번호 검색, 댓글, 수정, 삭제
			형식)
				1) 단일 조건문
					if(조건문-true/false)	=> 부정, 비교, 논리 연산자
					{
						출력내용 (true일 때, 수행하는 문장)
					}
					! 단일 조건문: 속도가 늦음 (독립적인 문장이기 때문에)	=> 중복적으로 수행해야할 때
					------------------------------------------------------------------
					다중조건일 경우 (a, b, c) -> 단일 if 多
					
				2) 선택 조건문
					if(조건문)							ex) if(로그인이 되었다면)					if(아이디 중복체크->중복)
					{										{									{
						조건이 true일 때 처리						main으로 이동하라						이미 사용 중인 아이디
					}										}									}
					else									else								else
					{										{									{
						조건이 false일 때 처리						회원가입으로 이동하라					사용 가능한 아이디
					}										}									}
				==> true와 false로 나뉘는 일을 처리할 때 사용 多
				
				3) 다중 조건문
					if(조건문)
					{
						조건문이 true일 때, 수행되는 문장	=> true일 경우, if문 종료	/  false일 경우, 아래 문장으로 이동
					}
					else if(조건문)
					{
						조건문이 true일 때, 수행되는 문장	=> true일 경우, if문 종료	/  false일 경우, 아래 문장으로 이동
					}
					else if(조건문)
					{
						조건문이 true일 때, 수행되는 문장	=> true일 경우, if문 종료	/  false일 경우, 아래 문장으로 이동
					}
					else if(조건문)
					{
						조건문이 true일 때, 수행되는 문장	=> true일 경우, if문 종료	/  false일 경우, 아래 문장으로 이동
					}
					else
						default 문장	(조건이 없는 경우)	=> 생략 가능
						
					if(조건1 && 조건2)		=> if(조건1){ if(조건2) }	=> 같은 내용 
				
				4) 중첩조건문
					ex) 
						if(id.equals(" "))
						{
							if(pwd.equals())
							{
								로그인
							}
							else
							{
								비밀번호가 다름
							}
						}
						else
						{
							존재하지 않는 아이디
						}
						
			선택문(switch case): 네트워크, 게임(키 값)
				switch(정수, 문자, 문자열)
								 -----
				{
					case "find";
					case "search";				// 2개의 케이스를 동시에 처리 가능 --> 해당 위치부터 break까지 수행
						처리						// break가 없을 경우, 나올 때까지 수행
						break;
					case "Login";				// 블럭 내에서 같은 변수를 선언 X --> 같은 변수명을 사용하려면, case 별로 블럭 따로 지정
						처리
						break;
					case "Logout";
						처리
						break;
					...
					...
					default:
						해당 문자열이 없는 경우 처리
				}
				
				
						
		2. 반복문
			-------------> 목록출력, 페이징 (화면출력)
			
			1) for: 반복횟수가 지정된 경우
				형식)
					for(초기값;조건식;증감식)
					{
						반복문장 수행
					}
				
			2) while: 반복횟수가 지정되지 않은 경우
						=> 파일, 데이터베이스 (갯수를 헤아릴 수 없을 때) 읽기
				형식)
					초기값		
					while(조건문)
					{
						수행문장
						증가식
					}
					
					cf) 필요에 의해 반복문 제어
						break;		=> 	반복문 중단 (조건 필요)
										-----------반복문, switch
						continue;	=>	반복문 지속
										반복문에서만 사용 가능
										종료 X -> 이동
										for	  -> 증가식으로 이동
										while -> 조건식으로 이동
							주의점: break / continue 사용시, 밑에는 소스 코딩이 불가능
													소속된 반복문만 제어 가능
						
							
							
			3) do~while: 한 번은 무조건 수행하는 while	
		
		3. 반복 제어문
			-------------> 페이징


		4. 배열
			=> 변수를 따로 잡을 경우, 무작위 주소와 공간에 뿌려지기 때문에 연산시에 번거로움
				-> 배열로 데이터를 모아야 연속성을 갖음
				-> 배열 형성시, 주소값을 가지므로, 주소값을 참조하여 배열의 데이터를 참조할 수 있음
				-> 주소값은 stack에 저장 / 배열 내의 데이터는 heap에 저장
				-> new: 주소값 생성 
				-> 하나의 주소값을 참조하는 두 배열은 둘 중 하나만 데이터 초기화해도 배열의 데이터가 변동함 (얕은 복사)
				 	깊은 복사( clone(), copy )를 통해 주소값을 다르게 생성해야함
					
		
			선언)	데이터형[] 배열이름= new 데이터형[갯수];
					데이터형[] 배열이름= { 데이터 };
			
			초기화)	인덱스를 이용한 초기화
					for문을 이용한 초기화
					향상된 for문(for-each)를 활용한 초기화



*/
import java.io.*;
import java.util.Scanner;
public class _01_제어문 {
	public static void main(String[] args) {
		
		String[] title= {"Kitsch","CHRISTIAN","꽃","Ditto","Hype boy","Teddy Bear","사건의 지평선","OMG","심 (心)",
				"I Dont Think That I Like Her","사랑은 늘 도망가","건물 사이에 피어난 장미","우리들의 블루스","빙글빙글 (Prod. by R.Tee)",
				"가질 수 없는 너","After LIKE","다시 만날 수 있을까","밤이 무서워요 (Lonely Night)","이제 나만 믿어요","London Boy","파이팅 해야지 (Feat. 이영지)",
				"Polaroid","무지개","Attention","아버지","A bientot","LOVE DIVE","손이 참 곱던 그대","사랑인가 봐","사랑해 진짜","연애편지","보금자리","인생찬가",
				"ANTIFRAGILE","NIGHT DANCER","Dangerously","Zero","The Drum","Like Crazy","바보가슴","Nxde","사랑하기 싫어","새삥 (Prod. by ZICO) (Feat. 호미들)","Thats Hilarious","Nostalgia",
				"흔들리는 꽃들 속에서 네 샴푸향이 느껴진거야","Monologue","VIBE (Feat. Jimin of BTS)","Dynamite","오르트구름","그때 그 순간 그대로 (그그그)","다정히 내 이름을 부르면",
				"TOMBOY","너의 모든 순간","해요 (2022)","Pink Venom","Unholy","Shut Down","취중고백","Dreamers (Music from the FIFA World Cup Qatar 2022 Official Soundtrack) (Feat. FIFA Sound)",
				"그라데이션","Stay","That That (Prod. & Feat. SUGA of BTS)","사랑하지 않아서 그랬어","Loving You Girl (Feat. Hkeem)","고백","Set Me Free Pt.2","내가 아니라도","Cookie","Love Me Like This","Say I Love You","보고싶었어","나의 X에게","NOT SORRY (Feat. pH-1) (Prod. by Slom)","Candy","D N D","그대를 알고","그중에 그대를 만나","아모르 파티","ELEVEN","너를 보는게 지친 하루에","Rush Hour (Feat. j-hope of BTS)","Butter","아로하","봄날","When I Get Old","Say My Name","잘가요","희재","2002","모든 날, 모든 순간 (Every day, Every Moment)","정이라고 하자 (Feat. 10CM)","나의 목소리로","Blueming","FEARLESS","발걸음","당신을 만나","Every Second","봄여름가을겨울 (Still Life)","LOVE me","나비무덤","딱 10CM만","결국엔 너에게 닿아서","자격지심 (Feat. ZICO)","Off My Face","밤하늘의 별을 (2020)","인생은 뷰티풀","신호등","빛이 나는 사람","Face-off","주마등","Permission to Dance","오래오래","Bad Habits","주저하는 연인들을 위해","슬픈등","친구","Celebrity","Made You Look","Bad","Love story","약속 (約束)","INVU","Il Mare Calmo Della Sera","Alone","벚꽃 엔딩","떠나보낼 준비해 둘걸 그랬어","내 기쁨은 너가 벤틀리를 끄는 거야","At My Worst","내 손을 잡아","사계 (Four Seasons)","Love in Portofino","마지막 사랑","Left and Right (Feat. Jung Kook of BTS)","위대한 사랑 (Un Amore Cosi Grande)","나비 (Outro)","비와 당신","우린 그렇게 사랑해서","OHAYO MY NIGHT","Poppy (Korean Ver.)","Stronger (What Doesnt Kill You)","strawberry moon","풍등","Yet To Come","Ai Wo Tsutaetaidatoka","Feel My Rhythm","찰나가 영원이 될 때 (The Eternal Moment)","예뻤어","새벽에 걸려온 너의 전화는","라일락","오늘도 빛나는 너에게 (To You My Light) (Feat.이라온)","어떻게 이별까지 사랑하겠어, 널 사랑하는 거지","그댄 행복에 살텐데 (2022)","Thats Not How This Works (Feat. Dan ＋ Shay)","Cupid","on the street","한 페이지가 될 수 있게","비도 오고 그래서 (Feat. 신용재)","바라만 본다","Next Level","첫눈처럼 너에게 가겠다","Weekend","있잖아","Switch","BETELGEUSE","팡파레","헤픈 우연","WHEN I MOVE","En Garde (준비,시작!)","도깨비불 (Illusion)","Tiny Riot","사이렌 Remix (Feat. UNEDUCATED KID & Paul Blanco)","마이웨이 (MY WAY) (Prod. by R.Tee)","건배","회전목마 (Feat. Zion.T & 원슈타인) (Prod. by Slom)","GHOST TOWN","12 : 45 (Stripped)","에잇 (Prod. & Feat. SUGA of BTS)","트위스트고고","너의 번호를 누르고 (Prod. by 영화처럼)","그대가 내 안에 박혔다 (그내박)","Expectations","시작","언제나 사랑해","MY BAG","나와 함께 가시렵니까","봄 사랑 벚꽃 말고","KISS ME (Feat. BIG Naughty)","처음부터 너와 나","너를 생각해","Way Back Home","오래된 노래","오.내.언.사 (Guitar Ver.)","Crazy","바람 같은 사람","스티커 사진","좋아 (JOAH)","사나이 청춘","비 오는 날 듣기 좋은 노래 (Feat. Colde)","밥 한 번 먹자"};
		
		System.out.println(title.length);
		int page=0;
		if(page==0)
			page=1;
		while(true)
		{
		
		int j=0;
		int rowSize=20;							// 페이지 당 나올 개수 rowSize
		int pagecnt=(page*rowSize)-rowSize;		// -> (page*페이지 당 나올 갯수)-페이지 당 나올 갯수
		/* 페이지의 시작 위치 
			start		end
			 0			9	=>	1page
			 10			19	=>  2page
			 20			29	=>  3page
		*/
		for(int i=0;i<title.length;i++)
		{													// 만일, page가 1이라면, pagecnt가 20이므로, for문에서 i=0~19까지 공회전.
			if(j<rowSize && i>=pagecnt)						// 20부터 카운팅 시작 -> j가 0부터 19까지 증가한 뒤, for문을 빠져나가므로 그 뒤는 실행 x 
			{												// i는 40부터 200까지 또 공회전
				System.out.println((i+1)+". "+title[i]);
				j++;
			}
		}
		Scanner scan= new Scanner(System.in);
		System.out.println("페이지 입력: ");
		page=scan.nextInt();
		break;
		}
		
//		System.out.println("=== w h i l e문 사용 ===");
//		try
//		{
//			// FileWriter: 파일 쓰기 / FileReader: 파일 읽기
//			FileReader fr=
//						new FileReader("C:\\javaDev\\javaStudy\\2주차정리\\src\\_01_제어문.java");
//			
//			int i=0;
//			
//			while((i=fr.read())!=-1)			// -1: 문장의 끝
//			{
//				System.out.print((char)i);
//			}
//		}catch(Exception ex) 
//		{
//			
//		}

		int a=1;					// while 문에서 continue 무한루프 탈출 => 제외하고 싶은 부분에서 무한루프에 빠지지 않도록 조건식 설정할 것!
		while(a<=10)
		{
			if(a%2==0)
			{
				a++;
				continue;
			}
			System.out.println(a);
			a++;
		}
		
		int[] arr= {1,2,3,4,5};
		System.out.println(arr);	// 배열 arr의 주소값 :	[I@7e0ea639
		int[] arr2=arr;
		System.out.println(arr2);	// arr2에 arr값을 대입 ==> arr의 주소값을 가져오는 것
		arr2[0]=10;
		System.out.println(arr[0]);	// arr2의 0번째 데이터를 10으로 바꾸면, 같은 주소를 참조하는 arr의 0번째 데이터 역시 10을 가져옴
		int[] arr3=arr.clone();		// arr3는 arr 배열의 데이터 자체를 복사했으므로, 다른 주소값을 가짐
		System.out.println(arr3);	// 배열 arr3의 주소값 : [I@3d24753a
									// 주소에 의한 참조 -> 메모리 주소를 이용해서 실제 데이터 관리 
		
		int[] arr5=new int[1000000000];
		
		
		
	}
}
