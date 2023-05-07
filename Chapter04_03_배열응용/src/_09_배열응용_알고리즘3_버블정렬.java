import java.util.Arrays;

/*
		버블정렬: 인접한 데이터끼리 비교		==> 선택정렬: 앞에서부터 정렬	/ 버블정렬: 뒤에서부터 정렬
				
		40	30	10	50	20	=> ASC(오름차순)
		--	--
		30	40
			--	--
			10	40
				--	--
				40	50
					--	--
					20	50
		------------------
		30	10	40	20	50(고정) => 1round: i=0 / j=4
		--	--
		10	30
			--	--
			30	40
				--	--
				20	40(고정)		
		------------------	
		10	30	20	40	50		=> 2round: i=1 / j=3
		--	--
		10	30
			--	--
			20	30
		------------------
		10	20	30	40	50		=> 3round:	i=2	/ j=2
		--	--
		10	20
		------------------
		10	20	30	40	50		=> 4round:	i=3	/ j=1
		--
		10						=> 하나는 비교할 필요가 없으므로, length-1

			
			i	j
			0	4
			1	3
			2	2
			3	1	=> i+j=4 -> j=4-i -> j=(length-1)-i


*/
public class _09_배열응용_알고리즘3_버블정렬 {
	public static void main(String[] args) {
		
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
			for(int j=0;j<i;j++)
			{
				if(arr[i]==arr[j])
				{
					i--;
					break;
				}
			}
		}
		System.out.println("=========정렬 전=========");
		System.out.println(Arrays.toString(arr));
		System.out.println("=========정렬 후=========");
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
