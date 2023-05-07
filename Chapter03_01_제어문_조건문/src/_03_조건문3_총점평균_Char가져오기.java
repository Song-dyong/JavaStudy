// 세 개의 정수를 입력받아서 총점 / 평균 / 학점 구하기
import java.util.Scanner;
public class _03_조건문3_총점평균_Char가져오기 {
	public static void main(String[] args) {
		
//		int kor, eng, math;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("점수 입력(80 90 90):");
//		kor=scan.nextInt();
//		eng=scan.nextInt();
//		math=scan.nextInt();
//		
//		// 결과값 출력
//		int total= kor+eng+math;
//		double avg = total/3.0;
//		// 학점
//		int temp=(int)avg;
//		char score='A';	// default 값을 정의해놔야함 " " or "아무거나"
//		if(temp>=90 && temp<=100)		// if문은 독립문장이므로, 하나씩 다 수행 (속도가 느림)
//			score='A';					// 따라서, 범위를 명확히 정의해야함
//		if(temp>=80 && temp<90)
//			score='B';
//		if(temp>=70 && temp<80)
//			score='C';
//		if(temp>=60 && temp<70)
//			score='D';
//		if(temp<60)
//			score='F';
//		System.out.println("국어점수="+kor);
//		System.out.println("영어점수="+eng);
//		System.out.println("수학점수="+math);
//		System.out.println("총점="+total);
//		System.out.printf("평균=%.2f\n",avg);
//		System.out.println("학점은="+score);
		
		int kor, eng, math, total;
		double avg;
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 3개 입력하세요(90 90 90):");
		kor=scan.nextInt();
		eng=scan.nextInt();
		math=scan.nextInt();
		total=kor+eng+math;
		avg=total/3.0;
		System.out.println("국어점수:"+kor);
		System.out.println("영어점수:"+eng);
		System.out.println("수학점수:"+math);
		System.out.println("총점:"+total);
		System.out.printf("평균:%.2f\n",avg);
		int temp=(int)avg;
		char score=' ';
		
		if(temp>=90 && temp<=100)
		{
			score='A';
			System.out.println("학점:"+score);
		}
		if(temp>=80 && temp<90)
		{
			score='B';
			System.out.println("학점:"+score);
		}
		if(temp>=70 && temp<80)
		{
			score='C';
			System.out.println("학점:"+score);
		}
		if(temp>=60 && temp<70)
		{
			score='D';
			System.out.println("학점:"+score);
		}
		if(temp<60)
		{
			score='F';
			System.out.println("학점:"+score);
		}
	}
}
