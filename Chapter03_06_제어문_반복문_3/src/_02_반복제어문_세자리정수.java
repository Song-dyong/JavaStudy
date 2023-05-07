// break 와 continue

import java.util.Scanner;
public class _02_반복제어문_세자리정수 {
	public static void main(String[] args) {
		// 		세 자리 정수 입력 
		// 조건: 0을 포함할 수 없음 / 같은 수를 입력할 수 없음
	Scanner s = new Scanner(System.in);
	while(true)
	{
		System.out.println("세 자리 정수 입력:");
		int input = s.nextInt();
		
		// 세 자리가 아닌 정수를 입력할 경우 제외
		if(input<100 || input>999)
		{
			System.out.println("잘못된 입력입니다.");
			continue;								//while문 처음부터 수행
		}
		int a = input/100;				// 100의 자리
		int b = (input%100)/10;			// 10의 자리
		int c = input%10;				// 1의 자리
		System.out.println("input= "+input);
		System.out.println("a = "+a+", b = "+b+", c = "+c);
		
		// 0이 포함되는 경우 제외
		if(a==0 || b==0 || c==0)
		{
			System.out.println("0은 포함될 수 없습니다.");
			continue;
		}
		
		// 같은 숫자가 포함되는 경우 제외
		if(a==b || b==c || c==a)
		{
			System.out.println("같은 숫자를 사용할 수 없습니다.");
			continue;
		}
		// 정상 수행시
		break;						// --> while문 내에서 break를 통해 빠져나오기
	}
									// continue의 사용처: for ==> 제외 (증감식) / while ==> 처음부터 (조건식)
	}
}
