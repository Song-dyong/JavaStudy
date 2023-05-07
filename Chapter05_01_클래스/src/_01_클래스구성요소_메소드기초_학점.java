import java.util.Scanner;

/*
	자바의 형식
	--------
		package	 	(클래스의 위치)
		import  	(외부 라이브러리 불러오기	=> 여러번 사용 가능)
		public class ClassName
		{
			----------------------------------------------
				멤버 변수
					= 인스턴스 변수		=> new를 사용할 때마다, 메모리가 따라서 생성됨
					= 정적 변수 (공유변수)	=> 메모리가 한 개만 생성
			----------------------------------------------
				생성자: 메모리 할당시, 호출되는 메소드
					=> 멤버변수에 대한 초기화
			----------------------------------------------
				메소드: 특정 작업 수행하는 명령문의 집합
			----------------------------------------------
				main(): 프로그램의 시작점
			----------------------------------------------	
		}
			===> OOP(Object Oriented Program)답게 변환 (객체 지향 프로그램)
				1) 데이터 보호 (캡슐화)
				2) 재사용 (상속 / 포함)
				3) 수정, 추가 (다형성)	=> 오버라이딩 / 오버로딩
			===> 클래스의 종료 (추상클래스 / 인터페이스)
			===> 예외처리
				================================================= 자바언어 기초
			
			===> 라이브러리: 사용자 정의 / 자바에서 지원 / 외부 업체에서 지원(Jsoup)
			
		
	메소드 기초
	---------
		메소드: 하나의 기능을 수행할 목적
			1. 메소드 목적
				1) 재사용 - 다른 클래스에서 사용하기 위해
				
				2) 반복 	- 중복된 코드 제거
						ex) 데이터베이스 연결					==> 오라클 연결과 닫기처럼 반복되는 문장에 메소드 사용
							------------------	목록					최대한 소스코드를 줄일 필요가 있음.
								오라클 연결							
								목록에 출력할 데이터읽기
								오라클 닫기
							------------------	데이터 추가
								오라클 연결
								데이터 추가
								오라클 닫기
							------------------	데이터 수정
								오라클 연결
								데이터 수정
								오라클 닫기
							------------------	데이터 삭제
								오라클 연결
								데이터 삭제
								오라클 닫기
				
				3) 구조화된 프로그램 생성 - 단락을 나눠서 처리 (에러 발생시 편리함)

			2. 메소드 형식
				선언부
					public static void main(String[] args)
				구현부
					{
						}
				
					형식) 
						int add(int a, int b)	=> 선언부 
						{
							int c= a+b;
							return c;			=> 구현부	
						}									선언부에서 int를 설정했으면, 구현부의 return값이 int여야 함
															 	(선언부에서 설정한 데이터형이 적어도 리턴보다는 커야함)
															 	
						void gugudan()			=> 결과값 없이 자체에서 출력
						{
							구구단 출력	
							return; 			=> 메소드는 return에서 종료	/ 단! void에서는 생략이 가능 
						}											(생략시, 컴파일러가 자동으로 return을 올려줌)
						
						변수의 비율(20%) / 메소드의 비율(80%)
						
						
						
			3. 메소드 구성요소
				결과값 메소드명 (매개변수)
				---- 1개		--------여러 개 가능
				
				=> 사용자의 요청값을 받아서 처리 결과값을 넘겨줌
				   ----------- 매개변수	  ----- 리턴형
				   		ex) 로그인: 사용자 요청값(id, pwd) / 결과값: 로그인 여부(boolean)
				   			=> boolean isLogin(String id, String pwd)
				   		
				   			사칙연산: 사용자 요청값(정수 2개, 연산자) / 결과값: 정수 2개의 연산값
				
				=>
				  리턴형			  매개변수
				------------------------
					O				O
				리턴형			메소드명(매개변수...)		ex) String substring(int s, in e) / concat
				------------------------
					O				X
				리턴형			메소드명()				ex) String trim() / double random()
				------------------------
					X				O
				void			메소드명(매개변수...)		ex) void main(String[] args) / System.out.println(String a)
				------------------------
					X				X
				void(받을 값x)	메소드명()				ex) void println() 
				------------------------
				*** 결과값(처리) => 리턴형
				리턴형: 기본형, 배열, 클래스
				메소드명
					1) 알파벳이나 한글 사용 가능 (알파벳 대소문자 구분)
					2) 숫자 사용가능 (맨 앞에 사용x)
					3) 특수문자 사용 가능 ( _  $만 가능)
					4) 키워드는 사용 불가능 (public, static, int 등등)
					5) 공백 불가능
					6) 암묵적 약속: 소문자로 시작 / 두 단어 연결시(카멜, _) / 
				
				매개변수: 사용자가 요청한 값 => 3개 이상 => 배열, 클래스를 활용
						ex) 게시판 글쓰기, 수정, 회원가입
				  			
			4. 메소드 사용법
				=프로그램
					1) 재사용
					2) 가독성: 단락 나누기 (유지보수)
					3) 반복제거: 소스 양 줄이기
				
				=모든 프로그램: 메소드 재작
					1) 사용자 입력
					2) 사용자 요청 처리: 세분화
					3) 결과값 출력
			
			
		
			메소드 호출
			---------
			리턴형이 있는 경우			=> 데이터형 변수명 = 메소드명()
				int add(int a, int b)
				{
					return a+b;
				}
				
				int c = add(10,20);
				
				boolean(String id, String pwd)
				{
					return true;
				}
				
				boolean bCheck=isLogin("admin","1234")
					==> 메소드의 데이터형과 메인 내의 메소드 사용 데이터형은 항상 일치해야 함
				
			리턴형이 없는 경우 (void)	=> 메소드명()
				void dan()
				{
					=>구구단 출력
				}
				
				호출시?
				dan();	=> 매개변수가 있는지 확인 必
				
					==> 메소드를 호출하면, 메소드 전체를 수행한 뒤 호출된 위치로 복귀
						ex) 
							main()
							{
								1,2,3, dan(),4,5,6
							}							==> 1,2,3,dan,7,8,9,10,11,4,5,6 순서로 출력
							void dan()
							{
								7,8,9,10,11
							}
				***	return은 항상 마지막에 있음
				*	중간에 있는 경우, 그 부분에서 종료
	
		
		
	3개의 정수를 받아서 / 총점, 평균, 학점 구하기 
		메소드: 정수 입력 / 총점 / 평균 / 학점 ==> 4개의 메소드 필요

*/

