package com.sist.util;

import java.nio.file.spi.FileSystemProvider;

/*
	335page
	Collection ==> 데이터를 묶어서 관리할 수 있게 만든 클래스
			   ==> 배열의 단점을 보완
			   
	컬렉션 프레임워크 (프레임워크 -> 표준화)
		---------> 모든 개발자가 동일한 형태로 소스코딩
					소스의 통일화 목적 : Spring / MyBatis / JQuery / VueJS / ReactJS
					
	Collection : 데이터 그룹, 다수의 데이터를 모아서 관리
				 -------------------------------
				 	배열, 클래스
		-배열: 배열의 크기를 정해놓고 (고정적) 작업해야하는 단점	
		 |	=> 애초에 크게 만들어서 작업하면, 메모리 누수현상 발생
		 |	
		데이터 크기에 맞게 클래스 제작 (가변형) 
	
		-컬렉션 : 가변형
			   ------ 디폴트 10개, 추가될 때마다 자동으로 10개 추가
			   		  => 저장할 메모리의 한계를 정하지 않음
			   		  					
			   		  					  <관계도>
			   		  					Collection
			   		  						|
			   		  -------------------------------------------
			   		  |						   |				|
			   		List		    		  Set			   Map				=> <인터페이스>
			---------------------		   ---------	   ---------  		
			|		  |			|		   |	   |	   |		|   		
		ArrayList	Vector	LinkedList	HashSet	TresSet	HashMap	HashTable		=> <구현된 클래스>
		
		종류
			1) List
				1| ArrayList (비동기) : 데이터베이스에 연동
				2| Vector (동기)	: 네트워크에서 주로 사용
				3| LinkedList : C언어 호환 
					==> 3개의 클래스는 호환가능
						ex) List list=new ArrayList()
							list=new Vector()
							list=new LinkedList()
			2) Set
				1| HashSet : 중복없는 데이터 저장
				2| TreeSet : 검색
			3) Map
				1| HashMap
				2| HashTable
				
		<List>
			특징)
			  1. 순서를 가짐(인덱스 0부터)
			  2. 저장된 데이터의 중복을 허용
			  3. 주 사용처: CURD 프로그램
			  	  	   Create Update Read Delete
			  	   		저장    수정    읽기  삭제
			  	오라클: Insert Update Select Delete
			  4. 비동기화 => 데이터베이스 프로그램 연동시 사용
			  
			 구현클래스)
			  	1. ArrayList 
			  	2. Vector
			  	3. LinkedList
			  	
			 주요메소드)
			    1. 데이터 추가	: add(Object)
			    2. 데이터 삭제	: remove()
			    3. 데이터 수정	: set()
			    4. 데이터 읽기	: get()
			    5. 저장된 데이터 갯수 : size()
			    6. 전체 삭제	: clear()
			    7. 데이터 존재여부 확인 : isEmpty()
			  		cf)오라클에서 데이터 읽고, 저장 (List) ==> 브라우저 전송
			  		
		<Set>
			특징)
			  1. 순서가 없음 (인덱스x) => forEach로 출력
			  2. 데이터 중복 불가
			  3. 주 사용처: List에 중복된 데이터 제거
			
			구현클래스)
			  1. HashSet
			  2. TreeSet
			  
			주요메소드)
			    1. 데이터 추가	: add(Object)
			    2. 데이터 삭제	: remove()
			    3. 데이터 수정	: set()
			    4. 데이터 읽기	: get()
			    5. 저장된 데이터 갯수 : size()
			    6. 전체 삭제	: clear()
			    7. 데이터 존재여부 확인 : isEmpty()
		
		<Map>
			특징)
			  1. 웹에서 지원하는 모든 클래스는 Map형식을 가지고 있음 (key값 / value값)
			  		request / response / sesson / cookie 
			  			ex) new Cookie(key, value) => key를 통해 값을 찾아옴
			  				request.setAttribute("id","hong")
			  				request.setAttribute("pwd","hong")
			  				request.setAttribute("sex","man")	=> 같은 값에 다른 키로 저장해야 중복을 방지할 수 있음
			  2. 키와 값을 페어로 저장
			  3. 키는 중복을 허용하지 않음 / 값은 중복 가능 (키가 동일할 경우, 덮어쓰기)
			  4. 주 사용처 : 웹 (클래스 관리, SQL관리)
			  
			구현클래스)
			  1. hashMap
			  
			주요메소드)
				1. 데이터 저장 : put()
				2. 데이터 읽기 : get(key) => value 리턴
				
	
	
	cf) 프로젝트
	1차 : 데이터베이스 사용법 (SQL) 백엔드 / JQuery (AJax) 프론트
	2차 : Spring /Spring 라이브러리 / VueJS(Vuex)
	3차 : Spring-boot / ReactJS(Redux)
	
		웹 프로그램
		--------
		  Model 1 : 간단한 사이트 (JSP)
		  	
		  Model 2 : 큰 사이트 MVC ex) Vuex, Redux
					
			  				
*/

