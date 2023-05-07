package com.sist.lib;

/*
		제네릭 (JDK1.5에 도입)
	=> JDK1.8 호환성 => 17버전, SpringFrame(14버전)
					  ------ Spring-Boot
	 제네릭이 도입된 이유
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
	----------------------------------------------------------------------
	
	Iterator / ListIterator => 데이터를 모아서 관리
	-------- hasNext(), next(), remove()
	-------- hasNext(), next(), remove(), hasPrevious()
		=> 순서가 없는 경우 주로 사용 (Set, Map 출력)
			ArrayList의 경우, index가 존재하므로 for문으로 출력이 더 편함
	
	
	

*/

import java.util.*;
public class _4주차정리2
{
	public static void main(String[] args)
	{
		//List<E>
		//Set<E>
		//Map<K, V>
		
		
		// 리스트 생성
		List<String> list=new ArrayList<String>();
		
		// 초기화
		list.add("사과");
		list.add("배");
		list.add("수박");
		list.add("딸기");
		list.add("바나나");
		
		// 일반형 출력
		for(String s:list)
		{
			System.out.print(s+" \n");
		}
		
		// toString()로 출력
		System.out.println(list.toString());
		
		// Iterator 출력 --> 출력이 어려운 경우 + 단방향 출력
		System.out.println("--------Iterator--------");
		Iterator<String> it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		// 한 번 출력하면, 재출력 불가능
		System.out.println("--------Iterator--------");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		// ListIterator -> List에서만 사용 가능
		
		// 한 번 선언된 List는 제네릭 변경 불가능
		//List<String> list1=new ArrayList<>();
		//list1=new ArrayList<Integer>();
		
		// 와일드 카드를 사용하면, 제네릭 변경 가능
		List<?> list2=new ArrayList<String>();
		list2=new ArrayList<Integer>();
		//단, 이 경우에는 메모리를 clear하는 것이 좋음 list2.clear();
		
		List<Integer> list3=new ArrayList<Integer>();
		list3.add(1);
		list3.add(2);
		list3.add(3);
		list3.add(4);
		list3.add(5);
		
		for(int i=0;i<list3.size();i++)
		{
			System.out.print(list3.get(i)+" ");
		}
		System.out.println("\n================");
		for(int i=list3.size()-1;i>=0;i--)
		{
			System.out.print(list3.get(i)+" ");
		}
		
		ListIterator<Integer> it1=list3.listIterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		
		
		
	}
}
