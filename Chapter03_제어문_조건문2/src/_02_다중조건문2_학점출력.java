/*
	성적계산 => Rank, 정렬...
	세 개의 정수를 받아, 평균을 구해서 등급 출력
	다중 조건문 사용

*/

// 학점출력
import java.util.Scanner;
public class _02_다중조건문2_학점출력 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	// System.in : 키보드 입력값 Scanner: 입력값을 메모리에 저장
												// 정수 : nextInt(), 실수 : nextDouble(), 논리 : nextBoolean() 
												// 문자열 : next()  단! char는 존재하지 않음 
												// Scanner는 도스에서만 사용 가능 (window, web에서는 사용 X)
		
		System.out.println("세 개의 정수 입력(10 20 30) :");
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();
		int avg = (kor+eng+math)/3;
		
		System.out.println("국어점수:"+ kor);
		System.out.println("영어점수:"+ eng);
		System.out.println("수학점수:"+ math);
		
		System.out.println("총점:"+(kor+eng+math));
		System.out.printf("평균:%.2f\n",(kor+math+eng)/3.0);
		
		// 학점 계산
		
		char score='F';		// default값 --> else 생략 가능
		if(avg>=90)
		{
			score='A';
		}
		else if (avg>=80)
			score = 'B';
		else if (avg>=70)
			score = 'C';
		else if (avg>=60)
			score = 'D';
		System.out.println("학점:"+score);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
