// 연도, 월, 일 --> 요일 출력 프로그램		library에 calendar 있음

import java.util.Scanner;
public class _03_배열_오늘무슨요일 {
	public static void main(String[] args) {
		
		//연도, 월, 일 입력받기
		Scanner s=new Scanner(System.in);
		System.out.print("연도 입력: ");
		int year= s.nextInt();
		System.out.println("월 입력: ");
		int month= s.nextInt();
		System.out.println("일 입력: ");
		int day= s.nextInt();
		
		// 요일 만들기
		char[] strWeek= {'일','월','화','수','목','금','토'};
		// 각 달의 마지막 날
		int[] lastday= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		// 윤년 조건 만들어주기
		if((year%4==0 && year%100!=0)||(year%400==0))
		{
			lastday[1]=29;
		}
		else
		{
			lastday[1]=28;
		}
		// 1. 1년도 1월 1일~ 전년도까지의 총 날 수
		int total=	(year-1)*365 
					+(year-1)/4
					-(year-1)/100
					+(year-1)/400;
		// 2. 전달까지의 합
		for(int i=0;i<month-1;i++)
		{
			total+=lastday[i];
		}
		total+=day;
		// 3. 요일 구하기
		int week=total%7;
		
		System.out.printf("%d년도 %d월 %d일은 %c요일입니다.",year,month,day,strWeek[week]);
		
		
		
	}
}
