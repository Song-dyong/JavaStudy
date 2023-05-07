// 3의 배수, 5의 배수, 7의 배수의 합과 각각의 갯수


public class _03_반복문_배수의합과갯수 {
	public static void main(String[] args) {
		int a3=0, a5=0, a7=0; // 합		==> 누적변수
		int c3=0, c5=0, c7=0; // 갯수	==> 증가변수
		
		int i =1;				//		==> 루프변수
		while(i<=100)
		{
			if(i%3==0)				// 중복적으로 수행 --> 단일조건(if문장 여러개) / 중복이없는 경우 --> 다중 조건(else if)
			{
				a3+=i;
				c3+=1;
			}
			if(i%5==0)
			{
				a5+=i;
				c5+=1;
			}
			if(i%7==0)
			{
				a7+=i;
				c7+=1;
			}
			i++;
		}
		
		System.out.println("========결과=========");
		System.out.println("3의 배수의 합: "+a3);
		System.out.println("5의 배수의 합: "+a5);
		System.out.println("7의 배수의 합: "+a7);
		System.out.println("3의 배수의 갯수: "+c3);
		System.out.println("5의 배수의 갯수: "+c5);
		System.out.println("7의 배수의 갯수: "+c7);
		
		System.out.println("1~100 사이의 3의 배수 합: "+a3+" / 갯수: "+ c3);
		System.out.println("1~100 사이의 5의 배수 합: "+a5+" / 갯수: "+ c5);
		System.out.println("1~100 사이의 7의 배수 합: "+a7+" / 갯수: "+ c7);
		//3,5,7의 배수의 갯수 최대값
		int max = c3;
		if(max<c5)
			max=c5;
		if(max<c7)
			max=c7;
		
		int min=c3;
		if(min>c5)
			min=c5;
		if(min>c7)
			min=c7;
		
		System.out.println("배수의 갯수가 가장 많은 것: "+ max);
		System.out.println("배수의 갯수가 가장 적은 것: "+ min);
		
	}
}
