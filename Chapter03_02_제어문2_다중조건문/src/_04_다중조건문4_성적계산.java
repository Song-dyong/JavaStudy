// 성적 계산 -> A+ (97이상) / A0 / A-

import java.util.Scanner;
public class _04_다중조건문4_성적계산 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요.(10 10 10)");
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();
		int total = kor+eng+math;
		double avg = (kor + eng + math)/3.0;
		
		System.out.println("국어점수:"+kor);
		System.out.println("영어점수:"+eng);
		System.out.println("수학점수:"+math);
	
		System.out.println("총점:"+total);
		System.out.printf("평균:%.2f\n",avg);
		
		// 학점 계산 ==> 학점 + 옵션(+, -, 0)
		char score = 'F';
		char op = '+';
		
		if(avg>=90)
		{
			score = 'A';
			if(avg>=97)
			{
				op='+';
			}
			else if(avg>=94)
			{
				op='0';
			}
			else if(avg>=90)
			{
				op='-';
			}
		}
		else if(avg>=80)
		{
			score = 'B';
			if(avg>=87)
			{
				op='+';
			}
			else if(avg>=84)
			{
				op='0';
			}
			else if(avg>=80)
			{
				op='-';
			}
		}
		else if(avg>=70)
		{
			score = 'C';
			if(avg>=77)
			{
				op='+';
			}
			else if(avg>=74)
			{
				op='0';
			}
			else if(avg>=70)
			{
				op='-';
			}
		}
		else if(avg>=60)
		{
			score = 'D';
			if(avg>=67)
			{
				op='+';
			}
			else if(avg>=64)
			{
				op='0';
			}
			else
			{
				op='-';
			}
		}
		else
		{
			score = 'F';
			op=' ';
		}
		System.out.println("학점:"+score+op);	// score + op에 괄호를 치면, 캐릭터의 정수값끼리 연산됨
		
		
		
		
		
		
		
		
		
	}
}
