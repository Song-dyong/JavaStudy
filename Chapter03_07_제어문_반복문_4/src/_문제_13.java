
import java.util.Scanner;
public class _문제_13 {
	public static void main(String[] args) {
//		Scanner s=new Scanner(System.in);
//		System.out.println("두 개의 정수를 입력: (10 10)");
//		int a= s.nextInt();
//		int b= s.nextInt();
//		int sum=1;
//		
//		for(a=a;a<=b;a++)
//		{
//			sum*=a;
//		}
//		System.out.println(sum);
//		
		Scanner s=new Scanner(System.in);
		System.out.println("첫 번째 정수 입력:");
		int start=s.nextInt();
	
		int end=0;
		while(true)
		{
			System.out.println("두 번째 정수 입력:");
			end=s.nextInt();
			if(end<start)
			{
				System.out.println("첫 번째 정수보다 큰 수여야 합니다.");
				continue;
			}
			break;
		}
		int gop=1;
		for(int i=start;i<=end;i++)
		{
			gop*=i;
		}
		System.out.println(start+"부터 "+end+"까지의 곱:"+gop);
				
		
	}
}
