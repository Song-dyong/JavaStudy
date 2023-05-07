import java.util.Scanner;

/*
			달력 만들기
			   기능
			1) 연도와 월 입력 
			2) 그 달 1일의 요일 확인
			3) 달력 출력
		=> 보통 메소드 3개	( 입력 / 확인 / 출력 )	-> 요일 확인 작업에서 세분화가 된다면 메소드 갯수 증가 (재사용 편리)

*/

public class _06_메소드조립_달력 {
	// 입력
	
	static int input(String msg)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println(msg+" 입력:");
		return scan.nextInt();									// 굳이 변수를 잡지 않아도, scan.next의 값을 리턴하면 됨
	}
	
	static int getWeek(int year, int month)
	{
		int total=(year-1)*365
				+(year-1)/4				// 4년에 한 번씩 366일이므로.
				-(year-1)/100			// 100년에 한번 씩 윤년 아님
				+(year-1)/400;			// 400년 마다 한 번씩 윤년
		int[] lastday={
				31,28,31,30,31,30,			// 각 달의 먀지막 날 but! 2월달은 윤년마다 29일이 됨
				31,31,30,31,30,31
		};
		
		if((year%4==0 && year%100!=0)||(year%400==0))
			lastday[1]=29;
		else
			lastday[1]=28;
		// 전 달까지 총날수
			for(int i=0;i<month-1;i++)
			{
				total+=lastday[i];					// total에 전 달까지의 합도 더함
			}
		// +1								==> 입력한 달의 첫 날
			total++;
			int week=total%7;
			return week;
		
	}
	
	static void print(int month, int week)
	{
		int[] lastday={
				31,28,31,30,31,30,			// 각 달의 먀지막 날 but! 2월달은 윤년마다 29일이 됨
				31,31,30,31,30,31
		};
		String[] strWeek= {"일","월","화","수","목","금","토"};
		for(int i=0;i<strWeek.length;i++)
		{
			System.out.print(strWeek[i]+"\t");
		}												// 일~토까지 출력
		System.out.println("\n");
		for(int i=1;i<=lastday[month-1];i++)
		{
			if(i==1)	// 맨 처음 1번
			{
				for(int j=0;j<week;j++)					// 2023년의 4월은 토요일이 1일 --> week는 6(week는 total%7이었으므로) -> \t를 6번 실행
				System.out.print("\t");	
			}
			System.out.printf("%2d\t",i);
			week++;										// week가 6(토요일)에 있으므로, week를 하루 추가 => week= 7
			if(week>6)
			{
				week=0;									// week가 7이되면, week=0 (일요일)로 초기화 + 다음 줄에 출력해야함
				System.out.println();
				System.out.println();
			}
		}
		
	}
	
	static void process()
	{
		int year=input("연도");
		int month=input("월");
		System.out.println(year+"년 "+month+"월");
		int week=getWeek(year, month);
		System.out.println("요일: "+week);
		print(month,week);
	}
	
	public static void main(String[] args) {
		process();
		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("연도 입력:");
//		int year=scan.nextInt();
//		System.out.println("월 입력");
//		int month=scan.nextInt();
//		///////////////////////////////// 사용자 입력 기능 => 메소드
//		
//		// 전년도까지 총날수
//		int total=(year-1)*365
//					+(year-1)/4				// 4년에 한 번씩 366일이므로.
//					-(year-1)/100			// 100년에 한번 씩 윤년 아님
//					+(year-1)/400;			// 400년 마다 한 번씩 윤년
//		int[] lastday={
//				31,28,31,30,31,30,			// 각 달의 먀지막 날 but! 2월달은 윤년마다 29일이 됨
//				31,31,30,31,30,31
//		};
//		
//		if((year%4==0 && year%100!=0)||(year%400==0))
//			lastday[1]=29;
//		else
//			lastday[1]=28;
//		// 전 달까지 총날수
//			for(int i=0;i<month-1;i++)
//			{
//				total+=lastday[i];					// total에 전 달까지의 합도 더함
//			}
//		// +1								==> 입력한 달의 첫 날
//			total++;
//		//========================= %7 --> 요일 구하기
//		int week=total%7;
//		/////////////////////////////////////// 처리 과정
//		System.out.printf("%d년도 %d월\n\n",year,month);
//		String[] strWeek= {"일","월","화","수","목","금","토"};
//		for(int i=0;i<strWeek.length;i++)
//		{
//			System.out.print(strWeek[i]+"\t");
//		}												// 일~토까지 출력
//		System.out.println("\n");
//		for(int i=1;i<=lastday[month-1];i++)
//		{
//			if(i==1)	// 맨 처음 1번
//			{
//				for(int j=0;j<week;j++)					// 2023년의 4월은 토요일이 1일 --> week는 6(week는 total%7이었으므로) -> \t를 6번 실행
//				System.out.print("\t");	
//			}
//			System.out.printf("%2d\t",i);
//			week++;										// week가 6(토요일)에 있으므로, week를 하루 추가 => week= 7
//			if(week>6)
//			{
//				week=0;									// week가 7이되면, week=0 (일요일)로 초기화 + 다음 줄에 출력해야함
//				System.out.println();
//				System.out.println();
//			}
//		}
	}
}
