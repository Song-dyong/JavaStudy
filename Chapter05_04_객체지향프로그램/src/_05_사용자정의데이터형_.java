/*
		


*/

import java.util.Scanner;
class Sawon
{
	/////////////////////////////////////////////////////////	인스턴스 변수 (클래스가 메모리에 저장)
	int sabun;
	String name;
	String dept;	// 부서
	String job;		// 직위
	String loc;		// 근무지
	long pay;		// 연봉 -> 21억 이상일 경우 고려
	/////////////////////////////////////////////////////////
	static String company; 	// 회사명
	/////// 메모리 공간이 1개만 설정 -> 컴파일러에 의해 자동으로 생성	-> new 없이 생성 가능
}
public class _05_사용자정의데이터형_
{
	
	public static void main(String[] args)
	{
		Sawon.company="113";		// ==> new없이 생성 가능!
		// 클래스변수명.변수명 ==> hong.company
		// 클래스명.변수명	  ==> Sawon.company	
		// 			공유변수, 클래스변수 (클래스명으로 접근)
		// 일반변수 (인스턴스변수) => 인스턴스명.변수명
		Sawon hong=new Sawon();
		hong.sabun=1;
		hong.name="홍길동";
		hong.dept="개발부";
		hong.job="대리";
		hong.loc="서울";
		hong.pay=4500;
//		hong.company="ABC";
		Sawon shim= new Sawon();
		shim.sabun=2;
		shim.name="심청이";
		shim.dept="개발부";
		shim.job="사원";
		shim.loc="서울";
		shim.pay=3300;
//		shim.company="ABC";

		Sawon park=new Sawon();
		park.sabun=3;
		park.name="박문수";
		park.dept="개발부";
		park.job="과장";
		park.loc="서울";
		park.pay=6200;
//		park.company="ABC";
		
//		hong.company="BCD";		// static -> 저장공간이 하나이므로, 하나가 바뀌면 전체 바뀜
//		shim.company="CDE";
//		park.company="DEF";
		
		System.out.println("회사명: "+hong.company);
		System.out.println("회사명: "+shim.company);
		System.out.println("회사명: "+park.company);
		
		hong.loc="부산";								// 저장공간이 다르므로, 변화 x
		System.out.println("근무지: "+hong.loc);
		System.out.println("근무지: "+shim.loc);
		System.out.println("근무지: "+park.loc);
	}
}
