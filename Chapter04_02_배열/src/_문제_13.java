import java.util.Arrays;

//5개의 정수를 {95, 75, 85, 100, 50}로 초기화하고 오름차순으로 정렬하는 프로그램


public class _문제_13 {
	public static void main(String[] args) {
			
		int [] arr= {95, 75, 85, 100, 50};
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length-1;j++)
			{
				if(arr[i]<arr[j]) {
					int temp= arr[i];
					arr[i]=arr[j];
					arr[j]=temp;				// select sort 
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
