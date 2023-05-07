/*
	switch ~ case (선택문)
	=> 범위를 지정하는 것이 아닌 특정값 설정
						   -----> char, int, String (3개의 데이터형만 가능) // 실수, boolean은 사용 불가능
	
	=> 자주 사용되는 곳 : 게임(키보드별 처리) / 메뉴 / 네트워크 (기능별 처리) / 웹 (화면 전환)
	
	=> 형식)
			   'B'   ==> 문장 2, 3, 4를 다 수행
				|
		switch (문자, 문자열, 정수)
		{
			case 'A':
					문장 1
			case 'B':
					문장 2
			case 'C':
					문장 3
			default:
					문장 4 ==> A, B, C가 아닌 경우  // 생략 가능
		}
=======================================================================================		
			   'B'   ==> break 가 있어야 빠져나감
				|
		switch (문자, 문자열, 정수)
		{
			case 'A':
					문장 1
					break; 
			case 'B':
					문장 2
					break;
			case 'C':
					문장 3
					break;
			default:
					문장 4 ==> A, B, C가 아닌 경우  // 생략 가능 // 마지막 문장은 break 필요 없음 
		}
		
		정수		--> case 1:			/  case 2: ...
		문자열	--> case "login":	/  case "logout": ...
	
	
	
*/
import java.util.Scanner;
public class _01_선택문1_switchCase_메뉴만들기 {
	public static void main(String[] args) {
		
		System.out.println("======메뉴======");
		System.out.println("1.로그인");
		System.out.println("2.회원가입");
		System.out.println("3.로그아웃");
		System.out.println("4.맛집추천");
		System.out.println("5.레시피만들기");
		System.out.println("6.프로그램종료");
		System.out.println("===============");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("번호를 입력하세요(1~6)");
		int input = scan.nextInt();
		System.out.println("입력하신 번호:"+input);
		switch(input)
		{
		case 1:
			System.out.println("로그인을 요청하셨습니다.");
			break;
		case 2:
			System.out.println("회원가입을 요청하셨습니다.");
			break;
		case 3:
			System.out.println("로그아웃을 요청하셨습니다.");
			break;			
		case 4:
			System.out.println("맛집추천을 요청하셨습니다.");
			break;
		case 5:
			System.out.println("레시피만들기를 요청하셨습니다.");
			break;
		case 6:
			System.out.println("프로그램을 종료합니다.");
			System.exit(0); // 프로그램을 완전 종료 -->  (0)은 정상 종료  (0이 아닌 번호) 비정상 종료
			break;
		default: 
			System.out.println("없는 메뉴입니다."); 		// 없는 메뉴 선택시
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
