// 3의 배수의 합, 갯수 확인 (1~100)
public class _03_반복문3_3의배수의합과갯수 {
	public static void main(String[] args) {
		int sum =0, count = 0;
		for (int i=1; i<=100;i++)
		{
			if(i%3==0)
			{
				sum+=i;				// 합계
				count++;			// 갯수 확인
			}
		}
		System.out.println("====결과값====");
		System.out.println("1~100까지 3의 배수의 합: "+sum);
		System.out.println("1~100까지 3의 배수의 갯수: " +count+"개");
		
		int sum1 = 0, sum2 = 0, count1 = 0, count2 = 0;
		
		
		for (int i=1;i<=100;i++)
		{
			if(i%5==0)
			{
				sum1+=i;
				count1++;
			}
			if(i%7==0)
			{
				sum2+=i;
				count2++;
			}
		}
		System.out.println("==================");
		System.out.println("5의 배수의 합: "+sum1);
		System.out.println("7의 배수의 합: "+sum2);
		System.out.println("5의 배수와 7의 배수의 합: "+(sum1+sum2));
		System.out.println("5의 배수의 갯수:" + count1);
		System.out.println("7의 배수의 갯수:" + count2);
		
		
	}
}
