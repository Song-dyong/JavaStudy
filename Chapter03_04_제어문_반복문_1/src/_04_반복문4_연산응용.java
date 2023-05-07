// 1-2+3-4+5-6+7-8+9-10 의 값
// for문은 숫자에 일정한 패턴이 있어야만 함



public class _04_반복문4_연산응용 {
	public static void main(String[] args) {
		
		int sum = 0;
		for(int i =1;i<=10;i++)
		{
			if(i%2==0)
			{
				sum-=i;
			}
			else
			{
				sum+=i;
			}
		}
		System.out.println("sum: "+sum);		
	}
}
