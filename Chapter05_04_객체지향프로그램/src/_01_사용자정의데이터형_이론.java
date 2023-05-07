/*
		클래스: 데이터 저장 -> 데이터 가공 -> 데이터 출력
				변수		  연산자, 제어문	모바일 / 웹 등등
			(배열 / 클래스)   (메소드)	
		
		
		class Card
		{
			int numger
			String 무늬
			static int width
			static int height
		}
			==> 스태틱도 하나의 변수로 데이터 ==> 클래스에는 여러 개의 데이터 저장되어 있음
			
			Card c1=new Card()
			Card c2=new Card()
			Card c3=new Card()	==> new는 새로운 데이터 공간을 생성 + 그 데이터 공간 안에 변수 데이터가 쌓인 형태
									c1에는 주소값이 저장되며, 생성된 데이터 공간(class)를 제어할 수 있음
										ex) c1.number ==>  . 주소 접근 연산자
									
									static은 별도로 저장 (공유 변수) + c1, c2, c3가 동시에 제어함 (static내의 변수가 바뀌면, 전체가 바뀜)
			
		1) 변수의 종류
		   ---------
		   클래스 영역에 선언하는 변수 (멤버변수) ==== heap
		   	= 인스턴스 변수: new를 사용할 때 저장되는 변수 (new 설정에 따라 따로 저장)
		   		=클래스객체명.변수명
		   		Card c1=new Card()
		   			--- 
		   			
		   			Card c1=newCard
		   			
		   	메소드 영역에 선언하는 변수 (지역변수) ==== stack
		   	 	--------------메소드가 종료되면 사라지는 변수
		   	 	1) 메소드 영역에 선언되는 변수
		   	 		void aaa()
		   	 		{
		   	 			int a=10;
		   	 		}
		   	 	2) 매개변수
		   	 	void aaa(int a)
		   	 	{
		   	 	
		   	 	}
	
	
		자바 메모리 구조
		---------------------------------------
		1. Method Area => method, static 저장
		---------------------------------------
		2. Stack: 메모리 자체에서 관리 (생성 / 소멸)
			=> 블럭변수 (매개변수, 지역변수)
			=> 변수 초기화가 안됨 (반드시 초기화 후 사용)
		---------------------------------------> method, stack은 메모리에서 자동으로 저장
		3. Heap: 프로그래머 영역 
				(직접 메모리 크기를 만들어서 저장)
			=> 자동 소멸이 안됨 -> GC (System.gc())	
		---------------------------------------
			heap, method area -> 변수 저장시에 자동 초기화됨
				ex) class ClassName {
						int a;		=> 0
						double d;	=> 0.0
						boolean b;	=> false
						char c;		=> '\u00000'
						long l;		=> 0L
						String s;	=> null			null은 참조 타입에서 발생 (주소값이 없음) ->  " " 자체가 주소
					}
						ex) String s;	-> null
							int[] arr;	-> null 
	

				변수유형		선언위치				메모리저장			사용범위
			--------------------------------------------------------------------		cf) 바꿨을 때, 전체가 바뀌면 static (1개만 존재)
			  인스턴스변수		클래스블럭			new: 새로운 저장공간	클래스 전체					여러 개가 존재하면 인스턴스(개별 변동)
		  				class ClassName	 	heap메모리에 저장
		  				{
		  					int a;	
		  				}
			--------------------------------------------------------------------
				정적변수		클래스블럭			컴파일시에 자동 저장
						class ClassName
						{
							static int a;
						-> 많이 사용되지는 않음.
							
						}
			--------------------------------------------------------------------
				지역변수	class ClassName								메소드 안에서만 
						{											  사용 가능
							void display()	 메소드 호출시마다 생성
							{				메소드가 끝나면 자동 소멸
								int a=10;
							}
						}
						반드시 초기화
			--------------------------------------------------------------------

			1) 메모리 저장
				메모리에 저장된 상태: 인스턴스 (객체)
				설계 (어떤 데이터를 저장할지)	==> 메모리에 저장				============>	활용		=====================> 소멸 (메모리 해제)
											ClassName (변수명) = new ClassName();		c.변수명						c=null; 주소값 없애면서 초기화
				class ClassName										----------		c.메소드명()						gc()
				{													   생성자				ex) String s=" ";
					String s;																s.substring()
					int a;																	s.trim()
				}																		Scanner scan=new Scanner(System.in);
																						scan.nextInt()
																						
																						
																						
																						
																						
*/
class Student
{
	String name;
	int kor;
	int eng;
	int math;
	
}
public class _01_사용자정의데이터형_이론
{
	public static void main(String[] args)
	{
		Student s1=new Student();
	//	int		a =		10		;	=> 같은 형식 데이텨형(클래스명) 변수명(클래스변수명) = 
		System.out.println("s1="+s1);
		s1.name="홍길동";
		s1.kor=90;
		s1.eng=80;
		s1.math=78;
		// s1 = name, kor, eng, math가 저장됨
		Student s2=new Student();
		System.out.println("s2="+s2);
		s2.name="심청이";
		s2.kor=98;
		s2.eng=87;
		s2.math=73;
		// s2 = name, kor, eng, math가 저장됨
		Student s3=new Student();
		System.out.println("s3="+s3);			// 메모리 주소가 다름 -> new를 통해 새로운 주소를 만들었기 때문
		s3.name="강감찬";
		s3.kor=99;
		s3.eng=89;
		s3.math=98;
		
		
		
		// s3 = name, kor, eng, math가 저장됨
		
		System.out.println(s1.name+" "+s1.kor+" "+s1.eng+" "+s1.math);
		System.out.println(s2.name+" "+s2.kor+" "+s2.eng+" "+s2.math);
		System.out.println(s3.name+" "+s3.kor+" "+s3.eng+" "+s3.math);
		
	}
}
