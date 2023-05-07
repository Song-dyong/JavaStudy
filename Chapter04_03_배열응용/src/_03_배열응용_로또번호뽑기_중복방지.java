import java.util.Arrays;

/*
			6개의 난수 발생 --> 1~45 (로또 번호) --> 중복 x 
*/
public class _03_배열응용_로또번호뽑기_중복방지 {
	public static void main(String[] args) {
//		
//		for(int i=0;i<lotto.length;i++)
//		{
//			lotto[i]=(int)(Math.random()*45)+1;
//			for(int j=0;j<i;j++)
//			{
//				if(lotto[i]==lotto[j])
//				{										// 이해 잘못함 ( 다시 생각 )
//					//i--;						// i--;가 없으면, 동일 숫자가 나와버린 i의 시점에서 그 숫자를 제외하고 다시 for문이 돌기 때문에, 총 배열 수가 
//					break;										// default 값인 0으로 나와버림 --> 따라서, 증가한 i를 다시 줄여서 다시 한번 난수가 발생하도록
//				}
//			}
//		}
//			
//		System.out.println(Arrays.toString(lotto));
	
		int [] lotto=new int[10];
		int su=0; // 난수를 저장
		boolean bCheck=false;
		for(int i=0;i<lotto.length;i++)
		{
			bCheck=true;
			while(bCheck)
			{
				su=(int)(Math.random()*10)+1;
				bCheck=false;
				for(int j=0;j<i;j++)
				{
					if(lotto[j]==su)
					{
						bCheck=true;
						break;
					}
					
					
				}
		
			}
			lotto[i]=su;
		}
		System.out.println(Arrays.toString(lotto));	// 중복없는 난수발생
		
		
	}
}
