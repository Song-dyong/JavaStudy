import java.util.Arrays;
import java.util.Scanner;

/*
		클래스 구성요소
		--------------------------------------------------------
			변수: 프로그램 종료시까지 유지하는 변수 (전역변수, 멤버변수)
				 메소드 안에서 사용되는 변수 (지역변수)
				 기본형 / 참조형
				 ----
				 정수: int / long
				 실수: double
				 논리: boolean
				 참조형: 데이터가 여러개	(메모리 주소를 이용해서 연결)
				 		배열(1차원) - 같은 크기의 데이터형
				 		클래스	  - 다른 크기의 데이터형 ★★★★★★
		--------------------------------------------------------
			생성자: 변수에 초기화, 클래스를 메모리에 저장시에 사용
		--------------------------------------------------------
			메소드: 기능을 수행, 다른 클래스와 연결 (메세지)	★★★
				  ---------- 연산자 / 제어문 (명령문) 
							 => 명령문의 집합
							  1) 다른 클래스와 통신
							  2) 재사용 목적 (기능을 최소화 -> 한 개의 기능만 수행)
							  
		--------------------------------------------------------
		1. 메소드 형식
			[접근지정어] [옵션]		리턴형	메소드명	(매개변수)
			 public	  static
			 private  final
			 		  abstract
		2. 메소드 종류
			리턴형		매개변수
			------------------
			 O			 O
			 => String
			 String substring(int s)
			 String replace(String s1, String s2)
			------------------
			 O			 X
			 => String trim()
			 	double random()
			------------------
			 X			 O
			 => void println(String s)
			 	void main(String[] args)
			------------------
  			 X			 X
  			 => void println()
			------------------
		
		3. 메소드 구성요소
			= 리턴형 (처리 결과값)		=> 화면 출력 (데이터)
										여러개인 경우: 배열 / 클래스
											ex) 검색, 상세보기...
										한 개인 경우: 기본형
											ex) 최대값, 최소값...
			
			= 매개변수 (사용자 요청값): 3개 이상이면, 배열 혹은 클래스 사용
									1개면, 기본형
			
			= 메소드명 
				-알파벳 시작 (대소문자 구분)
				-숫자 사용가능 (제일 앞 x)
				-특수문자 _ $ 가능 ( _ : 임시 메소드 / 단어 구분)
				-키워드(public, int ..) 사용금지
				-소문자로 시작
				-같은 이름의 메소드 사용 가능(오버로딩) cf) 변수는 같은 이름 x
					ex) plus(int, int)
						plus(double, double)
						plus(double,int)
						.
						.
				cf) 매개변수의 갯수를 알지 못하는 경우?
					장바구니 기능의 경우, 매개변수를 알 수 없음
					=> 가변 매개변수 사용
					(int...arg) -> ...


*/
// 		void println()
//		System.out.println();		// println에 마우스 갖다대면, println의 원형 void 확인 가능
//		System.out.printf("%d\n",10);
//		System.out.printf("%d %d\n",10,20);
//		System.out.printf("%d %d %d\n",10,20,30);
//		System.out.printf("%d %d %d %d\n",10,20,30,40);
//		System.out.printf("%d %d %d %d %d %d %d\n",10,20,30,40,50,60,70);	// 매개변수를 원하는만큼 설정 가능 => printf에 마우스 대보면 ...


// 사용자가 원하는 갯수만큼 난수 발생(1~100)
//	사용자 갯수 입력(매개변수), 리턴형 -> 배열 (발생한 난수 한번에 넘겨주기) / 
public class _01_메소드_메소드이론_난수발생 {
	static int[] rand(int count)
	{
		int[] arr=new int[count];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		return arr;									// int 배열의 리턴형이면 return에 배열명 입력
	}
	public static void main(String[] args) {
													// 하나의 클래스 내에서 count라는 변수가 사용되는 중 => rand 메소드에서 사용된 count와 메인 영역에서 사용되는
													// count는 같은 변수인가?
		Scanner scan=new Scanner(System.in);
		System.out.println("갯수 입력: ");
		int count=scan.nextInt();
		int []arr=rand(count);						// 메소드 호출: 메소드명(매개변수 값)	=> 소속된 클래스 내에서 사용할 때 (클래스명이 생략된 것)
													// 다른 클래스에서 호출: 클래스명.메소드명(매개변수값)
		System.out.println(Arrays.toString(arr));
		
		for(int a:arr)
		{
			System.out.print(a+"\t");
		}
		
		
		
	}
}
