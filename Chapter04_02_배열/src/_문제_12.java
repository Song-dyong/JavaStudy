import java.util.Arrays;

//10명의 컴퓨터 정수를 입력받아 배열에 저장하고 총점과 평균을 구하여 출력하는 프로그램을 작성

public class _문제_12 {
	public static void main(String[] args) {
		
		int [] arr=new int[10];
		for(int i=0; i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		int total=0;
		
		for(int i=0;i<arr.length;i++)
		{
			total+=arr[i];
		}
		double avg=total/10.0;
		System.out.println(total);
		System.out.println(avg);
		
		
	}
}
