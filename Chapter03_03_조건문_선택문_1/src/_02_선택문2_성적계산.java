// 성적 계산
import java.util.Scanner;

public class _02_선택문2_성적계산 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("세 개의 정수를 입력");
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();
		int avg = (kor + eng + math) / 3;		
		
		// 학점 출력
		char score = 'A';
		switch (avg/10)				// 1~100까지의 수를 case로 다 지정하기 힘들기 때문에, 10으로 나눔으로써 10개로 줄일 수 있음
		{							// break를 걸지 않는다면, 모든 케이스에서 빠져나가지 못하고, default인 'F'만 출력됨
		case 10:		// 100
//			score = 'A';			--> case 10에서 문장과 break를 주지 않으면, 10 || 9로 엮을 수 있음.
//			break;						ex) case 3: case 4: case 5: syso("봄") ==> 3, 4, 5 묶기
		case 9:			// 99~90
			score = 'A';
			break;
		case 8:
			score = 'B';
			break;
		case 7: 
			score = 'C';
			break;
		case 6: 
			score = 'D';
			break;
		default:
			score= 'F';
		}
		System.out.println("당신의 학점은 "+score+"입니다.");
		
		
	}
}
