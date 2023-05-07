//			문제3. 1학년부터 4학년까지 중간고사 시험을 보았다. 
//         4학년은 70점 이상이면 합격, 그 이외의 학년은 60점 이상이면 합격이다. 
//         이를 판단하는 프로그램을 작성해보자.
//         점수가 0미만 100초과이면 경고문구 출력!
/*
		경고문을 먼저 설정.
		if(score<0 || score>100)
		{
			경고문구
		}
		else
		{
			if(grade==4)
			{
				if(score>=70)
				{
					"합격"
				}
				else
				{
					"불합격"
				}
			}
			else
			{
				if(score>60)
				{
					"합격"
				}
				else
				{
					"불합격"
				}
				
			}
		}


*/


import java.util.Scanner;
public class _문제_03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("학년을 입력하세요.");
		int grade=scan.nextInt();
		System.out.println("점수를 입력하세요");
		int score=scan.nextInt();
		
		if(grade==4)
		{
			if(score>=70 && score<=100)
				System.out.println("합격입니다.");
			if(score<70 && score>0)
				System.out.println("불합격입니다.");
		}
		if(grade<4)
		{
			if(score>=60 && score<=100)
				System.out.println("합격입니다.");
			if(score<60 && score>=0)
				System.out.println("불합격입니다.");		
		}
		if(score>100 || score<0)
			System.out.println("잘못 입력하였습니다.");
		
	}
}
