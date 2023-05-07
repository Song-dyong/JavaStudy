//문제5. 사용자로 부터 정수를 입력받아서 양수인지 음수인지 확인하는 
//         프로그램 작성
import java.util.Scanner;
public class _문제_05 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		int i = scan.nextInt();
		
		System.out.println("입력한 값:"+i);
		if(i==0)
		{
			System.out.println("0입니다.");
		}
		else
		{	
			if(i>=0)
			{
				System.out.println("양수입니다.");
			}
			else
			{
				System.out.println("음수입니다.");
			}
		}
	}
}
