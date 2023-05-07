//1) Scanner 클래스를 이용하여 한 개의 정수를 입력 받아 양수인지 음수인지 판별하여 출력하라
import java.util.Scanner; // 라이브러리, 사용자 정의 --> 클래스가 다른 폴더에저장된 경우
							// import가 생략이 가능한 라이브러리: java.lang.*    ex)Math. / String, Object
							/*
								java.util
								java.text
								java.io
								java.net
								--------
								java.sql ==> 1.0
								javax~~ ==> 1.2(Web)
								기타 => 외부에서 만든 라이브러리 =>org/com
							*/
public class _문제_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력: ");
		int a = scan.nextInt();
		
		if (a>=0)
		{
			System.out.println(a+"는(은) 양수입니다.");
		}
		else
		{
			System.out.println(a+"는(은) 음수입니다.");
		}
		
	}
}
