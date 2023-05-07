package com.sist.generic;

/*
  		제네릭
  		 => 데이터형을 통일화
  		 => 라이브러리의 데이터형을 변경할 경우에 사용
  		 	-------- 매개변수 / 리턴형 (Object)
  		 			 => 프로그램 개발시마다 형변환을 해야된다
  		 			 => 프로그램에 필요한 데이터형으로 변경
  		 		** 데이터를 저장할 때는 한 가지 데이터형만 저장해야 사용하기 쉽게
  		 		   프로그램 = 데이터를 통일
  		 	사용방법: < >
  		 		List <클래스명> => Object는 지정한 클래스로 변경	
  		 			ex)
  		 				List<String>
  		 				List<MovieVO>
  		 					=> T, E, K, V
  		 					  ------------
  		 					  T => Type (클래스형)
  		 					  E => Element
  		 					  K => Key
  		 					  V => Value
  		 					  Map<K, V>
  		 					  Map<String, String>
  		 					  List<E>
  		 					  List<Integer>
  		 					  	   -------
  		 					  	   기본형은 사용 불가능 (클래스형만 가능)
  
  
  
  
 
*/

import java.util.*;

class Box<T>
{
	T t;
	// 제네릭스를 직접 만들 수 있음 (클래스를 만드는 것과 동일)
	// 단, T를 설정하지 않으면, Object로 바뀜
	public T getT()
	{
		return t;
	}

	public void setT(T t)
	{
		this.t = t;
	}
}

class A{
	
}

public class _01_라이브러리_Generic
{
	public static void main(String[] args)
	{
		 List<String> list = new ArrayList<String>();
		 list.add("사과");
		 list.add("배");
		 list.add("딸기");
		 
		 for(String f:list)
		 {
			 System.out.println(f);
		 }
		 
//		 list.add(1);							// java.lang.ClassCastException 
		 for(Object obj:list)
		 {
			 String f=(String)obj;
			 System.out.println(f);
		 }
	
		 List<A> list2=new ArrayList<A>();
		 A a=new A();
		 list2.add(a);
	}
}
