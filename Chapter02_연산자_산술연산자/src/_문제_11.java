// 사용자로부터 두 개의 정수를 입력 받아서 뺄셈과 곱셈 연산의 결과를 출력하는 프로그램을 작성


import java.util.Scanner;
public class _문제_11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("첫 번째 정수입력:");
		int num1 = scan.nextInt();
		System.out.println("두 번째 정수입력:");
		int num2 = scan.nextInt();
		
		System.out.println(num1-num2);
		System.out.println(num1*num2);
	}
}
