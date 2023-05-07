/*
			up & down 게임 만들기
	-> 컴퓨터가 1~100 사이의 난수를 발생 
	-> 사용자 입력
	-> 입력시에 up, down으로 힌트 제공
	-> for문의 횟수?  =  무한 루프
						for(;;) --> 조건 / 범위 / 증가식도 없는 문장

*/

import java.util.Scanner;
public class _06_반복문6_업다운게임만들기 {
	public static void main(String[] args) {
		
		int com=(int)(Math.random()*100)+1;
		int count = 0;
		Scanner scan= new Scanner(System.in);
		for(;;)	// 무한루프는 끝나는 지점을 반드시 지정해야 함 ==> 보통 while문에서 많이 사용됨
		{
			System.out.print("1~100 사이의 정수를 입력: ");
			int user=scan.nextInt();
			if(user>=1 && user<=100)
			// 힌트 제공
			{
				count++;
				if(com>user)
				{
					System.out.println("up");
				}
				else if(com<user)
				{
					System.out.println("down");
				}
				else if(com==user)
				{
					System.out.println("Correct");
					System.out.println("입력 횟수: "+count);
					System.out.println((1000-(50*count)+"점"));
					System.exit(0);
				}
			}
				else
				{
					System.out.println("잘못된 입력");
				}
			
				
		}
		
		
	}
}
