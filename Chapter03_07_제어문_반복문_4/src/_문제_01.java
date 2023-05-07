// 100~999 사이의 7의 배수의 갯수와 합
public class _문제_01 {
	public static void main(String[] args) {
		int cnt = 0;
		int sum = 0;
		
		for(int i = 100; i<=999; i++)
		{
			if(i%7==0)
			{
				sum+=i;
				cnt++;
			}
		}
		System.out.println("7의 배수의 갯수:"+cnt);
		System.out.println("7의 배수의 합:"+sum);
		
		
	}
}
