package com.sist.util;
/* 
	List의 메소드
		
		add / remove / get / set / size / clear => 기본 메소드
 		---------------------------------------------------
 		containsAll() : 2개의 list에서 중복된 데이터를 모아서 관리
 		retainAll() : 2개의 list에서 중복된 데이터만 남기기
 		addAll() : 데이터 전체 복사
 		subList() : 부분적 데이터 복사
 		Collections.sort() : 리스트 오름차순 정렬
 		
 
  
*/
import java.util.*;
public class _03_라이브러리_ArrayList2
{
	public static void main(String[] args)
	{
		ArrayList list=new ArrayList();
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(6);
		list.add(9);
		list.add(2);
		list.add(1);
		list.add(4);

		for(Object o:list)
		{
			System.out.println(o.toString());   		//toString()은 생략 가능
		}
		
		// 일부만 추가 subList(start, end)
		ArrayList list2 = new ArrayList(list.subList(1, 4));	// list의 index 1 2 3을 list2의 index 0 1 2에 넣기
		list2.add(10);											// subList -> start부터 end-1까지 부분적으로 데이터 복사
		list2.add(11);											// 페이지 나누기에 적합 
		list2.add(12);											
		System.out.println("======================");
		for(Object o:list2)
		{
			System.out.println(o);
		}
		
		// sort
		System.out.println("==================");
		Collections.sort(list);							// Collections.sort(리스트명) 
		for(Object o:list)
		{
			System.out.println(o);   		
		}
		
		System.out.println("==================");

		// 같은 데이터 추출 (모두 같아야 가능) 
		System.out.println(list.containsAll(list2));	// 리스트명.containsAll(비교할 리스트명); ==> 같은 데이터가 있는지 확인 true / false
		for(Object o:list)								// 모든 데이터가 포함되어야 true --> 하나라도 다르다면 false
		{
			System.out.println(o);   		
		}
		// 같은 데이터 추출 (교집합만 추출)
		System.out.println("==================");
		
		System.out.println(list.retainAll(list2)); 		// 중복된 수가 존재하면 true -> 중복된 수만 남기고 나머지 데이터 삭제
		for(Object o:list)								// intersection (교집합)
		{
			System.out.println(o);   		
		}
		
		// addAll
		System.out.println("==================");

		ArrayList list3=new ArrayList<>();				// 리스트1.addAll(리스트2) => 리스트1에 리스트2의 값 전부 더하기
		list3.add(1);									// 모든 데이터 복사 
		list3.addAll(list);
		for(Object o:list3)
		{
			System.out.println(o);
		}
		System.out.println("==================");

		
		// retainAll은 원본의 값이 변동되기 때문에, 카피리스트에 addAll한 뒤, 처리할 것
		
		ArrayList name1=new ArrayList<>();
		name1.add(1);
		name1.add(2);
		name1.add(3);
		name1.add(4);
		name1.add(5);
		name1.add(6);
		name1.add(7);
		name1.add(8);
		
		ArrayList name1Copy=new ArrayList<>();
		name1Copy.addAll(name1);
		
		ArrayList name2=new ArrayList<>();
		name2.add(2);
		name2.add(3);
		name2.add(4);
		name2.add(5);
		name2.add(6);
		name1.retainAll(name2);
		
		for(Object o:name1)
		{
			System.out.print(o);
		}
		System.out.println("\n==================");

		for(Object o:name2)
		{
			System.out.print(o);
		}
		System.out.println("\n==================");

		for(Object o:name1Copy)
		{
			System.out.print(o);
		}
		
	}
}	
