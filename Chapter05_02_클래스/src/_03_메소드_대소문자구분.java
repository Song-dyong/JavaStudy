/* 		char를 한 개 보내서 => 대문자 / 소문자 확인 => 리턴형: boolean (2개 중 하나이므로)
		

*/

import java.util.Scanner;
public class _03_메소드_대소문자구분 {

	static String isAlpha(char c)
	{
		String result="";
		boolean bCheck=false;			// false로 디폴트를 잡았기 때문에, else를 굳이 하지않아도 됨
		if(c>='A'&& c<='Z')
			result="대문자입니다.";
		else if(c>='a'&&c<='z')
			result="소문자입니다.";
		else
			result="알파벳이 아닙니다.";
		return result;
	}
	
	static void process()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("알파벳 입력");
		String s=scan.next();
		char c=s.charAt(0);						// 문자열 받아서, 문자열의 첫번째 문자 가져오기
		
		String result=isAlpha(c);
		System.out.println(c+"는(은) "+result);
	}
	// 가급적, 결과값이 여러개인 경우, 문자열로 처리
	
	public static void main(String[] args) {
		process();
		
	}
}
