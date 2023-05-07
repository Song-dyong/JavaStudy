package com.sist.text;

/*
		제목:					국어:90			국어		영어		수학		총점		평균 
		감독:					영어:90			90		90		90		270		90.0
		출연:					수학:90
		-----------				총점:270			==> 출력하는 형식을 MessageFormat을 통해 구현 
		제목  감독  출연			평균:90.0		
		
		MessageFormat ==> 오라클 SQL문장 작성시에 사용
									
		

*/
import java.text.*;
public class _04_라이브러리_text_MessageFormat2_응용
{
	public static void main(String[] args)
	{
//		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t");
//		String msg="{0}\t{1}\t{2}\t{3}\t{4}\t{5}\t";
		
		String msg="이름:{0}\n국어:{1}\n영어:{2}\n수학:{3}\n총점:{4}\n평균:{5}\n";
		
		Object[] obj1= {"홍길동",90,90,90,270,90.0};
		System.out.println(MessageFormat.format(msg, obj1));
		System.out.println("=======================");
		Object[] obj2= {"심청이",90,90,90,270,90.0};
		System.out.println(MessageFormat.format(msg, obj2));
		System.out.println("=======================");
		Object[] obj3= {"박문수",90,90,90,270,90.0};
		System.out.println(MessageFormat.format(msg, obj3));
		
		
		
	}
}
