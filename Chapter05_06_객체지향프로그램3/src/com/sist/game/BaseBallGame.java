package com.sist.game;

import java.util.Arrays;
import java.util.Scanner;

/*
		1. 컴퓨터 난수 발생		=> int[] com						--> 메소드로 나누어 지역변수로 선언하면 매번 선언과 전달이 필요하므로
		2. 사용자 입력			=> int[] user								전역 변수로 설정 ( public class 내에 설정하기 )
		3. 비교				=> int[] com <-> int[] user => S / B		★★★ 반복되는 변수는 멤버변수로 잡아서 반복 입력되지 않게 하기
		4. 힌트				=> S / B
		5. 종료여부 확인		=> S 


*/


public class BaseBallGame
{
	int[] com = new int[3];
	int[] user = new int[3];
	int s,b;
	
	// 1. 컴퓨터 난수 발생
	void rand()
	{
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
	}
	
	// 2. 사용자 입력 		void
	void userInput()
	{
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.print("세 자리 정수 입력: ");
			int input=scan.nextInt();
			if(input<100 || input>999)
			{
				System.out.println("잘못된 입력입니다.");
				continue; 								// DOS에서만 사용
			}
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			if(user[0]==user[1]||user[1]==user[2]||user[2]==user[0])
			{
				System.out.println("같은 숫자는 사용할 수 없습니다");
				continue;
			}
			if(user[0]==0||user[1]==0||user[2]==0)
			{
				System.out.println("0은 사용할 수 없습니다");
				continue;
			}
			break;				// if문에 걸리는 문제없이, 정상 입력되면 빠져나가기
		}
	}
	// 3. 비교			void
	void compare()
	{
		s=0;
		b=0;
		for(int i=0;i<com.length;i++)
		{
			for(int j=0;j<user.length;j++)
			{
				if(com[i]==user[j])	// 같은 숫자가 있는지
				{
					if(i==j)		//	그게 같은 자리인지
						s++;
					else			// 다른 자리인지
						b++;
				}
			}
		}
	}
	// 4. 힌트			void
	void hint()
	{
		System.out.printf("InputNumber: %d%d%d,REsult:%dS-%dB\n",user[0],user[1],user[2],s,b);
	}													// int input은 userInput 메소드의 지역변수이므로, 다른 클래스에서 사용하기 위해서는 return을 해야함
														// userInput 메소드는 void이므로, 멤버변수로 잡아두었던 user[i]값을 가져와야함
	// 5. 종료여부 확인	void
	boolean isEnd(int s)
	{
		boolean bCheck=false;
		if(s==3)
		{
			bCheck=true;
		}
		return bCheck;
	}
	// 6. 조립		
	void process()
	{
		Scanner scan=new Scanner(System.in);
		rand();		// -> com[]의 배열을 난수로 채웠음
		while(true)
		{
			userInput();		// --> user[]의 배열을 입력해서 가져옴
			compare();			// --> 비교하기
			hint();				// --> 힌트주기
			if(isEnd(s))
			{
				System.out.println("게임을 다시할까요? y(Y)/n(N) :");
				char c=scan.next().charAt(0);
				if(c=='y'||c=='Y')
				{
					System.out.println("새 게임을 시작합니다!!");
					process();									// 재귀호출 --> 자신의 메소드가 자신의 메소드를 부를 때
				}
				else if(c=='n'||c=='N')
				{
					System.out.println("Game Over!!!");
					System.exit(0);								// System.exit(0); 대신에 break;를 줄 경우: 
				}												//			while문이 종료되어 무한반복이 아니기 때문에 종료
				else
				{
					System.out.println("잘못 입력하였습니다.");
					System.exit(0);
				}
				
//				System.out.println("Game Over!!!");
//				System.exit(0);								프로그램 끝내기
			}
		}
	}
	
	
	public static void main(String[] args)
	{
		BaseBallGame b=new BaseBallGame();
		b.process();
	}
}
