/*
		1. if ~ else if (다중 조건문)과 switch는 유사한 제어문
			= if ~ else if : 범위가 있는 경우
			= switch : 한 개가 선택될 경우 (Web에서는 많이 사용하지 않음)

		2. switch에서 문법 사항
			1) switch에서 처리 할 수 있는 데이터형 ( int /  char / String )
			2) case 값: 
			3) 종료시에는 break;
			4) default는 생략 가능
			5) 여러 개를 같은 문장으로 처리할 경우, 문장과 break 생략
				case 10: case 9: case 8:  --> 10, 9, 8의 문장이 동일하게 출력
	
			연산자 -> 제어문 -> 배열 -> 클래스 -> 자바 프로그램
			----------------------------> 메소드 
*/


public class _03_선택문3_계절확인 {
	public static void main(String[] args) {
		int month = (int)(Math.random()*15)+1;
		System.out.println(month+"월");
		switch (month)
		{
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9: case 10: case 11:
			System.out.println("가을");
			break;
		case 12: case 1: case 2:
			System.out.println("겨울");
			break;
		default: System.out.println("잘못 입력되었습니다.");
		}
		
		
		
	}
}
