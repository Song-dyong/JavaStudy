// 둘 중 큰 수만 출력


import java.util.Scanner;

public class _문제_연습 {
	public static void main(String[] args) {
		
	
	Scanner scan = new Scanner(System.in);
	System.out.println("첫 번째 정수 입력:");
	int num1 = scan.nextInt();
	System.out.println("두 번째 정수 입력:");
	int num2 = scan.nextInt();
	
	System.out.println((num1>num2) ? num1 : num2);
	
	
	}
}
