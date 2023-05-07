//Scanner 클래스를 이용하여 한 개의 정수를 입력 받아 정수의 절대값을 출력하라

import java.util.Scanner;
public class _문제_03 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("정수 입력:");
		int i = s.nextInt();
		
		if(i==0)
			System.out.println(0);
		else if (i>0)
			System.out.println(i);
		else
			System.out.println(-i);
		
		// System.ou.println(Math.abs(num)); --> 절댓값 라이브러리
		
	}
}
