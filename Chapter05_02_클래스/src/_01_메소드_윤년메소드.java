/*
		변수		연산자	제어문	출력
		---		------------
		 |			  |			 |
		배열			명령문		Application
		클래스		-----		-----------
					메소드			Web Application
		--------------------------------------------
		
		클래스
		-----
			1. 메소드 ★★★★★
				1) 사용자 정의
				2) 라이브러리: 리턴형과 매개변수, 기능 암기
					ex) String trim()	/	double random()
			2. 변수(멤버)	=> 프로그램 종료시까지 메모리 유지
			3. 생성자
			--------------------------------------- 기본요소
		
		객체지향 프로그램: 유지보수 (데이터보호, 재사용, 수정, 추가)
								캡슐화   상속/포함	오버라이딩/오버로딩
			4. 비정상 종료를 방지하는 프로그램: 견고한 프로그램 (예외처리)
		-------------------------------------------------------- 8장까지 => 자바 기본
			5. 자바에서 지원하는 라이브러리 => 조립식 프로그램
		--------------------------------------------------------------------------
		*** 오라클 연결 => 웹 만들기 가능 ***
		*** 브라우저 연결 ***
		자바: 오라클에 연결되는 프로그램을 만들기 위함	->		브라우저에 연결
		
		자바 -> 오라클 -> 브라우저 통합연결: Spring


*/
/* 		연도를 입력받아서 윤년여부 확인

   		메소드 안에서 출력 or 결과값을 받아서 출력?
 			(void)				(boolean)
 		--> 리턴형으로 결정
 		
 			매개변수: 연도 입력
 */
import java.util.Scanner;

public class _01_메소드_윤년메소드 {
	
	static void isYear(int year)
	{
		if((year%4==0 && year%100!=0)|| year%400==0)
			System.out.println(year+"년도는 윤년입니다.");
		else
			System.out.println(year+"년도는 윤년이 아닙니다.");
	}
	
	static void process()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("연도 입력:");
		int year = scan.nextInt();
		// 메소드 호출과정	=> 호출시에는 실제 데이터값 입력
		//isYear(year);
		boolean bCheck=isYear2(year);
		if(bCheck==true)
			System.out.println(year+"년도는 윤년입니다.");
		else
			System.out.println(year+"년도는 윤년이 아닙니다.");
	}
	
	static boolean isYear2(int year)
	{
		boolean bCheck=false;
		if((year%4==0 && year%100!=0)|| year%400==0)
			bCheck=true;
		return bCheck;
	}
	
	
	public static void main(String[] args) {
		
		process();
		
	
	}
}
