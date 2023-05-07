package com.sist.main;

import java.io.OutputStream;

/*
		추상클래스(abstract)
		=> 메소드 관련 (구현이 안된 메소드)
		---------------------------- 상속을 통해, 구현이 안된 메소드 구현하기 (오버라이딩)
			일종의 설계도를 미리 작성해둔 뒤, 클래스(객체)에 적절한 기능(메소드)를 작성(구현)
		오버라이딩
			=> 상속을 받아서 기존의 기능을 변경해서 사용하는 기법(modify)
			조건)
				1| 상속 관계가 존재해야함.
					=> 추상클래스는 단독으로 사용 불가능 (미완성된 클래스(선언뿐)이기 때문에, 메모리 할당 불가능)
					=> 상속을 내린 후에 상속을 받은 클래스를 통해서 메모리 할당(구현)
						class A
						class B extends A
						A a=new B(); --> a는 B에서 구현한 메소드 사용 --> A는 추상클래스이므로 B에서 구현된 클래스를 사용해야함
						
				2| 메소드명 동일
				3| 리턴형 동일
				4| 매개변수 동일 (매개변수가 다른 경우 ==> 오버로딩) 
				5| 접근지정어의 확대는 가능 --> 축소는 오류 발생 
				   	private -> default -> protected -> public 
			
			목적) 여러 개의 클래스를 모아서 한 개의 이름으로 제어
				의존적 클래스 --> 독립적 클래스
			
			
				1| 요구사항 분석 => 여러 개의 사이트 참조하여 밴치마킹 
					ex) 로그인 -> 만개의 레시피 / 회원가입 -> 망고플레이트 / 예약 -> cgv / 결제 -> 옥션 ...
				
				2| 프로그램에 맞게 구현해서 사용
					ex) void buttonClick();
						-> 버튼 클릭 메소드 --> 로그인버튼으로 하고싶다면, 로그인 클래스를 만들어서 추상클래스의 메소드 버튼클릭을 상속 
								--> 로그인 클래스에서 구현 --> 버튼 클릭이라는 메소드 (기능)의 구현 내용은 필요에 따라 바뀔 수 있으므로 추상클래스를 사용
						
						void getConnection();	(연결메소드)
							-> 오라클 / MS-SQL / MySQL / MariaDB 등, 여러 데이터베이스 프로그램
							 	--> getConnection 메소드에서 구현하면, 다른 DB에 연결할 때마다 수정 필요
				
				3| 한 개의 객체로 여러 개를 제어하는 프로그램 작성
					
		
		추상클래스
		--------
			=> 공통적으로 사용하는 부분에서 코딩 내용을 다르게 만들 경우
			ex) 게시판 		: 목록출력 / 찾기 / 글쓰기 / 내용보기 / 수정하기 / 삭제하기
				댓글게시판		: 목록출력 / 찾기 / 글쓰기 / 내용보기 / 수정하기 / 삭제하기 / 답변하기
				후기게시판		: 목록출력 / 찾기 / 글쓰기 / 내용보기 / 수정하기 / 삭제하기 / 댓글
				후기게시판 	: 목록출력 / 찾기 / 글쓰기 / 내용보기 / 수정하기 / 삭제하기 / 업로드
				=> 공통으로 들어가는 부분을 추출
				
				abstract class Board
				{
					목록출력(); --> 목록출력하는 형식이 다르므로, 각자 구현
					찾기(){}   --> 모두 공통으로 사용하는 부분이므로, 추상클래스에서 구현
					글쓰기();	  
					내용보기();
					수정하기();
					삭제하기();
				}
			** 권장: 1개 이상의 추상메소드(구현이 안된 메소드)를 포함할 것
			
			abstract void find();	-> abstract를 붙이면, 추상 --> 구현이 필요함
			Board content();		-> 붙지 않았다면, 구현이 돼있는 메소드
			void write();
				
			추상클래스 특징) 
				1| 단일상속 -> extends 사용
				2| 메소드가 구현이 안된 것이 있으면 미완성 클래스 --> 메모리에 단독으로 저장할 수 없음
					ex) abstract class A{}
						-> A a=new A(); -> 불가능
				3| 상속을 내려서 구현된 클래스를 이용해서 메모리 할당
					ex) abstract class A {}
						class B extends A { A에서 구현 안된 메소드 구현하기}
						A a=new B(); -> 가능 (묵시적(자동) 형변환 적용됨)	<상위>  <하위>
						double d=10; -> 상속을 내린 쪽이 상위클래스이므로, 	A a = new B() B는 자동 형변환으로 인해 A형변환 
						A a=new B();		
						B b=(B) a; 	 -> 명시적 형변환		cf) 상속, 포함관계의 경우, 클래스 간의 크기 비교가 가능해짐 
															 상속: 상속 내린 클래스 > 상속 받은 클래스
															 포함: 포함한 클래스 > 포함된 클래스
																
															class A				
															class B extends A 	A>B (is a)
															class A
															{
																B b=new B();
															}
															clas B				A>B (has a)
				4| 목적: 한 개의 클래스로 여러 개의 클래스를 묶어서 관리하기 위해 
							(소스 수정의 최소화)
				
				5| 선언된 메소드가 있는 경우, 상속시 반드시 구현해야함 (강제성)
		
			<클래스 종류 및 사용>
★★★	1. 일반클래스 -> new 			
		2. 추상클래스 -> 구현 후 사용
★★★	3. 인터페이스 -> 구현 후 사용 					
		4. 종단클래스 -> 상속해서 확장 불가능 -> 있는 그대로 사용
		5. static 클래스 -> 클래스명으로 접근
		
*/

abstract class 도형
{
	// 무조건 구현해야함 
	public abstract void draw();
	// 디폴트값 --> 필요시에 오버라이딩
	public void color() {
		System.out.println("검정색");
	}
	
}
class 선 extends 도형
{

	@Override
	public void draw()
	{
		// TODO Auto-generated method stub
		System.out.println("선을 그린다");
	}
	
}
class 원 extends 도형
{

	@Override
	public void draw()
	{
		// TODO Auto-generated method stub
		System.out.println("원을 그린다");
	}
	
}
class 네모 extends 도형
{

	@Override
	public void draw()
	{
		// TODO Auto-generated method stub
		System.out.println("네모를 그린다");
	}
	
}
interface A
{
	
}
abstract class AA
{
	public abstract void aaa();
	public abstract void bbb();
	public abstract void ccc();
	public  void ddd() {}		//	--> abstract가 아닌 일반 메소드의 경우, 상속받은 클래스에서 구현하지 않아도 됨
	public abstract void eee();
	
}

class B extends AA // 추상 클래스에 구현되지 않은 선언 메소드만 존재할 경우 --> 상속받은 클래스는 구현되지 않은 메소드를 무조건! 구현해야함 {빈 공백이라도} 
{

	@Override
	public void aaa()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bbb()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ccc()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eee()
	{
		// TODO Auto-generated method stub
		
	}
	
}
public class _02_추상클래스
{
	public static void main(String[] args)
	{	// 오버라이딩
		도형 a=new 선();
		a.draw();
		a=new 원();
		a.draw();
		a=new 네모();
		a.draw();
		OutputStream out;
	}
}
