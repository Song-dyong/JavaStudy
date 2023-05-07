
public class _문제_16 {
	public static void main(String[] args) {
		int sum2=0, sum3=0;
		
		for(int i=0;i<=12;i++)
		{
			if(i%2==0)
			{
				sum2+=i;
			}
			if(i%3==0)
			{
				sum3+=i;
			}
			// if(i%2==0 || i%3==0)
			// sum2+=i; sum3+=i; ==> 2와 3의 공배수가 한 번씩 제외됨. (x)
			
		}
		System.out.println("2의 배수와 3의 배수의 합:" + (sum2+sum3));
		
		
	}
}
