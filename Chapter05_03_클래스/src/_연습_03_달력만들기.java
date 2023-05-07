import java.util.Scanner;

public class _연습_03_달력만들기
{
	static int input(String msg)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println(msg+" 입력:");
		return scan.nextInt();					// 입력값 리턴하기
	}
	
	static int getWeek(int year, int month)
	{
		int total=(year-1)*365
				+(year-1)/4
				-(year-1)/100
				+(year-1)/400;
//		String[] strWeek= {"일","월","화","수","목","금","토"};
		
		int[] lastDay={
							31,28,30,31,30,31,
							31,31,30,31,30,31		};
			
		if((year%4==0&&year%100!=0)||year%400==0)
		{
			lastDay[1]=29;
		}
		else
			lastDay[1]=28;
		
		for(int i=0;i<month-1;i++)
		{
			total+=lastDay[i];
		}
		total++;
		
		int week=total%7;
		return week;			// 요일 리턴하기
		
	}
	
	static void print(int month, int week)
	{
		int[] lastDay={
				31,28,30,31,30,31,
				31,31,30,31,30,31		};
		String[] strWeek= {"일","월","화","수","목","금","토"};
		
		
		
	}
	
	
	public static void main(String[] args)
	{
		
	}
}
