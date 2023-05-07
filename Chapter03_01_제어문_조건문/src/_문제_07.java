//		문제7. 정수 3개를 입력받아서 총점과 평균을 구하고 학점을 구하는 프로그램
//        작성 ( 90이상이면 A,80이상이면 B, 70이상이면 C,60이상이면 D, 
//        나머지는 F)

import java.util.Scanner;

public class _문제_07 {
	public static void main(String[] args) {
		int a;
		int b;
		int	c;
		Scanner scan = new Scanner(System.in);
		System.out.println("a과목, b과목, c과목의 점수를 순서대로 입력하시오.(90 90 90)");
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		int total;
		total=a+b+c;
		double avg;
		avg=total/3.0;
		System.out.println("총점: "+total);
		System.out.printf("평균:%.2f\n",avg);
		
		int temp = (int)avg;
		
		if(temp>=90 && temp<=100)
		{
			System.out.println('A');
		}
		if(temp>=80 && temp<90)
		{
			System.out.println('B');
		}
		if(temp>=70 && temp<80)
		{
			System.out.println('C');
		}
		if(temp>=60 && temp<70)
		{
			System.out.println('D');
		}
		if(temp<60)
		{
			System.out.println('F');
		}
	}
}
