package com.sist.text;

/*
	MessageFormat


*/
import java.text.*;
public class _03_라이브러리_text_MessageFormat
{
	public static void main(String[] args)
	{
		String msg="이름: {0}\n성별: {1}\n나이: {2}\n";
		Object[] obj= {"홍길동", "남자", 26};
		System.out.println(MessageFormat.format(msg, obj));	// String으로 만들어진 포맷({0},{1}...로 구분)에 배열의 값들을 매칭시키기
	}
}
