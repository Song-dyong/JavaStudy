/*
		숫자 야구 게임
		1. 난수 발생
		2. 사용자 입력
		----------------------
		3. 비교
		4. 힌트
		----------------------
		5. 종료여부
*/

import java.util.Arrays;
import java.util.Scanner;
public class _07_메소드조립_숫자야구
{
	static int[] userNum()
	{
		int []user=new int[3];
		Scanner scan=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("세 자리 정수 입력:");
			int input=scan.nextInt();
			if(input<100||input>999)
			{
				System.out.println("잘못된 입력입니다.");
				continue;										// 다시 조건식으로 이동	=> 처음부터 다시
			}
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			if(user[0]==user[1]||user[1]==user[2]||user[2]==user[0])
			{
				System.out.println("같은 숫자는 사용할 수 없습니다");
				continue;
			}
			if(user[0]==0 || user[1]==0||user[2]==0)
			{
				System.out.println("0은 입력할 수 없습니다.");
				continue;
			}
		}
	//	return user;
	}
	
	static String compare(int[] com, int[] user)
	{
		
		int s=0, b=0;					// s는 같은 자리의 수 / b는 다른 자리에 있는 동일한 수
		for(int i=0;i<3;i++)			// com
		{
			for(int j=0;j<3;j++)		// user
			{
				if(com[i]==user[j])		// 같은 수가 있는지
				{
					if(i==j)
						s++;			// 같은 자리
					else
						b++;			// 다른 자리 같은 수
				}
			}
		}
		// 힌트
		String result=s+"S"+b+"B";
		System.out.printf("input: %d, result: %ds-%dB\n",Arrays.toString(user),s,b);
		return result;
	}
	
	static void process()
	{
		Scanner scan=new Scanner(System.in);
		int[] user=userNum();
		

	}
	
	public static void main(String[] args)
	{
		
		process();
/*		int[] com=new int[3];
		int[] user=new int[3];
		
		for(int i=0;i<3;i++)
		{
			com[i]=(int)(Math.random()*10)+1;
			for(int j=0;j<i;j++)
			{
				if(com[i]==com[j])
				{
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(com));
		
		// 사용자 입력
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.println("세 자리 정수 입력:");
			int input=scan.nextInt();
			if(input<100||input>999)
			{
				System.out.println("잘못된 입력입니다.");
				continue;										// 다시 조건식으로 이동	=> 처음부터 다시
			}
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			if(user[0]==user[1]||user[1]==user[2]||user[2]==user[0])
			{
				System.out.println("같은 숫자는 사용할 수 없습니다");
				continue;
			}
			if(user[0]==0 || user[1]==0||user[2]==0)
			{
				System.out.println("0은 입력할 수 없습니다.");
				continue;
			}
			
			
	===========================================================================================
			
			
			int s=0, b=0;					// s는 같은 자리의 수 / b는 다른 자리에 있는 동일한 수
			for(int i=0;i<3;i++)			// com
			{
				for(int j=0;j<3;j++)		// user
				{
					if(com[i]==user[j])		// 같은 수가 있는지
					{
						if(i==j)
							s++;			// 같은 자리
						else
							b++;			// 다른 자리 같은 수
					}
				}
			}
			// 힌트
			System.out.printf("input: %d, result: %ds-%dB\n",input,s,b);
			
			
	============================================================================================	
	
		
			//종료 여부
			if(s==3)
			{
				System.out.println("Game Over!!");
				break;
			}
		}
*/
	}
}
