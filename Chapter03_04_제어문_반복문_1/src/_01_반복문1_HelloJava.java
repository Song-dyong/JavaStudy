/*
	자바에서 지원하는 반복문
	------------------
	1. for : 반복 횟수가 지정된 경우 주로 사용
		= 일반 for			==> 2차 (중첩 for) why? 코딩테스트
		= for-each : 출력용 (Web에서 가장 많이 등장 --> 향상된 for)		--> 배열을 배운 뒤 학습 가능
	
	2. while : 반복 횟수를 모르는 경우 (선조건)
	
	3. do~while : 반복 횟수를 모르는 경우 (후조건) => 무조건 1 이상은 수행이 가능
	
	=> 유사한 내용을 여러 번 출력하고 싶을 때
		ex) 합계 / 통계 / 목록 출력 ... 
	
	 for문
		형식) for(초기값;조건식;증감식)   
		
			for(int i=1;i<=10;i++)	=> 10번 반복 수행
			{
				<반복 실행 문장>
			}
	
			초기값: 시작점 --> 한 번만 수행
			조건식: 종료점 --> 수행을 중단할 때
			증감식: 초기값 ~ 조건식 (false가 될 때까지)  -->		 감소도 가능 ex) for(int i=10;i>=1;i--)
														여러 개 증가도 가능 ex) for(int i=1;i<=10;i+=2) 복합대입 연산자 활용

		cf) 프로그램에서 가장 많이 사용되는 제어문: for, if ★★★★★ 
											ex) 웹 목록 생성: for / 목록의 상세보기: if
		
		실행 순서) 
		
		for문은 한 문장만 수행 가능
		여러 문장 사용시에는 {  }를 이용해서 처리한다.

			  	   	    	(반복문 종료)
			  	  ①		 ② false ↑			 ←	④				
		for(	초기값 ; 		조건식 	;		 증감식)
		{								↗
		 					↓ (true)
				 			③
						반복 실행 문장
		}
		
		초기값 -> ② 조건식에 대입 (true) -> ③ 반복 수행문장 수행 -> ④ 초기값 증가 	// ②, ③, ④의 반복 (조건식이 false가 될 때까지)
				② 조건식에 대입 (false) -> 종료
		
		
		
		
*/
public class _01_반복문1_HelloJava {
	public static void main(String[] args) {
//		String[] menu = {"밑반찬","메인반찬", "국", "탕","찌개","디저트","면","만두밥","죽","떡퓨전김치","젓갈","장류","양념","소스","잼","양식","샐러드"
//				,"스프","빵","과자","차","음료","술","기타"};
//		for(String s:menu)
//		{
//			System.out.println(s+" ");
//		}
		
		// Hello Java 10번 출력
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i + ". Hello Java");
		}
		for(int i=0;i<10;i++)
		{
			System.out.println((i+1)+". Hello Java");
		}
		
		for(int i=0;i<10;i++)
		{
			for(int j =0; j < 10;j++)
			{
				System.out.print("/");
			}
			System.out.println();
		}
		
		
	}
}
