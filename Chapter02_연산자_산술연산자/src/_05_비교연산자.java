/*
	단항연산자 (++, --)
	산술연산자 (쉬프트, 비트)
		----------> 계산 방향이 왼쪽에서 오른쪽
	대입연산자
	삼항연산자
		<---------- 계산 방향이 오른쪽에서 왼쪽
	단! (  ) 내의 계산은 최우선 순위


	비교연산자  ==>  결과값 (boolean) true / false
	== 같다
	!= 같지 않다
	<  작다 (왼쪽이 기준)
	>  크다
	<= 작거나 같다
	>= 크거나 같다

	ex) 7==6 false
		7!=6 true
		--------------------------------byte int short long double float boolean char 
		"a"=="a" ==> equals() *** (문자열의 경우, == 가 아닌 equals()로 비교) 
		
		'A' < 'B' --> 65 < 66 --> true
		10 > 5 --> true
		10 <= 10 --> true  10<10 || 10==10 
		




*/
public class _05_비교연산자 {
	public static void main(String[] args) {
		int a=(int)(Math.random()*100)+1;
		/*
				(int)(Math.random()*100)+1
				-------------------
						1 (0.0 ~ 0.99)
									---
									 2 ==> 0.0 ~ 99.0	
				-----
				  3	 0 ~ 99				---
				  						 4 --> 1 ~ 100	
		*/
		int b=(int)(Math.random()*100)+1;			// 난수 발생 
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		// 1. ==
		boolean b1=a==b;
		System.out.println("a==b : "+b1);
		
		// 2. !=
		boolean b2= a!=b;
		System.out.println("a!=b : "+b2);
		
		// 3. a<b
		boolean b3= a<b;
		System.out.println("a<b : "+b3);
		
		// 4. a>b
		b3= a>b;
		System.out.println("a>b : "+b3);
		
		// 5. a<=b
		b3= a<=b;
		System.out.println("a<=b : "+b3);
		
		// 6. a>=b
		b3= a>=b;
		System.out.println("a>=b : "+b3);
		
		
	}
}
