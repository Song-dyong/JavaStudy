import java.util.Arrays;

/*
		정렬 : ASC (올림차순) / DESC (내림차순) 
		----------------------------------
		선택정렬 / 버블정렬
		
		선택정렬 (Select Sort)
		
		10 30 50 20 40 => 10 20 30 40 50 (ASC) / 50 40 30 20 10 (DESC)
		-- -- 비교
  내림차 30 10
		--    --
        50	  30
		--	     --
		50		 20
		--			--
		50			40  
		--------------	 ==> 1round: 가장 큰 수가 앞으로 옴			0 -> 4번
		50 10 30 20 40 			-> 맨 앞자리 고정 / 다음 수들 비교
		   -- --
		   30 10
		   --	 --
		   30	 20
		   --	 	--
		   40		30
		--------------	 ==> 2round: 두 번째 큰 수 고정				1 -> 3번
		50 40 10 20 30
			  -- --
			  20 10
			  --	--
			  30	20
		--------------	 ==> 3round: 세 번째 큰 수 고정				2 -> 2번
		50 40 30 10 20
				 -- --
				 20 10
		--------------	 ==> 4round: 모든 수 고정					3 -> 1번
		50 40 30 20 10 		--> length-1

		  i		 j		
		start	횟수
		  0		 4
		  1		 3
		  2		 2
		  3		 1
		 ---------- > i+j=4(length-1)   ==> j=4-i(범위)	==> j=length-1-i (범위)

*/


public class _07_배열응용_알고리즘1_선택정렬 {
	public static void main(String[] args) {
		
		int[] arr = new int [5];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("=======정렬 전=======");
		System.out.println(Arrays.toString(arr));
		System.out.println("=======정렬 후(DESC)=======");
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length-1-i;j++)
			{
				if(arr[i]<arr[j])									// int a=10; int b=20; --> a=b; b=a; ==> a=20 / b=20  서로 바뀌지 않음
				{													// int temp=a; -> temp=10  / a=b; -> a=20 / b=temp; -> b=10
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}		
			System.out.println("=== for "+(i+1)+"회차 ===");			// 선택정렬
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("=======최종=======");
		System.out.println(Arrays.toString(arr));	
		System.out.println("=======정렬 후(ASC)=======");	
			
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])										// 올림차순 <, > 차이				
				{													
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}		
			System.out.println("=== for "+(i+1)+"회차 ===");
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("=======최종=======");
		System.out.println(Arrays.toString(arr));
			
			
			
			
		
		
	}
}
