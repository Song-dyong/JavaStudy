
public class _문제_19 {
	public static void main(String[] args) {
		int cnt3=0, cnt5=0;
		for(int i=1;i<=10;i++)
		{
			int num=(int)(Math.random()*100)+1;
			System.out.println("num= "+num);
			if(num%3==0)
			{
				cnt3++;
			}
			if(num%5==0)
			{
				cnt5++;
			}
		}
		
		System.out.println("3의 배수의 총 갯수: "+cnt3);
		System.out.println("5의 배수의 총 갯수: "+cnt5);
	}
}
