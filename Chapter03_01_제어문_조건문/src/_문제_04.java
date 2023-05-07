//			문제4. 사용자로부터 세 개의 정수를 입력받아, 그 수들의 최대값과 최소값, 
//         합계와 평균을 구해보자.
/*
			int max = a;
			if(max<b)
				max=b;
			if(max<c)
				max=c;
			System.out.println(max);




*/

import java.util.Scanner;
public class _문제_04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1, num2, num3, max, min, total;
		double avg;
		System.out.println("정수를 3개 입력하세요.(90 90 90)");
		num1= scan.nextInt();
		num2= scan.nextInt();
		num3= scan.nextInt();
		total= num1+num2+num3;
		avg= total/3.0;
		
		System.out.println("첫 번째 수: "+num1);
		System.out.println("두 번째 수: "+num2);
		System.out.println("세 번째 수: "+num3);
		System.out.println("합계: "+total);
		System.out.printf("평균:%.2f\n",avg); // %d 정수형 %f 실수형
		
		//최대값
		if(num1>num2 && num1>num3)
		{
			System.out.println("최대값:"+num1);
		}
		if(num2>num1 && num2>num3)
		{
			System.out.println("최대값:"+num2);
		}
		if(num3>num2 && num3>num1)
		{
			System.out.println("최대값:"+num3);
		}
		
		// 최소값
		if(num1<num2 && num1<num3)
		{
			System.out.println("최소값:"+num1);
		}
		if(num2<num1 && num2<num3)
		{
			System.out.println("최소값:"+num2);
		}
		if(num3<num2 && num3<num1)
		{
			System.out.println("최소값:"+num3);
		}
	}
}
