/*
	&& ||

	(조건) && (조건)
	-----	 -----
	  |		   |
	  ----------
	  	  |
	  	 결과
	-------------------------		&& => 범위나 기간에 포함
	true true	=>	true			
	-------------------------		
	true false	=>	false
	-------------------------		
	false true	=>	false
	-------------------------
	false false	=>	false
	-------------------------

|| => 범위나 기간을 벗어난 경우
	-------------------------		
	true true	=>	true			
	-------------------------		
	true false	=>	true
	-------------------------		
	false true	=>	true
	-------------------------
	false false	=>	false
	-------------------------

	=> 효율적 연산 : 둘 중 하나만 true or false 이면, 나머지 하나를 계산할 필요가 없으므로 효율적
	 ( ) && ( ) 
	
	int a=10;
	int b=9;
	
	(a<b) && ++b ==a --> 앞의 연산이 이미 false 이므로, 뒤의 ++b는 연산되지 않기에 b는 10이 아닌 9.
	


*/
public class _07_논리연산자 {
	public static void main(String[] args) {
//		int a = 10;
//		int b = 9;
//		boolean bCheck = (a<b) && ++b ==a;
//		System.out.println(bCheck);			// false
//		System.out.println(b);				//   9
//		
//		bCheck = (a<b) || ++b ==a;
//		System.out.println(bCheck);			// true
//		System.out.println(b);				//  10
//		
//		int x = 100;
//		int y = 99;
//		boolean yCheck = (x>y) && (y==x);
//		System.out.println(yCheck);
//		
//		yCheck = (x>y) || (y==x);
//		System.out.println(yCheck);
//		
//		char c = (char)((Math.random()*26)+65);
//		boolean cCheck = c>='A' && c<='Z';				// 범위 사이에 있는지 확인 (기간 확인)
//		System.out.println("c="+c);
//		System.out.println(cCheck);
//		
//		boolean nCheck = c>='a' && c<='z';
//		System.out.println(nCheck);
		
//		char sex = 'M';
//		int score=87;									// 두 가지 경우가 다 맞는지 (로그인)
//		boolean bCheck = (sex=='M' && score >=80);		
//		System.out.println(bCheck);
		
//		int a = 10;
//		boolean bCheck = a%2==0 && a>2;
//		System.out.println(bCheck);
//		System.out.println(a);
		
		int year =2024;										// cf) 윤년 계산
		boolean bCheck = ((year%4==0 && year%100!=0)) || (year%400==0);
		System.out.println(bCheck);
		
		
		
		
		
		
		
		
	}
	
}
