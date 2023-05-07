/*
		같은 문자열인지 확인
			-> 기본형 비교: 	== 		/  	 !=
			-> 문자열 비교: equals()	/ !equals()
				ex) 로그인 할 때, id / password 비교

*/

import java.util.Scanner;
public class _03_문자열_equals {
	public static void main(String[] args) {
		final String ID="hong";
		final String PWD="H1234";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("아이디 입력: ");
		String id=scan.next();
		System.out.println("비밀번호 입력: ");
		String pwd=scan.next();
		
		// String내에 저장하면, 문자열 저장이 아닌 메모리 주소값이 저장됨 ==> ==은 메모리 주소를 비교하는 것이기 때문에, id와 ID의 메모리 주소가 다름 => false
		// 로그인 처리
//		if(ID==id && pwd==PWD)
//		{
//			System.out.println(id+"님 로그인되었습니다.");
//		}
//		else
//		{
//			System.out.println("아이디 혹은 비밀번호가 틀렸습니다.");
//		}
		
		//.equals() : 메모리에 저장된 실제 문자열 자체를 비교	-------->	(대소문자 구분)
		//	-> 로그인, 아이디 찾기, 아이디 중복체크, 비밀번호 찾기 등...	|		-> 대소문자 구분하지 않는 기능: .equalsIgnoreCase() => 검색에서 사용
		if(ID.equals(id) && pwd.equals(PWD))
		{
			System.out.println(id+"님 로그인되었습니다.");
		}
		else
		{
			System.out.println("아이디 혹은 비밀번호가 틀렸습니다.");
		}
		
		
	}
}
