/*
			do~while => 후조건, 무조건 1번 수행 가능
			
				1. 초기화: 다른 코드의 값을 초기화하고 시작할 때 
				2. 게임:
				3. 형식)
						초기값				(1)
						do
						{
							반복 실행문장		(2)
							증감식			(3)
							
						}while(조건식);		(4) --> 증가된 변수로 조건 실행: true면 2번, false면 종료

*/
import java.util.Scanner;		// java.util.*; ---> util 내의 모든 클래스를 불러올 때, *  but! util 내의 클래스가 많기 때문에 속도가 느려짐
public class _06_반복문_doWhile {
	public static void main(String[] args) {
		
		//1~10까지 출력
		
		int i=1;
		do
		{
				System.out.print(i+" ");
				i++;
			
		}while(i<=10);
		System.out.println("\n=====================");
		
		Scanner s = new Scanner(System.in);
		System.out.print("단 입력: ");
		int dan=s.nextInt();
		i=1;
		do
		{
			System.out.printf("%5d*%2d=%-5d\n",dan,i,dan*i);			// %nd --> n은 n칸의 공간만큼 확보를 의미 (-n)을 줄 경우, 소숫점 쪽으로 공간 확보
			i++;
		}while(i<=9);
		System.out.println("==========for=========");
		i=10;
		for(i=10;i<10;i++)
		{
			
			System.out.println("i="+i);
		}
		
		System.out.println("=========while=========");
		i=10;
		while(i<10)
		{
			System.out.println("i+"+i);
			i++;
		}
		
		System.out.println("=======do~while=======");
		i=10;
		do
		{
			System.out.println("i="+i);
			i++;
			
		}while(i<10);
		
		
		
		
		
		
	}
}
