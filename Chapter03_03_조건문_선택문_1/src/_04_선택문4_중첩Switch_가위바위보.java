/* 
	if문 중첩
	if()
	{
		if()
		{
		}
	}
	
	중첩 switch		==> 특별한 경우가 아니면 거의 사용되지 않음
				
		switch()
		{
			case 값:
				switch()
				{
				
				}
		}
	
*/

// 가위 바위 보
/*
	가위 			바위 			보
	  가위				가위				가위
	  바위				바위				바위
	  보					보				보
		
*/

import java.util.Scanner;

public class _04_선택문4_중첩Switch_가위바위보 {
	public static void main(String[] args) {
		// 순서 : 컴퓨터가 먼저 가위바위보를 설정 --> 사용자의 입력 --> 승패 확인(비교)후 결과값 출력
									// 변수 설정 -> 변수에 대한 처리 -> 결과값 출력 [프로그래밍]
		Scanner scan = new Scanner(System.in);
		int com = (int)(Math.random()*3);
		
		System.out.println("가위(0), 바위(1), 보(2) 입력:");
		int user = scan.nextInt();
		
/*		
		cf) 배열을 통해 아래의 코드를 많이 줄일 수 있음
		String [] result = {"가위", "바위", "보"}
		System.out.println ("컴퓨터: " + result[com]);	
		System.out.println ("플레이어: " + result[user]);	
*/		
	
		
		switch (com)
		{	
		case 0:
			System.out.println("컴퓨터: 가위");
			break;
			// break 밑에 소스 코딩이 있는 경우, 오류 발생
		case 1:
			System.out.println("컴퓨터: 바위");
			break;
		case 2:
			System.out.println("컴퓨터: 보");
		}
		switch (user)
		{	
		case 0:
			System.out.println("플레이어: 가위");
			break;
			// break 밑에 소스 코딩이 있는 경우, 오류 발생
		case 1:
			System.out.println("플레이어: 바위");
			break;
		case 2:
			System.out.println("플레이어: 보");
		}
		
		// 비교(처리) => 결과값을 출력
		switch(com)
		{
		case 0: 					// 컴퓨터가 가위를 냈을 때, 처리하는 부분
			switch(user)
			{
			case 0:					
				System.out.println("비김");
				break;
			case 1:
				System.out.println("이김");
				break;
			case 2:
				System.out.println("짐");	
				break;
			}
			break;
		case 1: 					// 컴퓨터가 가위를 냈을 때, 처리하는 부분
			switch(user)
			{
			case 0:					
				System.out.println("짐");
				break;
			case 1:
				System.out.println("비김");
				break;
			case 2:
				System.out.println("이김");	
				break;
			}
			break;
		case 2: 
			switch(user)
			{
			case 0:					
				System.out.println("이김");
				break;
			case 1:
				System.out.println("짐");
				break;
			case 2:
				System.out.println("비김");	
				break;
			}
			break;
		}
		
		// 변수 설정
		
		
		
		
	}
}
