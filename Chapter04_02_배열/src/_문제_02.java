//	1에서 50까지의 합을 더하는 while 문이다. 빈 칸에 적절한 코드를 삽입하라
public class _문제_02 {	
	public static void main(String[] args) {
			int sum=0,i=1;
//		while (true) 
//		{
//			if(i>50) break;
//			sum+=i;
//			i++;
//		}
		while(i<=50)
		{
			sum+=i;
			i++;
		}
		
		System.out.println(sum);
			
	}	
}

