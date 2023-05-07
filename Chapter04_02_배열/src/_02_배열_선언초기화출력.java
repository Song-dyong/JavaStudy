/*
		알파벳 10개를 저장하는 공간 만들기
		char c1~c10 	'or'	 char[] c=new char[10]; 
		==> char[] c 하나로 10개의 알파벳 한 번에 제어
		
		알파벳 100,000개 저장하는 공간 만들기
		char c1~c100000   				==> 가장 큰 알파벳을 출력하라?
		 										if문 99999줄 필요
		char[] alpha= new char[100000];	==> 가장 큰 알파벳을 출력하라.
											for문 사용
		char max='A';
		for(int i=0;i<alpha.length;i++)
		{
			if(max<char[i])
			max=char[i];
		}


*/

public class _02_배열_선언초기화출력 {
	public static void main(String[] args) {
//			1. 선언
		int [] arr=new int[5];	// new -> 동적 메모리 할당 (새로운 메모리를 생성)

//			2. 초기화
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
	
//			3. 출력
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		
//			4. 제어 ex) 정렬
		
		
//			5. 결과값 출력
		
		
	}
}
