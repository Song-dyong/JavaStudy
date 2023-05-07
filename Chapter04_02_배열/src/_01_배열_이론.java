import java.util.Arrays;

/*
		배열 : 모아서 관리
				= 데이터	==>	배열 / 클래스 (★★★)
				= 명령문	==>	메소드 (재사용)
				
				
		1. 같은 데이터형을 모아서 관리
		   ---------- 
			=> 연속적으로 메모리 배치
			=> 인덱스 번호를 이용 (0부터 시작)
			=> 고정적 (변경 불가 --> 변경시에는 더 큰 배열을 생성해서 사용) 
			=> 배열 복사 
					-얕은 복사: 참조, 별칭 => 같은 메모리 주소를 활용
							int[] arr1={ };
							int[] arr2=arr1; (같은 곳에 저장)
							
					-깊은 복사: 데이터만 복사, 새로운 메모리 형성 후 저장 
							int[] arr1={};
							int[] arr2=arr1.clone();
							System.arraycopy();
							
			=> 배열의 크기: 배열이름.length
			=> 출력시에는 주로 for-each(향상된 for) 사용
			---------------------------------> Web(브라우저)에서 변경하는 것이 아니라, 있는 그대로 출력
				배열 / 컬렉션 (데이터가 모아져 있어야 사용 가능)
					-> 인덱스를 이용하는 프로그램 X
					-> 배열에 저장된 값을 한 개씩 읽어옴
					int[] arr={10,20,30,40,50};
					
					for(int a:arr)
					{
						a=10, a=20, a=30, a=40, a=50 ==> 배열에 소속된 데이터를 하나씩 a에 대입하여 가져옴
					}
					
					char[] arr={'A', 'B', 'C'}
					for(char c:arr)
					{
						c='A' c='B' c='C'		--> char c는 실제 저장된 데이터를 가지고 온다. 
					}									단, 크거나 같아야 함
					
					int[] arr={10,20,30,40,50};
					for(int i: arr)
					{
						i=100;   ==> 배열 arr의 값이 변경되지는 않음 --> i의 값만 계속 변동
					}													--> arr의 값 변경: arr[4]=100;
					
			=> 초기값, 값 변경시에는 일반 for 사용	(인덱스를 사용해야 변경 가능)
			
			for(int i:arr)
			{
					--> i = arr[0]
					--> i = arr[1]
					--> i = arr[2]
						.
						.
						.
					--> i = arr[arr.length]
			}
			
			
				
							
*/
public class _01_배열_이론 {
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		for(int i:arr)
		{
			
			i=100;
			System.out.println(i);
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
