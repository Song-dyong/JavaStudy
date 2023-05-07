// 세 개의 정수를 받아서 총점과 평균 구하기

import java.util.Scanner;
public class _03_반복제어문_총점과평균 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int kor, eng, math;
		while(true)
		{
			System.out.print("국어점수 입력(0~100): ");
			kor = s.nextInt();
			if(kor<0 || kor>100)
			{	
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			break;
		}
		while(true)
		{
			System.out.print("영어점수 입력(0~100): ");
			eng = s.nextInt();
			if(eng<0 || eng>100)
			{	
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			break;
		}
		while(true)
		{
			System.out.print("수학점수 입력(0~100): ");
			math = s.nextInt();
			if(math<0 || math>100)
			{	
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			break;
		}
		int total = kor + eng + math;
		double avg = total/3.0;
		
		System.out.println("총점: "+total);
		System.out.printf("평균: %.2f\n ",avg);
		
	}
}
