/*
	1. 메모리 저장
		int=a;	int=b;
		-----	-----	4byte
		  3		 a+5	
		-----a	-----b
		
	2. System.out.printf() => JDK1.5 => C언어에서 도입 (printf())
	 	서식이 있는 출력 
	 	%d : 정수값 
	 	%f : 실수값 
	 	%c : 문자값
	 	%s : 문자열
	 	
	 	int a = 10;
	 	double d - 10.5;
	 	char = 'A';
	 	
	 	System.out.println("a="+a+,",d="+d+",c="+c);
	 	System.out.printf("a=%d,b=%.1f,c=%c",a,b,c); --> .1f : 소수점 첫째자리까지
	 	System.out.printf("a=%3d,b=%4.1f,c=%2c",a,b,c); --> 칸 간격 조절 가능
*/
public class _문제_01 {
	public static void main(String[] args) {
		
		int a;
		int b;
		a=3;
		b=a+5;
		System.out.printf("a의 값:%d\n",a);
		System.out.printf("b의 값:%d\n",b);
		
	}
}
