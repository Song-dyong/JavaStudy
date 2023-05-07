
public class _문제_02 {
	public static void main(String[] args) {
		int cnt = 0;
		int sum = 0;
		
		for(int i = 100; i<=999; i++)
		{
			if(i%4!=0)
			{
				sum+=i;
				cnt++;
			}
		}
		System.out.println("갯수:"+cnt);
		System.out.println("합:"+sum);
	}
}
