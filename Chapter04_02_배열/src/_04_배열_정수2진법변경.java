// 16비트 => 0,1이 들어가는 비트가 16개  ==> 정수를 2진법으로 바꾸기

import java.util.Scanner;
public class _04_배열_정수2진법변경 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("정수 입력:");
		int input=s.nextInt();
		// 저장 공간(0,1)
		
		int[] binary = new int[16];
		int index=15;
		while(true)
		{
			binary[index]=input%2;
			input=input/2;
			if(input==0)
				break;
			index--;						// 뒤에서부터 채워가기 위해
		}

		for(int i=0;i<binary.length;i++)
		{
			if(i%4==0 && i!=0)					// 0은 처음에 들어가므로, 공백이 들어감 --> i!=0을 해야 한칸 떨어지지 않음.
			{
				System.out.print(" ");		// 4개마다 공백주기
			}
				System.out.print(binary[i]);
		}
		
	}
}
