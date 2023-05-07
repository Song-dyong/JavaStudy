
public class MainClass2_진법계산 {
	public static void main(String[] args) {
		// 프로그램의 시작점 / 끝점
		/*
			정수
			---
			2진법 		(0b)
			8진법		 (0)
			16진법		(0x)
		
			29의 2진법
			64 32 16 8 4 2 0(1) 
			       1 1 1 0 1  ==> 11101 
			76의 2진법         ==> 1001100
			
			
			       
		*/
		
		System.out.println(0b11101);
		System.out.println(0b1001100);
		System.out.println(Integer.toBinaryString(29)); // 2진법 바꾸는 문장 Integer.toBinaryString()  0b
		System.out.println(Integer.toOctalString(29)); // 8진법              						0
		System.out.println(Integer.toHexString(29)); // 16진법										0x
		
		/*
		    11101
		      ---
		   --- 5
		    3          --> 035   (2진법 -> 8진법)
		    11101
		     ----
		   -- 13  => 10-a, 11-b, 12-c, 13-d, 14-e, 15-f
		    1             ==> 1d  (2진법 -> 16진법)
		
		
		*/	
		
		System.out.println("c:\\dev");    // 특수문자 \\
		System.out.print("Hello\n");      //        \n
		System.out.println("Hello");
		System.out.printf("%d+%d=%d", 10,20,30); // --> printf : 일정한 형식으로 출력
		System.out.println();
		// 10 + 20 = 30
		System.out.println(10 + "+" + 20 + "=" +30);
		
		
		
		
	}
}
