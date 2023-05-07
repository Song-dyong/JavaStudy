package com.sist.lib;

/*
	컬렉션 프레임워크 														=> 개발자들이 같은 형식의 소스코드를 사용하도록 정형화시킨 클래스, 메소드의 모음
		1. 다수의 데이터를 쉽고 효율적으로 처리할 수 있게 만든 표준화된 클래스의 모음
						----------- 자바에서 라이브러리 지원 
		2. 데이터 수정 / 삭제 / 추가 / 읽기 (자료구조)
		3. 배열 => 정적 메모리 할당 (갯수의 제한 - 추가 어려움) -> 보완 : 동적 메모리 할당 (데이터 추가 용이) 
																----------- 추가될 때마다 자동으로 메모리 추가
		컬렉션 종류)
			<인터페이스>
			1) List : 순서 존재, 데이터 중복 허용 => ArrayList(비동기) / Vector(동기) / LinkedList(c언어)
			2) Set : 순서 없음, 데이터 중복 불가능 => HashSet / TreeSet 
												ex) 웹 채팅, List에서 중복된 데이터 추출
			3) Map : Key / Value 값이 페어로 저장 => HashMap / HashTable
			4) 먼저 들어온 데이터를 먼저 출력 : Queue(FIFO) / Stack(LIFO) 
										 ----순차적 처리  ----거꾸로 출력 ==> 1차원 배열
										<Queue>
										 for(int i=0;i<arr.length;i++)
										 {
										 	값 설정
										 }
										 for(int i=0;i<arr.length;i++)
										 {
										 	출력
										 }
										<Stack>
										 for(int i=0;i<arr.length;i++)
										 {
										 	값 설정
										 }
										 for(int i=arr.length-1;i>=0;i++)
										 {
										 	출력
										 }
		
							  <상속도>
							Collection
								|
				  ---------------------------------------------------------------				
				  |						 |					  |					|
				List					Set					Queue				Map
				  |						 |										|
		----------------------			---------							-------------
		|		  |			 |			|		|							|			|
	ArrayList	Vector	LinkedList	HashSet	TreeSet						HashMap		HashTable	
				  |
				Stack
				
				
		<List>
	= 중복 데이터를 저장해야할 때 (저장 순서는 인덱스 -> 순차 저장)
	  구현 클래스)
	  	1. ArrayList
	  		1) 단방향 포인터(인덱스)를 갖는다 => 조회 편리 
	  		2) 검색 속도 빠름 / 데이터 추가 속도 빠름
	  		3) 단점 : 수정, 중간에 추가, 삭제시 속도가 느려짐 (인덱스 번호가 밀리거나 당겨지기 때문)
	  				=> 변경, 삭제가 거의 없는 상태에서 주로 사용
	  				   --------------------- 데이터 베이스 (오라클)
	  				   웹 = 데이터베이스가 핵심인 프로그램 --> ArrayList 多
	 						추가, 조회는 리스트로 / 삭제, 변경은 오라클로
	 	
	 	2. LinkedList
	 		1) 양방향 포인터를 갖는다 => 수정, 삭제 편리
	 		2) 단점 : 검색 속도 느림 / 데이터 추가 속도 느림
	 	
	 	3. Vector
	 		1) 대용량 데이터 처리 => 채팅, 서버연결
	 		2) 비동기화 보완 => ArrayList
				과거에 만든 프로그램 유지보수할 때, 나올수도 있음
		
		★★★ 데이터는 반드시 구분이 되도록 만듦
		
		<Set>
	= 순서(인덱스)가 없기 떄문에, 데이터의 중복을 허용하지 않음
		--> 장르별 / 부서별 ... 
			but! 데이터베이스에는 중복이 안되는 명령어(DISTINCT)가 존재하기 때문에, 많이 사용하지 않음				
		1. HashSet : 속도가 빠름
		2. TreeSet : 정렬, 검색속도 빠름
		
		<Map>
	= 구분자(Key)를 통해 값(Value) 찾기
			--> 웹에서 주로 사용, 클래스 관리, 도서목록, 우편번호
		1. HashMap	
		2. HashTanle : HashMap보다 속도가 느림
	
		
		
	Set 클래스 (인터페이스)
	
	1. HashSet
		= 순서(인덱스)가 없음 --> 데이터 중복 허용하지 않음
		
		주요메소드)
			add() 	: Object로 데이터 저장
			remove(): 삭제 
			clear()	: 전체 샂게
			isEmpty(): 빈공간 (데이터 존재여부 확인)
			size() 	: 저장 갯수
			iterator(): 데이터를 한번에 모아서 관리
	2. TreeSet
		= 검색용으로 주로 사용
		주요메소드)
			headSet
			tailSet
	
	
		
				
*/

import java.util.*;
public class _01_라이브러리_Collection
{
	public static void main(String[] args)
	{
		//HashSet
		Set set=new HashSet<>();		// 생성 방법
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("A");
		set.add("B");
		set.add("C");					// A,B,C,D,A,B,C 7개 데이터 넣기 => A,B,C 중복된 데이터는 허용하지 않음
		// 출력
		for(Object o: set)
		{
			/*
				for-each구문은 형변환 불가능 
					ex) for((String)Objcet o:set) ==> for 선언하는 곳에서 형변환 불가
						{ String s=(String)o }    ==> 구현부에서 형변환은 가능
			*/

			String s=(String)o;
			System.out.print(s+" ");
			
		}
		
		
		
	}
}