public class _01_클래스구성요소_메소드기초_학점 {
/*	
		메소드
			1) 인스턴스 메소드	-	객체 생성시마다 따로 저장
					class A
					{
						void display(){}
					}
					A a=new A()	=> display()
					A b=new A()	=> display()
					A c=new C()	=> display()
			2) 정적 메소드		-	한 개의 공간에만 저장 (JVM에 의해 메모리에 자동 저장)
				static
			3) 추상 메소드		-	선언만 하는 메소드 (추상클래스 / 인터페이스)
				abstract
			4) 종단 메소드		-	수정이 불가능한 메소드
				final
*/
	
	static int input(String subject) 
	{
		Scanner scan=new Scanner(System.in);

		System.out.print(subject+ " 입력: ");
		int value=scan.nextInt();
		return value;
	}
	
	static int total_op(int kor, int eng, int math, int his, int phy)
	{
		return kor+eng+math+his+phy;
	}
	
	static double avg_op(int total)
	{
		return total/5.0;
	}
	
	static char score_op(double avg)
	{
		char score='A';
		switch((int)(avg/10))
		{
			case 10:
			case 9:
				score='A';
				break;
			case 8:
				score='B';
				break;
			case 7:
				score='C';
				break;
			case 6:
				score='D';
				break;
			default:
				score='F';
		}
		return score;
	}
	
	
	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//
//		// 5번 반복 --> 메소드화
//		System.out.print("국어 입력: ");
//		int kor=scan.nextInt();
//		
//		System.out.print("영어 입력: ");
//		int eng=scan.nextInt();
//		
//		System.out.print("수학 입력: ");
//		int math=scan.nextInt();
//		
//		System.out.print("국사 입력: ");
//		int his=scan.nextInt();
//		
//		System.out.print("물리 입력: ");
//		int phy=scan.nextInt();
		
		int kor=input("국어");
		int eng=input("영어");
		int math=input("수학");
		int his=input("국사");
		int phy=input("물리");
		
		System.out.println("국어: "+kor);
		System.out.println("영어: "+eng);
		System.out.println("수학: "+math);
		System.out.println("국사: "+his);
		System.out.println("물리: "+phy);
		
		// 총점 계산
//		int total=kor+eng+math+his+phy;
		int total=total_op(kor, eng, math, his, phy);
		// 여러 개의 매개변수가 나온다면, 배열[]을 통해 처리하는게 용이함
		System.out.println("총점: "+total);

//		double avg= total/5.0;
		double avg=avg_op(total);
		System.out.printf("평균:%.2f\n ",avg);
		
//		char score='A';
//		switch((int)(avg/10))
//		{
//			case 10:
//			case 9:
//				score='A';
//				break;
//			case 8:
//				score='B';
//				break;
//			case 7:
//				score='C';
//				break;
//			case 6:
//				score='D';
//				break;
//			default:
//				score='F';
//		}
		char score=score_op(avg);
		System.out.println("학점: "+score);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
