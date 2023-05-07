package com.sist.text;

/*
	숫자 포맷 --> 10,000
*/

import java.text.*;
public class _02_라이브러리_text_DecimalFormat
{
	public static void main(String[] args)
	{
		DecimalFormat df=new DecimalFormat("##,###,###");
		// 자바에서는 #을 통해 설정 / 오라클은 9로 설정 => TO_CHAR(123456789, "999,999,999") / 자바스크립트는 0으로 설정 ==> 암기 영역
		int won=12345678;
		System.out.println(df.format(won)); 	// df 형식으로 바꿔서 출력 --> DecimalFormat의 객체명.format(변수명)
		
		System.out.println("================================");
		double[] limit= {59,60,70,80,90};
		// 0~59, 60~69, 70~79, 80~89, 90~ 
		//  F		D	C		B		A 에 맞춰서 출력
		String[] grade= {"F","D","C","B","A"};
		int[] score= {100, 90, 85, 90, 80, 72, 60, 58};
		
		ChoiceFormat cf=new ChoiceFormat(limit,grade);
		for(int i=0;i<score.length;i++)
		{
			System.out.println(score[i]+": "+cf.format(score[i]));
		}
		
	}
}
