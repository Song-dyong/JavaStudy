/*
		달력 만들기
*/


import java.util.Scanner;
public class _11_배열응용_달력만들기 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("연도 입력: ");
		int year= scan.nextInt();
		
		System.out.print("월 입력: ");
		int month= scan.nextInt();
		
		System.out.println(year+"년 "+month+"월");
		System.out.println("\n");
		char[] strWeek= {'일','월','화','수','목','금','토'};
		for(char c:strWeek)
		{
			System.out.print(c+"\t");
		}
		System.out.println();
		// 1. 1년 1월 1일 ~ 전년도 (2022년 12월 31일) => 총 날 수
		int total = (year-1)*365
						+(year-1)/4
						-(year-1)/100
						+(year-1)/400;
		// 2. 전 달까지의 합 (2023년 3월 31일)
		int[] lastDay= {31,28,31,30,31,30,		// --> 각 달의 마지막 날짜
						31,31,30,31,30,31};
		if(((year%4==0)&&(year%100!=0))||(year%400)==0)
			lastDay[1]=29;
		else
			lastDay[1]=28;
		
		for(int i=0;i<month-1;i++)
		{
			total+=lastDay[i];
		}
		
		
		// 3. +1 ==> 4월 1일의 요일
		total++;
		
		// 4. 요일 구하기
		int week= total%7;
		
		// 5. 달력 출력
		for(int i=1;i<=lastDay[month-1];i++)
		{
			if(i==1)
			{
				for(int j=0;j<week;j++)
				{
					System.out.print("\t");				// 시작하는 요일부터 출력하기 위해
				}
			}
			System.out.printf("%2d\t",i);
			week++;
			if(week>6)									// 요일이 토요일이 되면, 일요일로 리셋
			{
				System.out.println();
				System.out.println();
				week=0;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
