// 1부터 30까지의 정수에서 짝수만 한 줄에 3개씩 출력하라
// if 문 쓰는듯?

public class _문제_12 {
	public static void main(String[] args) {
//		for (int i =2; i<=30; i+=2)
//		{
//			System.out.print(i+ "   ");	
//		
//			if(i%3==0)
//			{
//				System.out.println();
//			}
//		}		
		for(int i=1;i<=30;i++)
		{
			if(i%2==0)
			{
				System.out.printf("%5d\t",i);   // %2d --> 2칸 차지 --> %(n)d -- (n)칸만큼 숫자 출력
				if(i%3==0)						// -: 왼쪽 정렬 / +: 오른쪽 정렬
				{
					System.out.println();  // 줄바꿈
				}
				
			}
		}
		
		
		
	}
}
