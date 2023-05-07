package com.sist.util;

/*
		라이브러리
			= 자바에서 지원
				java.lang / java.util / java.io / java.net / java.text / java.sql
					웹: javax.xml / javax.servlet
			= 외부업체에서 지원
				Jsoup(HTML parse) / 셀레니움
				MyBatis / Spring / DBCP 
				
		java.lang
			Object / String / System / Math / StringBuffer (import 생략)
			
			1) Object : 최상위클래스 -> 모든 데이터형 받기 가능
				저장 - 일반 기본형, 사용자 정의 클래스 --> 기본 설정은 Object (형변환 주의)
				주요기능 	- clone() : 복제 (새로운 메모리 생성) 
					   	- finalize() : 소멸자 (자동호출 --> 메모리 해제)
					 	- toString() : 객체를 문자열화
					 	- equals() : 객체 비교 (기본은 객체의 주소값)
			2) System 
				주요기능 	-gc() : 가비지 컬렉션
						-out  : 출력
						-in	  : 입력
			3) Math : 수학과 관련된 기능
				주요기능	-round() : 반올림
						-ceil()	 : 올림
						-random(): 난수 (임의의 수 추출)
			4) StringBuffer : 문자열이 많은 경우의 제어
				주요기능	-append() : 문자열 결합
						-delete() : 문자 제거		
						-insert() : 문자열 추가 	==> String에 존재하지 않는 기능
			5) String : 문자열을 쉽게 제어하도록 만든 클래스
						-> 웹, 윈도우, 빅데이터(AI)
				주요기능	-equals() : 문자열 값 자체를 비교
						-trim()	  : 앞 뒤 공백 제거
						-substring() : 인덱스만큼 문자열 자르기
						-length() : 문자열의 길이 확인
						-valueOf(): 문자열화
						-contains(): 포함문자 비교
						-startsWith(): 시작문자 비교
						-endsWith(): 끝 문자 비교
						-split(): 문자열 나눠서 배열저장
						-replace(): 문자열 바꾸기
						-replaceAll():
		
		java.util
			1) StringTokenizer : 문자열 분리 (임시 저장 --> 값을 따로 저장할 필요가 있음)
				주요기능	-countToken() : 분리된 단어의 갯수 확인
						-hasMoreTokens(): 분리된 갯수만큼 루프 돌릴 때
						-nextToken() : 실제로 분리된 데이터를 가지고 올 때 (값 저장시에 사용)
			2)Wrapper : 기본형의 클래스화
				주요기능	-Integer : int의 클래스화
						-Double	 : double의 클래스화
						-Boolean : boolean의 클래스화
						-Long	 : long의 클래스화
						-(	 ).parseXxxx : 문자열 데이터의 변환에 사용 (웹에서는 모든 데이터가 String이므로, 사용할 일이 많음)
					==> 기본형 / Wrapper 서로 호환 
						ex) Integer i=10;  클래스에 리터럴값을 직접 대입할 수 있음		 (오토박싱)
							int a=new Integer(10); 기본형에 클래스 객체값을 받을 수 있음 (언박싱)
			3)Random : 난수발생
				주요기능	-nextInt(int bound): 0~bound-1만큼의 범위에서 난수 발생
			4)Arrays
				주요기능	-sort()	: 정렬
						-toString(): 배열 출력
						-asList() : List형으로 변환
			5)Date : 기능이 적음 but! 다른 프로그램(MySQL, 오라클)과 호환 
									--> 데이터를 받는 경우 사용 (날짜 저장용)
			6)Calendar : Date를 보완한 클래스
				주요기능 	-set() : 연/월/일/시/분/초  날짜 설정 가능
						-get() : 날짜 읽기
						-get(Calendar.DAY_OF_WEEK) : 요일 읽기
						-getActualMaximum() : 각달의 마지막 날 가져오기
			7)Collection : 데이터를 쉽게 관리 => 10개씩 자동으로 저장공간이 설정 (배열 대체 가능)
				List
					1| ArrayList
					2| Vector
					3| LinkedList-Queue
				Set
					1| HashSet
					2| TreeSet
				Map
					1| HashMap
					2| HashTable
					
				
				
				
			자바(웹 개발)의 3대 클래스 : String / Integer / List
			
				String과 Integer 예시
					String page="2";  --> int a=(page*10)-10;				  (오류)
									  --> int a=(Integer.parseInt(page)*10)-1 (정상작동)
			
			
			
			




*/

// Calendar 응용
import java.util.*;
public class _01_라이브러리_정리및복습_달력제작
{
	public static void main(String[] args)
	{
		// 사용자로부터 연도와 월 받기  ex) 예약, 체크인, 체크아웃 => 달력
		Scanner scan=new Scanner(System.in);
		System.out.print("연도 월 입력(2023 4): ");
		int year=scan.nextInt();
		int month=scan.nextInt();
		
		//1일자의 요일을 가지고 오기 (4 -> 4월 1일의 요일을 알아야 달력 출력가능) 
		
		Calendar cal=Calendar.getInstance(); // 추상클래스는 미완성된 클래스 --> 메소드 구현x --> 사용 불가능
											 //--> 구현한 클래스 이용 / 싱글턴 이용 ( newInstance(), getInstance() )
		/*
			static => 클래스명.메소드명()
			Math.random()
			클래스명 객체명 = new 생성자(); 		==> 추상클래스, 상속, 인터페이스
			클래스명 객체명=클래스명.메소드() 			==> 추상클래스
		*/
		cal.set(Calendar.YEAR, year);			// 입력한 연도
		cal.set(Calendar.MONTH, month-1); 		// 입력한 월 / month는 -1 해야함
		cal.set(Calendar.DATE, 1);       		// 1일 설정
		
		// 요일 구하기
		int week=cal.get(Calendar.DAY_OF_WEEK)-1;	// 요일 구하기 (인덱스는 1~7이므로 -1)
		
		// 입력 달의 마지막날
		int lastday=cal.getActualMaximum(Calendar.DATE);
		
		// 달력 출력
		String[] strWeek= {"일","월","화","수","목","금","토"};
		System.out.println(year+"년 "+month+"월");	// 입력받은 연도와 월 출력
		System.out.println("\n");
		for(String s: strWeek)
		{
			System.out.print(s+"\t");
		}									// 요일 출력
		System.out.println();
		
		for(int i=1;i<=lastday;i++)
		{
			if(i==1)						// 각 달의 1일차 요일에 맞춰서 공백주기
			{
				for(int j=0;j<week;j++)
				{
					System.out.print("\t");	// 첫 날의 요일(week)만큼 공백주기
				}
			}
			// 달력 숫자 출력하기
			System.out.printf("%2d\t",i);	// 일 간격 띄워서 출력
			week++;							// 요일 1개씩 증가
			if(week>6)						// 요일이 6(토)까지 증가한다면
			{	
				week=0;						// 요일을 0(일)으로 리셋하고
				System.out.println();		// 줄 바꿔주기
				System.out.println();		// 보기 좋게 한 번 더 줄 바꾸기
			}
		}
		
		
	}
}
