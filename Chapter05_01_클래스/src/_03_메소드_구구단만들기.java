/*
		메소드
			1) 구조화된 프로그램 (문장을 기능별로 나눠서 작업)									Static과 instance의 차이!
			2) 반복 제거 ==> spring(AOP) 						하나만 존재하여 저장(메모리 공간 하나 -> 공유): static / 여러 개 존재한다면 instance
			3) 한 개의 기능만 수행하도록 작성														단! 범위 설정에 따라 변동될 수 있음
		--------------------------------------------
			리턴형:	처리 후 결과값			=> 한 개만 
			매개변수: 사용자가 요청하는 값		=> 여러 개 가능
					(요청값이 3개 이상일 경우, 배열[] 혹은 class로 처리)
		
		형식)
		 	리턴형 메소드명 (매개변수...)
		(리턴할 데이터형)-> 한 개만 
but! 리턴값이 여러개 필요할 경우? 리턴할 데이터형 [] 배열 설정 or class 설정
		
			메소드명: 한 작업 파일안에 모든 메소드명이 달라야 함
					같은 메소드명이 있을 수 있음. (매개변수가 틀리면 됨)	==> 오버로딩
		
			매개변수: 갯수와 상관없음 (사용자의 요청값)
			
		메소드: 사용자의 요청값(매개변수)을 받아서 처리한 뒤, 결과값(리턴형)을 보내주거나 / 화면에 출력(결과값이 없는 상태, void) 
			  ------------------- 입력, 마우스 클릭, 버튼 클릭 등등...
			  
			  	ex) 정수 두 개를 보내고, 더한 값을 출력			==> 리턴형에서 받은 값을 아래의 소스에 사용할 경우, void는 사용해선 안됨.
			  			1. return a+b;	(결과값 출력)						리턴형을 갖는 메소드를 많이 사용해보는 편이 좋음
			  			2. System.out.println("a+b="+(a+b))	(void)
			  		
			  		단을 보내고 해당 단의 구구단을 출력
			  			=> 자체 출력이 편함
			  			
			  	main 메소드에서는 가급적이면 연결만 (변수선언 X)
				메소드 만들기 -> 메인에서 메소드 부르기
*/

// void 사용 (리턴값 x) / 구구단 출력 ( 단 입력받기 )
import java.util.Scanner;
public class _03_메소드_구구단만들기 {
	
//	public static void main() {
//		오버로딩
//	}
//	
//	public static void main(int a) {
//		오버로딩
//	}
//	
	static void gugudan(int dan)
	{
		for(int i=1;i<=9;i++)
		{
			System.out.printf("%d*%d=%d\n",dan,i,dan*i);
		}
		
	}
	static void process()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("단 입력:");
		int dan=scan.nextInt();
		
		gugudan(dan);
	}
	public static void main(String[] args) {
		process();
	}
}	
