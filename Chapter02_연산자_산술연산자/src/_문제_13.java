//	두 개의 정수를 입력 받아서 첫째 수를 둘째 수로 나눈 나머지를 출력하는 프로그램을 작성해 보자.


import java.util.Scanner;

public class _문제_13 {
	public static void main(String[] args) {
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("첫 번째 정수 입력:");
//		int num1 = scan.nextInt();
//		System.out.println("두 번째 정수 입력:");
//		int num2 = scan.nextInt();
//		
//		System.out.println(num1%num2);
//		
		int a,b;
		a=(int)(Math.random()*100)+1;
		b=(int)(Math.random()*100)+1;
		System.out.printf("a=%d, b=%d, a%%b=%d",a,b,a%b); // %는 문자열에서 오류 발생하므로, 
														// 2번 써야 함
		
		
		
	}
}
