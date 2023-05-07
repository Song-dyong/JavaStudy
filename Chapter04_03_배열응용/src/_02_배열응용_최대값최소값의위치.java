import java.util.Arrays;

/*
			1. 정수 10개 저장 공간 		=> 임의로 초기화 (난수 발생 1~100)
			2. 최대값 / 최소값 구하기 	=> 몇 번째에 위치하는지 
				ex)	1	2	3	4	5	6	7	8	10	9
					max=10 ==> 8번째
					min=1  ==> 0번째	
				
*/


public class _02_배열응용_최대값최소값의위치 {
	public static void main(String[] args) {
		// 배열 선언 및 초기화(난수)
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		//최대값 
		int max = arr[0];
		//최소값
		int min = arr[0];
		for(int i:arr)
		{
			if(max<i)
				max=i;
			if(min>i)
				min=i;
		}
		System.out.println("최대값: "+max);
		System.out.println("최소값: "+min);
		
		int index1=0, index2=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==max)
				index1=i;
			else if(arr[i]==min)
				index2=i;
		}
		System.out.println("최대값 위치(index): "+index1+" / 실제 위치: "+(index1+1)+"번째");
		System.out.println("최소값 위치(index): "+index2+" / 실제 위치: "+(index2+1)+"번째");
		
		
	}
}
