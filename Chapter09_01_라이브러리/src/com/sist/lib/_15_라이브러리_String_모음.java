package com.sist.lib;

/*
	concat: 문자열 결합(+)			==> 리턴형은 String
	
		String s1="Hello ";
		String s2="Java";
		s1.concat(s2)==> "Hello Java"
	
	==> 보통 +로 처리하기때문에, 많이 쓰이진 않음
	==> MySQL LIKE문장을 만들 때 주로 사용
		WHERE name LIKE CONCAT('%', '홍', '%')
		
	charAt()
	startsWith(String s) : 시작하는 문자열이 같은지 확인 				==> 리턴형은 boolean
	endsWith(String s) : 끝나는 문자열이 같은지 확인 					==> 리턴형은 boolean
	equals(), equalsIgnoreCase() : 문자 값이 같은지 비교 (대소문자) 	==> 리턴형은 boolean
	--------  -----------------
	id, pwd		영어 검색
	indexOf(), lastIndexOf() : 문자, 문자열의 위치 확인 				==> 리턴형은 int  
	length() : 문자열의 문자 갯수 확인 								==> 리턴형은 int
	substring() : 지정 인덱스부터 인덱스까지 문자열 자르기 				==> 리턴형은 String
	trim()	: 앞 뒤의 공백 자르기									==> 리턴형은 String
	split()	: 특정 문자 혹은 문자열을 기준으로 배열 형성					==> 리턴형은 String[]
	contains() : 특정 문자 혹은 문자열이 포함되었는지 확인				==> 리턴형은 boolean
	valueOf() : 모든 데이터형을 문자열로 변환							==> 리턴형은 String
	
	
	
	라는거 까지 기억을 하시면 되는 부분이지 않겠냐-- 생각되는 부분이라고 생각
	
	
*/
public class _15_라이브러리_String_모음
{
	public static void main(String[] args)
	{
//		String s1="Hello ";
//		String s2="Java";
//		System.out.println(s1.concat(s2));
//		System.out.println(s1+s2);
//		
//		if(s1.endsWith("o"))						// s1은 공백이 있으므로, false
//			System.out.println("o로 끝났다.");
//		else
//			System.out.println("o로 끝나지 않았다.");
		
		String[] data= {"JAVA", "java", "Java", "JAVa", "jaVA","javA"};
		for(String s: data)
		{
			if(s.equals("java"))
				System.out.println(s);
			else if(s.equalsIgnoreCase("java"))
				System.out.println(s);
		}
		String[] data2={"require",
"technology",
"individual",
"provide",
"object",
"level",
"involve",
"employ",
"attitude",
"improve",
"research",
"supply",
"tend",
"affect",
"thus",
"benefit",
"demand",
"occasion",
"fashion",
"recognize"};



		
		for(String s:data2)
		{
			System.out.println(s+": "+s.length());
		}
		System.out.println("가장 긴 이름의 단어를 출력하시오");
		String longest="";
		
		for(int i=0;i<data2.length;i++)
		{
			for(int j=0;j<data2.length;j++)
			{
				if(data2[i].length()<data2[j].length())
					longest=data2[j];
			}
		}
		System.out.println(longest);
		
		
		System.out.println("==========startsWith=============");
		// startsWith : 시작하는 단어 비교
		// 원형 : boolean startsWith()
		// 사용처: 자동완성기(검색기) / 쿠키 검색
		
		for(String s : data2)
		{
			if(s.startsWith("a"))
				System.out.println(s);
		}
		
		System.out.println("=========trim=========");
		// trim() : 좌우 공백 제거
		// 원형 : String trim()
		// 사용처 : 로그인, 회원가입, 검색 ...
		
		String id="admin";
		if(id.equals(" admin".trim()))
		{
			System.out.println("같은 아이디입니다.");
		}
		else
			System.out.println("다른 아이디 입니다.");
		
		
		System.out.println("======contains==========");
		// contains : 포함문자열을 찾을 경우
		// 원형: boolean contains(String s)
		// 사용처 : 검색, 추천
		// 추천 ==> 네이버 블로그, 카페에 언급된 횟수
		
		for(String s:data2)
		{
			if(s.contains("a"))
				System.out.println(s);
		}
		
		System.out.println("======valueOf========");
		// valueOf : String에서 유일한 static 메소드
		// 		=> 모든 데이터형을 문자열로 변환
		// 원형: static String valueOf((type))	==> 오버로딩된 상태
		// 사용처: 자바에서 윈도우 전송 / 네트워크 전송 / 웹 전송
		System.out.println(String.valueOf(10)+String.valueOf(30));
		
		System.out.println("=======substring==========");
		String ss="http://localhost:8080/JSPProject/main/main.do";
		String res=ss.substring(ss.lastIndexOf("/")+1);
		System.out.println(res);
		ss= ss.substring(ss.indexOf("//")+2);
		System.out.println(ss);
		res=ss.substring(0, ss.indexOf("/"));
		System.out.println(res);
		
		ss="서울특별시 용산구 소월로2길 27 지번 서울시 용산구 후암동 445-8";
		String addr1=ss.substring(0,ss.indexOf("지번"));
		String addr2=ss.substring(ss.indexOf("지번")+3);
		System.out.println(addr1);
		System.out.println(addr2);
		// substring() : 문자열을 자르는 경우
		// 오버로딩
		// substring(int s) => s번째부터 마지막까지
		// substring(int s, int e) => s부터 e-1까지 자르기
		// 원형 : String substring(int s)
		//		 String substring(int s, int e)
		// 사용처 : URL주소 제어, 주소 제어, 문자열이 긴 경우
		
		ss="홍길동, 이순신, 강감찬, 박문수, 을지문덕, 심청이, 춘향이";
		String[] names=ss.split(", ");
		for(String a:names)
		{
			System.out.print(a+ " ");
		}
		// split() : 문자를 기준으로 잘라서 배열 저장
		// 원형: String[] split(String regexp)
		// 구분이 되어있는 문자열을 나눠서 저장할 때
		// 
		
		ss= "	"
				+ "갈비살"
				+ " 30,000원"
				+ "돼지갈비"
				+ " 17,000원"
				+ "돼지목살"
				+ " 15,000원"
				+ "삼겹살"
				+ " 15,000원";
		
		String[] menu=ss.split("원");
		for(String m:menu)
		{
			System.out.println(m+"원");
		}
		
		ss="red|blue|green|blac|white|yellow";
		String[] colors=ss.split("\\|");	// |는 정규식에서 사용하는 기호 --> |  ?  .  +  *  ^  --> \\ 앞에 붙여야 함 
		for(String color:colors)
		{
			System.out.println(color);
		}
		
		System.out.println("=======replace========");
		// replace() : 문자, 문자열을 변경
		// 원형 : String replace(char old, char new)
		//		 String replace(String old, String new)
		// 사용처 : 데이터 수집(html 제거)
		ss="https://mp-seoul-image-production-s3.mangoplate.com/656242_1520282569201256.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80";
		// ==> 오라클에 저장할 떄, &(Scanner)를 다르게 해석하기 때문에, replace를 통해 값을 변경해야함
		res=ss.replace("&", "#");
		System.out.println(res);
		System.out.println(res.replace("#", "&"));		// 다시 자바로 가져올 때 원상복구
		
		
		
		
		
		
		
		
		
		
	}
}
