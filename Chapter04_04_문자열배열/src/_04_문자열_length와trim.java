/*
		length() => 문자 갯수
					why? ~자 이상으로 설정 (ID, PASSWORD 등) / 입력값이 없을 경우 (1보다 작을 경우, 입력값 X)

		trim()	=> 좌우 공백 제거 
					why? 실수로 공백을 입력할 경우, 처리
					
		javascript와 java의 메소드 동일 + jquery / VueJS / ReactJs 동일

*/

import java.util.Scanner;
public class _04_문자열_length와trim {
	public static void main(String[] args) {
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("문자열을 입력하세요");
//		String s=scan.next();
//		System.out.println("입력된 문장: "+s);
//		System.out.println("문자의 갯수: "+s.length());			// 한글은 한 글자에 2byte / 영문, 숫자는 한 글자에 1byte
		
		String s=" Hello Java!! ";
		System.out.println(s.length());							// 공백도 문자수에 포함
		System.out.println(s.trim().length()); 					// 앞 뒤 공백 제거	(가운데 공백은 제거X)
		
		
		
	}
}
