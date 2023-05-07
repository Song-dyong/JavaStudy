// 가위, 바위, 보 게임 만들기 --> 승패횟수 확인
/*
		컴퓨터		사용자		뺄셈
			가위(0)		가위(0)	0	-> same				==> 비기는 경우: 0
						바위(1)	-1	-> win				==> 이기는 경우: -1 or 2
						보(2)	-2	-> lose				==> 지는 경우: -2 or 1
						
			바위(1)		가위(0)	1	-> lose
						바위(1)	0	-> same
						보(2)	-1	-> win
						
			보(2)		가위(0)	2	-> win
						바위(1)	1	-> lose
						보(2)	0	-> same



*/
import java.util.Scanner;
public class _05_반복문_반복문활용_가위바위보 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int win=0, lose=0, same=0;
		
		while(true)			// for(;;) / while(true) --> 무한루프
		{
			System.out.print("가위(0), 바위(1), 보(2), 종료(9)");
			//컴퓨터 난수 발생
			int com = (int)(Math.random()*3);  // 난수 0, 1, 2
			int user = s.nextInt();			// 사용자 0,1,2 중 입력
			
			if(user == 9)
			{
				System.out.println("게임 종료!");
		//		System.exit(0);						==> 프로그램이 종료되는 위치이므로, 아래의 문장을 수행하지 못한 채 종료됨
				break;						// 무한루프 종료
			}
			
			// 컴퓨터와 사용자의 가위 바위 보 출력
			
			if(com==0)
				System.out.println("컴퓨터: 가위");
			else if (com==1)
				System.out.println("컴퓨터: 바위");
			else if (com==2)
				System.out.println("컴퓨터: 보");
			
			if(user==0)
				System.out.println("사용자: 가위");
			else if (user==1)
				System.out.println("사용자: 바위");
			else if (user==2)
				System.out.println("사용자: 보");
			
			// 결과값 출력
			switch(com-user)
			{
			case -1: case 2:
				System.out.println("Win!");
				win++;
				break;
			case 1: case -2:
				System.out.println("Lose!");
				lose++;
				break;
			case 0:
				System.out.println("Same!");
				same++;
				break;
				
			}
			
		}
		// while 종료		
		int total=win+same+lose;
		System.out.printf("%d전 %d승 %d패 %d무\n", total, win, lose, same);
		
		
	}
}
