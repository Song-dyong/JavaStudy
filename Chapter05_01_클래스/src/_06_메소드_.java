import java.util.Arrays;

/*
		  리턴형	      매개변수
		1.	O			O	
		2.	O			X
		3.	X			O
		4.	X			X
		------------------
		1) 2단~9단까지 구구단 출력				-> 4번
											static void gugudan(){}
		2) ID와 PWD를 받아서, 로그인 여부		-> 1번
											static boolean isLogin(String id,String pwd){}
		3) 검색어를 입력받아서, 검색된 노래명 출력	-> 3번
											static void find(String fd){}
		4) 검색어를 입력받아서, 노래명들을 받아서 출력-> 1번
											static String[] find(String fd){}
		5) 5개의 정수를 넘겨주고, 정렬된 정수 가져오기-> 1번
											static int[] sort(int[] arr){}
												
											
*/

// 6개의 난수를 발생 -> 총합 / 평균 구하기
public class _06_메소드_ {
	
	static int[] random()
	{
		int[] arr=new int[6];
		for(int i=0;i<6;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		return arr;					// 배열을 리턴할 경우, [] 없이 배열명만 넘기기
	}
	
	// 최대값, 최소값
	
	static int max(int[] arr)
	{
		int m=arr[0];
		for(int a:arr)
		{
			if(m<a)
				m=a;
		}
		return m;
	}
	
	static int min(int[] arr)
	{
		int m=arr[0];
		for(int a:arr)
		{
			if(m>a)
				m=a;
		}
		return m;
	}
	
	static void process()
	{
		int[] arr=random();				// cf) 얕은 복사 
		int total=0;
		for(int a:arr)
		{
			total+=a;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("총합: "+total);
		System.out.printf("평균: %.2f\n",total/(double)arr.length);			// arr의 갯수를 double로 바꿔서 출력
		System.out.println("최대값: "+max(arr));
		System.out.println("최소값: "+min(arr));								// 메소드 안에 메소드 호출 가능
		System.out.println("최대값-최소값: "+(max(arr)-min(arr)));
	}								// int max = max(arr)로 max의 새로운 값을 설정하는 경우는 max값을 다시 활용해야하는 경우
									// 위에 적은 것처럼 max(arr)-min(arr)로 할 경우, random에서 값이 변동할 여지가 있기 때문에 변수를 따로 잡는 것이 좋음
	public static void main(String[] args) {
		process();
	}
}
