// 10개의 정수를 입력받아 그 수들 중 짝수의 개수가 몇 개인지 출력하는 프로그램 작성

import java.util.Scanner;
public class _문제_18 {
	public static void main(String[] args) {
		
//		Scanner s=new Scanner(System.in);
//		System.out.println("10개의 정수를 입력하세요");
//		while(true)
//		{
//		int input=s.nextInt();
//		}
		
		int count = 0;
		for(int i=1;i<=10;i++)
		{
			int num=(int)(Math.random()*100)+1;
			System.out.println("num= "+num);
			if(num%2==0)
			count++;
		}
		System.out.println("짝수의 총 갯수: "+count);
		
		
		
	}
}
