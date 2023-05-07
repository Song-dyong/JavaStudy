package com.sist.text;
/*
		책에 없는 내용
	java.text : 출력 형태를 만들어서 사용하는 경우 (변경할 때)
	---------
		SimpleDateFormat : 날짜 변경
		DecimalFormat : 숫자 변환	
				ex) 가격출력 10000원 --> 10,000원
		MessageFormat : 데이터베이스에서 INSERT, UPDATE
				ex) String name=""; sex=""; tel=""; 
					int age=10;
					
					String sql="INSERT INTO member VALUES("								==> 형태가 복잡한 상황
								+ "'"+name+"', '"+sex+"','"+addr"','"+tel"','"+age+")"; 
					String sql="INSERT INTO member VALUES('{1}','{2}','{3}','{4}','{5}')"	==> 메세지포멧을 통해 간단하게 변환 



*/
import java.util.*;
import java.text.*;
public class _01_라이브러리_text_SimpleDateFormat
{
	public static void main(String[] args)
	{
	//	java.util.Date date=new java.util.Date(); sql패키지에도 Date가 있어서 충돌 --> java.util.Date
		Date date=new Date();
		System.out.println(date);   			// Mac은 date.toString() --> date를 인식 못함
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(date)); 	// 바꾼 형식으로 출력
		/*
		 오라클은 대소문자 구분x 
			yyyy ==> rrrr
			MM	==> mm
			dd	==> dd
			hh	==> hh24
			mm	==> mi
			ss	==> ss
		*/
		
		
		
		
		
	}
}
