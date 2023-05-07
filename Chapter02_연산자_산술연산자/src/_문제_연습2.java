// 가위바위보 프로그램

import java.util.Scanner;

public class _문제_연습2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("가위(0), 바위(1), 보(2) 입력:");
		int user = scan.nextInt();
		int com = (int)(Math.random()*3); // 0,1,2
		
		// 확인
		System.out.println(com==0?"컴퓨터 : 가위":"");
		System.out.println(com==1?"컴퓨터 : 바위":"");
		System.out.println(com==2?"컴퓨터 : 보":"");
		
		System.out.println(user==0?"당신 : 가위":"");
		System.out.println(user==1?"당신 : 바위":"");
		System.out.println(user==2?"당신 : 보":"");
		
		int result = com-user;
		System.out.println(result==0?"비겼습니다.":"");
		System.out.println(result==-1 || result==2?"이겼습니다.":"");
		System.out.println(result==-2 || result==1?"졌습니다.":"");
		
	}

}
