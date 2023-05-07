/*
		숫자 야구게임
		1. 컴퓨터 => 임의의 숫자 3개 발생 (1~9까지 중복없는 난수)
				3	6	9
		2. 사용자 숫자를 입력해서 컴퓨터 난수 맞추기
		
		3. 맞추지 못한 경우 힌트 제공
				 ex)	2	9	6 을 입력한 경우
						=> 0S-2B  (같은 위치 0개 / 같은 숫자 2개)
						3	7	8
						=> 1S-0B  (같은 위치 1개 / 같은 숫자 0개)
						3	9	8 
						=> 1S-1B  (같은 위치 1개 / 같은 숫자 1개)
						3	6	9
						=> 3S-0B  (같은 위치 3개 ==> 프로그램 종료)
*/

import java.util.Arrays;
import java.util.Scanner;
public class _04_배열응용_숫자야구게임 {
	public static void main(String[] args) {
	
		int [] com=new int[3];		// 난수 발생 ---> 저장 필요
		int [] user=new int[3];		// 입력
		// 중복 없는 난수
		for(int i=0;i<com.length;i++)
		{
			com[i]=(int)(Math.random()*9)+1;
			for(int j=0;j<i;j++)
			{
				if(com[i]==com[j])
				{
					i--;
					break;
				}
			}
		}
//		System.out.println(Arrays.toString(com));		==> 중간 확인
		
		// 사용자 입력
		Scanner s=new Scanner(System.in);
		while(true)
		{
			System.out.print("세자리 정수 입력:");
			int input=s.nextInt();
			if(input<100||input>1000)
			{
				System.out.println("다시 입력하세요");
				continue;								// ==> 처음부터 입력
			}			
		// 세 자리 정수 입력했다면?
			user[0]=input/100;							// 100의 자리 자르기
			user[1]=(input%100)/10;						// 10의 자리 자르기
			user[2]=input%10;							// 1의 자리 자르기
			
		// 조건 1. 같은 수 입력 X 
			if(user[0]==user[1]||user[1]==user[2]||user[2]==user[0])
			{
				System.out.println("중복된 수는 사용할 수 없습니다.");
				continue;
			}
			
		// 조건 2. 0이 숫자에 포함 X
			if(user[0]==0||user[1]==0||user[2]==0)
			{
				System.out.println("0은 사용할 수 없습니다.");
				continue;
			}
		// 힌트 제공 
			int st=0,b=0;
			for(int i=0;i<com.length;i++)
			{
				for(int j=0;j<user.length;j++)
				{
					if(com[i]==user[j])
						{
							if(i==j)
								st++;
							else
								b++;
						}
				}
			}
		//	System.out.printf("Input:%d,Result:%dS-%dB\n",input,st,b);
			
			System.out.println("===============");
			System.out.print("S: ");
			for(int i=0;i<st;i++)
			{
				System.out.print("●");
			}
			System.out.print("\nB:");
			for(int i=0;i<b;i++)
			{
				System.out.print("○");
			}
			System.out.println("\n===============");

		// 종료 시점 정하기: S가 3일 때
			if(st==3)
			{
				System.out.println("Game Over!!");
				break;
			}
		}
		
		
		
	}
}
