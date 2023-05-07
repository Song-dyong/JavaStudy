import java.util.Arrays;
import java.util.Scanner;

public class _문제_01
{
	static void process1()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력: ");
		int input = scan.nextInt();
	//	System.out.println(Integer.toBinaryString(input));
		
//		int[] binary= new int[16];
//		int index=15;
//				
//		while(true)
//		{
//			binary[index]=input%2;
//			input=input/2;
//			if(input==0);
//				break;
//			index--;
//		}
//		for(int i=0;i<binary.length;i++)
//		{
//			if(i%4==0 && i!=0)
//			{
//				System.out.println(" ");
//				System.out.print(binary[i]);
//			}
//		}
		
		
	}
	
	static void process2()
	{
		int[] arr=new int [5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		
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
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	static void process3()
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("연도 입력:");
		int year = scan.nextInt();
		
		if((year%4==0&&year%100!=0)||year%400==0)
		{
			System.out.println(year+"년은 윤년입니다");
		}
		else
			System.out.println(year+"년은 윤년이 아닙니다.");
	}
	
	public static void main(String[] args)
	{
		process1();
		process2();
		process3();
	}
}
