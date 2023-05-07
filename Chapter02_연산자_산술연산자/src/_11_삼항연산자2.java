/*
		컴퓨터 / 사용자 => 가위 바위 보
	=> 가정을 통해 0-가위, 1-바위, 2-보

	컴퓨터가 0~2까지 난수 발생
	사용자가 입력
	컴퓨터 / 사용자의 값 확인
	결과값 
	

*/

import java.util.Scanner;
public class _11_삼항연산자2 {
	public static void main(String[] args) {
		int com = (int)(Math.random()*3);           // 랜덤은 0.99까지이므로, 3을 곱해야 2까지.
		Scanner scan = new Scanner(System.in);
		System.out.print("가위(0), 바위(1), 보(2) 입력:");
		int user=scan.nextInt();
		
		// 확인
		System.out.println(com==0?"컴퓨터 : 가위":"");
		System.out.println(com==1?"컴퓨터 : 바위":"");
		System.out.println(com==2?"컴퓨터 : 보":"");
		
		System.out.println(user==0?"플레이어 : 가위":"");
		System.out.println(user==1?"플레이어 : 바위":"");
		System.out.println(user==2?"플레이어 : 보":"");
		// 결과값
		/*
			com		user
			0(가위)   0
					 1
					 2
			
			1(바위)	 0
					 1
					 2
			
			2(보)	 0
					 1
					 2
		*/
		System.out.println("=====결과=====");
//		System.out.print(com==0 && user==0?"same":"");
//		System.out.print(com==0 && user==1?"win":"");
//		System.out.print(com==0 && user==2?"fail":"");
//		System.out.print(com==1 && user==0?"same":"");		삼항연산자 9문장 써서 결과값 출력
//		System.out.print(com==1 && user==1?"win":"");
//		System.out.print(com==1 && user==2?"fail":"");
//		System.out.print(com==2 && user==0?"same":"");
//		System.out.print(com==2 && user==1?"win":"");
//		System.out.print(com==2 && user==2?"fail":""); 
		
		int res = com -user;
		System.out.println(res==0?"same":"");
		System.out.println(res==-1 || res==2?"user win":"");
		System.out.println(res==1 || res==-2?"com win":"");
		
		
	}
}
