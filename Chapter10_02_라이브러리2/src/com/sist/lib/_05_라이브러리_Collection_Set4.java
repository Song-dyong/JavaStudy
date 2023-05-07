package com.sist.lib;


import java.util.*;
public class _05_라이브러리_Collection_Set4
{
	public static void main(String[] args)
	{
		String[] names= {"홍길동","이순신","강감찬","심청이","춘향이","이산","을지문덕","박문수","이순신","강감찬","심청이"};
		// ArrayList로 변환하기
		List list = Arrays.asList(names);			// Arrays.asList(배열명)
		System.out.println(list);
		// 중복제거
		Set set=new HashSet<>();
		set.addAll(list);
		System.out.println(set); 					// Set으로 변경하기 => list와 set의 값은 서로 호환 가능
		
		List list2=new ArrayList<>();				// set으로 변경해서 값을 넣어준 후에 다시 그 값을 새로운arraylist 만들어서 넣기
		list2.addAll(set);
		System.out.println(list2);					// --> ArrayList에 Set처럼 중복제거하는 방법 		ex)장바구니 
		
	}
	
}
