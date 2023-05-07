import java.util.Arrays;

/*
		달력 만들기
			   기능
			1) 연도와 월 입력 
			2) 그 달 1일의 요일 확인
			3) 달력 출력
		=> 보통 메소드 3개	( 입력 / 확인 / 출력 )	-> 요일 확인 작업에서 세분화가 된다면 메소드 갯수 증가 (재사용 편리)
		
		숫자 야구게임
			   기능
			1) 난수 발생
			2) 사용자 입력
			3) 비교
			4) 힌트
			5) 종료여부 확인

*/
/*		
 		select sort
 		
		40	30	10	50	20
		--	--
		30	40
		--		--
		10		30
		--			--
		10			50
		--				--
		10				20
		------------------	for 1번
			40	30	50	20
			--	--
			30	40
			--		--
			30		50
			--			--
			20			30
		------------------	for 2번
				40	50	30
				--	--
				40	50
				--		--
				30		40
		------------------	for 3번
					50	40
					--	--
					40	50
		------------------	for 4번	(length-1)번
		10	20	30	40	50
	
					
				
		


*/
public class _04_메소드조립_셀렉트소트만들기 {
	
	static void sort(int[] arr,int n)					// n=1일 경우, ASC / n=2일 경우, DESC
	{
		if(n==1)
		{
			for(int i=0;i<arr.length-1;i++)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]>arr[j])
					{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					}
				}
			}
		}
		else
		{
			for(int i=0;i<arr.length-1;i++)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]<arr[j])
					{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					}
				}
			}
		}
	}
	/*	
			boolean bCheck=false;
			if(n==1)
			bCheck=arr[i]>arr[j]
			else
			bCheck=arr[i]<arr[j]
			==> else 밑의 for문 없이 가능
			
	*/	
	
	static void rand(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
	}
	
	public static void main(String[] args) {
		
		int[] arr=new int[5];									// 배열은 call by reference이므로, 메소드에서 정렬하면 메인 영역에서 변함
		rand(arr);
		System.out.println("정렬 전: "+Arrays.toString(arr));
		sort(arr,2);
		System.out.println("정렬 전: "+Arrays.toString(arr));		// 구분자 1개를 추가하여, ASC와 DESC 선택 가능
		
		
		
		
		
		
		
		
		
		
	}
}
