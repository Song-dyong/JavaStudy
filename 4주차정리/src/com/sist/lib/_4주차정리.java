package com.sist.lib;

/*
 		8장	=> 예외처리 (수정이 가능한 에러만)
 				에러 : 사용자 입력 / 프로그래머 실수
 		-------------
 			목적)  사전에 에러를 방지하는 방지하는 프로그램 제작
 				  프로그램의 비정상 종료 방지
 				  
 			방법)  상속도 => 예외처리 방법에 순서 존재 
 			 		Object
 			 		  |
 				  Throwable (Spring => AOP)
 				  	  |
 			-------------------------
 			|						|
 		Error					Exception (예외처리의 최상위 클래스)
 									|
 				CheckedException	|		UncheckedException	
			(컴파일시에 예외처리여부 확인)	|		(예외처리여부 확인x -> 실행(인터프리터)시 에러)	 
			=> 반드시 예외처리 필요		|		=> 필요시에만 예외처리 (오류가 자주 발생하는 부분에서 예외처리)
									|		 1) NumberFormatException (사용자 입력)
									|		 2) NullpointerException
					---------------------------------						 
 					|								|
 IOException : file명/디렉토리명				RuntimeException
 ClassNotFOundException: 							|	
 		Class.forName("패키지명.클래스명");		NullpointerException : 선언 후, 초기화가 안된 상태 (주소값 배정x)	
 		웹(MVC)								NumberFormatException : 문자열의 정수화시, 공백 등이 포함된 경우 Integer.parseInt(" 10");
 InterruptedException : 쓰레드				ArrayIndexOutOfBoundException : 배열의 갯수를 초과하는 경우
 MalforedURLException : ip / web주소			ClassCastException : 클래스 형변환이 잘못된 경우
 SQLException : 문법상 오류 (자바 -> 오라클)		
 		
 			예외처리의 종류)
 				1) 예외복구 : 프로그래머가 주로 사용
 						try{
 							<정상적으로 수행되는 소스코딩>
 							=> 지금까지 코딩한 모든 내용 -> 에러 발생시 catch절로 이동 (에러 아래의 문장은 수행x)
 						}catch(예외처리 클래스){
 							<에러 발생시 수행되는 소스코딩>
 							여러 개 사용 가능 -> 상속도에 맞는 순서대로 사용 (큰 클래스를 아래로)
 						}finally{
 							<무조건 수행되는 소스코딩>
 							파일 닫기, 오라클 닫기, 서버 연결해제
 							(생략 가능) 
 						}
 				2) 예외회피(떠넘기기) : 라이브러리
 						메소드 선언 뒤에 예상되는 에러 선언 => 메소드 호출시 처리되도록 (사용하는 프로그래머가 처리)
 							똑같이 선언(떠넘기기) or try/catch절 사용
 								ex) public void method() throws 예외처리 클래스 (복수 가능, 순서x)
 									{
 									}
 										public void display() throws 예외처리 클래스
 										{
 										}
 										public void display()
 										{
 											try{
 											}
 											catch(예외처리클래스){}
 										}
 				3) 예외 임의 발생 : throw (테스트용으로 사용) 
 				4) 사용자 정의 예외처리 : 거의 사용하지 않음
 						class MyException extends Exception
 							-> 대부분 if로 해결하기 때문...
 				----------------------------------------------- 자바의 문법 (8장까지)
 					=> but! 자바의 문법으로 프로그램에서 제어가 안되는 경우 多
 						다른 프로그램과 연동 (브라우저, 오라클 ...)
 						파일 읽기, 쓰기
 						프로그램 안에 다른 프로그램을 동시에 동작할 때
 						메모리 관리 (자료구조)
 						-------------------> 직접 만들어서 제공 (라이브러리)
 		
 		
		9장 / 10장 => 라이브러리
		---------------------
	라이브러리에 변수x / 메소드(기능)를 가져다 쓰는 것
		1. java.lang	=>	자바 프로그램의 기본 라이브러리 (가장 많이 사용)
						import 생략
			1) Object
				1| Object clone() : 복제 (prototype) / 새로운 메모리 생성
				2| equals() : 객체 비교 (오버라이딩을 하기 전까지 메모리 주소를 비교)
				3| toString() : 객체의 문자열화 (디폴트는 메모리주소 리턴)
				4| finalize() : 소멸자 (객체 메모리 해제 => 자동 호출)
			2) String
			3) StringBuffer : 문자열 결합 => append()
			4) Wrapper : 기본 데이터형을 사용하기 쉽게 기능 부여 (클래스화)
					int => Integer
					double => Double
					boolean => Boolean
					long => Long
					(문자열을 해당 데이터형으로 변경할 때, 주로 사용 + 제네릭 사용시)
						ex) "10" => 10
							Integer.parseInt("10")
							Double.parseDouble("10.5") => 10.5
							Boolean.parseBoolean("true") => true
							Long.parseLong("10") => 10L
							
							List<Integer> => List<int> 오류
							제네릭은 항상 클래스형으로 들어가야함.
							
			5) System : gc()
			6) Math : ceil(), round(), random()
			
		2. java.util	=> 프로그램에서 많이 사용되는 유용한 클래스의 집합
			1| 날짜
				Date : 기능 없이 날자를 저장할 목적으로 사용
				Calendar : Date에 없는 기능을 보완 (달력)
					=> 날짜 설정
						set(Calendar.YEAR,2023)
							--------.MONTH, DATE...
					=> 설정된 날짜 읽기
						get(Calendar.YEAR)
							--------.MONTH, DATE...
					=> 요일 읽기
						get(Calendar.DAY_OF_WEEK)
					주의점)	
					  -월(month)는 0번부터 시작 --> 등록시에 month-1
					  -요일(week)는 1번부터 시작 --> 사용시에 week-1
				
			2| 문자열 분해
				StringTokenizer : 구분자를 기준으로 문자열 분해
					=> counterTokens() : 분해된 문자열의 갯수
					=> hasMoreTokens() : 데이터가 존재할 때까지 true (while문에서 사용)
					=> nextTokens() : 실제 분해된 데이터 읽어오기
						-오라클 연동 / 네트워크로 상대방에게 값을 전송할 때 사용
						
			3| 자료구조 (메모리에서 데이터 쉽게 관리)
				컬렉션 (데이터를 모아서 관리) => 가변형이기 때문에, 크기를 결정하지 않음
										=> 관리 프로그램 제작시 자주 사용 (사람, 영화 등등...)
										=> 모든 프로그래머가 동일하게 사용하도록 표준화
					특징
					 -기본 생성자를 사용하면, 모든 데이터형은 Object
					 	List list=new ArrayList();
					 		add(Object)
					 		Object get(int index)
					 	Map map=new HashMap();
					 		put(String s, Object o)
					 	Set set=new HashSet();
							add(Object)
					 		Object get(int index)
					 		
					 	  => Object로 들어가게 되면 관리가 어려움 (모든 데이터형 추가 가능) 
					 	  	why? for문 수행이 어려움 --> 소스량 증가
					 	  => 같은 데이터형을 첨부하는 것이 편리 
					 	  => Object 리턴이면 형변환 必
					 	  => 메소드에서 사용되는 모든 매개변수, 리턴형 통일화 (제네릭) 
					 	  	--> 제네릭스 : <데이터형 - 클래스형만 가능>
					 	  		ex) 
					 	  			문자열
					 	  			list<String> => add(String s), String get(index)
					 	  			정수
					 	  			list<Integer> => add(Integer i), Integer get(index)
					 	  								-----------			 ----------
					 	  								int (오토박싱)		 int (언박싱)
					 		
								Collection
									|
				---------------------------------------------
				|											|
			   List										   Set				Map				==> 인터페이스
			   	|											|				 |
			ArrayList 									HashSet				HashMap			==> 구현된 클래스
		  	Vector										TreeSet				HashTable
		  	LinkedList
		  	
		  	List : 순서 존재(index), 중복 허용 => 오라클(데이터베이스) 연동시 주로 사용되는 클래스  
		  			// ArrayList -> Web에서 데이터를 모아 전송할 때
		  		주로 사용하는 메소드(기능)
		  			1) add() : 데이터 추가					★★★
		  			2) set() : 데이터 수정
		  			3) get(int index) : 저장된 데이터 읽기	★★★
		  			4) size() : 저장된 갯수 확인			★★★
		  			5) clear() : 전체 삭제				★★★
		  			6) isEmpty() : 데이터 존재여부 확인
		  			
		  	Set	: 순서 없음, 중복 불가 => List에서 중복된 데이터를 추출할 때	
		  			// HashSet -> 네트워크에서 서버에 접속하는 클라이언트의 IP, PORT / web채팅
		  		주로 사용하는 메소드(기능)
		  			1) add() : 데이터 추가					★★★
		  			2) set() : 데이터 수정
		  			3) get(int index) : 저장된 데이터 읽기	★★★
		  			4) size() : 저장된 갯수 확인			★★★
		  			5) clear() : 전체 삭제				★★★
		  			6) isEmpty() : 데이터 존재여부 확인
		  			 
		  	Map : 순서 없음, Key / Value 두 개를 동시 저장 (Key는 중복 불가, Value는 중복 가능) 
		  			// HashMap
		  		주로 사용하는 메소드(기능)
		  			1) put() : 저장시 사용
		  			2) get(key) : 저장된 데이터 읽기
		  			
		3. java.text
			날짜 변경 (출력형식) : SimpleDateFormat()
					연도 :	yyyy
					월 :		MM
					일 :		dd
					시간 :	hh
					분 :		mm
					초 :		ss
				=> yyyy/MM/dd, yyyy-MM-dd
			숫자 (출력형식) : DecimalFormat --> ##,###
		4. java.io
		5. java.net
		6. java.sql
		

	제네릭 (JDK1.5에 도입)
	=> JDK1.8 호환성 => 17버전, SpringFrame(14버전)
					  ------ Spring-Boot
	1) 제네릭이 도입된 이유
		= 컬렉션(ArrayList, Set, Map) => 데이터형(매개변수, 리턴형)이 Object => 반드시 형변환 후에 사용해야 함
			=> 오류발생 多 => 이를 방지하기 위한 제네릭
		= 데이터형의 통일화, 안정성 => 데이터 고정
		= 데이터형의 명시화 => 가독성 증가
			List<Object> list=new ArrayList<Object>(); => 가독성이 낮음
			List<String> list=new ArrayList<String>(); => <기본형은 사용 불가능 Wrapper클래스 사용>
		= 데이터형을 모르는 경우 (와일드 카드)
			List<?> list=new ArrayList<String>();
			
		ex) 
			class Box<T> => 임시 클래스 => default(T->Object)
			{
			}
			Box<String> => Object -> String : 매개변수, 리턴형을 변경
			<>안에는 라이브러리 외에 사용자 정의 클래스도 첨부 가능
			Box<MovieVO>...
			
			임시제네릭
			T : 임시데이터형 (클래스형 => type) -> 사용자 정의 제네릭
			E : 임시데이터형 (클래스형 => element 요소)
					ArrayList<E>, Vector<E>, LinkedList<E>
			K : key (클래스형)
			V : value (클래스형)
					Map<K,V>
		
		
		

--------------------------------------------------------------------------------------------------------

String 클래스의 주요 메소드 문제 (다음 설명에 맞는 메소드의 원형을 작성하시오)

1.  문자열이 지정한 문자로 시작하는지 판단 같으면 true반환 아니면 false를 반환한다.(대소문자구별)
 	=> boolean startsWith(String s) 
			ex) 검색기 Search Bar

2. 문자열 마지막에 지정한 문자가 있는지를 판단후 있으면 true, 없으면 false를 반환한다.(대소문자구별)
	=> boolean endsWith(String e)

3. 두개의 String에 값만을 비교해서 같으면 true, 다르면 false를 반환한다.(대소비교)
	=> booelan equals(String s)  ★★★★★	
			ex) 로그인, 아이디 중복체크

4. 지정한 문자가 문자열에 몇번째에 있는지를 반환한다.
	=> String은 char[] => 인덱스 번호 0부터 시작
		int indexOf(String s), int IndexOf(char c)

5. 문자열에 지정한 문자가 마지막몇번째에 있는 int를 반환한다.
	=> int lastIndexOf(String s), int lastIndexOf(char c)

6. 문자열의 길이를 반환한다.
	=> int length();

7. 문자열에 지정한 문자" "가 있으면 새로 지정한 문자" "로 바꿔서 출력한다.
	=> 문자형식(패턴)을 만들어서 변경하는 역할
		String replaceAll(String regex, String s)
			ex) 통계, 분석

8. 정규표현식을 지정한 문자로 바꿔서 출력한다.
	=> String[] split(String regex)
		패턴
		[가-힣] 한글 전체
		[A-Za-z] 영문 전체
		[0-9] 숫자 전체
			ex) 크롤링, 파일 입출력(네트워크 프로젝트)

9. 문자열에 지정한 문자 " "가 있으면 새로 지정한 문자 " "로 바꿔서 출력
	=> String replace(String s1, String s2)
	   String replace(char c1, char c2)
 
10. 문자열에 지정한 범위에 속하는 문자열을 반환한다.(시작범위에 값은 포함하고, 끝나는 범위에 값은 포함하지않는다.)
	=> String substring(int s, int e)
	

11. 문자열에 대문자를 소문자로 변환한다.
	=> String toLowerCase() => 오라클 LOWER()

12. 문자열에 소문자를 대문자로 변환한다.
	=> String toUpperCase() => 오라클 UPPER()
		(오라클은 대소문자를 구분하지 않는다. -> 실제 저장된 값은 구분함)
	
13. 문자열을 그대로 반환해준다.


14. 문자열에 공백을 제거해 준다.
 

15. 지정한 개체의 원시 값을 반환 (데이터형을 문자열로 변경)

 
16. 두개의 String을 비교해서 비교대상 String을 포함하고 있으면true, 다르면 false를 반환한다.


17. 지정한 index번째에 문자를 반환한다.


18. 문자와 문자를 결합해준다.


19. 서식문자열을 이용해서 서식화된 문자열을 반환한다.




*/
public class _4주차정리
{
	public static void main(String[] args)
	{
		try
		{
			for(int i=1;i<=3;i++)
			{
				if(i==2)
				{
					System.out.println(i/0);
				}
				System.out.println("i: "+i);
					
			}
		} catch (Exception e)
		{
			System.out.println("예외발생");
		}
		
		
		
		
//		String[] strArray = { "10" , "2a" };
//        int value = 0;
//        for(int i = 0; i <= 2; i++ ){
//        	try{
//            	value = Integer.parseInt(strArray[i]);
//            } catch(ArrayIndexOutOfBoundsException e){
//            	System.out.println("인덱스를 초과했음");
//            } catch(NumberFormatException e) {
//            	System.out.println("숫자로 변환할 수 없음");
//            } finally {
//            	System.out.println(value);
//            }
//        }
	}
}
