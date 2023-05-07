
// 한 개의점수를 받아서 60 이상이면 합격, 아니면 불합격
import java.util.Scanner;
public class _08_선택조건문2_합격불합격 {
	
	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		System.out.println("점수를 입력해주세요.");
		int score = scan.nextInt();
		
		if(score>=60)
		{
			System.out.println("합격입니다.");
		}
		else
		{
			System.out.println("불합격입니다.");
		}
	}
}
