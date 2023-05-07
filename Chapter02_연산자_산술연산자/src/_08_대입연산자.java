/*
		대입연산자
	연산순서 : 오른쪽 -> 왼쪽
	ex) a=10+20 => 10과 20을 더하고, 결과를 a에 대입
	
	---------------------- 복합 대입 연산자
	=
	+= : int a = 10;							// 보통 + - 가 많이 나옴
			a+=10; ==> a=a+10; --> 20			// + : 누적, 총합
			a+=1 / a=a+1 / a++ / ++a
	-= : a-=10
	*= : a*=10
	/= : a/=10
	<<= 
	>>=
	&=
	|=
	^=
	
			

	true / false가 나오는 비교, 논리, 부정연산자로 조건문				'ㅅ')b  ^~^ 



*/


public class _08_대입연산자 {
	public static void main(String[] args) {
		
		
		int a = 10;
		a++;
		a++;
		a++;
		System.out.println(a);
		a+=3;
		a=a+3;
		System.out.println(a);
		
		
		
	}
}
