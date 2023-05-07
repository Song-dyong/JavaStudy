// 년도를 입력받아서, 윤년여부 확인
// 윤년: 4년마다 윤년 / 100년마다 제외 / 400년마다 윤년
// 윤년조건 : ((year%4==0 && year%100!=0)|| (year%400==0))


import java.util.Scanner;
public class _06_조건문6_윤년조건 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("연도 입력:");
		int year = scan.nextInt();
		
		if((year%4==0 && year%100!=0)|| (year%400==0))
		{
			System.out.println(year+"년도는 윤년입니다.");
		}
		if(!((year%4==0 && year%100!=0)|| (year%400==0)))
		{
			System.out.println(year+"년도는 윤년이 아닙니다.");
		}
		
		int i =1;
		int a = 10;
		for(i=1;a<20;a++) {
			i++;
		}
		
	}
}
