import java.util.Arrays;

//	배열을 선언하고 생성하는 다음 물음에 답하라.
//	1) 10개의 문자를 가지는 배열 c를 생성하는 코드를 한 줄로 쓰라.
//	2) 0에서 5까지 정수 값으로 초기화된 정수 배열 n을 선언하라.
//	3) '일', '월', '화', '수', '목', '금', '토'로 초기화된 배열 day를 선언하라.
//	4) 4개의 논리 값을 가진 배열 bool을 선언하고 true, false, false, true로
//		선언하라.
public class _문제_04 {
	public static void main(String[] args) {
		//	1)
		char[] c= new char[10];
		
		// 2)
		int [] a = new int [6];
		for(int i=0;i<a.length;i++)
		{
			a[i]=i;
		}
		System.out.println(Arrays.toString(a));
		
		// 3)
		char [] day= {'일','월','화','수','목','금','토'};
		
		// 4)
		boolean[] bool= {true,false,false,true};
		
	}
}
