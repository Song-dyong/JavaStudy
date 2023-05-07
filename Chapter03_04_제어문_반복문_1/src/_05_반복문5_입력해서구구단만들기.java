// 사용자의 입력을 받아서 구구단 ex) 3을 입력하면 3단 출력

import java.util.Scanner;
public class _05_반복문5_입력해서구구단만들기 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("단 입력: ");
		int dan=scan.nextInt();
		
		for(int i=1;i<10;i++)
		{
			System.out.printf("%dx%d=%d\n",dan,i,(dan*i));
		}
		
		
	}
}
