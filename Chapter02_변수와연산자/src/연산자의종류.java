/*
		피연산자 / 연산자
		------ 연산대상
		
		피연산자 1개 : 단항연산자
		a++ 
		피연산자 2개 : 이항연산자
		10 + 20
		피연산자 3개 : 삼항연산자

		1. 단항연산자
			1) 증감연산자 : ++, -- ( 1 증가 or 감소 ) => 반복문 多
							ex) int a = 10; a++; --> 11
								int b = 10; b--; --> 9

			2) 부정연산자 : boolean (true / false)
						boolean b = true;
						!b;  --> false     => 턴 / 예약 가능한 날
			
			3) 형변환연산자 : (데이터형) --> 변환해서 계산
						(int)10.5 => 소수점 제거 10 (double -> int)
						(char)65 => 'A'			 (int -> char)
						============== downcasting : 강제형변환
						(double)10 => 10.0 (int -> double)
						(int)'A' => 65	   (char -> int)
						============== upcasting : 자동형변환

			10.5 + 10 = 20.5 ==> 데이터형이 동일할 때 연산이 가능 ( 자동 형변환 )
				  ----										--> 큰 데이터형으로 바뀜
				  10.0
			
			'A' + 10 = 
			
			int + double =>double
			char + long => long
			int + long => long
			long + double => double
			
			byte + char => int
				int 이하의 데이터형은 연산시 결과값이 int
				------byte / short / char
		
			4) 반전연산자 (양수 -> 음수) : 음수표현 ~ 


		@증감연산자
			++ : 1개 증가
			-- : 1개 감소
			
			형식
			 = 전치연산자 : 먼저 증가 / 감소
				++a
			 = 후치연산자 : 나중에 증가 / 감소
			 	a++
			 
			 int a = 10;
			 int b = ++a;
			 	  -- --
			 	      1
			 	   2 ==========> a = 11, b = 11    
			 
			 int a = 10;
			 int b = a++;
			 	  --  --
			 	  1
			 	      2 ==> b = 10, a = 11
			 
			 int a = 10;
			 int b = a++ + a++; --> b = 21
			 		 10     11 					// 첫 번째 a는 증가되지 않은 10, 뒤의 a는 앞의 증가를 받은 11
			 
			 int a = 10;
			 int b = ++a + ++a; --> 23
			 
			 
			 
			 
			 
			 
		@부정연산자 (!) --> true / false
			!true => false
			!false => true

		@형변환연산자
		
		10.5 + 10.5 => 21.0
		(int)10.5 + (int)10.5 => 20
		---------	---------
		   10 			10
		
		(int)(10.5+10.5) => 21
			  ----------
			   	  21
		
		double d =10; ==> 10.0 자동 형변환         65 97 48 육오 구칠 사팔
		int a='A'; 	  ==> 65 (아스키코드)
		int a = 10.5; --> error
		
		==> int 이하 데이터형은 연산시 int (byte, short, char)
		==> char는 연산이 되면 정수로 변경된다. (아스키코드 기준)
		
		2. 이항연산자
		
			1) 산술연산자 : +, -, *, /, %
			 	+, -, * : 데이터형
			 	
			 	+ : 산술연산, 문자열 결합
			 	
			 	/ : 정수 / 정수 => 정수 ==> (10/3 = 3)
			 		정수 / 실수 => 실수 ==> (10/3.0 = 3.33...)
			 		0으로 나누면 오류 발생
			 	
			 	% : 나머지 값 
			 		10%2 ==> 0
			 		11%2 ==> 1
					5%2  ==> 1
					-5%2 ==> -1
					5%-2 ==> 1 
					-5%-2 ==> -1
					------------- 부호는 왼쪽을 따라감
				
				+의 용도: 문자열 결합
					ex) "7" + 77 ==> "777"  String의 데이터가 가장 상위
					  	7 + "7" + 7 ==> "777"
					  	7 + 7 + "7" ==> "147"
					  	7 + "7" + 7 + 7 ==> "7777"
					  	7 + "7" +(7 + 7) ==> "7714"
		
		
		cf) char a = 'A'; char op = '+';
		System.out.println(a+""+op);        ""가 빠질 경우, a와 op의 'A'와 '+'가 int로 바뀌어 정수가 나오게 됨
											따라서, 중간에 문자열을 추가해 출력값이 문자열이 되도록 바꿔야 함.
		
		
		
		
*/

public class 연산자의종류 {
	public static void main(String[] args) {
//							증감연산자 연습 
//		byte b = 10;
//		char c = 'A';
//		int a = b+c;
//		byte b=10;
//		byte c = 20;
//		int d = b+c; // or byte d = (byte) (b+c);
//		System.out.println(d);
//		System.out.println(~10); // -11
		
//		int a = 10;
//		int b = ++a;
//		System.out.println("a = "+a);
//		System.out.println("b = "+b);
//		
//		int a = 10;
//		int b = a++;						//a=11, b=10
//		System.out.println("a = "+a); 
//		System.out.println("b = "+b);
		
//		int a = 10;
//		int b = a++ + a++;
//		System.out.println(b); // 21
		
//		int a = 10;
//		int b = ++a + ++a;
//		System.out.println(b); // 23
		
//		int a = 10;
//		int b = ++a + a++;
//		System.out.println(b); // 22
		
//		int a = 10;
//		int b = a++ + ++a;
//		System.out.println(b); // 22
		
//		int a = 10;
//		int b = a++ + a++ + ++a + a++; // 10 11 13 13
//		System.out.println(b); // 47
		
//		int a = 10;
//		int b = a++ + a++ + a++ + a++; // 10 11 12 13
//		System.out.println(b); // 46
		
//		int a = 10;
//		int b = ++a + ++a + ++a + ++a; // 11 12 13 14
//		System.out.println(b); // 50
		
//		int a = 10;
//		int b = a-- + a-- + --a; // 10 9 7
//		System.out.println(b); // 26
		
		// 부정연산자 연습
//		boolean bCheck = false;
//		System.out.println(bCheck);
//		System.out.println(!bCheck);
		
		
		// 형변환연산자 연습
		
//		int a =(int)(Math.random()*100)+1;  // 1~100 사이의 랜덤한 숫자를 추출할 때 사용
//					=====================
//							0.0~0.99
//		System.out.println(a); 
		
		// 산술연산자 연습
		
		System.out.println(10/3);	// 3
		System.out.println(10/3.0);	// 3.3333333333333335
		System.out.println(10/(double)3); // 3.3333333333333335
		
		
		
		
		
		
		
		
		
		
	}
}
