/*
					 i	   j	
					줄수 / 별표
		★			1	   1
		★★			2	   2
		★★★			3	   3
		★★★★			4	   4		==> i=j 같음	--> j<=i
					
					i	   j	
					줄수 / 별표
		★★★★		1	   4
		★★★			2	   3
		★★			3	   2
		★			4	   1		==> i+j=5 --> j=5-i
		
		A
		BC
		DEF
		GHIJ	
		
		2차for --> 정렬 / 빈도구하기 / 등수구하기 多
		
		예제)
			★
		   ★★
		  ★★★
		 ★★★★
		 ---------
		  i	  k   j			i/k      			i/j
		 줄수 공백 별표	   i+k=4 --> k=4-1		j=i
		  1   3   1			
		  2   2   2
		  3   1   3
		  4   0   4
		  
		  
		 ★★★★
		  ★★★
		   ★★
		 	★
		    
		    ★
		   ★★★
		  ★★★★★
		 ★★★★★★★
		
		
*/
public class _02_중첩반복문2_계단만들기 {
	public static void main(String[] args) {
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("★");
			}
			System.out.println();
		}
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=5-i;j++)
			{
				System.out.print("★");
			}
			System.out.println();
		}
		char c= 'A';
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(c++);
			}
			System.out.println();
		}
		for(int i=1;i<=4;i++)
		{
			c='A';
			for(int j=1;j<=i;j++)
			{
				System.out.print(c++);
			}
			System.out.println();
		}
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i==j)
				{
					System.out.print("#");
				}
				else
				{
					System.out.print(j);
				}
			}
			System.out.println();
		}
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=5-i;k++)
			{
				System.out.print("★");
			}
			System.out.println();
		}
		
		
		
	}
}
