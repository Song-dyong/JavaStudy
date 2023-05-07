//년도를 입력 받아 윤년인지 아닌지를 판별하는 방법을 if~else문으로 사용하라 5 6 7 16 빼기

import java.util.Scanner;
public class _문제_04 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("년도를 입력하세요");
		int year = s.nextInt();
		
		if((year%4 ==0 && year%100!=0)||(year%400==0))
			System.out.println(year+"년은 윤년입니다.");
		else
			System.out.println(year+"년은 윤년이 아닙니다.");
	}
}
