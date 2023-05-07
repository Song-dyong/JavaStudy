package com.sist.lib;

import java.util.HashMap;

import org.xml.sax.HandlerBase;

/*
		<Map>
		  |
	-------------
	|			|
HashTable	HashMap
	
		특징) 
		  -2개를 동시에 저장 (Key / Value)
		  -Key는 중복 불가능 / Value는 중복 가능
		  	ex) ("id", "hong")
		  		("id", "shim")	--> key 중복은 뒤에 온 값이 덮어씀
		  		("pwd","shim")	--> value는 중복 가능  
			
		  -사용처: 웹에서 제공하는 모든 클래스 (Map형식)
					   HttpServletRequest
					   		request.setAttribute("key", "value")
					   HttpServletResponse
					   HttpSession
					   Cookie
				 스프링, 마이바티스 (Map형식)
				 ----	------- SQL ("all", "SELECT * FROM emp")
			  클래스 등록   
			  ("a", new A()) -> "a"를 주고 A주소 찾아오기
		메소드)
			put("key", "value") : 저장
			get(key) : 읽기
			---------------------> JSON, Properties (맵 방식 사용)
			!! 데이터는 구분자를 필요로 함
				ArrayList : index 번호를 구분자로 사용
				Set : 데이터 중복 불가능 -> 구분자 없이도 구별 가능
				Map : Key를 구분자로 사용
				오라클 : Primary Key를 구분자로 사용 
				
*/


import java.util.*;
public class _07_라이브러리_Collection_Map1
{
	public static void main(String[] args)
	{
		Map map=new HashMap();
		map.put("id","admin");
		map.put("pwd","1234");
		map.put("name","홍길동");
		map.put("sex","남자");
		map.put("age", 25);
		map.put("pwd", "4567");
		
		// 데이터 출력
//		System.out.println("ID "+map.get("id"));
//		System.out.println("pwd "+map.get("pwd"));
//		System.out.println("name "+map.get("name"));
//		System.out.println("sex "+map.get("sex"));
//		System.out.println("age "+map.get("age"));
		
		// set을 활용해서 출력하기 --> key전체값을 모아서 관리	keySet() --> 중복이 없어야되므로, map.keySet --> key값만 가져오기
		Set set=map.keySet();
		System.out.println(set);
		for(Object o:set)
		{
			String key=(String)o;
			System.out.println(key+":"+map.get(key));
		}
		
		/* clear() : 전체 삭제
			get() : 실제 데이터값 읽을 때
			put() : 데이터 추가
			isEmpty() : 데이터가 있는지 여부 (true/false)
			size() : 저장된 갯수
			values() : 실제 저장된 값(value만) 전체 가져올 때
*/
		System.out.println();
		for(Object o:map.values())	
		{
			System.out.println(o);
		}
			
		
		
		
	}
}