// ArrayList => 사용빈도가 가장 많다
// 배열과 유사 / 인덱스번호를 사용 -> 자동으로 지정
// 순차적 ( 인덱스: 0~...)
// 가변형 -> 크기를 지정하지 않는다
/*
	생성
	---
	List list = new ArrayList(); => 기본 생성자: 메모리 10개 생성, 추가할 때마다 10개씩 증가
	ArrayList list = new ArrayList();


*/
import java.util.*;
public class _01_라이브러리_Collection_정리
{
	public static void main(String[] args)
	{
		// 생성
		ArrayList list=new ArrayList();		// 제네릭스가 없으면 경고! --> 기본 디폴트: Object
		// list 내에는 모든 데이터형이 들어갈 수 있음
		// 가급적이면, 같은 데이터형을 첨부하는 것이 좋음
		// list라는 공간에 데이터 추가
		// 여러 데이터형을 혼합해서 넣어두면, for문을 돌리기 힘듦
		// 이름 관리
		list.add("홍길동"); // index=0
		list.add("박문수"); // 1
		list.add("심청이"); // 2 -> 3 -> 4
		list.add("춘향이"); // 3 -> 4 -> 5
		list.add("이순신"); // 4 -> 5 -> 6
		list.add(2, "강감찬"); // 2 --> 위의 인덱스 2번으로 들어가고, 나머지는 하나씩 뒤로 밀림
		list.add(3, "을지문덕"); // 3 
		list.add("박문수"); // 7
		// 출력
		// 데이터 추가: .add(Object o) / .add(int index, Object o) 단, 인덱스 번호에 개입하면 처리시간이 길어지므로 가능한 지양할 것.
		// 저장된 갯수: .size()
		// 데이터 출력: .get(int index)
		for(int i=0;i<list.size();i++)
		{
			System.out.println(i+". "+list.get(i));
		}
		//
		System.out.println("==============삭제==============");
		//데이터 삭제
		/*
		0. 홍길동
		1. 박문수
		2. 강감찬
		//3. 을지문덕	-> 삭제 -> 3번 사라짐 -> 뒷 번호가 앞으로 땡겨짐
		3. 심청이				=> 생략되는 번호없이 순차적으로 설정된다
		4. 춘향이
		5. 이순신
		*/
		list.remove(3);
		list.remove("박문수");		// .remove(int index or Object o) => (중복이 있을 때) 실제값으로 삭제할 경우, 가장 앞의 것을 삭제
		for(int i=0;i<list.size();i++)
		{
			System.out.println(i+". "+list.get(i));
		}
		System.out.println("============수정===============");
		// 수정 => set(인덱스 번호, 변경할 데이터)
		list.set(0, "홍길수");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(i+". "+list.get(i));
		}
		// 저장된 갯수 확인
		System.out.println(list.size()+"명");
		System.out.println("======전체 삭제======");
		list.clear();
		System.out.println("인원수 :" + list.size());
		/*
			add(Object o)
			set(int index, Object o)
			remove(int index)
			Object get(int index)
			int size()
			clear()
		
		
		
		*/
		
	}
}
