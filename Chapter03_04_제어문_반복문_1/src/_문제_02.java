
// 한 개의 정수를 입력 받아 3의 배수인지 판별하여 출력하라
import java.util.Scanner;
public class _문제_02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("정수 입력:");
		int input = s.nextInt();
		
		if(input ==0)
			System.out.println(input+"는(은) 0입니다.");
		else if (input%3==0)
			System.out.println(input+"는(은) 3의 배수입니다.");
		else
			System.out.println(input+"는(은) 3의 배수가 아닙니다.");
	}
}
