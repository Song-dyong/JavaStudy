// 1~100까지 합
public class _02_반복문2_1부터100까지합 {
	public static void main(String[] args) {
		int sum=0;
		for(int i=1; i<=100; i++)
		{
			sum+=i;
			System.out.println("sum="+sum+", i="+i);
		}
		System.out.println("=====최종결과값=====");
		System.out.println("1~100까지의 합: "+sum);
		
		sum=0;
		for(int i=0; i<=100;i+=2)
		{
			sum+=i;
			System.out.println("sum="+sum+", i="+i);
		}
		System.out.println("===결과===");
		System.out.println("1~100까지 짝수들의 합: "+sum);
		
		sum=0;
		for(int i=1; i<=100;i+=2)
		{
			sum+=i;
			System.out.println("sum="+sum+", i="+i);
		}
		System.out.println("===결과===");
		System.out.println("1~100까지 홀수들의 합: "+sum);
		
		for(int i=5;i>=0;i--)
		{
			for(int j =0;j<i;j++)
			{
				System.out.print('*');
			}
			System.out.println();
		}
		
		for(int i=5;i>=0;i--)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
	}
}
