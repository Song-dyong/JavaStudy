/*
		문자열 데이터형: 참조형
			=> String: 문자열 저장
				문자 				/ 			문자열 
				---	  							-----
				' ': 한 글자 저장할 때, 사용			" ": 여러 개의 문자를 동시에 저장
			String => char[ ]	
			-------	  -------
			"홍길동"   {'홍','길','동'}
			
			String => java.lang.String에 존재 (라이브러리)
			------
			  일반 데이터 (문자열 저장)	/  클래스형 (지원하는 기능 -> 메소드)
			  => 가장 많이 사용되는 데이터형 (기본형처럼 사용 가능)
			  => 단점! 웹, 윈도우는 무조건 문자열 통신
			  	ex) <input type="text">	--> 문자열을 받아서 정수로 변환해야 함
			  => 가장 많이 사용되는 데이터형: int, String
			  
			 사용법)
			 	String name="홍길동";
			 	String name=new String(" ")
			  => String에서 지원하는 메소드 암기 必 (변경 불가능) => '표준화'
			  			Math.random() / Math.ceil() 		/ Math.round()
			  			-----임의 발생	----올림 (총 페이지)     ----- 반올림
			  		즉, 메소드는 결과값이 존재 --> 결과값을 받아서 처리 (Return형)	
			  		
			  	1) 대문자 변환 toUpperCase()
			  		String s="hello java";
			  		String result=s.toUpperCase(); => result의 결과값: "HELLO JAVA"	
			  	
			  	2) 소문자 변환 toLowerCase()
			  		String s="Hello Java";
			  		String result=s.toLowerCase(); => result의 결과값: "hello java" 
			  			사용처) 검색시, 대문자와 소문자 관계없이 검색이 가능하도록 입력값을 소문자로 변환
			  	
			  	3) 찾기
			  		-----------
			★★★  	-startsWith	=> 시작 문자열	=> 결과값은 true / false (if문에서 많이 사용) 
			★★★  	-endsWith	=> 끝 문자열 	=> 결과값은 true / false (if문에서 많이 사용)
			  		----------- 서제스트(suggest): 자동 완성기
			★★★  	-contains	=> 포함 문자(검색)	=> 추천	=> 결과값은 true / false
			



*/


public class _01_문자열_대소문자변환 {
	public static void main(String[] args) {
		
		char[] msg= {'H','e','l','l','o','J','a','v','a'};
		System.out.println("===== 대문자 변환 =====");
		for(char c:msg)
		{
			if(c>='a'&&c<='z')		// 소문자라면
			{
				System.out.print((char)(c-32));
				// 'A'(65) / 'a'(97) ==> 'a'-32
			}
			if(c>'A' && c<'Z')		// 대문자라면
			{
				System.out.print(c);
			}
		}
		System.out.println("\n===== 소문자 변환 =====");
		for(char c:msg)
		{
			if(c>='a'&&c<='z')		// 소문자라면
			{
				System.out.print(c);
				// 'A'(65) / 'a'(97) ==> 'a'-32
			}
			if(c>'A' && c<'Z')		// 대문자라면
			{
				System.out.print((char)(c+32));
			}
		}
		
		System.out.println("\n===== 문자열 =====");
		String s="Hello Java";
		System.out.println("===== 문자열에서 대문자 변환 =====");
		System.out.println(s.toUpperCase());
//		String result=s.toUpperCase();
//		System.out.println(result);
		System.out.println("===== 문자열에서 소문자 변환 =====");
		System.out.println(s.toLowerCase());
		
		/*
				String toUpperCase()
				{
					for(char c:msg)
					{
						if(c>='a'&&c<='z')						// 소문자라면
						{
							System.out.print((char)(c-32));		// 'A'(65) / 'a'(97) ==> 'a'-32
						}
						if(c>'A' && c<'Z')						// 대문자라면
						{
							System.out.print(c);
						}
					}
				}
					==> 메소드 형태로 저장되어 있음
		
		
		*/
		
		
		
		
		
		
		
		
		
	}
}
