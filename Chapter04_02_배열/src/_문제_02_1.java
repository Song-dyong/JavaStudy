
public class _문제_02_1 {
	public static void main(String[] args) {
		
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				// i=1 -> j=1,j=2,j=3
				// i=2 -> j=1,j=2,j=3
				// i=3 -> j=1,j=2,j=3
				
					
			System.out.println("i="+i+",j="+j);
			}
			if(i==2)
				break;
		}
		
	}
}
